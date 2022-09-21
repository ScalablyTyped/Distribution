package typings.plotlyJs.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.plotlyJs.mod.TraceModule
  - typings.plotlyJs.mod.LocaleModule
  - typings.plotlyJs.mod.TransformModule
  - typings.plotlyJs.mod.ComponentModule
  - typings.plotlyJs.mod.ApiMethodModule
*/
trait PlotlyModule extends StObject
object PlotlyModule {
  
  inline def ApiMethodModule(fn: Any, name: String): typings.plotlyJs.mod.ApiMethodModule = {
    val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any], moduleType = "apiMethod", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.plotlyJs.mod.ApiMethodModule]
  }
  
  inline def ComponentModule(name: String): typings.plotlyJs.mod.ComponentModule = {
    val __obj = js.Dynamic.literal(moduleType = "component", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.plotlyJs.mod.ComponentModule]
  }
  
  inline def LocaleModule(dictionary: Record[String, Any], format: Record[String, Any], name: String): typings.plotlyJs.mod.LocaleModule = {
    val __obj = js.Dynamic.literal(dictionary = dictionary.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], moduleType = "locale", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.plotlyJs.mod.LocaleModule]
  }
  
  inline def TraceModule(categories: js.Array[String], meta: Record[String, Any], name: String): typings.plotlyJs.mod.TraceModule = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], moduleType = "trace", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.plotlyJs.mod.TraceModule]
  }
  
  inline def TransformModule(
    attributes: Record[String, Any],
    calcTransform: Any,
    name: String,
    supplyDefaults: Any,
    transform: Any
  ): typings.plotlyJs.mod.TransformModule = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], calcTransform = calcTransform.asInstanceOf[js.Any], moduleType = "transform", name = name.asInstanceOf[js.Any], supplyDefaults = supplyDefaults.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.plotlyJs.mod.TransformModule]
  }
}
