package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchExternal extends StObject {
  
  var launchExternal: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object LaunchExternal {
  
  @scala.inline
  def apply(): LaunchExternal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchExternal]
  }
  
  @scala.inline
  implicit class LaunchExternalMutableBuilder[Self <: LaunchExternal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchExternal(value: Boolean): Self = StObject.set(x, "launchExternal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchExternalUndefined: Self = StObject.set(x, "launchExternal", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
