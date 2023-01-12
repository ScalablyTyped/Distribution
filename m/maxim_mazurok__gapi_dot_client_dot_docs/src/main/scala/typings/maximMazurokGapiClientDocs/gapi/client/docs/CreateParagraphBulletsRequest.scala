package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateParagraphBulletsRequest extends StObject {
  
  /** The kinds of bullet glyphs to be used. */
  var bulletPreset: js.UndefOr[String] = js.undefined
  
  /** The range to apply the bullet preset to. */
  var range: js.UndefOr[Range] = js.undefined
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
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
