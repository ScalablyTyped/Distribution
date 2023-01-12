package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetingExpansionConfig extends StObject {
  
  /**
    * Required. Whether to exclude first party audiences from targeting. Similar audiences of the excluded first party lists will not be excluded. Only applicable when a first-party
    * audience is positively targeted (directly or included in a combined audience), otherwise this selection will be ignored.
    */
  var excludeFirstPartyAudience: js.UndefOr[Boolean] = js.undefined
  
  /** Required. Magnitude of expansion for applicable targeting under this line item. */
  var targetingExpansionLevel: js.UndefOr[String] = js.undefined
}
object TargetingExpansionConfig {
  
  inline def apply(): TargetingExpansionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingExpansionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetingExpansionConfig] (val x: Self) extends AnyVal {
    
    inline def setExcludeFirstPartyAudience(value: Boolean): Self = StObject.set(x, "excludeFirstPartyAudience", value.asInstanceOf[js.Any])
    
    inline def setExcludeFirstPartyAudienceUndefined: Self = StObject.set(x, "excludeFirstPartyAudience", js.undefined)
    
    inline def setTargetingExpansionLevel(value: String): Self = StObject.set(x, "targetingExpansionLevel", value.asInstanceOf[js.Any])
    
    inline def setTargetingExpansionLevelUndefined: Self = StObject.set(x, "targetingExpansionLevel", js.undefined)
  }
}
