package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TControlOptions extends StObject {
  
  var anchor: js.UndefOr[ControlAnchor] = js.undefined
  
  var attachToViewer: js.UndefOr[Boolean] = js.undefined
  
  var autoFade: js.UndefOr[Boolean] = js.undefined
}
object TControlOptions {
  
  @scala.inline
  def apply(): TControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TControlOptions]
  }
  
  @scala.inline
  implicit class TControlOptionsMutableBuilder[Self <: TControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: ControlAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setAttachToViewer(value: Boolean): Self = StObject.set(x, "attachToViewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachToViewerUndefined: Self = StObject.set(x, "attachToViewer", js.undefined)
    
    @scala.inline
    def setAutoFade(value: Boolean): Self = StObject.set(x, "autoFade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFadeUndefined: Self = StObject.set(x, "autoFade", js.undefined)
  }
}
