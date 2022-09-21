package typings.postcssCustomProperties

import typings.postcssCustomProperties.anon.From
import typings.postcssCustomProperties.anon.To
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  type ExportAsFunction = js.Function1[/* ExportCustomProperties */ Any, Unit]
  
  type ExportAsFunctionPromise = js.Function1[/* ExportCustomProperties */ Any, js.Promise[Unit]]
  
  trait ExportCustomProperties extends StObject {
    
    var `custom-properties`: js.UndefOr[Record[String, String]] = js.undefined
    
    var customProperties: js.UndefOr[Record[String, String]] = js.undefined
    
    def toJSON(): Record[String, String]
    def toJSON(customProperties: Record[String, String]): Record[String, String]
    @JSName("toJSON")
    var toJSON_Original: ExportJSONFunction
  }
  object ExportCustomProperties {
    
    inline def apply(toJSON: /* customProperties */ js.UndefOr[Record[String, String]] => Record[String, String]): ExportCustomProperties = {
      val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction1(toJSON))
      __obj.asInstanceOf[ExportCustomProperties]
    }
    
    extension [Self <: ExportCustomProperties](x: Self) {
      
      inline def `setCustom-properties`(value: Record[String, String]): Self = StObject.set(x, "custom-properties", value.asInstanceOf[js.Any])
      
      inline def `setCustom-propertiesUndefined`: Self = StObject.set(x, "custom-properties", js.undefined)
      
      inline def setCustomProperties(value: Record[String, String]): Self = StObject.set(x, "customProperties", value.asInstanceOf[js.Any])
      
      inline def setCustomPropertiesUndefined: Self = StObject.set(x, "customProperties", js.undefined)
      
      inline def setToJSON(value: /* customProperties */ js.UndefOr[Record[String, String]] => Record[String, String]): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
    }
  }
  
  type ExportJSONFunction = js.Function1[/* customProperties */ js.UndefOr[Record[String, String]], Record[String, String]]
  
  type ExportOptions = ExportToSource | ExportCustomProperties | ExportAsFunction | ExportAsFunctionPromise
  
  type ExportToSource = To | String
  
  type ImportAsFunction = js.Function0[ImportFromSource | ImportCustomProperties]
  
  type ImportAsFunctionPromise = js.Function0[js.Promise[ImportFromSource | ImportCustomProperties]]
  
  type ImportAsPromise = js.Promise[ImportFromSource | ImportCustomProperties]
  
  trait ImportCustomProperties extends StObject {
    
    var `custom-properties`: js.UndefOr[Record[String, String]] = js.undefined
    
    var customProperties: js.UndefOr[Record[String, String]] = js.undefined
  }
  object ImportCustomProperties {
    
    inline def apply(): ImportCustomProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportCustomProperties]
    }
    
    extension [Self <: ImportCustomProperties](x: Self) {
      
      inline def `setCustom-properties`(value: Record[String, String]): Self = StObject.set(x, "custom-properties", value.asInstanceOf[js.Any])
      
      inline def `setCustom-propertiesUndefined`: Self = StObject.set(x, "custom-properties", js.undefined)
      
      inline def setCustomProperties(value: Record[String, String]): Self = StObject.set(x, "customProperties", value.asInstanceOf[js.Any])
      
      inline def setCustomPropertiesUndefined: Self = StObject.set(x, "customProperties", js.undefined)
    }
  }
  
  type ImportFromSource = From | String
  
  type ImportOptions = ImportFromSource | ImportCustomProperties | ImportAsFunction | ImportAsPromise | ImportAsFunctionPromise
}
