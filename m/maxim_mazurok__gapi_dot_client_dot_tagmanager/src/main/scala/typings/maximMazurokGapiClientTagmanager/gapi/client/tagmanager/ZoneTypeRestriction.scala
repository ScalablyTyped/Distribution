package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoneTypeRestriction extends StObject {
  
  /** True if type restrictions have been enabled for this Zone. */
  var enable: js.UndefOr[Boolean] = js.native
  
  /** List of type public ids that have been whitelisted for use in this Zone. */
  var whitelistedTypeId: js.UndefOr[js.Array[String]] = js.native
}
object ZoneTypeRestriction {
  
  @scala.inline
  def apply(): ZoneTypeRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneTypeRestriction]
  }
  
  @scala.inline
  implicit class ZoneTypeRestrictionMutableBuilder[Self <: ZoneTypeRestriction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setWhitelistedTypeId(value: js.Array[String]): Self = StObject.set(x, "whitelistedTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistedTypeIdUndefined: Self = StObject.set(x, "whitelistedTypeId", js.undefined)
    
    @scala.inline
    def setWhitelistedTypeIdVarargs(value: String*): Self = StObject.set(x, "whitelistedTypeId", js.Array(value :_*))
  }
}
