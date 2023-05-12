package typings.pixiTextHtml

import typings.pixiDisplay.libDisplayObjectMod.IDestroyOptions
import typings.pixiText.mod.TextStyle
import typings.pixiTextHtml.anon.PartialIHTMLTextStyle
import typings.pixiTextHtml.anon.PartialITextStyle
import typings.pixiTextHtml.libHtmltextstyleMod.IHTMLFont
import typings.pixiTextHtml.libHtmltextstyleMod.IHTMLTextStyle
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/text-html", "HTMLText")
  @js.native
  /**
    * @param {string} [text] - Text contents
    * @param {PIXI.HTMLTextStyle|PIXI.TextStyle|PIXI.ITextStyle} [style] - Style setting to use.
    *        Strongly recommend using an HTMLTextStyle object. Providing a PIXI.TextStyle
    *        will convert the TextStyle to an HTMLTextStyle and will no longer be linked.
    */
  open class HTMLText ()
    extends typings.pixiTextHtml.libHtmltextMod.HTMLText {
    def this(text: String) = this()
    def this(text: String, style: TextStyle) = this()
    def this(text: String, style: PartialITextStyle) = this()
    def this(text: String, style: typings.pixiTextHtml.libHtmltextstyleMod.HTMLTextStyle) = this()
    def this(text: Unit, style: TextStyle) = this()
    def this(text: Unit, style: PartialITextStyle) = this()
    def this(text: Unit, style: typings.pixiTextHtml.libHtmltextstyleMod.HTMLTextStyle) = this()
  }
  /* static members */
  object HTMLText {
    
    @JSImport("@pixi/text-html", "HTMLText")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default autoResolution for all HTMLText objects */
    @JSImport("@pixi/text-html", "HTMLText.defaultAutoResolution")
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
    @JSImport("@pixi/text-html", "HTMLText.defaultDestroyOptions")
    @js.native
    def defaultDestroyOptions: IDestroyOptions = js.native
    inline def defaultDestroyOptions_=(x: IDestroyOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultDestroyOptions")(x.asInstanceOf[js.Any])
    
    /** Default maxHeight, set at construction */
    @JSImport("@pixi/text-html", "HTMLText.defaultMaxHeight")
    @js.native
    def defaultMaxHeight: Double = js.native
    inline def defaultMaxHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxHeight")(x.asInstanceOf[js.Any])
    
    /** Default maxWidth, set at construction */
    @JSImport("@pixi/text-html", "HTMLText.defaultMaxWidth")
    @js.native
    def defaultMaxWidth: Double = js.native
    inline def defaultMaxWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxWidth")(x.asInstanceOf[js.Any])
    
    /** Default resolution, make sure autoResolution or defaultAutoResolution is `false`. */
    @JSImport("@pixi/text-html", "HTMLText.defaultResolution")
    @js.native
    def defaultResolution: js.UndefOr[Double] = js.native
    inline def defaultResolution_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultResolution")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@pixi/text-html", "HTMLTextStyle")
  @js.native
  /**
    * @param style - TextStyle properties to be set on the text. See {@link PIXI.TextStyle.defaultStyle}
    *       for the default values.
    */
  open class HTMLTextStyle ()
    extends typings.pixiTextHtml.libHtmltextstyleMod.HTMLTextStyle {
    def this(style: typings.pixiText.anon.PartialITextStyle) = this()
  }
  /* static members */
  object HTMLTextStyle {
    
    @JSImport("@pixi/text-html", "HTMLTextStyle")
    @js.native
    val ^ : js.Any = js.native
    
    /** The collection of installed fonts */
    @JSImport("@pixi/text-html", "HTMLTextStyle.availableFonts")
    @js.native
    def availableFonts: Record[String, IHTMLFont] = js.native
    inline def availableFonts_=(x: Record[String, IHTMLFont]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableFonts")(x.asInstanceOf[js.Any])
    
    /**
      * List of default options, these are largely the same as TextStyle,
      * with the exception of whiteSpace, which is set to 'normal' by default.
      */
    @JSImport("@pixi/text-html", "HTMLTextStyle.defaultOptions")
    @js.native
    val defaultOptions: IHTMLTextStyle = js.native
    
    /**
      * Convert a TextStyle to HTMLTextStyle
      * @param originalStyle
      * @example
      * import {TextStyle } from 'pixi.js';
      * import {HTMLTextStyle} from '@pixi/text-html';
      * const style = new TextStyle();
      * const htmlStyle = HTMLTextStyle.from(style);
      */
    inline def from(originalStyle: TextStyle): typings.pixiTextHtml.libHtmltextstyleMod.HTMLTextStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(originalStyle.asInstanceOf[js.Any]).asInstanceOf[typings.pixiTextHtml.libHtmltextstyleMod.HTMLTextStyle]
    inline def from(originalStyle: PartialIHTMLTextStyle): typings.pixiTextHtml.libHtmltextstyleMod.HTMLTextStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(originalStyle.asInstanceOf[js.Any]).asInstanceOf[typings.pixiTextHtml.libHtmltextstyleMod.HTMLTextStyle]
  }
}
