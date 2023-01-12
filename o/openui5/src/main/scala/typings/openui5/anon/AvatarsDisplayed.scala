package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvatarsDisplayed extends StObject {
  
  /**
    * The number of currently displayed (visible) avatars.
    */
  var avatarsDisplayed: js.UndefOr[int] = js.undefined
  
  /**
    * The `GroupType` of the control.
    */
  var groupType: js.UndefOr[String] = js.undefined
  
  /**
    * Indication whether the overflow button is pressed.
    */
  var overflowButtonPressed: js.UndefOr[Boolean] = js.undefined
}
object AvatarsDisplayed {
  
  inline def apply(): AvatarsDisplayed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvatarsDisplayed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvatarsDisplayed] (val x: Self) extends AnyVal {
    
    inline def setAvatarsDisplayed(value: int): Self = StObject.set(x, "avatarsDisplayed", value.asInstanceOf[js.Any])
    
    inline def setAvatarsDisplayedUndefined: Self = StObject.set(x, "avatarsDisplayed", js.undefined)
    
    inline def setGroupType(value: String): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
    
    inline def setGroupTypeUndefined: Self = StObject.set(x, "groupType", js.undefined)
    
    inline def setOverflowButtonPressed(value: Boolean): Self = StObject.set(x, "overflowButtonPressed", value.asInstanceOf[js.Any])
    
    inline def setOverflowButtonPressedUndefined: Self = StObject.set(x, "overflowButtonPressed", js.undefined)
  }
}
