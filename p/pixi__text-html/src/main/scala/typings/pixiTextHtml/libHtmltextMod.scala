package typings.pixiTextHtml

import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiDisplay.libDisplayObjectMod.IDestroyOptions
import typings.pixiMath.mod.ISize
import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.pixiSprite.mod.Sprite
import typings.pixiText.mod.TextStyle
import typings.pixiTextHtml.anon.PartialITextStyle
import typings.pixiTextHtml.anon.Resolution
import typings.pixiTextHtml.libHtmltextstyleMod.HTMLTextStyle
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHtmltextMod {
  
  @JSImport("@pixi/text-html/lib/HTMLText", "HTMLText")
  @js.native
  /**
    * @param {string} [text] - Text contents
    * @param {PIXI.HTMLTextStyle|PIXI.TextStyle|PIXI.ITextStyle} [style] - Style setting to use.
    *        Strongly recommend using an HTMLTextStyle object. Providing a PIXI.TextStyle
    *        will convert the TextStyle to an HTMLTextStyle and will no longer be linked.
    */
  open class HTMLText () extends Sprite {
    def this(text: String) = this()
    def this(text: String, style: TextStyle) = this()
    def this(text: String, style: PartialITextStyle) = this()
    def this(text: String, style: HTMLTextStyle) = this()
    def this(text: Unit, style: TextStyle) = this()
    def this(text: Unit, style: PartialITextStyle) = this()
    def this(text: Unit, style: HTMLTextStyle) = this()
    
    /* private */ var _autoResolution: Any = js.native
    
    /* private */ var _domElement: Any = js.native
    
    /* private */ var _foreignObject: Any = js.native
    
    /* private */ var _image: Any = js.native
    
    /* private */ var _loadImage: Any = js.native
    
    /* private */ var _loading: Any = js.native
    
    /**
      * Handle dirty style changes
      * @private
      */
    def _onStyleChange(): Unit = js.native
    
    /**
      * Renders the object using the Canvas Renderer.
      * @private
      * @param {PIXI.CanvasRenderer} renderer - The renderer
      */
    def _renderCanvas(renderer: IRenderer[ICanvas]): Unit = js.native
    
    /* private */ var _resolution: Any = js.native
    
    /* private */ var _style: Any = js.native
    
    /* private */ var _styleElement: Any = js.native
    
    /* private */ var _svgRoot: Any = js.native
    
    /* private */ var _text: Any = js.native
    
    /* private */ var dirty: Any = js.native
    
    /* private */ var localStyleID: Any = js.native
    
    /** The maximum height in rendered pixels that the content can be, any larger will be hidden */
    var maxHeight: Double = js.native
    
    /** The maximum width in rendered pixels that the content can be, any larger will be hidden */
    var maxWidth: Double = js.native
    
    /**
      * Calculate the size of the output text without actually drawing it.
      * This includes the `padding` in the `style` object.
      * This can be used as a fast-pass to do things like text-fitting.
      * @param {object} [overrides] - Overrides for the text, style, and resolution.
      * @param {string} [overrides.text] - The text to measure, if not specified, the current text is used.
      * @param {PIXI.HTMLTextStyle} [overrides.style] - The style to measure, if not specified, the current style is used.
      * @param {number} [overrides.resolution] - The resolution to measure, if not specified, the current resolution is used.
      * @returns {PIXI.ISize} Width and height of the measured text.
      */
    def measureText(): ISize = js.native
    def measureText(overrides: Resolution): ISize = js.native
    
    /** The HTMLTextStyle object is owned by this instance */
    /* private */ var ownsStyle: Any = js.native
    
    /**
      * The resolution / device pixel ratio of the canvas.
      * This is set to automatically match the renderer resolution by default, but can be overridden by setting manually.
      * @member {number}
      * @default 1
      */
    def resolution: Double = js.native
    def resolution_=(value: Double): Unit = js.native
    
    /**
      * Sanitise text - replace `<br>` with `<br/>`, `&nbsp;` with `&#160;`
      * @param text
      * @see https://www.sitepoint.com/community/t/xhtml-1-0-transitional-xml-parsing-error-entity-nbsp-not-defined/3392/3
      */
    /* private */ var sanitiseText: Any = js.native
    
    /** The raw image element that is rendered under-the-hood. */
    def source: HTMLImageElement = js.native
    
    /** The base style to render with text. */
    def style: HTMLTextStyle = js.native
    def style_=(style: HTMLTextStyle | TextStyle | PartialITextStyle): Unit = js.native
    
    /**
      * Contents of text. This can be HTML text and include tags.
      * @example
      * const text = new HTMLText('This is a <em>styled</em> text!');
      * @member {string}
      */
    def text: String = js.native
    def text_=(text: String): Unit = js.native
    
    /**
      * Manually refresh the text.
      * @public
      * @param {boolean} respectDirty - Whether to abort updating the
      *        text if the Text isn't dirty and the function is called.
      */
    def updateText(): js.Promise[Unit] = js.native
    def updateText(respectDirty: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Update the texture resource.
      * @private
      */
    def updateTexture(): Unit = js.native
  }
  /* static members */
  object HTMLText {
    
    @JSImport("@pixi/text-html/lib/HTMLText", "HTMLText")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default autoResolution for all HTMLText objects */
    @JSImport("@pixi/text-html/lib/HTMLText", "HTMLText.defaultAutoResolution")
    @js.native
    def defaultAutoResolution: Boolean = js.native
    inline def defaultAutoResolution_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultAutoResolution")(x.asInstanceOf[js.Any])
    
    /**
      * Default opens when destroying.
      * @type {PIXI.IDestroyOptions}
      * @property {boolean} [texture=true] - Whether to destroy the texture.
      * @property {boolean} [children=false] - Whether to destroy the children.
      * @property {boolean} [baseTexture=true] - Whether to destroy the base texture.
      */
    @JSImport("@pixi/text-html/lib/HTMLText", "HTMLText.defaultDestroyOptions")
    @js.native
    def defaultDestroyOptions: IDestroyOptions = js.native
    inline def defaultDestroyOptions_=(x: IDestroyOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultDestroyOptions")(x.asInstanceOf[js.Any])
    
    /** Default maxHeight, set at construction */
    @JSImport("@pixi/text-html/lib/HTMLText", "HTMLText.defaultMaxHeight")
    @js.native
    def defaultMaxHeight: Double = js.native
    inline def defaultMaxHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxHeight")(x.asInstanceOf[js.Any])
    
    /** Default maxWidth, set at construction */
    @JSImport("@pixi/text-html/lib/HTMLText", "HTMLText.defaultMaxWidth")
    @js.native
    def defaultMaxWidth: Double = js.native
    inline def defaultMaxWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxWidth")(x.asInstanceOf[js.Any])
    
    /** Default resolution, make sure autoResolution or defaultAutoResolution is `false`. */
    @JSImport("@pixi/text-html/lib/HTMLText", "HTMLText.defaultResolution")
    @js.native
    def defaultResolution: js.UndefOr[Double] = js.native
    inline def defaultResolution_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultResolution")(x.asInstanceOf[js.Any])
  }
}
