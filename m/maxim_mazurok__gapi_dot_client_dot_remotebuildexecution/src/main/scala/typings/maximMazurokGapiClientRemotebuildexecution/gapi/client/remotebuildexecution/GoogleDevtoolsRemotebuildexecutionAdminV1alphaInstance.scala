package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance extends StObject {
  
  /** The policy to define whether or not RBE features can be used or how they can be used. */
  var featurePolicy: js.UndefOr[GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy] = js.native
  
  /** The location is a GCP region. Currently only `us-central1` is supported. */
  var location: js.UndefOr[String] = js.native
  
  /** Output only. Whether stack driver logging is enabled for the instance. */
  var loggingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Output only. Instance resource name formatted as: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`. Name should not be populated when creating an instance since it is provided in the
    * `instance_id` field.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. State of the instance. */
  var state: js.UndefOr[String] = js.native
}
object GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstanceMutableBuilder[Self <: GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeaturePolicy(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy): Self = StObject.set(x, "featurePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturePolicyUndefined: Self = StObject.set(x, "featurePolicy", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLoggingEnabled(value: Boolean): Self = StObject.set(x, "loggingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingEnabledUndefined: Self = StObject.set(x, "loggingEnabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
