package typings.postcssReporter

import typings.postcss.mod.ResultMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Messages extends StObject {
    
    var messages: js.Array[ResultMessage]
    
    var source: String
  }
  object Messages {
    
    inline def apply(messages: js.Array[ResultMessage], source: String): Messages = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Messages]
    }
    
    extension [Self <: Messages](x: Self) {
      
      inline def setMessages(value: js.Array[ResultMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: ResultMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
