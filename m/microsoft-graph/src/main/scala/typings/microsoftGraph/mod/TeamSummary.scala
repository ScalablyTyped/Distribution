package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamSummary extends StObject {
  
  var guestsCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  var membersCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  var ownersCount: js.UndefOr[NullableOption[Double]] = js.undefined
}
object TeamSummary {
  
  inline def apply(): TeamSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamSummary]
  }
  
  extension [Self <: TeamSummary](x: Self) {
    
    inline def setGuestsCount(value: NullableOption[Double]): Self = StObject.set(x, "guestsCount", value.asInstanceOf[js.Any])
    
    inline def setGuestsCountNull: Self = StObject.set(x, "guestsCount", null)
    
    inline def setGuestsCountUndefined: Self = StObject.set(x, "guestsCount", js.undefined)
    
    inline def setMembersCount(value: NullableOption[Double]): Self = StObject.set(x, "membersCount", value.asInstanceOf[js.Any])
    
    inline def setMembersCountNull: Self = StObject.set(x, "membersCount", null)
    
    inline def setMembersCountUndefined: Self = StObject.set(x, "membersCount", js.undefined)
    
    inline def setOwnersCount(value: NullableOption[Double]): Self = StObject.set(x, "ownersCount", value.asInstanceOf[js.Any])
    
    inline def setOwnersCountNull: Self = StObject.set(x, "ownersCount", null)
    
    inline def setOwnersCountUndefined: Self = StObject.set(x, "ownersCount", js.undefined)
  }
}
