package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemotebuildexecutionAdminV1alphaSoleTenancyConfig extends StObject {
  
  /** The sole-tenant node type to host the pool's workers on. */
  var nodeType: js.UndefOr[String] = js.undefined
  
  /** Zone in which STNs are reserved. */
  var nodesZone: js.UndefOr[String] = js.undefined
}
object GoogleDevtoolsRemotebuildexecutionAdminV1alphaSoleTenancyConfig {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemotebuildexecutionAdminV1alphaSoleTenancyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildexecutionAdminV1alphaSoleTenancyConfig]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemotebuildexecutionAdminV1alphaSoleTenancyConfigMutableBuilder[Self <: GoogleDevtoolsRemotebuildexecutionAdminV1alphaSoleTenancyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
    
    @scala.inline
    def setNodesZone(value: String): Self = StObject.set(x, "nodesZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesZoneUndefined: Self = StObject.set(x, "nodesZone", js.undefined)
  }
}
