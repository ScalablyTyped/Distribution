package typings.nginstackWebFramework.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formats extends StObject {
  
  var formats: js.Array[ProcessKey]
  
  def getExporter(): Any
  
  def getRawDataExporter(): Any
  
  var title: String
}
object Formats {
  
  inline def apply(
    formats: js.Array[ProcessKey],
    getExporter: () => Any,
    getRawDataExporter: () => Any,
    title: String
  ): Formats = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], getExporter = js.Any.fromFunction0(getExporter), getRawDataExporter = js.Any.fromFunction0(getRawDataExporter), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formats]
  }
  
  extension [Self <: Formats](x: Self) {
    
    inline def setFormats(value: js.Array[ProcessKey]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsVarargs(value: ProcessKey*): Self = StObject.set(x, "formats", js.Array(value*))
    
    inline def setGetExporter(value: () => Any): Self = StObject.set(x, "getExporter", js.Any.fromFunction0(value))
    
    inline def setGetRawDataExporter(value: () => Any): Self = StObject.set(x, "getRawDataExporter", js.Any.fromFunction0(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
