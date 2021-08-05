package typings.node.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Console {
  
  /**
    * Console message.
    */
  trait ConsoleMessage extends StObject {
    
    /**
      * Column number in the resource that generated this message (1-based).
      */
    var column: js.UndefOr[Double] = js.undefined
    
    /**
      * Message severity.
      */
    var level: String
    
    /**
      * Line number in the resource that generated this message (1-based).
      */
    var line: js.UndefOr[Double] = js.undefined
    
    /**
      * Message source.
      */
    var source: String
    
    /**
      * Message text.
      */
    var text: String
    
    /**
      * URL of the message origin.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object ConsoleMessage {
    
    inline def apply(level: String, source: String, text: String): ConsoleMessage = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsoleMessage]
    }
    
    extension [Self <: ConsoleMessage](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait MessageAddedEventDataType extends StObject {
    
    /**
      * Console message that has been added.
      */
    var message: ConsoleMessage
  }
  object MessageAddedEventDataType {
    
    inline def apply(message: ConsoleMessage): MessageAddedEventDataType = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageAddedEventDataType]
    }
    
    extension [Self <: MessageAddedEventDataType](x: Self) {
      
      inline def setMessage(value: ConsoleMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
