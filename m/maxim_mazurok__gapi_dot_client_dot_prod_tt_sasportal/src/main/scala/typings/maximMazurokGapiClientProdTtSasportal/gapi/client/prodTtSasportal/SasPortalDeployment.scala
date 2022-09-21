package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalDeployment extends StObject {
  
  /** The deployment's display name. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. The FRNs copied from its direct parent. */
  var frns: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Resource name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** User ID used by the devices belonging to this deployment. Each deployment should be associated with one unique user ID. */
  var sasUserIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SasPortalDeployment {
  
  inline def apply(): SasPortalDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalDeployment]
  }
  
  extension [Self <: SasPortalDeployment](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFrns(value: js.Array[String]): Self = StObject.set(x, "frns", value.asInstanceOf[js.Any])
    
    inline def setFrnsUndefined: Self = StObject.set(x, "frns", js.undefined)
    
    inline def setFrnsVarargs(value: String*): Self = StObject.set(x, "frns", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSasUserIds(value: js.Array[String]): Self = StObject.set(x, "sasUserIds", value.asInstanceOf[js.Any])
    
    inline def setSasUserIdsUndefined: Self = StObject.set(x, "sasUserIds", js.undefined)
    
    inline def setSasUserIdsVarargs(value: String*): Self = StObject.set(x, "sasUserIds", js.Array(value*))
  }
}
