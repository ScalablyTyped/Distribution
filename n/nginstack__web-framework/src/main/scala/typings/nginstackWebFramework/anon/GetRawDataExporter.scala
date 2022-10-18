package typings.nginstackWebFramework.anon

import typings.nginstackWebFramework.libDsvVisualizationMod.DataExporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRawDataExporter extends StObject {
  
  var formats: js.Array[ProcessKey]
  
  def getExporter(): DataExporter
  
  def getRawDataExporter(): DataExporter
  
  var title: String
}
object GetRawDataExporter {
  
  inline def apply(
    formats: js.Array[ProcessKey],
    getExporter: () => DataExporter,
    getRawDataExporter: () => DataExporter,
    title: String
  ): GetRawDataExporter = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], getExporter = js.Any.fromFunction0(getExporter), getRawDataExporter = js.Any.fromFunction0(getRawDataExporter), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRawDataExporter]
  }
  
  extension [Self <: GetRawDataExporter](x: Self) {
    
    inline def setFormats(value: js.Array[ProcessKey]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsVarargs(value: ProcessKey*): Self = StObject.set(x, "formats", js.Array(value*))
    
    inline def setGetExporter(value: () => DataExporter): Self = StObject.set(x, "getExporter", js.Any.fromFunction0(value))
    
    inline def setGetRawDataExporter(value: () => DataExporter): Self = StObject.set(x, "getRawDataExporter", js.Any.fromFunction0(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
