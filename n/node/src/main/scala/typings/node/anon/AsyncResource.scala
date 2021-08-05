package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncResource extends StObject {
  
  var asyncResource: typings.node.asyncHooksMod.AsyncResource
}
object AsyncResource {
  
  inline def apply(asyncResource: typings.node.asyncHooksMod.AsyncResource): AsyncResource = {
    val __obj = js.Dynamic.literal(asyncResource = asyncResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncResource]
  }
  
  extension [Self <: AsyncResource](x: Self) {
    
    inline def setAsyncResource(value: typings.node.asyncHooksMod.AsyncResource): Self = StObject.set(x, "asyncResource", value.asInstanceOf[js.Any])
  }
}
