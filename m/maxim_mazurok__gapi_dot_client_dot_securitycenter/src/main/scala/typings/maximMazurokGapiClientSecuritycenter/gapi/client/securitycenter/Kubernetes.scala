package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kubernetes extends StObject {
  
  /** Provides information on any Kubernetes access reviews (i.e. privilege checks) relevant to the finding. */
  var accessReviews: js.UndefOr[js.Array[AccessReview]] = js.undefined
  
  /** Provides Kubernetes role binding information for findings that involve RoleBindings or ClusterRoleBindings. */
  var bindings: js.UndefOr[js.Array[GoogleCloudSecuritycenterV1Binding]] = js.undefined
  
  /** GKE Node Pools associated with the finding. This field will contain NodePool information for each Node, when it is available. */
  var nodePools: js.UndefOr[js.Array[NodePool]] = js.undefined
  
  /** Provides Kubernetes Node information. */
  var nodes: js.UndefOr[js.Array[Node]] = js.undefined
  
  /** Kubernetes Pods associated with the finding. This field will contain Pod records for each container that is owned by a Pod. */
  var pods: js.UndefOr[js.Array[Pod]] = js.undefined
  
  /** Provides Kubernetes role information for findings that involve Roles or ClusterRoles. */
  var roles: js.UndefOr[js.Array[Role]] = js.undefined
}
object Kubernetes {
  
  inline def apply(): Kubernetes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Kubernetes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Kubernetes] (val x: Self) extends AnyVal {
    
    inline def setAccessReviews(value: js.Array[AccessReview]): Self = StObject.set(x, "accessReviews", value.asInstanceOf[js.Any])
    
    inline def setAccessReviewsUndefined: Self = StObject.set(x, "accessReviews", js.undefined)
    
    inline def setAccessReviewsVarargs(value: AccessReview*): Self = StObject.set(x, "accessReviews", js.Array(value*))
    
    inline def setBindings(value: js.Array[GoogleCloudSecuritycenterV1Binding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setBindingsVarargs(value: GoogleCloudSecuritycenterV1Binding*): Self = StObject.set(x, "bindings", js.Array(value*))
    
    inline def setNodePools(value: js.Array[NodePool]): Self = StObject.set(x, "nodePools", value.asInstanceOf[js.Any])
    
    inline def setNodePoolsUndefined: Self = StObject.set(x, "nodePools", js.undefined)
    
    inline def setNodePoolsVarargs(value: NodePool*): Self = StObject.set(x, "nodePools", js.Array(value*))
    
    inline def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setPods(value: js.Array[Pod]): Self = StObject.set(x, "pods", value.asInstanceOf[js.Any])
    
    inline def setPodsUndefined: Self = StObject.set(x, "pods", js.undefined)
    
    inline def setPodsVarargs(value: Pod*): Self = StObject.set(x, "pods", js.Array(value*))
    
    inline def setRoles(value: js.Array[Role]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: Role*): Self = StObject.set(x, "roles", js.Array(value*))
  }
}
