package typings.pixiTextBitmap

import typings.pixiCore.mod.ObservablePoint
import typings.pixiDisplay.libDisplayObjectMod.DisplayObject
import typings.pixiDisplay.mod.Container
import typings.pixiMesh.libMeshMaterialMod.MeshMaterial
import typings.pixiMesh.mod.Mesh
import typings.pixiText.libTextStyleMod.TextStyleAlign
import typings.pixiTextBitmap.anon.PartialIBitmapTextStyle
import typings.pixiTextBitmap.libBitmapFontMod.BitmapFont
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBitmapTextMod {
  
  @JSImport("@pixi/text-bitmap/lib/BitmapText", "BitmapText")
  @js.native
  open class BitmapText protected () extends Container[DisplayObject] {
    /**
      * @param text - A string that you would like the text to display.
      * @param style - The style parameters.
      * @param {string} style.fontName - The installed BitmapFont name.
      * @param {number} [style.fontSize] - The size of the font in pixels, e.g. 24. If undefined,
      *.     this will default to the BitmapFont size.
      * @param {string} [style.align='left'] - Alignment for multiline text ('left', 'center', 'right' or 'justify'),
      *      does not affect single line text.
      * @param {number} [style.tint=0xFFFFFF] - The tint color.
      * @param {number} [style.letterSpacing=0] - The amount of spacing between letters.
      * @param {number} [style.maxWidth=0] - The max width of the text before line wrapping.
      */
    def this(text: String) = this()
    def this(text: String, style: PartialIBitmapTextStyle) = this()
    
    /** Collection of page mesh data. */
    /* protected */ var _activePagesMeshData: js.Array[PageMeshData] = js.native
    
    /**
      * Private tracker for the current text align.
      * @type {string}
      * @private
      */
    /* protected */ var _align: TextStyleAlign = js.native
    
    /**
      * Text anchor.
      * @readonly
      * @private
      */
    /* protected */ var _anchor: ObservablePoint[Any] = js.native
    
    var _autoResolution: Boolean = js.native
    
    /**
      * Private tracker for the current font.
      * @private
      */
    /* protected */ var _font: js.UndefOr[BitmapFont] = js.native
    
    /**
      * Private tracker for the current font name.
      * @private
      */
    /* protected */ var _fontName: String = js.native
    
    /**
      * Private tracker for the current font size.
      * @private
      */
    /* protected */ var _fontSize: js.UndefOr[Double] = js.native
    
    /**
      * Letter spacing. This is useful for setting the space between characters.
      * @private
      */
    /* protected */ var _letterSpacing: Double = js.native
    
    /**
      * The max line height. This is useful when trying to use the total height of the Text,
      * ie: when trying to vertically align. (Internally used)
      * @private
      */
    /* protected */ var _maxLineHeight: Double = js.native
    
    /**
      * The max width of this bitmap text in pixels. If the text provided is longer than the
      * value provided, line breaks will be automatically inserted in the last whitespace.
      * Disable by setting value to 0
      * @private
      */
    /* protected */ var _maxWidth: Double = js.native
    
    /**
      * The resolution / device pixel ratio of the canvas.
      *
      * This is set to automatically match the renderer resolution by default, but can be overridden by setting manually.
      * @default PIXI.settings.RESOLUTION
      */
    var _resolution: Double = js.native
    
    /**
      * If true PixiJS will Math.floor() x/y values when rendering.
      * @default PIXI.settings.ROUND_PIXELS
      */
    /* protected */ var _roundPixels: Boolean = js.native
    
    /**
      * Private tracker for the current text.
      * @private
      */
    /* protected */ var _text: String = js.native
    
    /**
      * Private tracker for the height of the overall text.
      * @private
      */
    /* protected */ var _textHeight: Double = js.native
    
    /**
      * Private tracker for the width of the overall text.
      * @private
      */
    /* protected */ var _textWidth: Double = js.native
    
    /** Cached char texture is destroyed when BitmapText is destroyed. */
    /* private */ var _textureCache: Any = js.native
    
    /**
      * Private tracker for the current tint.
      * @private
      */
    /* protected */ var _tint: Double = js.native
    
    /**
      * The alignment of the BitmapText object.
      * @member {string}
      * @default 'left'
      */
    def align: TextStyleAlign = js.native
    def align_=(value: TextStyleAlign): Unit = js.native
    
    /**
      * The anchor sets the origin point of the text.
      *
      * The default is `(0,0)`, this means the text's origin is the top left.
      *
      * Setting the anchor to `(0.5,0.5)` means the text's origin is centered.
      *
      * Setting the anchor to `(1,1)` would mean the text's origin point will be the bottom right corner.
      */
    def anchor: ObservablePoint[Any] = js.native
    def anchor_=(value: ObservablePoint[Any]): Unit = js.native
    
    /** Set to `true` if the BitmapText needs to be redrawn. */
    var dirty: Boolean = js.native
    
    /** The name of the BitmapFont. */
    def fontName: String = js.native
    def fontName_=(value: String): Unit = js.native
    
    /** The size of the font to display. */
    def fontSize: Double = js.native
    def fontSize_=(value: js.UndefOr[Double]): Unit = js.native
    
    /** Additional space between characters. */
    def letterSpacing: Double = js.native
    def letterSpacing_=(value: Double): Unit = js.native
    
    /**
      * The max line height. This is useful when trying to use the total height of the Text,
      * i.e. when trying to vertically align.
      * @readonly
      */
    def maxLineHeight: Double = js.native
    
    /**
      * The max width of this bitmap text in pixels. If the text provided is longer than the
      * value provided, line breaks will be automatically inserted in the last whitespace.
      * Disable by setting the value to 0.
      */
    def maxWidth: Double = js.native
    def maxWidth_=(value: Double): Unit = js.native
    
    /**
      * The resolution / device pixel ratio of the canvas.
      *
      * This is set to automatically match the renderer resolution by default, but can be overridden by setting manually.
      * @default 1
      */
    def resolution: Double = js.native
    def resolution_=(value: Double): Unit = js.native
    
    /**
      * If true PixiJS will Math.floor() x/y values when rendering, stopping pixel interpolation.
      * Advantages can include sharper image quality (like text) and faster rendering on canvas.
      * The main disadvantage is movement of objects may appear less smooth.
      * To set the global default, change {@link PIXI.settings.ROUND_PIXELS}
      * @default PIXI.settings.ROUND_PIXELS
      */
    def roundPixels: Boolean = js.native
    def roundPixels_=(value: Boolean): Unit = js.native
    
    /** The text of the BitmapText object. */
    def text: String = js.native
    
    /**
      * The height of the overall text, different from fontSize,
      * which is defined in the style object.
      * @readonly
      */
    def textHeight: Double = js.native
    
    /**
      * The width of the overall text, different from fontSize,
      * which is defined in the style object.
      * @readonly
      */
    def textWidth: Double = js.native
    
    def text_=(text: String): Unit = js.native
    
    /**
      * The tint of the BitmapText object.
      * @default 0xffffff
      */
    def tint: Double = js.native
    def tint_=(value: Double): Unit = js.native
    
    /** Renders text and updates it when needed. This should only be called if the BitmapFont is regenerated. */
    def updateText(): Unit = js.native
    
    /**
      * Updates text when needed
      * @private
      */
    /* protected */ def validate(): Unit = js.native
  }
  /* static members */
  object BitmapText {
    
    @JSImport("@pixi/text-bitmap/lib/BitmapText", "BitmapText")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pixi/text-bitmap/lib/BitmapText", "BitmapText.styleDefaults")
    @js.native
    def styleDefaults: PartialIBitmapTextStyle = js.native
    inline def styleDefaults_=(x: PartialIBitmapTextStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styleDefaults")(x.asInstanceOf[js.Any])
  }
  
  trait PageMeshData extends StObject {
    
    var index: Double
    
    var indexCount: Double
    
    var indices: js.UndefOr[js.typedarray.Uint16Array] = js.undefined
    
    var mesh: Mesh[MeshMaterial]
    
    var total: Double
    
    var uvs: js.UndefOr[js.typedarray.Float32Array] = js.undefined
    
    var uvsCount: Double
    
    var vertexCount: Double
    
    var vertices: js.UndefOr[js.typedarray.Float32Array] = js.undefined
  }
  object PageMeshData {
    
    inline def apply(
      index: Double,
      indexCount: Double,
      mesh: Mesh[MeshMaterial],
      total: Double,
      uvsCount: Double,
      vertexCount: Double
    ): PageMeshData = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], indexCount = indexCount.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], uvsCount = uvsCount.asInstanceOf[js.Any], vertexCount = vertexCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageMeshData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageMeshData] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexCount(value: Double): Self = StObject.set(x, "indexCount", value.asInstanceOf[js.Any])
      
      inline def setIndices(value: js.typedarray.Uint16Array): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
      
      inline def setMesh(value: Mesh[MeshMaterial]): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setUvs(value: js.typedarray.Float32Array): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
      
      inline def setUvsCount(value: Double): Self = StObject.set(x, "uvsCount", value.asInstanceOf[js.Any])
      
      inline def setUvsUndefined: Self = StObject.set(x, "uvs", js.undefined)
      
      inline def setVertexCount(value: Double): Self = StObject.set(x, "vertexCount", value.asInstanceOf[js.Any])
      
      inline def setVertices(value: js.typedarray.Float32Array): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    }
  }
}
