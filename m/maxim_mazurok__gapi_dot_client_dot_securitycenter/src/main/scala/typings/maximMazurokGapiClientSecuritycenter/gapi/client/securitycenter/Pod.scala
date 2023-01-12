package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pod extends StObject {
  
  /** Pod containers associated with this finding, if any. */
  var containers: js.UndefOr[js.Array[Container]] = js.undefined
  
  /** Pod labels. For Kubernetes containers, these are applied to the container. */
  var labels: js.UndefOr[js.Array[Label]] = js.undefined
  
  /** Kubernetes Pod name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Kubernetes Pod namespace. */
  var ns: js.UndefOr[String] = js.undefined
}
object Pod {
  
  inline def apply(): Pod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pod] (val x: Self) extends AnyVal {
    
    inline def setContainers(value: js.Array[Container]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: Container*): Self = StObject.set(x, "containers", js.Array(value*))
    
    inline def setLabels(value: js.Array[Label]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: Label*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
  }
}
