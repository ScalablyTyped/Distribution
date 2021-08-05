package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerReference extends StObject {
  
  /** API version of the referent. */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /**
    * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To
    * set this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned. +optional
    */
  var blockOwnerDeletion: js.UndefOr[Boolean] = js.undefined
  
  /** If true, this reference points to the managing controller. +optional */
  var controller: js.UndefOr[Boolean] = js.undefined
  
  /** Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names */
  var name: js.UndefOr[String] = js.undefined
  
  /** UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids */
  var uid: js.UndefOr[String] = js.undefined
}
object OwnerReference {
  
  inline def apply(): OwnerReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OwnerReference]
  }
  
  extension [Self <: OwnerReference](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setBlockOwnerDeletion(value: Boolean): Self = StObject.set(x, "blockOwnerDeletion", value.asInstanceOf[js.Any])
    
    inline def setBlockOwnerDeletionUndefined: Self = StObject.set(x, "blockOwnerDeletion", js.undefined)
    
    inline def setController(value: Boolean): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
