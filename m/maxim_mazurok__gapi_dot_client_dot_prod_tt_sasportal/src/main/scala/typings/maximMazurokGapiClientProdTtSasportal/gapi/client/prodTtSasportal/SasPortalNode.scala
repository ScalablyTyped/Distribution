package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalNode extends StObject {
  
  /** The node's display name. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. Resource name. */
  var name: js.UndefOr[String] = js.native
  
  /** User ids used by the devices belonging to this node. */
  var sasUserIds: js.UndefOr[js.Array[String]] = js.native
}
object SasPortalNode {
  
  @scala.inline
  def apply(): SasPortalNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalNode]
  }
  
  @scala.inline
  implicit class SasPortalNodeMutableBuilder[Self <: SasPortalNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSasUserIds(value: js.Array[String]): Self = StObject.set(x, "sasUserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSasUserIdsUndefined: Self = StObject.set(x, "sasUserIds", js.undefined)
    
    @scala.inline
    def setSasUserIdsVarargs(value: String*): Self = StObject.set(x, "sasUserIds", js.Array(value :_*))
  }
}
