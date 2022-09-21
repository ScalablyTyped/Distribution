package typings.minio.mod

import typings.minio.anon.AllowQuotedRecordDelimiter
import typings.minio.anon.Type
import typings.minio.minioStrings.BZIP2
import typings.minio.minioStrings.GZIP
import typings.minio.minioStrings.NONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputSerialization extends StObject {
  
  var CSV: js.UndefOr[AllowQuotedRecordDelimiter] = js.undefined
  
  var CompressionType: js.UndefOr[NONE | GZIP | BZIP2] = js.undefined
  
  var JSON: js.UndefOr[Type] = js.undefined
  
  var Parquet: js.UndefOr[EmptyObject] = js.undefined
}
object InputSerialization {
  
  inline def apply(): InputSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSerialization]
  }
  
  extension [Self <: InputSerialization](x: Self) {
    
    inline def setCSV(value: AllowQuotedRecordDelimiter): Self = StObject.set(x, "CSV", value.asInstanceOf[js.Any])
    
    inline def setCSVUndefined: Self = StObject.set(x, "CSV", js.undefined)
    
    inline def setCompressionType(value: NONE | GZIP | BZIP2): Self = StObject.set(x, "CompressionType", value.asInstanceOf[js.Any])
    
    inline def setCompressionTypeUndefined: Self = StObject.set(x, "CompressionType", js.undefined)
    
    inline def setJSON(value: Type): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
    
    inline def setJSONUndefined: Self = StObject.set(x, "JSON", js.undefined)
    
    inline def setParquet(value: EmptyObject): Self = StObject.set(x, "Parquet", value.asInstanceOf[js.Any])
    
    inline def setParquetUndefined: Self = StObject.set(x, "Parquet", js.undefined)
  }
}
