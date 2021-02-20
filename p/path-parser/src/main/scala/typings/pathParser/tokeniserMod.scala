package typings.pathParser

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokeniserMod {
  
  @JSImport("path-parser/dist/tokeniser", JSImport.Default)
  @js.native
  def default(str: String): js.Array[Token] = js.native
  @JSImport("path-parser/dist/tokeniser", JSImport.Default)
  @js.native
  def default(str: String, tokens: js.Array[Token]): js.Array[Token] = js.native
  
  @js.native
  trait Token extends StObject {
    
    var `match`: String = js.native
    
    var otherVal: js.Any = js.native
    
    var regex: js.UndefOr[RegExp] = js.native
    
    var `type`: String = js.native
    
    var `val`: js.Any = js.native
  }
  object Token {
    
    @scala.inline
    def apply(`match`: String, otherVal: js.Any, `type`: String, `val`: js.Any): Token = {
      val __obj = js.Dynamic.literal(otherVal = otherVal.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherVal(value: js.Any): Self = StObject.set(x, "otherVal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVal(value: js.Any): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
}
