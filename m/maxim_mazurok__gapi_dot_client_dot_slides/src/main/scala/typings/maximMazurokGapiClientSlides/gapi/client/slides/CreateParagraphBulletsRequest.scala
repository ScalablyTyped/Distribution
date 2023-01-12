package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateParagraphBulletsRequest extends StObject {
  
  /** The kinds of bullet glyphs to be used. Defaults to the `BULLET_DISC_CIRCLE_SQUARE` preset. */
  var bulletPreset: js.UndefOr[String] = js.undefined
  
  /** The optional table cell location if the text to be modified is in a table cell. If present, the object_id must refer to a table. */
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  
  /** The object ID of the shape or table containing the text to add bullets to. */
  var objectId: js.UndefOr[String] = js.undefined
  
  /** The range of text to apply the bullet presets to, based on TextElement indexes. */
  var textRange: js.UndefOr[Range] = js.undefined
}
object CreateParagraphBulletsRequest {
  
  inline def apply(): CreateParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateParagraphBulletsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateParagraphBulletsRequest] (val x: Self) extends AnyVal {
    
    inline def setBulletPreset(value: String): Self = StObject.set(x, "bulletPreset", value.asInstanceOf[js.Any])
    
    inline def setBulletPresetUndefined: Self = StObject.set(x, "bulletPreset", js.undefined)
    
    inline def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
    
    inline def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setTextRange(value: Range): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
    
    inline def setTextRangeUndefined: Self = StObject.set(x, "textRange", js.undefined)
  }
}
