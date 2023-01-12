package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2RevisionTemplate extends StObject {
  
  /** KRM-style annotations for the resource. */
  var annotations: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Holds the single container that defines the unit of execution for this Revision. */
  var containers: js.UndefOr[js.Array[GoogleCloudRunV2Container]] = js.undefined
  
  /** A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek */
  var encryptionKey: js.UndefOr[String] = js.undefined
  
  /** The sandbox environment to host this Revision. */
  var executionEnvironment: js.UndefOr[String] = js.undefined
  
  /** KRM-style labels for the resource. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Sets the maximum number of requests that each serving instance can receive. */
  var maxInstanceRequestConcurrency: js.UndefOr[Double] = js.undefined
  
  /** The unique name for the revision. If this field is omitted, it will be automatically generated based on the Service name. */
  var revision: js.UndefOr[String] = js.undefined
  
  /** Scaling settings for this Revision. */
  var scaling: js.UndefOr[GoogleCloudRunV2RevisionScaling] = js.undefined
  
  /**
    * Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what
    * permissions the revision has. If not provided, the revision will use the project's default service account.
    */
  var serviceAccount: js.UndefOr[String] = js.undefined
  
  /** Max allowed time for an instance to respond to a request. */
  var timeout: js.UndefOr[String] = js.undefined
  
  /** A list of Volumes to make available to containers. */
  var volumes: js.UndefOr[js.Array[GoogleCloudRunV2Volume]] = js.undefined
  
  /** VPC Access configuration to use for this Revision. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc. */
  var vpcAccess: js.UndefOr[GoogleCloudRunV2VpcAccess] = js.undefined
}
object GoogleCloudRunV2RevisionTemplate {
  
  inline def apply(): GoogleCloudRunV2RevisionTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2RevisionTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudRunV2RevisionTemplate] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setContainers(value: js.Array[GoogleCloudRunV2Container]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: GoogleCloudRunV2Container*): Self = StObject.set(x, "containers", js.Array(value*))
    
    inline def setEncryptionKey(value: String): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setExecutionEnvironment(value: String): Self = StObject.set(x, "executionEnvironment", value.asInstanceOf[js.Any])
    
    inline def setExecutionEnvironmentUndefined: Self = StObject.set(x, "executionEnvironment", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMaxInstanceRequestConcurrency(value: Double): Self = StObject.set(x, "maxInstanceRequestConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxInstanceRequestConcurrencyUndefined: Self = StObject.set(x, "maxInstanceRequestConcurrency", js.undefined)
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    inline def setScaling(value: GoogleCloudRunV2RevisionScaling): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
    
    inline def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setVolumes(value: js.Array[GoogleCloudRunV2Volume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: GoogleCloudRunV2Volume*): Self = StObject.set(x, "volumes", js.Array(value*))
    
    inline def setVpcAccess(value: GoogleCloudRunV2VpcAccess): Self = StObject.set(x, "vpcAccess", value.asInstanceOf[js.Any])
    
    inline def setVpcAccessUndefined: Self = StObject.set(x, "vpcAccess", js.undefined)
  }
}
