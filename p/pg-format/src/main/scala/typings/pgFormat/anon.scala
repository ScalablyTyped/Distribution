package typings.pgFormat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Ident extends StObject {
    
    var ident: js.UndefOr[String] = js.native
    
    var literal: js.UndefOr[String] = js.native
    
    var string: js.UndefOr[String] = js.native
  }
  object Ident {
    
    @scala.inline
    def apply(): Ident = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ident]
    }
    
    @scala.inline
    implicit class IdentMutableBuilder[Self <: Ident] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdent(value: String): Self = StObject.set(x, "ident", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentUndefined: Self = StObject.set(x, "ident", js.undefined)
      
      @scala.inline
      def setLiteral(value: String): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiteralUndefined: Self = StObject.set(x, "literal", js.undefined)
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    }
  }
  
  @js.native
  trait Pattern extends StObject {
    
    var pattern: Ident = js.native
  }
  object Pattern {
    
    @scala.inline
    def apply(pattern: Ident): Pattern = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pattern]
    }
    
    @scala.inline
    implicit class PatternMutableBuilder[Self <: Pattern] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPattern(value: Ident): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
}
