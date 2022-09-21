package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalNode extends StObject {
  
  /** The node's display name. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. Resource name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** User ids used by the devices belonging to this node. */
  var sasUserIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SasPortalNode {
  
  inline def apply(): SasPortalNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalNode]
  }
  
  extension [Self <: SasPortalNode](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSasUserIds(value: js.Array[String]): Self = StObject.set(x, "sasUserIds", value.asInstanceOf[js.Any])
    
    inline def setSasUserIdsUndefined: Self = StObject.set(x, "sasUserIds", js.undefined)
    
    inline def setSasUserIdsVarargs(value: String*): Self = StObject.set(x, "sasUserIds", js.Array(value*))
  }
}
