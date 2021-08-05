package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeOffReason
  extends StObject
     with ChangeTrackedEntity {
  
  // The name of the timeOffReason. Required.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Supported icon types: none; car; calendar; running; plane; firstAid; doctor; notWorking; clock; juryDuty; globe; cup;
    * phone; weather; umbrella; piggyBank; dog; cake; trafficCone; pin; sunny. Required.
    */
  var iconType: js.UndefOr[NullableOption[TimeOffReasonIconType]] = js.undefined
  
  // Indicates whether the timeOffReason can be used when creating new entities or updating existing ones. Required.
  var isActive: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object TimeOffReason {
  
  inline def apply(): TimeOffReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOffReason]
  }
  
  extension [Self <: TimeOffReason](x: Self) {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIconType(value: NullableOption[TimeOffReasonIconType]): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
    
    inline def setIconTypeNull: Self = StObject.set(x, "iconType", null)
    
    inline def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
    
    inline def setIsActive(value: NullableOption[Boolean]): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveNull: Self = StObject.set(x, "isActive", null)
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
  }
}
