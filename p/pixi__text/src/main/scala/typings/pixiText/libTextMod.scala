package typings.pixiText

import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.pixiSettings.libIcanvasrenderingcontext2dMod.ICanvasRenderingContext2D
import typings.pixiSprite.mod.Sprite
import typings.pixiText.anon.PartialITextStyle
import typings.pixiText.libTextStyleMod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTextMod {
  
  @JSImport("@pixi/text/lib/Text", "Text")
  @js.native
  /**
    * @param text - The string that you would like the text to display
    * @param style - The style parameters
    * @param canvas - The canvas element for drawing text
    */
  open class Text () extends Sprite {
    def this(text: String) = this()
    def this(text: Double) = this()
    def this(text: String, style: PartialITextStyle) = this()
    def this(text: String, style: TextStyle) = this()
    def this(text: Double, style: PartialITextStyle) = this()
    def this(text: Double, style: TextStyle) = this()
    def this(text: Unit, style: PartialITextStyle) = this()
    def this(text: Unit, style: TextStyle) = this()
    def this(text: String, style: Unit, canvas: ICanvas) = this()
    def this(text: String, style: PartialITextStyle, canvas: ICanvas) = this()
    def this(text: String, style: TextStyle, canvas: ICanvas) = this()
    def this(text: Double, style: Unit, canvas: ICanvas) = this()
    def this(text: Double, style: PartialITextStyle, canvas: ICanvas) = this()
    def this(text: Double, style: TextStyle, canvas: ICanvas) = this()
    def this(text: Unit, style: Unit, canvas: ICanvas) = this()
    def this(text: Unit, style: PartialITextStyle, canvas: ICanvas) = this()
    def this(text: Unit, style: TextStyle, canvas: ICanvas) = this()
    
    var _autoResolution: Boolean = js.native
    
    /**
      * Private tracker for the current font.
      * @private
      */
    /* protected */ var _font: String = js.native
    
    /**
      * Generates the fill style. Can automatically generate a gradient based on the fill style being an array
      * @param style - The style.
      * @param lines - The lines of text.
      * @param metrics
      * @returns The fill style
      */
    /* private */ var _generateFillStyle: Any = js.native
    
    /**
      * Keep track if this Text object created it's own canvas
      * element (`true`) or uses the constructor argument (`false`).
      * Used to workaround a GC issues with Safari < 13 when
      * destroying Text. See `destroy` for more info.
      */
    /* private */ var _ownCanvas: Any = js.native
    
    /**
      * The resolution / device pixel ratio of the canvas.
      *
      * This is set to automatically match the renderer resolution by default, but can be overridden by setting manually.
      * @default PIXI.settings.RESOLUTION
      */
    var _resolution: Double = js.native
    
    /**
      * Private tracker for the current style.
      * @private
      */
    /* protected */ var _style: TextStyle = js.native
    
    /**
      * Private listener to track style changes.
      * @private
      */
    /* protected */ def _styleListener(): Unit = js.native
    
    /**
      * Private tracker for the current text.
      * @private
      */
    /* protected */ var _text: String = js.native
    
    /** The canvas element that everything is drawn to. */
    var canvas: ICanvas = js.native
    
    /** The canvas 2d context that everything is drawn with. */
    var context: ICanvasRenderingContext2D = js.native
    
    var dirty: Boolean = js.native
    
    /**
      * Render the text with letter-spacing.
      * @param text - The text to draw
      * @param x - Horizontal position to draw the text
      * @param y - Vertical position to draw the text
      * @param isStroke - Is this drawing for the outside stroke of the
      *  text? If not, it's for the inside fill
      */
    /* private */ var drawLetterSpacing: Any = js.native
    
    var localStyleID: Double = js.native
    
    /**
      * The resolution / device pixel ratio of the canvas.
      *
      * This is set to automatically match the renderer resolution by default, but can be overridden by setting manually.
      * @default 1
      */
    def resolution: Double = js.native
    def resolution_=(value: Double): Unit = js.native
    
    /**
      * Set the style of the text.
      *
      * Set up an event listener to listen for changes on the style object and mark the text as dirty.
      *
      * If setting the `style` can also be partial {@link PIXI.ITextStyle}.
      */
    def style: TextStyle = js.native
    def style_=(style: TextStyle | PartialITextStyle): Unit = js.native
    
    /** Set the copy for the text object. To split a line you can use '\n'. */
    def text: String = js.native
    def text_=(text: String | Double): Unit = js.native
    
    /**
      * Renders text to its canvas, and updates its texture.
      *
      * By default this is used internally to ensure the texture is correct before rendering,
      * but it can be used called externally, for example from this class to 'pre-generate' the texture from a piece of text,
      * and then shared across multiple Sprites.
      * @param respectDirty - Whether to abort updating the text if the Text isn't dirty and the function is called.
      */
    def updateText(respectDirty: Boolean): Unit = js.native
    
    /** Updates texture size based on canvas size. */
    /* private */ var updateTexture: Any = js.native
  }
  /* static members */
  object Text {
    
    @JSImport("@pixi/text/lib/Text", "Text")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Override whether or not the resolution of the text is automatically adjusted to match the resolution of the renderer.
      * Setting this to false can allow you to get crisper text at lower render resolutions.
      * @example
      * // renderer has a resolution of 1
      * const app = new Application();
      *
      * Text.defaultResolution = 2;
      * Text.defaultAutoResolution = false;
      * // text has a resolution of 2
      * const text = new Text('This is a PixiJS text');
      */
    @JSImport("@pixi/text/lib/Text", "Text.defaultAutoResolution")
    @js.native
    def defaultAutoResolution: Boolean = js.native
    inline def defaultAutoResolution_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultAutoResolution")(x.asInstanceOf[js.Any])
    
    /**
      * If {@link PIXI.Text.defaultAutoResolution} is false, this will be the default resolution of the text.
      * If not set it will default to {@link PIXI.settings.RESOLUTION}.
      * @example
      * Text.defaultResolution = 2;
      * Text.defaultAutoResolution = false;
      *
      * // text has a resolution of 2
      * const text = new Text('This is a PixiJS text');
      */
    @JSImport("@pixi/text/lib/Text", "Text.defaultResolution")
    @js.native
    def defaultResolution: Double = js.native
    inline def defaultResolution_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultResolution")(x.asInstanceOf[js.Any])
  }
}
