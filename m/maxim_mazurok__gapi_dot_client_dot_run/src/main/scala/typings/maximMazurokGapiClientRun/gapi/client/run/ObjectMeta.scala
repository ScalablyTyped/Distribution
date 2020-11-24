package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectMeta extends js.Object {
  
  /**
    * (Optional) Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and
    * should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
    */
  var annotations: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.ObjectMeta with TopLevel[js.Any]
  ] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported The name of the cluster which the object belongs to. This is used to distinguish resources with
    * same name and namespace in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or update request.
    */
  var clusterName: js.UndefOr[String] = js.native
  
  /**
    * (Optional) CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be set in happens-before order across separate
    * operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC. Populated by the system. Read-only. Null for lists. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Number of seconds allowed for this object to gracefully terminate before it will be removed from
    * the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.
    */
  var deletionGracePeriodSeconds: js.UndefOr[Double] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This field is
    * set by the server when a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be deleted (no longer visible from
    * resource lists, and not reachable by name) after the time in this field, once the finalizers list is empty. As long as the finalizers list contains items, deletion is blocked. Once
    * the deletionTimestamp is set, this value may not be unset or be set further into the future, although it may be shortened or the resource may be deleted prior to this time. For
    * example, a user may request that a pod is deleted in 30 seconds. The Kubelet will react by sending a graceful termination signal to the containers in the pod. After that 30 seconds,
    * the Kubelet will send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the presence of network partitions, this object may
    * still exist after this timestamp, until an administrator or automated process can determine the resource is fully terminated. If not set, graceful deletion of the object has not
    * been requested. Populated by the system when a graceful deletion is requested. Read-only. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  var deletionTimestamp: js.UndefOr[String] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Must be empty before the object is deleted from the registry. Each entry is an identifier for the
    * responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed. +patchStrategy=merge
    */
  var finalizers: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name
    * field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix.
    * The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server. If this field
    * is specified and the generated name exists, the server will NOT return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout indicating a unique name
    * could not be found in the time allotted, and the client should retry (optionally after the time indicated in the Retry-After header). Applied only if Name is not specified. More
    * info: https://git.k8s.io/community/contributors/devel/api-conventions.md#idempotency string generateName = 2;
    */
  var generateName: js.UndefOr[String] = js.native
  
  /** (Optional) A sequence number representing a specific generation of the desired state. Populated by the system. Read-only. */
  var generation: js.UndefOr[Double] = js.native
  
  /**
    * (Optional) Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and routes. More
    * info: http://kubernetes.io/docs/user-guide/labels
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.ObjectMeta with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Name must be unique within a namespace, within a Cloud Run region. Is required when creating resources, although some resources may allow a client to request the generation of an
    * appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info:
    * http://kubernetes.io/docs/user-guide/identifiers#names +optional
    */
  var name: js.UndefOr[String] = js.native
  
  /** Namespace defines the space within each name must be unique, within a Cloud Run region. In Cloud Run the namespace must be equal to either the project ID or project number. */
  var namespace: js.UndefOr[String] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported List of objects that own this object. If ALL objects in the list have been deleted, this object
    * will be garbage collected.
    */
  var ownerReferences: js.UndefOr[js.Array[OwnerReference]] = js.native
  
  /**
    * (Optional) An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic
    * concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They
    * may only be valid for a particular resource or set of resources. Populated by the system. Read-only. Value must be treated as opaque by clients. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
    */
  var resourceVersion: js.UndefOr[String] = js.native
  
  /** (Optional) SelfLink is a URL representing this object. Populated by the system. Read-only. string selfLink = 4; */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * (Optional) UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on
    * PUT operations. Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  var uid: js.UndefOr[String] = js.native
}
object ObjectMeta {
  
  @scala.inline
  def apply(): ObjectMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectMeta]
  }
  
  @scala.inline
  implicit class ObjectMetaOps[Self <: ObjectMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnnotations(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.ObjectMeta with TopLevel[js.Any]
    ): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterName: Self = this.set("clusterName", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDeletionGracePeriodSeconds(value: Double): Self = this.set("deletionGracePeriodSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionGracePeriodSeconds: Self = this.set("deletionGracePeriodSeconds", js.undefined)
    
    @scala.inline
    def setDeletionTimestamp(value: String): Self = this.set("deletionTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionTimestamp: Self = this.set("deletionTimestamp", js.undefined)
    
    @scala.inline
    def setFinalizersVarargs(value: String*): Self = this.set("finalizers", js.Array(value :_*))
    
    @scala.inline
    def setFinalizers(value: js.Array[String]): Self = this.set("finalizers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalizers: Self = this.set("finalizers", js.undefined)
    
    @scala.inline
    def setGenerateName(value: String): Self = this.set("generateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateName: Self = this.set("generateName", js.undefined)
    
    @scala.inline
    def setGeneration(value: Double): Self = this.set("generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneration: Self = this.set("generation", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.ObjectMeta with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setOwnerReferencesVarargs(value: OwnerReference*): Self = this.set("ownerReferences", js.Array(value :_*))
    
    @scala.inline
    def setOwnerReferences(value: js.Array[OwnerReference]): Self = this.set("ownerReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerReferences: Self = this.set("ownerReferences", js.undefined)
    
    @scala.inline
    def setResourceVersion(value: String): Self = this.set("resourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceVersion: Self = this.set("resourceVersion", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
  }
}
