package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateInstanceRequest extends StObject {
  
  /** Specifies the instance to update. */
  var instance: js.UndefOr[GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance] = js.undefined
  
  /** Deprecated, use instance.logging_enabled instead. Whether to enable Stackdriver logging for this instance. */
  var loggingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated, use instance.Name instead. Name of the instance to update. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The update mask applies to instance. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask If an empty
    * update_mask is provided, only the non-default valued field in the worker pool field will be updated. Note that in order to update a field to the default value (zero, false, empty
    * string) an explicit update_mask must be provided.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateInstanceRequest {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateInstanceRequest]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateInstanceRequestMutableBuilder[Self <: GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setLoggingEnabled(value: Boolean): Self = StObject.set(x, "loggingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingEnabledUndefined: Self = StObject.set(x, "loggingEnabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
