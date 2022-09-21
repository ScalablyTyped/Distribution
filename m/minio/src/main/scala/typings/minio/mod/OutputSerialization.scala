package typings.minio.mod

import typings.minio.anon.FieldDelimiter
import typings.minio.anon.RecordDelimiter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputSerialization extends StObject {
  
  var CSV: js.UndefOr[FieldDelimiter] = js.undefined
  
  var JSON: js.UndefOr[RecordDelimiter] = js.undefined
}
object OutputSerialization {
  
  inline def apply(): OutputSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputSerialization]
  }
  
  extension [Self <: OutputSerialization](x: Self) {
    
    inline def setCSV(value: FieldDelimiter): Self = StObject.set(x, "CSV", value.asInstanceOf[js.Any])
    
    inline def setCSVUndefined: Self = StObject.set(x, "CSV", js.undefined)
    
    inline def setJSON(value: RecordDelimiter): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
    
    inline def setJSONUndefined: Self = StObject.set(x, "JSON", js.undefined)
  }
}
