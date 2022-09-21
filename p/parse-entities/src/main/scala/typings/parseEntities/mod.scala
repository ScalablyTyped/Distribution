package typings.parseEntities

import typings.unist.mod.Point
import typings.unist.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-entities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseEntities(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseEntities")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def parseEntities(value: String, options: Options[Unit, Unit, Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseEntities")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options[WarningContext, ReferenceContext, TextContext] extends StObject {
    
    /**
      * Additional character to accept.
      * This allows other characters, without error, when following an ampersand.
      *
      * @default ''
      */
    var additional: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to parse `value` as an attribute value.
      * This results in slightly different behavior.
      *
      * @default false
      */
    var attribute: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to allow nonterminated character references.
      * For example, `&copycat` for `©cat`.
      * This behavior is compliant to the spec but can lead to unexpected results.
      *
      * @default true
      */
    var nonTerminated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Starting `position` of `value` (`Point` or `Position`). Useful when dealing with values nested in some sort of syntax tree.
      */
    var position: js.UndefOr[Position | Point] = js.undefined
    
    /**
      * Reference handler.
      */
    var reference: js.UndefOr[ReferenceHandler[ReferenceContext]] = js.undefined
    
    /**
      * Context used when calling `reference`.
      */
    var referenceContext: js.UndefOr[ReferenceContext] = js.undefined
    
    /**
      * Text handler.
      */
    var text: js.UndefOr[TextHandler[TextContext]] = js.undefined
    
    /**
      * Context used when calling `text`.
      */
    var textContext: js.UndefOr[TextContext] = js.undefined
    
    /**
      * Warning handler.
      */
    var warning: js.UndefOr[WarningHandler[WarningContext]] = js.undefined
    
    /**
      * Context used when calling `warning`.
      */
    var warningContext: js.UndefOr[WarningContext] = js.undefined
  }
  object Options {
    
    inline def apply[WarningContext, ReferenceContext, TextContext](): Options[WarningContext, ReferenceContext, TextContext] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[WarningContext, ReferenceContext, TextContext]]
    }
    
    extension [Self <: Options[?, ?, ?], WarningContext, ReferenceContext, TextContext](x: Self & (Options[WarningContext, ReferenceContext, TextContext])) {
      
      inline def setAdditional(value: String): Self = StObject.set(x, "additional", value.asInstanceOf[js.Any])
      
      inline def setAdditionalUndefined: Self = StObject.set(x, "additional", js.undefined)
      
      inline def setAttribute(value: Boolean): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      inline def setNonTerminated(value: Boolean): Self = StObject.set(x, "nonTerminated", value.asInstanceOf[js.Any])
      
      inline def setNonTerminatedUndefined: Self = StObject.set(x, "nonTerminated", js.undefined)
      
      inline def setPosition(value: Position | Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setReference(value: ReferenceHandler[ReferenceContext]): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setReferenceContext(value: ReferenceContext): Self = StObject.set(x, "referenceContext", value.asInstanceOf[js.Any])
      
      inline def setReferenceContextUndefined: Self = StObject.set(x, "referenceContext", js.undefined)
      
      inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
      
      inline def setText(value: TextHandler[TextContext]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextContext(value: TextContext): Self = StObject.set(x, "textContext", value.asInstanceOf[js.Any])
      
      inline def setTextContextUndefined: Self = StObject.set(x, "textContext", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setWarning(value: WarningHandler[WarningContext]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningContext(value: WarningContext): Self = StObject.set(x, "warningContext", value.asInstanceOf[js.Any])
      
      inline def setWarningContextUndefined: Self = StObject.set(x, "warningContext", js.undefined)
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  type ReferenceHandler[Context] = js.ThisFunction3[
    /* this */ Context, 
    /* value */ String, 
    /* position */ Position, 
    /* source */ String, 
    Unit
  ]
  
  type TextHandler[Context] = js.ThisFunction2[/* this */ Context, /* value */ String, /* position */ Position, Unit]
  
  type WarningHandler[Context] = js.ThisFunction3[/* this */ Context, /* reason */ String, /* point */ Point, /* code */ Double, Unit]
}
