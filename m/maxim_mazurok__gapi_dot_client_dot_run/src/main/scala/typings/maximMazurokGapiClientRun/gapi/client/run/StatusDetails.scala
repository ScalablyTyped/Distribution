package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusDetails extends StObject {
  
  /** The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes. +optional */
  var causes: js.UndefOr[js.Array[StatusCause]] = js.undefined
  
  /** The group attribute of the resource associated with the status StatusReason. +optional */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds +optional
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described). +optional */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may
    * indicate how long to wait before taking the alternate action. +optional
    */
  var retryAfterSeconds: js.UndefOr[Double] = js.undefined
  
  /** UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids +optional */
  var uid: js.UndefOr[String] = js.undefined
}
object StatusDetails {
  
  inline def apply(): StatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusDetails]
  }
  
  extension [Self <: StatusDetails](x: Self) {
    
    inline def setCauses(value: js.Array[StatusCause]): Self = StObject.set(x, "causes", value.asInstanceOf[js.Any])
    
    inline def setCausesUndefined: Self = StObject.set(x, "causes", js.undefined)
    
    inline def setCausesVarargs(value: StatusCause*): Self = StObject.set(x, "causes", js.Array(value :_*))
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRetryAfterSeconds(value: Double): Self = StObject.set(x, "retryAfterSeconds", value.asInstanceOf[js.Any])
    
    inline def setRetryAfterSecondsUndefined: Self = StObject.set(x, "retryAfterSeconds", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
