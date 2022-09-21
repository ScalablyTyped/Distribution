package typings.ol

import typings.ol.baseImageMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @JSImport("ol/layer/Image", JSImport.Default)
  @js.native
  open class default () extends ImageLayer {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait ImageLayer
    extends typings.ol.baseImageMod.default
}
