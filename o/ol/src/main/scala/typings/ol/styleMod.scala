package typings.ol

import typings.ol.colorMod.Color
import typings.ol.imageStateMod.ImageState
import typings.ol.sizeMod.Size
import typings.ol.styleCircleMod.Options
import typings.ol.styleCircleMod.default
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleMod {
  
  @JSImport("ol/style", "Circle")
  @js.native
  open class Circle () extends default {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/style", "Fill")
  @js.native
  open class Fill ()
    extends typings.ol.styleFillMod.default {
    def this(opt_options: typings.ol.styleFillMod.Options) = this()
  }
  
  @JSImport("ol/style", "Icon")
  @js.native
  open class Icon ()
    extends typings.ol.styleIconMod.default {
    def this(opt_options: typings.ol.styleIconMod.Options) = this()
  }
  
  @JSImport("ol/style", "IconImage")
  @js.native
  open class IconImage protected ()
    extends typings.ol.styleIconImageMod.default {
    def this(
      image: HTMLCanvasElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLCanvasElement,
      src: Unit,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLImageElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLImageElement,
      src: Unit,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("ol/style", "Image")
  @js.native
  open class Image protected ()
    extends typings.ol.styleImageMod.default {
    def this(options: typings.ol.styleImageMod.Options) = this()
  }
  
  @JSImport("ol/style", "RegularShape")
  @js.native
  open class RegularShape protected ()
    extends typings.ol.styleRegularShapeMod.default {
    def this(options: typings.ol.styleRegularShapeMod.Options) = this()
  }
  
  @JSImport("ol/style", "Stroke")
  @js.native
  open class Stroke ()
    extends typings.ol.styleStrokeMod.default {
    def this(opt_options: typings.ol.styleStrokeMod.Options) = this()
  }
  
  @JSImport("ol/style", "Style")
  @js.native
  open class Style ()
    extends typings.ol.styleStyleMod.default {
    def this(opt_options: typings.ol.styleStyleMod.Options) = this()
  }
  
  @JSImport("ol/style", "Text")
  @js.native
  open class Text ()
    extends typings.ol.styleTextMod.default {
    def this(opt_options: typings.ol.styleTextMod.Options) = this()
  }
}
