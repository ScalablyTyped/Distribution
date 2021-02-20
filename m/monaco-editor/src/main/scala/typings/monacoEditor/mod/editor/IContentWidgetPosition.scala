package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IPosition
import typings.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContentWidgetPosition extends StObject {
  
  /**
    * Desired position for the content widget.
    * `preference` will also affect the placement.
    */
  var position: IPosition | Null = js.native
  
  /**
    * Placement preference for position, in order of preference.
    */
  var preference: js.Array[ContentWidgetPositionPreference] = js.native
  
  /**
    * Optionally, a range can be provided to further
    * define the position of the content widget.
    */
  var range: js.UndefOr[IRange | Null] = js.native
}
object IContentWidgetPosition {
  
  @scala.inline
  def apply(preference: js.Array[ContentWidgetPositionPreference]): IContentWidgetPosition = {
    val __obj = js.Dynamic.literal(preference = preference.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentWidgetPosition]
  }
  
  @scala.inline
  implicit class IContentWidgetPositionMutableBuilder[Self <: IContentWidgetPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: IPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionNull: Self = StObject.set(x, "position", null)
    
    @scala.inline
    def setPreference(value: js.Array[ContentWidgetPositionPreference]): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferenceVarargs(value: ContentWidgetPositionPreference*): Self = StObject.set(x, "preference", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeNull: Self = StObject.set(x, "range", null)
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
