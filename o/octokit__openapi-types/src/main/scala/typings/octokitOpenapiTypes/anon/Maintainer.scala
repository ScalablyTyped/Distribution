package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maintainer extends StObject {
  
  var created_at: String
  
  var maintainer: js.UndefOr[Gravatarid] = js.undefined
  
  var node_id: String
  
  var privacy_level: String
  
  /** User */
  var sponsor: Deleted | Null
  
  /** User */
  var sponsorable: Deleted | Null
  
  /**
    * Sponsorship Tier
    * @description The `tier_changed` and `pending_tier_change` will include the original tier before the change or pending change. For more information, see the pending tier change payload.
    */
  var tier: Iscustomammount
}
object Maintainer {
  
  inline def apply(created_at: String, node_id: String, privacy_level: String, tier: Iscustomammount): Maintainer = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], privacy_level = privacy_level.asInstanceOf[js.Any], tier = tier.asInstanceOf[js.Any], sponsor = null, sponsorable = null)
    __obj.asInstanceOf[Maintainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Maintainer] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setMaintainer(value: Gravatarid): Self = StObject.set(x, "maintainer", value.asInstanceOf[js.Any])
    
    inline def setMaintainerUndefined: Self = StObject.set(x, "maintainer", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPrivacy_level(value: String): Self = StObject.set(x, "privacy_level", value.asInstanceOf[js.Any])
    
    inline def setSponsor(value: Deleted): Self = StObject.set(x, "sponsor", value.asInstanceOf[js.Any])
    
    inline def setSponsorNull: Self = StObject.set(x, "sponsor", null)
    
    inline def setSponsorable(value: Deleted): Self = StObject.set(x, "sponsorable", value.asInstanceOf[js.Any])
    
    inline def setSponsorableNull: Self = StObject.set(x, "sponsorable", null)
    
    inline def setTier(value: Iscustomammount): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
  }
}
