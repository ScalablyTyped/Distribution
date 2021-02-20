package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemotebuildbotResourceUsageStat extends StObject {
  
  var total: js.UndefOr[String] = js.native
  
  var used: js.UndefOr[String] = js.native
}
object GoogleDevtoolsRemotebuildbotResourceUsageStat {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemotebuildbotResourceUsageStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildbotResourceUsageStat]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemotebuildbotResourceUsageStatMutableBuilder[Self <: GoogleDevtoolsRemotebuildbotResourceUsageStat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    @scala.inline
    def setUsed(value: String): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedUndefined: Self = StObject.set(x, "used", js.undefined)
  }
}
