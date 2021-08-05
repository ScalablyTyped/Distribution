package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParagraphMarker extends StObject {
  
  /** The bullet for this paragraph. If not present, the paragraph does not belong to a list. */
  var bullet: js.UndefOr[Bullet] = js.undefined
  
  /** The paragraph's style */
  var style: js.UndefOr[ParagraphStyle] = js.undefined
}
object ParagraphMarker {
  
  inline def apply(): ParagraphMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphMarker]
  }
  
  extension [Self <: ParagraphMarker](x: Self) {
    
    inline def setBullet(value: Bullet): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
    
    inline def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
    
    inline def setStyle(value: ParagraphStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
