package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourceAction extends StObject {
  
  def id(value: String): GetResourceActionId = js.native
  
  def request(): js.Promise[GetResponseAction] = js.native
  def request(params: GetParams): js.Promise[GetResponseAction] = js.native
}
