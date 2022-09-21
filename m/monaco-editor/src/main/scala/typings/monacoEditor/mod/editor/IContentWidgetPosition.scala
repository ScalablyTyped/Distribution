package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IPosition
import typings.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContentWidgetPosition extends StObject {
  
  /**
    * Desired position for the content widget.
    * `preference` will also affect the placement.
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
    * Optionally, a range can be provided to further
    * define the position of the content widget.
    */
  var range: js.UndefOr[IRange | Null] = js.undefined
}
object IContentWidgetPosition {
  
  inline def apply(preference: js.Array[ContentWidgetPositionPreference]): IContentWidgetPosition = {
    val __obj = js.Dynamic.literal(preference = preference.asInstanceOf[js.Any], position = null)
    __obj.asInstanceOf[IContentWidgetPosition]
  }
  
  extension [Self <: IContentWidgetPosition](x: Self) {
    
    inline def setPosition(value: IPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionAffinity(value: PositionAffinity): Self = StObject.set(x, "positionAffinity", value.asInstanceOf[js.Any])
    
    inline def setPositionAffinityUndefined: Self = StObject.set(x, "positionAffinity", js.undefined)
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPreference(value: js.Array[ContentWidgetPositionPreference]): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceVarargs(value: ContentWidgetPositionPreference*): Self = StObject.set(x, "preference", js.Array(value*))
    
    inline def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeNull: Self = StObject.set(x, "range", null)
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
