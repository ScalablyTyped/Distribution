package typings.openapiTypes.mod.OpenAPIV31

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathsWebhooksComponents[T /* <: js.Object */] extends StObject {
  
  var components: ComponentsObject
  
  var paths: PathsObject[T, js.Object]
  
  var webhooks: Record[String, PathItemObject[js.Object] | ReferenceObject]
}
object PathsWebhooksComponents {
  
  inline def apply[T /* <: js.Object */](
    components: ComponentsObject,
    paths: PathsObject[T, js.Object],
    webhooks: Record[String, PathItemObject[js.Object] | ReferenceObject]
  ): PathsWebhooksComponents[T] = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathsWebhooksComponents[T]]
  }
  
  extension [Self <: PathsWebhooksComponents[?], T /* <: js.Object */](x: Self & PathsWebhooksComponents[T]) {
    
    inline def setComponents(value: ComponentsObject): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: PathsObject[T, js.Object]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setWebhooks(value: Record[String, PathItemObject[js.Object] | ReferenceObject]): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
  }
}
