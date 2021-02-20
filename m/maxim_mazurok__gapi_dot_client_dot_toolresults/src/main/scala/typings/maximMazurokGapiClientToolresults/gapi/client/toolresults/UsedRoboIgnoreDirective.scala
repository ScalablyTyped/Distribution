package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsedRoboIgnoreDirective extends StObject {
  
  /** The name of the resource that was ignored. */
  var resourceName: js.UndefOr[String] = js.native
}
object UsedRoboIgnoreDirective {
  
  @scala.inline
  def apply(): UsedRoboIgnoreDirective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsedRoboIgnoreDirective]
  }
  
  @scala.inline
  implicit class UsedRoboIgnoreDirectiveMutableBuilder[Self <: UsedRoboIgnoreDirective] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
