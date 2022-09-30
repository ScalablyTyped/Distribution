package typings.pixiJs.mod

import typings.pixiAccessibility.mod.IAccessibleTarget
import typings.pixiCompressedTextures.anon.Compressed
import typings.pixiCore.anon.Size
import typings.pixiCore.anon.SyncFunc
import typings.pixiCore.mod.IRendererOptionsAuto
import typings.pixiCore.mod.IRenderingContext
import typings.pixiCore.mod.IResourcePlugin
import typings.pixiCore.mod.IUniformData
import typings.pixiCore.mod.IUniformParser
import typings.pixiGraphics.mod.IGraphicsCurvesSettings
import typings.pixiInteraction.mod.InteractiveTarget_
import typings.pixiJs.mod.^
import typings.pixiSettings.mod.IAdapter
import typings.pixiSettings.mod.ISettings
import typings.pixiSettings.mod.isMobileResult
import typings.pixiUtils.mod.Dict
import typings.std.WebGL2RenderingContext
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def BrowserAdapter: IAdapter = ^.asInstanceOf[js.Dynamic].selectDynamic("BrowserAdapter").asInstanceOf[IAdapter]

inline def DEG_TO_RAD: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DEG_TO_RAD").asInstanceOf[Double]

inline def GRAPHICS_CURVES: IGraphicsCurvesSettings = ^.asInstanceOf[js.Dynamic].selectDynamic("GRAPHICS_CURVES").asInstanceOf[IGraphicsCurvesSettings]

inline def INSTALLED: js.Array[IResourcePlugin[Any, Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("INSTALLED").asInstanceOf[js.Array[IResourcePlugin[Any, Any]]]

inline def PI_2: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PI_2").asInstanceOf[Double]

inline def RAD_TO_DEG: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("RAD_TO_DEG").asInstanceOf[Double]

inline def VERSION: /* "$_VERSION" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[/* "$_VERSION" */ String]

inline def accessibleTarget: IAccessibleTarget = ^.asInstanceOf[js.Dynamic].selectDynamic("accessibleTarget").asInstanceOf[IAccessibleTarget]

inline def autoDetectFormat(data: Any): (/* import warning: importer.ImportType#apply Failed type conversion: typeof TextFormat */ js.Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectFormat")(data.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: typeof TextFormat */ js.Any) | Null]

inline def autoDetectRenderer(): typings.pixiCore.mod.AbstractRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectRenderer")().asInstanceOf[typings.pixiCore.mod.AbstractRenderer]
inline def autoDetectRenderer(options: IRendererOptionsAuto): typings.pixiCore.mod.AbstractRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectRenderer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.mod.AbstractRenderer]

inline def autoDetectResource[R /* <: typings.pixiCore.mod.Resource */, RO](source: Any): R = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectResource")(source.asInstanceOf[js.Any]).asInstanceOf[R]
inline def autoDetectResource[R /* <: typings.pixiCore.mod.Resource */, RO](source: Any, options: RO): R = (^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectResource")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[R]

inline def checkMaxIfStatementsInShader(maxIfs: Double, gl: IRenderingContext): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checkMaxIfStatementsInShader")(maxIfs.asInstanceOf[js.Any], gl.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def createUBOElements(uniformData: js.Array[IUniformData]): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("createUBOElements")(uniformData.asInstanceOf[js.Any]).asInstanceOf[Size]

inline def defaultFilterVertex: String = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultFilterVertex").asInstanceOf[String]

inline def defaultVertex: String = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultVertex").asInstanceOf[String]

inline def generateProgram(gl: IRenderingContext, program: typings.pixiCore.mod.Program): typings.pixiCore.mod.GLProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("generateProgram")(gl.asInstanceOf[js.Any], program.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.GLProgram]

inline def generateUniformBufferSync(group: typings.pixiCore.mod.UniformGroup[Dict[Any]], uniformData: Dict[Any]): SyncFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("generateUniformBufferSync")(group.asInstanceOf[js.Any], uniformData.asInstanceOf[js.Any])).asInstanceOf[SyncFunc]

inline def getTestContext(): WebGLRenderingContext | WebGL2RenderingContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestContext")().asInstanceOf[WebGLRenderingContext | WebGL2RenderingContext]

inline def getUBOData(uniforms: Dict[Any], uniformData: Dict[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUBOData")(uniforms.asInstanceOf[js.Any], uniformData.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def interactiveTarget: InteractiveTarget_ = ^.asInstanceOf[js.Dynamic].selectDynamic("interactiveTarget").asInstanceOf[InteractiveTarget_]

inline def isMobile: isMobileResult = ^.asInstanceOf[js.Dynamic].selectDynamic("isMobile").asInstanceOf[isMobileResult]

inline def parseDDS(arrayBuffer: js.typedarray.ArrayBuffer): js.Array[typings.pixiCompressedTextures.mod.CompressedTextureResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDDS")(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.pixiCompressedTextures.mod.CompressedTextureResource]]

inline def parseKTX(url: String, arrayBuffer: js.typedarray.ArrayBuffer): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKTX")(url.asInstanceOf[js.Any], arrayBuffer.asInstanceOf[js.Any])).asInstanceOf[Compressed]
inline def parseKTX(url: String, arrayBuffer: js.typedarray.ArrayBuffer, loadKeyValueData: Boolean): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKTX")(url.asInstanceOf[js.Any], arrayBuffer.asInstanceOf[js.Any], loadKeyValueData.asInstanceOf[js.Any])).asInstanceOf[Compressed]

inline def settings: ISettings = ^.asInstanceOf[js.Dynamic].selectDynamic("settings").asInstanceOf[ISettings]

inline def uniformParsers: js.Array[IUniformParser] = ^.asInstanceOf[js.Dynamic].selectDynamic("uniformParsers").asInstanceOf[js.Array[IUniformParser]]
