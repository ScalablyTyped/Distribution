package typings.openlayers.mod.olx

import typings.openlayers.mod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object render {
  
  @js.native
  trait ToContextOptions extends StObject {
    
    var pixelRatio: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[Size] = js.native
  }
  object ToContextOptions {
    
    @scala.inline
    def apply(): ToContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToContextOptions]
    }
    
    @scala.inline
    implicit class ToContextOptionsMutableBuilder[Self <: ToContextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
