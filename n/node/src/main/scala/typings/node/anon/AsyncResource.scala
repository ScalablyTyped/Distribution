package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncResource extends StObject {
  
  var asyncResource: typings.node.asyncHooksMod.AsyncResource = js.native
}
object AsyncResource {
  
  @scala.inline
  def apply(asyncResource: typings.node.asyncHooksMod.AsyncResource): AsyncResource = {
    val __obj = js.Dynamic.literal(asyncResource = asyncResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncResource]
  }
  
  @scala.inline
  implicit class AsyncResourceMutableBuilder[Self <: AsyncResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncResource(value: typings.node.asyncHooksMod.AsyncResource): Self = StObject.set(x, "asyncResource", value.asInstanceOf[js.Any])
  }
}
