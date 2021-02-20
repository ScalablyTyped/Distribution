package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deploy extends StObject {
  
  var deploy: String = js.native
}
object Deploy {
  
  @scala.inline
  def apply(deploy: String): Deploy = {
    val __obj = js.Dynamic.literal(deploy = deploy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deploy]
  }
  
  @scala.inline
  implicit class DeployMutableBuilder[Self <: Deploy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploy(value: String): Self = StObject.set(x, "deploy", value.asInstanceOf[js.Any])
  }
}
