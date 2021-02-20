package typings.plotlyJs

import typings.plotlyJs.anon.ColorColor
import typings.plotlyJs.anon.Partialopacitynumbercolor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scatterMod {
  
  @js.native
  trait ScatterSelectedMarker extends StObject {
    
    var marker: Partialopacitynumbercolor = js.native
    
    var textfont: ColorColor = js.native
  }
  object ScatterSelectedMarker {
    
    @scala.inline
    def apply(marker: Partialopacitynumbercolor, textfont: ColorColor): ScatterSelectedMarker = {
      val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], textfont = textfont.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterSelectedMarker]
    }
    
    @scala.inline
    implicit class ScatterSelectedMarkerMutableBuilder[Self <: ScatterSelectedMarker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMarker(value: Partialopacitynumbercolor): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextfont(value: ColorColor): Self = StObject.set(x, "textfont", value.asInstanceOf[js.Any])
    }
  }
}
