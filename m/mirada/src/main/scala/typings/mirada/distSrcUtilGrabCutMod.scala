package typings.mirada

import typings.mirada.distSrcTypesOpencvMod.Scalar
import typings.mirada.mod.File_
import typings.mirada.mod.Rect
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilGrabCutMod {
  
  @JSImport("mirada/dist/src/util/grabCut", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def grabCutObsolete(o: GrabCutObsoleteOptions): js.Promise[GrabCutOsoleteResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("grabCut_obsolete")(o.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GrabCutOsoleteResult]]
  
  @js.native
  trait GrabCutObsoleteOptions extends Rect {
    
    /**
      * If given a rectangle frame will be drawn on given coordinates with that color.
      */
    var frameColor: js.UndefOr[Scalar] = js.native
    
    var image: File_ = js.native
  }
  
  trait GrabCutOsoleteResult extends StObject {
    
    var image: ImageData
  }
  object GrabCutOsoleteResult {
    
    inline def apply(image: ImageData): GrabCutOsoleteResult = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[GrabCutOsoleteResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GrabCutOsoleteResult] (val x: Self) extends AnyVal {
      
      inline def setImage(value: ImageData): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    }
  }
}
