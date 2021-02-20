package typings.parseEntities

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Decode special characters in `value`.
    */
  @JSImport("parse-entities", JSImport.Namespace)
  @js.native
  def apply[WC, TC, RC](value: String): String = js.native
  @JSImport("parse-entities", JSImport.Namespace)
  @js.native
  def apply[WC, TC, RC](value: String, options: Partial[ParseEntitiesOptions[WC, TC, RC]]): String = js.native
  
  /**
    * Error handler.
    */
  type ErrorHandler[C] = js.ThisFunction3[/* this */ C, /* reason */ String, /* position */ Position, /* code */ Double, Unit]
  
  @js.native
  trait Location extends StObject {
    
    var end: Position = js.native
    
    var start: Position = js.native
  }
  object Location {
    
    @scala.inline
    def apply(end: Position, start: Position): Location = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParseEntitiesOptions[WC, TC, RC] extends StObject {
    
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
  
  @js.native
  trait Position extends StObject {
    
    var column: Double = js.native
    
    var indent: js.UndefOr[js.Array[Double]] = js.native
    
    var line: Double = js.native
    
    var offset: Double = js.native
  }
  object Position {
    
    @scala.inline
    def apply(column: Double, line: Double, offset: Double): Position = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent(value: js.Array[Double]): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setIndentVarargs(value: Double*): Self = StObject.set(x, "indent", js.Array(value :_*))
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Character reference handler.
    */
  type ReferenceHandler[C] = js.ThisFunction3[/* this */ C, /* value */ String, /* location */ Location, /* source */ Location, Unit]
  
  /**
    * Text handler.
    */
  type TextHandler[C] = js.ThisFunction2[/* this */ C, /* value */ String, /* location */ Location, Unit]
}
