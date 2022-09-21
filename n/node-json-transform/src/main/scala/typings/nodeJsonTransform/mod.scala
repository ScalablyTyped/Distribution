package typings.nodeJsonTransform

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-json-transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DataTransform(data: Any, map: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("DataTransform")(data.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def transform(data: Any, map: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(data.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def transform(data: Any, map: Any, context: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(data.asInstanceOf[js.Any], map.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def transformAsync(data: Any, map: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAsync")(data.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def transformAsync(data: Any, map: Any, context: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAsync")(data.asInstanceOf[js.Any], map.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
}
