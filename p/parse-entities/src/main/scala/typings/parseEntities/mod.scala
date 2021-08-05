package typings.parseEntities

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Decode special characters in `value`.
    */
  inline def apply[WC, TC, RC](value: String): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply[WC, TC, RC](value: String, options: Partial[ParseEntitiesOptions[WC, TC, RC]]): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("parse-entities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Error handler.
    */
  type ErrorHandler[C] = js.ThisFunction3[/* this */ C, /* reason */ String, /* position */ Position, /* code */ Double, Unit]
  
  trait Location extends StObject {
    
    var end: Position
    
    var start: Position
  }
  object Location {
    
    inline def apply(end: Position, start: Position): Location = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setEnd(value: Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseEntitiesOptions[WC, TC, RC] extends StObject {
    
    /**
      * Additional character to accept (`string?`, default: `''`).
      * This allows other characters, without error, when following an ampersand.
      */
    var additional: String
    
    /**
      * Whether to parse `value` as an attribute value (`boolean?`, default: `false`).
      */
    var attribute: Boolean
    
    /**
      * Whether to allow non-terminated entities (`boolean`, default: `true`).
      * For example, `&copycat` for `©cat`.  This behaviour is spec-compliant but can lead to unexpected results.
      */
    var nonTerminated: Boolean
    
    /**
      * Starting `position` of `value` (`Location` or `Position`, optional).  Useful when dealing with values nested in some sort of syntax tree.
      */
    var position: Position
    
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
    ): Unit
    
    /**
      * Context used when invoking `reference` (`'*'`, optional)
      */
    var referenceContext: RC
    
    /**
      * Reference handler (`Function?`).
      */
    @JSName("reference")
    var reference_Original: ReferenceHandler[RC]
    
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
    ): Unit
    
    /**
      * Context used when invoking `text` (`'*'`, optional).
      */
    var textContext: TC
    
    /**
      * Text handler (`Function?`).
      */
    @JSName("text")
    var text_Original: TextHandler[TC]
    
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
    ): Unit
    
    /**
      * Context used when invoking `warning` (`'*'`, optional).
      */
    var warningContext: WC
    
    /**
      * Error handler (`Function?`).
      */
    @JSName("warning")
    var warning_Original: ErrorHandler[WC]
  }
  object ParseEntitiesOptions {
    
    inline def apply[WC, TC, RC](
      additional: String,
      attribute: Boolean,
      nonTerminated: Boolean,
      position: Position,
      reference: ReferenceHandler[RC],
      referenceContext: RC,
      text: TextHandler[TC],
      textContext: TC,
      warning: ErrorHandler[WC],
      warningContext: WC
    ): ParseEntitiesOptions[WC, TC, RC] = {
      val __obj = js.Dynamic.literal(additional = additional.asInstanceOf[js.Any], attribute = attribute.asInstanceOf[js.Any], nonTerminated = nonTerminated.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], referenceContext = referenceContext.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textContext = textContext.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any], warningContext = warningContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseEntitiesOptions[WC, TC, RC]]
    }
    
    extension [Self <: ParseEntitiesOptions[?, ?, ?], WC, TC, RC](x: Self & (ParseEntitiesOptions[WC, TC, RC])) {
      
      inline def setAdditional(value: String): Self = StObject.set(x, "additional", value.asInstanceOf[js.Any])
      
      inline def setAttribute(value: Boolean): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setNonTerminated(value: Boolean): Self = StObject.set(x, "nonTerminated", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setReference(value: ReferenceHandler[RC]): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setReferenceContext(value: RC): Self = StObject.set(x, "referenceContext", value.asInstanceOf[js.Any])
      
      inline def setText(value: TextHandler[TC]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextContext(value: TC): Self = StObject.set(x, "textContext", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: ErrorHandler[WC]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningContext(value: WC): Self = StObject.set(x, "warningContext", value.asInstanceOf[js.Any])
    }
  }
  
  trait Position extends StObject {
    
    var column: Double
    
    var indent: js.UndefOr[js.Array[Double]] = js.undefined
    
    var line: Double
    
    var offset: Double
  }
  object Position {
    
    inline def apply(column: Double, line: Double, offset: Double): Position = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setIndent(value: js.Array[Double]): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setIndentVarargs(value: Double*): Self = StObject.set(x, "indent", js.Array(value :_*))
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
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
