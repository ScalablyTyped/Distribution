package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsedRoboDirective extends StObject {
  
  /** The name of the resource that was used. */
  var resourceName: js.UndefOr[String] = js.native
}
object UsedRoboDirective {
  
  @scala.inline
  def apply(): UsedRoboDirective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsedRoboDirective]
  }
  
  @scala.inline
  implicit class UsedRoboDirectiveMutableBuilder[Self <: UsedRoboDirective] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
