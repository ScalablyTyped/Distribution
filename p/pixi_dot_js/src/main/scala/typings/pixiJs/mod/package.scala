package typings.pixiJs.mod

import typings.pixiAccessibility.libAccessibleTargetMod.IAccessibleTarget
import typings.pixiAssets.libAssetExtensionMod.AssetExtension
import typings.pixiAssets.libCacheCacheMod.CacheClass
import typings.pixiAssets.libCacheCacheParserMod.CacheParser
import typings.pixiAssets.libDetectionsMod.FormatDetectionParser
import typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParser
import typings.pixiAssets.libResolverTypesMod.ResolveURLParser
import typings.pixiCompressedTextures.anon.Compressed
import typings.pixiCore.anon.Size
import typings.pixiCore.anon.SyncFunc
import typings.pixiCore.libAutoDetectRendererMod.IRendererOptionsAuto
import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiCore.libIrendererMod.IRenderingContext
import typings.pixiCore.libShaderProgramMod.IUniformData
import typings.pixiCore.libShaderUtilsUniformParsersMod.IUniformParser
import typings.pixiCore.libTexturesBaseTextureMod.IBaseTextureOptions
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IResourcePlugin
import typings.pixiEvents.libFederatedEventTargetMod.IFederatedDisplayObject
import typings.pixiGraphics.libConstMod.IGraphicsCurvesSettings
import typings.pixiJs.mod.^
import typings.pixiSettings.libAdapterMod.IAdapter
import typings.pixiSettings.libSettingsMod.ISettings
import typings.pixiSettings.libUtilsIsMobileMod.isMobileResult
import typings.pixiSpritesheet.libSpritesheetAssetMod.SpriteSheetJson
import typings.pixiUtils.libTypesMod.Dict
import typings.std.FontFace
import typings.std.ImageBitmap
import typings.std.WebGL2RenderingContext
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Assets: typings.pixiAssets.libAssetsMod.AssetsClass = ^.asInstanceOf[js.Dynamic].selectDynamic("Assets").asInstanceOf[typings.pixiAssets.libAssetsMod.AssetsClass]

inline def BrowserAdapter: IAdapter = ^.asInstanceOf[js.Dynamic].selectDynamic("BrowserAdapter").asInstanceOf[IAdapter]

inline def Cache: CacheClass = ^.asInstanceOf[js.Dynamic].selectDynamic("Cache").asInstanceOf[CacheClass]

inline def DEG_TO_RAD: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DEG_TO_RAD").asInstanceOf[Double]

inline def FederatedDisplayObject: IFederatedDisplayObject = ^.asInstanceOf[js.Dynamic].selectDynamic("FederatedDisplayObject").asInstanceOf[IFederatedDisplayObject]

inline def GRAPHICS_CURVES: IGraphicsCurvesSettings = ^.asInstanceOf[js.Dynamic].selectDynamic("GRAPHICS_CURVES").asInstanceOf[IGraphicsCurvesSettings]

inline def INSTALLED: js.Array[IResourcePlugin[Any, Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("INSTALLED").asInstanceOf[js.Array[IResourcePlugin[Any, Any]]]

inline def PI_2: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PI_2").asInstanceOf[Double]

inline def RAD_TO_DEG: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("RAD_TO_DEG").asInstanceOf[Double]

inline def VERSION: /* "$_VERSION" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[/* "$_VERSION" */ String]

inline def accessibleTarget: IAccessibleTarget = ^.asInstanceOf[js.Dynamic].selectDynamic("accessibleTarget").asInstanceOf[IAccessibleTarget]

inline def autoDetectFormat(data: Any): (/* import warning: importer.ImportType#apply Failed type conversion: typeof TextFormat */ js.Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectFormat")(data.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: typeof TextFormat */ js.Any) | Null]

inline def autoDetectRenderer(): IRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectRenderer")().asInstanceOf[IRenderer]
inline def autoDetectRenderer(options: IRendererOptionsAuto): IRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectRenderer")(options.asInstanceOf[js.Any]).asInstanceOf[IRenderer]

inline def autoDetectResource[R /* <: typings.pixiCore.libTexturesResourcesResourceMod.Resource */, RO](source: Any): R = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectResource")(source.asInstanceOf[js.Any]).asInstanceOf[R]
inline def autoDetectResource[R /* <: typings.pixiCore.libTexturesResourcesResourceMod.Resource */, RO](source: Any, options: RO): R = (^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectResource")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[R]

inline def cacheTextureArray: CacheParser[
js.Array[
  typings.pixiCore.mod.Texture[typings.pixiCore.libTexturesResourcesResourceMod.Resource]
]] = ^.asInstanceOf[js.Dynamic].selectDynamic("cacheTextureArray").asInstanceOf[CacheParser[
js.Array[
  typings.pixiCore.mod.Texture[typings.pixiCore.libTexturesResourcesResourceMod.Resource]
]]]

inline def checkExtension(url: String, `extension`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkExtension")(url.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def checkExtension(url: String, `extension`: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkExtension")(url.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def checkMaxIfStatementsInShader(maxIfs: Double, gl: IRenderingContext): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checkMaxIfStatementsInShader")(maxIfs.asInstanceOf[js.Any], gl.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def convertToList[T](input: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
inline def convertToList[T](input: T, transform: js.Function1[/* input */ String, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
inline def convertToList[T](input: String): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
inline def convertToList[T](input: String, transform: js.Function1[/* input */ String, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
inline def convertToList[T](input: js.Array[String | T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
inline def convertToList[T](input: js.Array[String | T], transform: js.Function1[/* input */ String, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]

inline def createStringVariations(string: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStringVariations")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def createTexture(
  base: typings.pixiCore.mod.BaseTexture[typings.pixiCore.libTexturesResourcesResourceMod.Resource, IAutoDetectOptions],
  loader: typings.pixiAssets.libLoaderLoaderMod.Loader,
  url: String
): typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTexture")(base.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource]]

inline def createUBOElements(uniformData: js.Array[IUniformData]): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("createUBOElements")(uniformData.asInstanceOf[js.Any]).asInstanceOf[Size]

inline def defaultFilterVertex: String = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultFilterVertex").asInstanceOf[String]

inline def defaultVertex: String = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultVertex").asInstanceOf[String]

inline def detectAvif: FormatDetectionParser = ^.asInstanceOf[js.Dynamic].selectDynamic("detectAvif").asInstanceOf[FormatDetectionParser]

inline def detectCompressedTextures: FormatDetectionParser = ^.asInstanceOf[js.Dynamic].selectDynamic("detectCompressedTextures").asInstanceOf[FormatDetectionParser]

inline def detectDefaults: FormatDetectionParser = ^.asInstanceOf[js.Dynamic].selectDynamic("detectDefaults").asInstanceOf[FormatDetectionParser]

inline def detectWebp: FormatDetectionParser = ^.asInstanceOf[js.Dynamic].selectDynamic("detectWebp").asInstanceOf[FormatDetectionParser]

inline def generateProgram(gl: IRenderingContext, program: typings.pixiCore.libShaderProgramMod.Program): typings.pixiCore.libShaderGlprogramMod.GLProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("generateProgram")(gl.asInstanceOf[js.Any], program.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.libShaderGlprogramMod.GLProgram]

inline def generateUniformBufferSync(group: typings.pixiCore.libShaderUniformGroupMod.UniformGroup[Dict[Any]], uniformData: Dict[Any]): SyncFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("generateUniformBufferSync")(group.asInstanceOf[js.Any], uniformData.asInstanceOf[js.Any])).asInstanceOf[SyncFunc]

inline def getFontFamilyName(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontFamilyName")(url.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getTestContext(): WebGLRenderingContext | WebGL2RenderingContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestContext")().asInstanceOf[WebGLRenderingContext | WebGL2RenderingContext]

inline def getUBOData(uniforms: Dict[Any], uniformData: Dict[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUBOData")(uniforms.asInstanceOf[js.Any], uniformData.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def isMobile: isMobileResult = ^.asInstanceOf[js.Dynamic].selectDynamic("isMobile").asInstanceOf[isMobileResult]

inline def isSingleItem(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingleItem")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def loadBitmapFont: LoaderParser[String | typings.pixiTextBitmap.libBitmapFontMod.BitmapFont, Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("loadBitmapFont").asInstanceOf[LoaderParser[String | typings.pixiTextBitmap.libBitmapFontMod.BitmapFont, Any]]

inline def loadDDS: LoaderParser[Any, Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("loadDDS").asInstanceOf[LoaderParser[Any, Any]]

inline def loadImageBitmap(url: String): js.Promise[ImageBitmap] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadImageBitmap")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageBitmap]]

inline def loadJson: LoaderParser[Any, Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("loadJson").asInstanceOf[LoaderParser[Any, Any]]

inline def loadKTX: LoaderParser[
typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource] | js.Array[typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource]], 
IBaseTextureOptions[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("loadKTX").asInstanceOf[LoaderParser[
typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource] | js.Array[typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource]], 
IBaseTextureOptions[Any]]]

inline def loadSVG: LoaderParser[
String | typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource], 
IBaseTextureOptions[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("loadSVG").asInstanceOf[LoaderParser[
String | typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource], 
IBaseTextureOptions[Any]]]

inline def loadTextures: LoaderParser[
typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource], 
IBaseTextureOptions[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("loadTextures").asInstanceOf[LoaderParser[
typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource], 
IBaseTextureOptions[Any]]]

inline def loadTxt: LoaderParser[Any, Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("loadTxt").asInstanceOf[LoaderParser[Any, Any]]

inline def loadWebFont: LoaderParser[FontFace | js.Array[FontFace], Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("loadWebFont").asInstanceOf[LoaderParser[FontFace | js.Array[FontFace], Any]]

inline def parseDDS(arrayBuffer: js.typedarray.ArrayBuffer): js.Array[typings.pixiCompressedTextures.libResourcesMod.CompressedTextureResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDDS")(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.pixiCompressedTextures.libResourcesMod.CompressedTextureResource]]

inline def parseKTX(url: String, arrayBuffer: js.typedarray.ArrayBuffer): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKTX")(url.asInstanceOf[js.Any], arrayBuffer.asInstanceOf[js.Any])).asInstanceOf[Compressed]
inline def parseKTX(url: String, arrayBuffer: js.typedarray.ArrayBuffer, loadKeyValueData: Boolean): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKTX")(url.asInstanceOf[js.Any], arrayBuffer.asInstanceOf[js.Any], loadKeyValueData.asInstanceOf[js.Any])).asInstanceOf[Compressed]

inline def resolveCompressedTextureUrl: ResolveURLParser = ^.asInstanceOf[js.Dynamic].selectDynamic("resolveCompressedTextureUrl").asInstanceOf[ResolveURLParser]

inline def resolveTextureUrl: ResolveURLParser = ^.asInstanceOf[js.Dynamic].selectDynamic("resolveTextureUrl").asInstanceOf[ResolveURLParser]

inline def settings: ISettings = ^.asInstanceOf[js.Dynamic].selectDynamic("settings").asInstanceOf[ISettings]

inline def spritesheetAsset: AssetExtension[typings.pixiSpritesheet.libSpritesheetMod.Spritesheet | SpriteSheetJson, Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("spritesheetAsset").asInstanceOf[AssetExtension[typings.pixiSpritesheet.libSpritesheetMod.Spritesheet | SpriteSheetJson, Any]]

inline def uniformParsers: js.Array[IUniformParser] = ^.asInstanceOf[js.Dynamic].selectDynamic("uniformParsers").asInstanceOf[js.Array[IUniformParser]]
