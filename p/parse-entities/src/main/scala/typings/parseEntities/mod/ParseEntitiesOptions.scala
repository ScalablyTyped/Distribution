package typings.parseEntities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseEntitiesOptions[WC, TC, RC] extends js.Object {
  
  /**
    * Additional character to accept (`string?`, default: `''`).
    * This allows other characters, without error, when following an ampersand.
    */
  var additional: String = js.native
  
  /**
    * Whether to parse `value` as an attribute value (`boolean?`, default: `false`).
    */
  var attribute: Boolean = js.native
  
  /**
    * Whether to allow non-terminated entities (`boolean`, default: `true`).
    * For example, `&copycat` for `©cat`.  This behaviour is spec-compliant but can lead to unexpected results.
    */
  var nonTerminated: Boolean = js.native
  
  /**
    * Starting `position` of `value` (`Location` or `Position`, optional).  Useful when dealing with values nested in some sort of syntax tree.
    */
  var position: Position = js.native
  
  /**
    * Reference handler (`Function?`).
    */
  def reference(
    /**
    * String of content (`string`).
    */
  value: String,
    /**
    * Location at which `value` starts and ends (`Location`).
    */
  location: Location,
    /**
    * Source of character reference (`Location`).
    */
  source: Location
  ): Unit = js.native
  
  /**
    * Context used when invoking `reference` (`'*'`, optional)
    */
  var referenceContext: RC = js.native
  
  /**
    * Reference handler (`Function?`).
    */
  @JSName("reference")
  var reference_Original: ReferenceHandler[RC] = js.native
  
  /**
    * Text handler (`Function?`).
    */
  def text(
    /**
    * String of content (`string`).
    */
  value: String,
    /**
    * Location at which `value` starts and ends (`Location`).
    */
  location: Location
  ): Unit = js.native
  
  /**
    * Context used when invoking `text` (`'*'`, optional).
    */
  var textContext: TC = js.native
  
  /**
    * Text handler (`Function?`).
    */
  @JSName("text")
  var text_Original: TextHandler[TC] = js.native
  
  /**
    * Error handler (`Function?`).
    */
  def warning(
    /**
    * Human-readable reason for triggering a parse error (`string`).
    */
  reason: String,
    /**
    * Place at which the parse error occurred (`Position`).
    */
  position: Position,
    /**
    * Identifier of reason for triggering a parse error (`number`).
    */
  code: Double
  ): Unit = js.native
  
  /**
    * Context used when invoking `warning` (`'*'`, optional).
    */
  var warningContext: WC = js.native
  
  /**
    * Error handler (`Function?`).
    */
  @JSName("warning")
  var warning_Original: ErrorHandler[WC] = js.native
}
