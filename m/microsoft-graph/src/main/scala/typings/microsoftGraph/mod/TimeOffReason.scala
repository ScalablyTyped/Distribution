package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeOffReason extends ChangeTrackedEntity {
  
  // The name of the timeOffReason. Required.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Supported icon types: none; car; calendar; running; plane; firstAid; doctor; notWorking; clock; juryDuty; globe; cup;
    * phone; weather; umbrella; piggyBank; dog; cake; trafficCone; pin; sunny. Required.
    */
  var iconType: js.UndefOr[NullableOption[TimeOffReasonIconType]] = js.native
  
  // Indicates whether the timeOffReason can be used when creating new entities or updating existing ones. Required.
  var isActive: js.UndefOr[NullableOption[Boolean]] = js.native
}
object TimeOffReason {
  
  @scala.inline
  def apply(): TimeOffReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOffReason]
  }
  
  @scala.inline
  implicit class TimeOffReasonMutableBuilder[Self <: TimeOffReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setIconType(value: NullableOption[TimeOffReasonIconType]): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconTypeNull: Self = StObject.set(x, "iconType", null)
    
    @scala.inline
    def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
    
    @scala.inline
    def setIsActive(value: NullableOption[Boolean]): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActiveNull: Self = StObject.set(x, "isActive", null)
    
    @scala.inline
    def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
  }
}
