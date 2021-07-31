package typings.nodeSpriteGenerator

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.nodeSpriteGenerator.anon.xnumberynumberImage
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(option: Option): Unit = ^.asInstanceOf[js.Dynamic].apply(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(option: Option, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(option.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("node-sprite-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def middleware(option: Option): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(option.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.canvas
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.gm
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.jimp
  */
  trait BuiltinCompositors extends StObject
  object BuiltinCompositors {
    
    @scala.inline
    def canvas: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.canvas = "canvas".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.canvas]
    
    @scala.inline
    def gm: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.gm = "gm".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.gm]
    
    @scala.inline
    def jimp: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.jimp = "jimp".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.jimp]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.packed
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.vertical
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.horizontal
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.diagonal
  */
  trait BuiltinLayouts extends StObject
  object BuiltinLayouts {
    
    @scala.inline
    def diagonal: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.diagonal = "diagonal".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.diagonal]
    
    @scala.inline
    def horizontal: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.horizontal = "horizontal".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.horizontal]
    
    @scala.inline
    def packed: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.packed = "packed".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.packed]
    
    @scala.inline
    def vertical: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.vertical = "vertical".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.vertical]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.stylus
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.less
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sass
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.scss
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.css
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.`prefixed-css`
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.javascript
  */
  trait BuiltinStylesheetFormats extends StObject
  object BuiltinStylesheetFormats {
    
    @scala.inline
    def css: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.css = "css".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.css]
    
    @scala.inline
    def javascript: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.javascript = "javascript".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.javascript]
    
    @scala.inline
    def less: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.less = "less".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.less]
    
    @scala.inline
    def `prefixed-css`: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.`prefixed-css` = "prefixed-css".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.`prefixed-css`]
    
    @scala.inline
    def sass: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sass = "sass".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sass]
    
    @scala.inline
    def scss: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.scss = "scss".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.scss]
    
    @scala.inline
    def stylus: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.stylus = "stylus".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.stylus]
  }
  
  trait Compositor extends StObject {
    
    def readImages(
      files: js.Array[String],
      callback: js.Function2[/* error */ Error, /* images */ js.Array[Image], Unit]
    ): Unit
    
    def render(
      layout: Layout,
      spritePath: String,
      options: CompositorOption,
      callback: js.Function1[/* error */ Error, Unit]
    ): Unit
  }
  object Compositor {
    
    @scala.inline
    def apply(
      readImages: (js.Array[String], js.Function2[/* error */ Error, /* images */ js.Array[Image], Unit]) => Unit,
      render: (Layout, String, CompositorOption, js.Function1[/* error */ Error, Unit]) => Unit
    ): Compositor = {
      val __obj = js.Dynamic.literal(readImages = js.Any.fromFunction2(readImages), render = js.Any.fromFunction4(render))
      __obj.asInstanceOf[Compositor]
    }
    
    @scala.inline
    implicit class CompositorMutableBuilder[Self <: Compositor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReadImages(
        value: (js.Array[String], js.Function2[/* error */ Error, /* images */ js.Array[Image], Unit]) => Unit
      ): Self = StObject.set(x, "readImages", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRender(value: (Layout, String, CompositorOption, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction4(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.all
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.none
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sub
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.up
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.average
    - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.paeth
  */
  trait CompositorFilters extends StObject
  object CompositorFilters {
    
    @scala.inline
    def all: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.all = "all".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.all]
    
    @scala.inline
    def average: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.average = "average".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.average]
    
    @scala.inline
    def none: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.none = "none".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.none]
    
    @scala.inline
    def paeth: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.paeth = "paeth".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.paeth]
    
    @scala.inline
    def sub: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sub = "sub".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sub]
    
    @scala.inline
    def up: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.up = "up".asInstanceOf[typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.up]
  }
  
  trait CompositorOption extends StObject {
    
    var compressionLevel: js.UndefOr[Double] = js.undefined
    
    var filter: js.UndefOr[CompositorFilters] = js.undefined
  }
  object CompositorOption {
    
    @scala.inline
    def apply(): CompositorOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompositorOption]
    }
    
    @scala.inline
    implicit class CompositorOptionMutableBuilder[Self <: CompositorOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompressionLevel(value: Double): Self = StObject.set(x, "compressionLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionLevelUndefined: Self = StObject.set(x, "compressionLevel", js.undefined)
      
      @scala.inline
      def setFilter(value: CompositorFilters): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  trait Image extends StObject {
    
    var data: js.Any
    
    var height: Double
    
    var width: Double
  }
  object Image {
    
    @scala.inline
    def apply(data: js.Any, height: Double, width: Double): Image = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    @scala.inline
    implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Layout extends StObject {
    
    var height: Double
    
    var images: js.Array[xnumberynumberImage]
    
    var width: Double
  }
  object Layout {
    
    @scala.inline
    def apply(height: Double, images: js.Array[xnumberynumberImage], width: Double): Layout = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout]
    }
    
    @scala.inline
    implicit class LayoutMutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImages(value: js.Array[xnumberynumberImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesVarargs(value: xnumberynumberImage*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type LayoutFunc = js.Function3[
    /* images */ js.Array[Image], 
    /* options */ LayoutOption, 
    /* callback */ js.Function2[/* error */ Error, /* layout */ Layout, Unit], 
    Unit
  ]
  
  trait LayoutOption extends StObject {
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var scaling: js.UndefOr[Double] = js.undefined
  }
  object LayoutOption {
    
    @scala.inline
    def apply(): LayoutOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutOption]
    }
    
    @scala.inline
    implicit class LayoutOptionMutableBuilder[Self <: LayoutOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setScaling(value: Double): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    }
  }
  
  trait Option extends StObject {
    
    var compositor: js.UndefOr[BuiltinCompositors | Compositor] = js.undefined
    
    var compositorOptions: js.UndefOr[CompositorOption] = js.undefined
    
    var layout: js.UndefOr[BuiltinLayouts | LayoutFunc] = js.undefined
    
    var layoutOptions: js.UndefOr[LayoutOption] = js.undefined
    
    var spritePath: js.UndefOr[String] = js.undefined
    
    var src: js.UndefOr[js.Array[String]] = js.undefined
    
    var stylesheet: js.UndefOr[BuiltinStylesheetFormats | StylesheetFunc | String] = js.undefined
    
    var stylesheetOptions: js.UndefOr[StylesheetOption] = js.undefined
    
    var stylesheetPath: js.UndefOr[String] = js.undefined
  }
  object Option {
    
    @scala.inline
    def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompositor(value: BuiltinCompositors | Compositor): Self = StObject.set(x, "compositor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompositorOptions(value: CompositorOption): Self = StObject.set(x, "compositorOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompositorOptionsUndefined: Self = StObject.set(x, "compositorOptions", js.undefined)
      
      @scala.inline
      def setCompositorUndefined: Self = StObject.set(x, "compositor", js.undefined)
      
      @scala.inline
      def setLayout(value: BuiltinLayouts | LayoutFunc): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutFunction3(
        value: (/* images */ js.Array[Image], /* options */ LayoutOption, /* callback */ js.Function2[/* error */ Error, /* layout */ Layout, Unit]) => Unit
      ): Self = StObject.set(x, "layout", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLayoutOptions(value: LayoutOption): Self = StObject.set(x, "layoutOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutOptionsUndefined: Self = StObject.set(x, "layoutOptions", js.undefined)
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setSpritePath(value: String): Self = StObject.set(x, "spritePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpritePathUndefined: Self = StObject.set(x, "spritePath", js.undefined)
      
      @scala.inline
      def setSrc(value: js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value :_*))
      
      @scala.inline
      def setStylesheet(value: BuiltinStylesheetFormats | StylesheetFunc | String): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesheetFunction5(
        value: (/* layout */ Layout, /* stylesheetPath */ String, /* spritePath */ String, /* options */ StylesheetOption, /* callback */ js.Function1[/* error */ Error, Unit]) => Unit
      ): Self = StObject.set(x, "stylesheet", js.Any.fromFunction5(value))
      
      @scala.inline
      def setStylesheetOptions(value: StylesheetOption): Self = StObject.set(x, "stylesheetOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesheetOptionsUndefined: Self = StObject.set(x, "stylesheetOptions", js.undefined)
      
      @scala.inline
      def setStylesheetPath(value: String): Self = StObject.set(x, "stylesheetPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesheetPathUndefined: Self = StObject.set(x, "stylesheetPath", js.undefined)
      
      @scala.inline
      def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
    }
  }
  
  type StylesheetFunc = js.Function5[
    /* layout */ Layout, 
    /* stylesheetPath */ String, 
    /* spritePath */ String, 
    /* options */ StylesheetOption, 
    /* callback */ js.Function1[/* error */ Error, Unit], 
    Unit
  ]
  
  trait StylesheetOption extends StObject {
    
    var nameMapping: js.UndefOr[js.Function0[String]] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var spritePath: js.UndefOr[String] = js.undefined
  }
  object StylesheetOption {
    
    @scala.inline
    def apply(): StylesheetOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StylesheetOption]
    }
    
    @scala.inline
    implicit class StylesheetOptionMutableBuilder[Self <: StylesheetOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNameMapping(value: () => String): Self = StObject.set(x, "nameMapping", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNameMappingUndefined: Self = StObject.set(x, "nameMapping", js.undefined)
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSpritePath(value: String): Self = StObject.set(x, "spritePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpritePathUndefined: Self = StObject.set(x, "spritePath", js.undefined)
    }
  }
}
