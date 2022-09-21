package typings.postcssCustomProperties

import typings.postcssCustomProperties.optionsMod.ExportJSONFunction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait From extends StObject {
    
    var from: String
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object From {
    
    inline def apply(from: String): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait To extends StObject {
    
    var to: String
    
    def toJSON(): Record[String, String]
    def toJSON(customProperties: Record[String, String]): Record[String, String]
    @JSName("toJSON")
    var toJSON_Original: ExportJSONFunction
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object To {
    
    inline def apply(
      to: String,
      toJSON: /* customProperties */ js.UndefOr[Record[String, String]] => Record[String, String]
    ): To = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any], toJSON = js.Any.fromFunction1(toJSON))
      __obj.asInstanceOf[To]
    }
    
    extension [Self <: To](x: Self) {
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: /* customProperties */ js.UndefOr[Record[String, String]] => Record[String, String]): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
