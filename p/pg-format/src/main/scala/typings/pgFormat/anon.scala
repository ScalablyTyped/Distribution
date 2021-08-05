package typings.pgFormat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ident extends StObject {
    
    var ident: js.UndefOr[String] = js.undefined
    
    var literal: js.UndefOr[String] = js.undefined
    
    var string: js.UndefOr[String] = js.undefined
  }
  object Ident {
    
    inline def apply(): Ident = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ident]
    }
    
    extension [Self <: Ident](x: Self) {
      
      inline def setIdent(value: String): Self = StObject.set(x, "ident", value.asInstanceOf[js.Any])
      
      inline def setIdentUndefined: Self = StObject.set(x, "ident", js.undefined)
      
      inline def setLiteral(value: String): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      inline def setLiteralUndefined: Self = StObject.set(x, "literal", js.undefined)
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    }
  }
  
  trait Pattern extends StObject {
    
    var pattern: Ident
  }
  object Pattern {
    
    inline def apply(pattern: Ident): Pattern = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pattern]
    }
    
    extension [Self <: Pattern](x: Self) {
      
      inline def setPattern(value: Ident): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
}
