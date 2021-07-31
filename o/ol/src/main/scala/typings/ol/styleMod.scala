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
  class Circle () extends default {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/style", "Fill")
  @js.native
  class Fill ()
    extends typings.ol.fillMod.default {
    def this(opt_options: typings.ol.fillMod.Options) = this()
  }
  
  @JSImport("ol/style", "Icon")
  @js.native
  class Icon ()
    extends typings.ol.iconMod.default {
    def this(opt_options: typings.ol.iconMod.Options) = this()
  }
  
  @JSImport("ol/style", "IconImage")
  @js.native
  class IconImage protected ()
    extends typings.ol.iconImageMod.default {
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
  
  @JSImport("ol/style", "Image")
  @js.native
  abstract class Image protected ()
    extends typings.ol.styleImageMod.default {
    def this(options: typings.ol.styleImageMod.Options) = this()
  }
  
  @JSImport("ol/style", "RegularShape")
  @js.native
  class RegularShape protected ()
    extends typings.ol.regularShapeMod.default {
    def this(options: typings.ol.regularShapeMod.Options) = this()
  }
  
  @JSImport("ol/style", "Stroke")
  @js.native
  class Stroke ()
    extends typings.ol.strokeMod.default {
    def this(opt_options: typings.ol.strokeMod.Options) = this()
  }
  
  @JSImport("ol/style", "Style")
  @js.native
  class Style ()
    extends typings.ol.styleStyleMod.default {
    def this(opt_options: typings.ol.styleStyleMod.Options) = this()
  }
  
  @JSImport("ol/style", "Text")
  @js.native
  class Text ()
    extends typings.ol.textMod.default {
    def this(opt_options: typings.ol.textMod.Options) = this()
  }
}
