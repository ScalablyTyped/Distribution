package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContentWidgetPosition extends StObject {
  
  /**
    * Desired position which serves as an anchor for placing the content widget.
    * The widget will be placed above, at, or below the specified position, based on the
    * provided preference. The widget will always touch this position.
    *
    * Given sufficient horizontal space, the widget will be placed to the right of the
    * passed in position. This can be tweaked by providing a `secondaryPosition`.
    *
    * @see preference
    * @see secondaryPosition
    */
  var position: IPosition | Null
  
  /**
    * Placement preference when multiple view positions refer to the same (model) position.
    * This plays a role when injected text is involved.
    */
  var positionAffinity: js.UndefOr[PositionAffinity] = js.undefined
  
  /**
    * Placement preference for position, in order of preference.
    */
  var preference: js.Array[ContentWidgetPositionPreference]
  
  /**
    * Optionally, a secondary position can be provided to further define the placing of
    * the content widget. The secondary position must have the same line number as the
    * primary position. If possible, the widget will be placed such that it also touches
    * the secondary position.
    */
  var secondaryPosition: js.UndefOr[IPosition | Null] = js.undefined
}
object IContentWidgetPosition {
  
  inline def apply(preference: js.Array[ContentWidgetPositionPreference]): IContentWidgetPosition = {
    val __obj = js.Dynamic.literal(preference = preference.asInstanceOf[js.Any], position = null)
    __obj.asInstanceOf[IContentWidgetPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IContentWidgetPosition] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: IPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionAffinity(value: PositionAffinity): Self = StObject.set(x, "positionAffinity", value.asInstanceOf[js.Any])
    
    inline def setPositionAffinityUndefined: Self = StObject.set(x, "positionAffinity", js.undefined)
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPreference(value: js.Array[ContentWidgetPositionPreference]): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceVarargs(value: ContentWidgetPositionPreference*): Self = StObject.set(x, "preference", js.Array(value*))
    
    inline def setSecondaryPosition(value: IPosition): Self = StObject.set(x, "secondaryPosition", value.asInstanceOf[js.Any])
    
    inline def setSecondaryPositionNull: Self = StObject.set(x, "secondaryPosition", null)
    
    inline def setSecondaryPositionUndefined: Self = StObject.set(x, "secondaryPosition", js.undefined)
  }
}
