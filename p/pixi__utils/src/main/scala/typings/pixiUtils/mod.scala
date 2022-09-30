package typings.pixiUtils

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.eventemitter3.mod.EventEmitterStatic
import typings.eventemitter3.mod.ValidEventTypes
import typings.pixiSettings.mod.isMobileResult
import typings.pixiUtils.anon.Base
import typings.pixiUtils.anon.Data
import typings.pixiUtils.anon.Length
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
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
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
  open class CanvasRenderTarget protected () extends StObject {
    /**
      * @param width - the width for the newly created canvas
      * @param height - the height for the newly created canvas
      * @param {number} [resolution=PIXI.settings.RESOLUTION] - The resolution / device pixel ratio of the canvas
      */
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, resolution: Double) = this()
    
    /** The Canvas object that belongs to this CanvasRenderTarget. */
    var canvas: HTMLCanvasElement = js.native
    
    /**
      * Clears the canvas that was created by the CanvasRenderTarget class.
      * @private
      */
    def clear(): Unit = js.native
    
    /** A CanvasRenderingContext2D object representing a two-dimensional rendering context. */
    var context: CanvasRenderingContext2D = js.native
    
    /** Destroys this canvas. */
    def destroy(): Unit = js.native
    
    /**
      * The height of the canvas buffer in pixels.
      * @member {number}
      */
    def height: Double = js.native
    def height_=(`val`: Double): Unit = js.native
    
    /**
      * Resizes the canvas to the specified width and height.
      * @param desiredWidth - the desired width of the canvas
      * @param desiredHeight - the desired height of the canvas
      */
    def resize(desiredWidth: Double, desiredHeight: Double): Unit = js.native
    
    /**
      * The resolution / device pixel ratio of the canvas
      * @default 1
      */
    var resolution: Double = js.native
    
    /**
      * The width of the canvas buffer in pixels.
      * @member {number}
      */
    def width: Double = js.native
    def width_=(`val`: Double): Unit = js.native
  }
  
  @JSImport("@pixi/utils", "DATA_URI")
  @js.native
  val DATA_URI: js.RegExp = js.native
  
  @JSImport("@pixi/utils", "EventEmitter")
  @js.native
  open class EventEmitter[EventTypes /* <: ValidEventTypes */, Context /* <: Any */] ()
    extends typings.eventemitter3.mod.^[EventTypes, Context]
  object EventEmitter extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@pixi/utils", "EventEmitter")
    @js.native
    open class ^[EventTypes /* <: ValidEventTypes */, Context] ()
      extends StObject
         with typings.eventemitter3.mod.EventEmitter[EventTypes, Context]
    
    @JSImport("@pixi/utils", "EventEmitter")
    @js.native
    val ^ : js.Object & EventEmitterStatic = js.native
    @JSImport("@pixi/utils", "EventEmitter.EventEmitter")
    @js.native
    val EventEmitter: EventEmitterStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pixi/utils", "EventEmitter.EventEmitter")
    @js.native
    open class EventEmitterCls[EventTypes /* <: ValidEventTypes */, Context] ()
      extends StObject
         with typings.eventemitter3.mod.EventEmitter[EventTypes, Context]
    
    /* static member */
    @JSImport("@pixi/utils", "EventEmitter.prefixed")
    @js.native
    def prefixed: String | Boolean = js.native
    inline def prefixed_=(x: String | Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixed")(x.asInstanceOf[js.Any])
    
    type _To = js.Object & EventEmitterStatic
    
    /* This means you don't have to write `^`, but can instead just say `EventEmitter.foo` */
    override def _to: js.Object & EventEmitterStatic = ^
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
  
  inline def sayHello(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sayHello")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sign(n: Double): `-1` | `0` | `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(n.asInstanceOf[js.Any]).asInstanceOf[`-1` | `0` | `1`]
  
  inline def skipHello(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skipHello")().asInstanceOf[Unit]
  
  inline def string2hex(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("string2hex")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def trimCanvas(canvas: HTMLCanvasElement): Data = ^.asInstanceOf[js.Dynamic].applyDynamic("trimCanvas")(canvas.asInstanceOf[js.Any]).asInstanceOf[Data]
  
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
  
  type ArrayFixed[T, L /* <: Double */] = Array[T] & Length[L]
  
  trait DecomposedDataUri extends StObject {
    
    var charset: String
    
    var data: String
    
    var encoding: String
    
    var mediaType: String
    
    var subType: String
  }
  object DecomposedDataUri {
    
    inline def apply(charset: String, data: String, encoding: String, mediaType: String, subType: String): DecomposedDataUri = {
      val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecomposedDataUri]
    }
    
    extension [Self <: DecomposedDataUri](x: Self) {
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setSubType(value: String): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    }
  }
  
  type Dict[T] = StringDictionary[T]
  
  @js.native
  trait FormatFunction extends StObject {
    
    def apply(URL: URL): String = js.native
    def apply(URL: URL, options: URLFormatOptions): String = js.native
    def apply(urlObject: String): String = js.native
    def apply(urlObject: UrlObject): String = js.native
  }
  
  type PackedArray = js.typedarray.Float32Array | js.typedarray.Uint32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array
  
  @js.native
  trait ParseFunction extends StObject {
    
    def apply(urlStr: String): UrlWithStringQuery = js.native
    def apply(urlStr: String, parseQueryString: Boolean): Url_ = js.native
    def apply(urlStr: String, parseQueryString: Boolean, slashesDenoteHost: Boolean): Url_ = js.native
    def apply(urlStr: String, parseQueryString: Unit, slashesDenoteHost: Boolean): UrlWithStringQuery = js.native
    def apply(urlStr: String, parseQueryString: `false`): UrlWithStringQuery = js.native
    def apply(urlStr: String, parseQueryString: `false`, slashesDenoteHost: Boolean): UrlWithStringQuery = js.native
    def apply(urlStr: String, parseQueryString: `true`): UrlWithParsedQuery = js.native
    def apply(urlStr: String, parseQueryString: `true`, slashesDenoteHost: Boolean): UrlWithParsedQuery = js.native
  }
  
  /**
    * This file contains redeclared types for Node `url` and `querystring` modules. These modules
    * don't provide their own typings but instead are a part of the full Node typings. The purpose of
    * this file is to redeclare the required types to avoid having the whole Node types as a
    * dependency.
    */
  type ParsedUrlQuery = StringDictionary[String | js.Array[String]]
  
  type ParsedUrlQueryInput = StringDictionary[Any]
  
  @js.native
  trait Path_ extends StObject {
    
    def basename(path: String): String = js.native
    def basename(path: String, ext: String): String = js.native
    
    var delimiter: String = js.native
    
    def dirname(path: String): String = js.native
    
    def extname(path: String): String = js.native
    
    def getProtocol(path: String): String = js.native
    
    def hasProtocol(path: String): Boolean = js.native
    
    def isAbsolute(path: String): Boolean = js.native
    
    def isDataUrl(path: String): Boolean = js.native
    
    def isUrl(path: String): Boolean = js.native
    
    def join(paths: String*): String = js.native
    
    def normalize(path: String): String = js.native
    
    def parse(path: String): Base = js.native
    
    def rootname(path: String): String = js.native
    
    var sep: String = js.native
    
    def toAbsolute(url: String): String = js.native
    def toAbsolute(url: String, baseUrl: String): String = js.native
    def toAbsolute(url: String, baseUrl: String, rootUrl: String): String = js.native
    def toAbsolute(url: String, baseUrl: Unit, rootUrl: String): String = js.native
    
    def toPosix(path: String): String = js.native
  }
  
  type ResolveFunction = js.Function2[/* from */ String, /* to */ String, String]
  
  trait URLFormatOptions extends StObject {
    
    var auth: js.UndefOr[Boolean] = js.undefined
    
    var fragment: js.UndefOr[Boolean] = js.undefined
    
    var search: js.UndefOr[Boolean] = js.undefined
    
    var unicode: js.UndefOr[Boolean] = js.undefined
  }
  object URLFormatOptions {
    
    inline def apply(): URLFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URLFormatOptions]
    }
    
    extension [Self <: URLFormatOptions](x: Self) {
      
      inline def setAuth(value: Boolean): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setFragment(value: Boolean): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
      
      inline def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
    }
  }
  
  trait UrlObject
    extends StObject
       with UrlObjectCommon {
    
    var port: js.UndefOr[String | Double] = js.undefined
    
    var query: js.UndefOr[String | Null | ParsedUrlQueryInput] = js.undefined
  }
  object UrlObject {
    
    inline def apply(): UrlObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlObject]
    }
    
    extension [Self <: UrlObject](x: Self) {
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setQuery(value: String | ParsedUrlQueryInput): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  trait UrlObjectCommon extends StObject {
    
    var auth: js.UndefOr[String] = js.undefined
    
    var hash: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
    
    var slashes: js.UndefOr[Boolean] = js.undefined
  }
  object UrlObjectCommon {
    
    inline def apply(): UrlObjectCommon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlObjectCommon]
    }
    
    extension [Self <: UrlObjectCommon](x: Self) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
      
      inline def setSlashesUndefined: Self = StObject.set(x, "slashes", js.undefined)
    }
  }
  
  trait UrlWithParsedQuery
    extends StObject
       with Url_ {
    
    @JSName("query")
    var query_UrlWithParsedQuery: ParsedUrlQuery
  }
  object UrlWithParsedQuery {
    
    inline def apply(query: ParsedUrlQuery): UrlWithParsedQuery = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlWithParsedQuery]
    }
    
    extension [Self <: UrlWithParsedQuery](x: Self) {
      
      inline def setQuery(value: ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  trait UrlWithStringQuery
    extends StObject
       with Url_ {
    
    @JSName("query")
    var query_UrlWithStringQuery: String | Null
  }
  object UrlWithStringQuery {
    
    inline def apply(): UrlWithStringQuery = {
      val __obj = js.Dynamic.literal(query = null)
      __obj.asInstanceOf[UrlWithStringQuery]
    }
    
    extension [Self <: UrlWithStringQuery](x: Self) {
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
    }
  }
  
  trait Url_
    extends StObject
       with UrlObjectCommon {
    
    var port: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[String | Null | ParsedUrlQuery] = js.undefined
  }
  object Url_ {
    
    inline def apply(): Url_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Url_]
    }
    
    extension [Self <: Url_](x: Self) {
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setQuery(value: String | ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
}
