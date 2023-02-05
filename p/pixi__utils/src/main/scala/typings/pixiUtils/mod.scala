package typings.pixiUtils

import typings.eventemitter3.mod.EventEmitter.EventEmitterStatic
import typings.eventemitter3.mod.EventEmitter.ValidEventTypes
import typings.eventemitter3.mod.default
import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.pixiSettings.libUtilsIsMobileMod.isMobileResult
import typings.pixiUtils.anon.Data
import typings.pixiUtils.libDataInterleaveTypedArraysMod.PackedArray
import typings.pixiUtils.libNetworkDecomposeDataUriMod.DecomposedDataUri
import typings.pixiUtils.libPathMod.Path_
import typings.pixiUtils.libUrlMod.FormatFunction
import typings.pixiUtils.libUrlMod.ParseFunction
import typings.pixiUtils.libUrlMod.ResolveFunction
import typings.pixiUtils.libUrlMod.URLFormatOptions
import typings.pixiUtils.libUrlMod.UrlObject
import typings.pixiUtils.libUrlMod.UrlWithParsedQuery
import typings.pixiUtils.libUrlMod.UrlWithStringQuery
import typings.pixiUtils.libUrlMod.Url_
import typings.pixiUtils.pixiUtilsBooleans.`false`
import typings.pixiUtils.pixiUtilsBooleans.`true`
import typings.pixiUtils.pixiUtilsInts.`-1`
import typings.pixiUtils.pixiUtilsInts.`0`
import typings.pixiUtils.pixiUtilsInts.`1`
import typings.pixiUtils.pixiUtilsStrings.Float32Array
import typings.pixiUtils.pixiUtilsStrings.Int32Array
import typings.pixiUtils.pixiUtilsStrings.Uint16Array
import typings.pixiUtils.pixiUtilsStrings.Uint32Array
import typings.pixiUtils.pixiUtilsStrings.Uint8Array
import typings.std.Location
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi/utils", "CanvasRenderTarget")
  @js.native
  open class CanvasRenderTarget protected ()
    extends typings.pixiUtils.libMediaCanvasRenderTargetMod.CanvasRenderTarget {
    /**
      * @param width - the width for the newly created canvas
      * @param height - the height for the newly created canvas
      * @param {number} [resolution=PIXI.settings.RESOLUTION] - The resolution / device pixel ratio of the canvas
      */
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, resolution: Double) = this()
  }
  
  @JSImport("@pixi/utils", "DATA_URI")
  @js.native
  val DATA_URI: js.RegExp = js.native
  
  @JSImport("@pixi/utils", "EventEmitter")
  @js.native
  open class EventEmitter[EventTypes /* <: ValidEventTypes */, Context /* <: Any */] () extends default[EventTypes, Context]
  object EventEmitter {
    
    @JSImport("@pixi/utils", "EventEmitter")
    @js.native
    val ^ : js.Any = js.native
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@pixi/utils", "EventEmitter.EventEmitter")
    @js.native
    open class EventEmitter[EventTypes /* <: ValidEventTypes */, Context] ()
      extends typings.eventemitter3.mod.EventEmitter[EventTypes, Context]
    @JSImport("@pixi/utils", "EventEmitter.EventEmitter")
    @js.native
    val EventEmitter: EventEmitterStatic = js.native
    
    /* static member */
    @JSImport("@pixi/utils", "EventEmitter.prefixed")
    @js.native
    def prefixed: String | Boolean = js.native
    inline def prefixed_=(x: String | Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixed")(x.asInstanceOf[js.Any])
  }
  
  inline def clearTextureCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTextureCache")().asInstanceOf[Unit]
  
  inline def correctBlendMode(blendMode: Double, premultiplied: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("correctBlendMode")(blendMode.asInstanceOf[js.Any], premultiplied.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def createIndicesForQuads(size: Double): js.typedarray.Uint16Array | js.typedarray.Uint32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("createIndicesForQuads")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint16Array | js.typedarray.Uint32Array]
  inline def createIndicesForQuads(size: Double, outBuffer: js.typedarray.Uint16Array): js.typedarray.Uint16Array | js.typedarray.Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("createIndicesForQuads")(size.asInstanceOf[js.Any], outBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array | js.typedarray.Uint32Array]
  inline def createIndicesForQuads(size: Double, outBuffer: js.typedarray.Uint32Array): js.typedarray.Uint16Array | js.typedarray.Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("createIndicesForQuads")(size.asInstanceOf[js.Any], outBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array | js.typedarray.Uint32Array]
  
  inline def decomposeDataUri(dataUri: String): DecomposedDataUri = ^.asInstanceOf[js.Dynamic].applyDynamic("decomposeDataUri")(dataUri.asInstanceOf[js.Any]).asInstanceOf[DecomposedDataUri]
  
  inline def deprecation(version: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecation")(version.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deprecation(version: String, message: String, ignoreDepth: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecation")(version.asInstanceOf[js.Any], message.asInstanceOf[js.Any], ignoreDepth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def destroyTextureCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyTextureCache")().asInstanceOf[Unit]
  
  inline def determineCrossOrigin(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("determineCrossOrigin")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def determineCrossOrigin(url: String, loc: Location): String = (^.asInstanceOf[js.Dynamic].applyDynamic("determineCrossOrigin")(url.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getBufferType(
    array: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ITypedArray */ Any
  ): Float32Array | Uint32Array | Int32Array | Uint16Array | Uint8Array | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBufferType")(array.asInstanceOf[js.Any]).asInstanceOf[Float32Array | Uint32Array | Int32Array | Uint16Array | Uint8Array | Null]
  
  inline def getResolutionOfUrl(url: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getResolutionOfUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getResolutionOfUrl(url: String, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolutionOfUrl")(url.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hex2rgb(hex: Double): js.Array[Double] | js.typedarray.Float32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hex2rgb")(hex.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double] | js.typedarray.Float32Array]
  inline def hex2rgb(hex: Double, out: js.Array[Double]): js.Array[Double] | js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("hex2rgb")(hex.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double] | js.typedarray.Float32Array]
  inline def hex2rgb(hex: Double, out: js.typedarray.Float32Array): js.Array[Double] | js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("hex2rgb")(hex.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double] | js.typedarray.Float32Array]
  
  inline def hex2string(hex: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hex2string")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def interleaveTypedArrays(arrays: js.Array[PackedArray], sizes: js.Array[Double]): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("interleaveTypedArrays")(arrays.asInstanceOf[js.Any], sizes.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  
  @JSImport("@pixi/utils", "isMobile")
  @js.native
  val isMobile: isMobileResult = js.native
  
  inline def isPow2(v: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPow2")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWebGLSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebGLSupported")().asInstanceOf[Boolean]
  
  inline def log2(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def nextPow2(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextPow2")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("@pixi/utils", "path")
  @js.native
  val path: Path_ = js.native
  
  @JSImport("@pixi/utils", "premultiplyBlendMode")
  @js.native
  val premultiplyBlendMode: js.Array[js.Array[Double]] = js.native
  
  inline def premultiplyRgba(rgb: js.Array[Double], alpha: Double): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def premultiplyRgba(rgb: js.Array[Double], alpha: Double, out: js.typedarray.Float32Array): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def premultiplyRgba(rgb: js.Array[Double], alpha: Double, out: js.typedarray.Float32Array, premultiply: Boolean): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any], premultiply.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def premultiplyRgba(rgb: js.Array[Double], alpha: Double, out: Unit, premultiply: Boolean): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any], premultiply.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def premultiplyRgba(rgb: js.typedarray.Float32Array, alpha: Double): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def premultiplyRgba(rgb: js.typedarray.Float32Array, alpha: Double, out: js.typedarray.Float32Array): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def premultiplyRgba(
    rgb: js.typedarray.Float32Array,
    alpha: Double,
    out: js.typedarray.Float32Array,
    premultiply: Boolean
  ): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any], premultiply.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def premultiplyRgba(rgb: js.typedarray.Float32Array, alpha: Double, out: Unit, premultiply: Boolean): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any], premultiply.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  
  inline def premultiplyTint(tint: Double, alpha: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyTint")(tint.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def premultiplyTintToRgba(tint: Double, alpha: Double, out: js.typedarray.Float32Array): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyTintToRgba")(tint.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def premultiplyTintToRgba(tint: Double, alpha: Double, out: js.typedarray.Float32Array, premultiply: Boolean): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyTintToRgba")(tint.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any], premultiply.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  
  inline def removeItems(arr: js.Array[Any], startIdx: Double, removeCount: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeItems")(arr.asInstanceOf[js.Any], startIdx.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rgb2hex(rgb: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hex")(rgb.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def rgb2hex(rgb: js.typedarray.Float32Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hex")(rgb.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sayHello(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sayHello")().asInstanceOf[Unit]
  
  inline def sign(n: Double): `-1` | `0` | `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(n.asInstanceOf[js.Any]).asInstanceOf[`-1` | `0` | `1`]
  
  inline def skipHello(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skipHello")().asInstanceOf[Unit]
  
  inline def string2hex(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("string2hex")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def trimCanvas(canvas: ICanvas): Data = ^.asInstanceOf[js.Dynamic].applyDynamic("trimCanvas")(canvas.asInstanceOf[js.Any]).asInstanceOf[Data]
  
  inline def uid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[Double]
  
  object url {
    
    @JSImport("@pixi/utils", "url")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pixi/utils", "url.format")
    @js.native
    def format: FormatFunction = js.native
    inline def format(URL: URL): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(URL.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def format(URL: URL, options: URLFormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(URL.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def format(urlObject: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(urlObject.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def format(urlObject: UrlObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(urlObject.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def format_=(x: FormatFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/utils", "url.parse")
    @js.native
    def parse: ParseFunction = js.native
    inline def parse(urlStr: String): UrlWithStringQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any]).asInstanceOf[UrlWithStringQuery]
    inline def parse(urlStr: String, parseQueryString: Boolean): Url_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[Url_]
    inline def parse(urlStr: String, parseQueryString: Boolean, slashesDenoteHost: Boolean): Url_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[Url_]
    inline def parse(urlStr: String, parseQueryString: Unit, slashesDenoteHost: Boolean): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
    inline def parse_=(x: ParseFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    inline def parse_false(urlStr: String, parseQueryString: `false`): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
    inline def parse_false(urlStr: String, parseQueryString: `false`, slashesDenoteHost: Boolean): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
    
    inline def parse_true(urlStr: String, parseQueryString: `true`): UrlWithParsedQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[UrlWithParsedQuery]
    inline def parse_true(urlStr: String, parseQueryString: `true`, slashesDenoteHost: Boolean): UrlWithParsedQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[UrlWithParsedQuery]
    
    @JSImport("@pixi/utils", "url.resolve")
    @js.native
    def resolve: ResolveFunction = js.native
    inline def resolve(from: String, to: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def resolve_=(x: ResolveFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolve")(x.asInstanceOf[js.Any])
  }
}
