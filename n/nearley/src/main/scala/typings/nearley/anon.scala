package typings.nearley

import org.scalablytyped.runtime.StringDictionary
import typings.nearley.mod.LexerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var lexerState: LexerState
  }
  object Dictkey {
    
    @scala.inline
    def apply(lexerState: LexerState): Dictkey = {
      val __obj = js.Dynamic.literal(lexerState = lexerState.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLexerState(value: LexerState): Self = StObject.set(x, "lexerState", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: String
  }
  object Value {
    
    @scala.inline
    def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
