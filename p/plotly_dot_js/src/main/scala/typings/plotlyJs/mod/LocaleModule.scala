package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.locale
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocaleModule
  extends StObject
     with PlotlyModule {
  
  var dictionary: Record[String, Any]
  
  var format: Record[String, Any]
  
  var moduleType: locale
  
  var name: String
}
object LocaleModule {
  
  inline def apply(dictionary: Record[String, Any], format: Record[String, Any], name: String): LocaleModule = {
    val __obj = js.Dynamic.literal(dictionary = dictionary.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], moduleType = "locale", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocaleModule] (val x: Self) extends AnyVal {
    
    inline def setDictionary(value: Record[String, Any]): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Record[String, Any]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setModuleType(value: locale): Self = StObject.set(x, "moduleType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
