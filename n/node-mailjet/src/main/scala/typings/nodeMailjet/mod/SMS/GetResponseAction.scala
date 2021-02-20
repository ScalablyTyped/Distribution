package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResponseAction extends StObject {
  
  val body: GetResponseActionData = js.native
}
object GetResponseAction {
  
  @scala.inline
  def apply(body: GetResponseActionData): GetResponseAction = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseAction]
  }
  
  @scala.inline
  implicit class GetResponseActionMutableBuilder[Self <: GetResponseAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: GetResponseActionData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
