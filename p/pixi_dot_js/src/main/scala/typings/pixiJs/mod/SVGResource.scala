package typings.pixiJs.mod

import typings.pixiCore.mod.ISVGResourceOptions
import typings.pixiMath.mod.ISize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "SVGResource")
@js.native
open class SVGResource protected ()
  extends typings.pixiCore.mod.SVGResource {
  /**
    * @param sourceBase64 - Base64 encoded SVG element or URL for SVG file.
    * @param {object} [options] - Options to use
    * @param {number} [options.scale=1] - Scale to apply to SVG. Overridden by...
    * @param {number} [options.width] - Rasterize SVG this wide. Aspect ratio preserved if height not specified.
    * @param {number} [options.height] - Rasterize SVG this high. Aspect ratio preserved if width not specified.
    * @param {boolean} [options.autoLoad=true] - Start loading right away.
    */
  def this(sourceBase64: String) = this()
  def this(sourceBase64: String, options: ISVGResourceOptions) = this()
}
/* static members */
object SVGResource {
  
  @JSImport("pixi.js", "SVGResource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Regular expression for SVG size.
    * @example &lt;svg width="100" height="100"&gt;&lt;/svg&gt;
    * @readonly
    */
  @JSImport("pixi.js", "SVGResource.SVG_SIZE")
  @js.native
  def SVG_SIZE: js.RegExp = js.native
  inline def SVG_SIZE_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SVG_SIZE")(x.asInstanceOf[js.Any])
  
  /**
    * Regular expression for SVG XML document.
    * @example &lt;?xml version="1.0" encoding="utf-8" ?&gt;&lt;!-- image/svg --&gt;&lt;svg
    * @readonly
    */
  @JSImport("pixi.js", "SVGResource.SVG_XML")
  @js.native
  def SVG_XML: js.RegExp = js.native
  inline def SVG_XML_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SVG_XML")(x.asInstanceOf[js.Any])
  
  /**
    * Get size from an svg string using a regular expression.
    * @param svgString - a serialized svg element
    * @returns - image extension
    */
  inline def getSize(): ISize = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")().asInstanceOf[ISize]
  inline def getSize(svgString: String): ISize = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(svgString.asInstanceOf[js.Any]).asInstanceOf[ISize]
  
  /**
    * Used to auto-detect the type of resource.
    * @param {*} source - The source object
    * @param {string} extension - The extension of source, if set
    * @returns {boolean} - If the source is a SVG source or data file
    */
  inline def test(source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def test(source: Any, `extension`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
