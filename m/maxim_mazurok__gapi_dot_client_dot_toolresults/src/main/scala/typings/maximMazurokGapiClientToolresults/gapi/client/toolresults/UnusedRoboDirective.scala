package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnusedRoboDirective extends StObject {
  
  /** The name of the resource that was unused. */
  var resourceName: js.UndefOr[String] = js.native
}
object UnusedRoboDirective {
  
  @scala.inline
  def apply(): UnusedRoboDirective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnusedRoboDirective]
  }
  
  @scala.inline
  implicit class UnusedRoboDirectiveMutableBuilder[Self <: UnusedRoboDirective] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
