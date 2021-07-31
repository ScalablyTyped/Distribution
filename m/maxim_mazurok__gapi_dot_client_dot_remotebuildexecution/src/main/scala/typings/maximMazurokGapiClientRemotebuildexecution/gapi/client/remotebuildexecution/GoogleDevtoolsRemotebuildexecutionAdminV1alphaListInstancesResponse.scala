package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse extends StObject {
  
  /** The list of instances in a given project. */
  var instances: js.UndefOr[js.Array[GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]] = js.undefined
}
object GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponseMutableBuilder[Self <: GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
