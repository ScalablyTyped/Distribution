package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overlay extends StObject {
  
  /** List of Animations. The list should be chronological, without any time overlap. */
  var animations: js.UndefOr[js.Array[Animation]] = js.native
  
  /** Image overlay. */
  var image: js.UndefOr[Image] = js.native
}
object Overlay {
  
  @scala.inline
  def apply(): Overlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overlay]
  }
  
  @scala.inline
  implicit class OverlayMutableBuilder[Self <: Overlay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimations(value: js.Array[Animation]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
    
    @scala.inline
    def setAnimationsVarargs(value: Animation*): Self = StObject.set(x, "animations", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
