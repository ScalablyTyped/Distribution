package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParagraphMarker extends StObject {
  
  /** The bullet for this paragraph. If not present, the paragraph does not belong to a list. */
  var bullet: js.UndefOr[Bullet] = js.native
  
  /** The paragraph's style */
  var style: js.UndefOr[ParagraphStyle] = js.native
}
object ParagraphMarker {
  
  @scala.inline
  def apply(): ParagraphMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphMarker]
  }
  
  @scala.inline
  implicit class ParagraphMarkerMutableBuilder[Self <: ParagraphMarker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBullet(value: Bullet): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
    
    @scala.inline
    def setStyle(value: ParagraphStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
