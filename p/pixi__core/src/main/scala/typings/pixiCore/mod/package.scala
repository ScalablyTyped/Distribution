package typings.pixiCore.mod

import typings.pixiCore.anon.Size
import typings.pixiCore.anon.SyncFunc
import typings.pixiCore.libAutoDetectRendererMod.IRendererOptionsAuto
import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiCore.libIrendererMod.IRenderingContext
import typings.pixiCore.libShaderProgramMod.IUniformData
import typings.pixiCore.libShaderUtilsUniformParsersMod.IUniformParser
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IResourcePlugin
import typings.pixiCore.mod.^
import typings.pixiSettings.libAdapterMod.IAdapter
import typings.pixiSettings.libSettingsMod.ISettings
import typings.pixiSettings.libUtilsIsMobileMod.isMobileResult
import typings.pixiUtils.libTypesMod.Dict
import typings.std.WebGL2RenderingContext
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def BrowserAdapter: IAdapter = ^.asInstanceOf[js.Dynamic].selectDynamic("BrowserAdapter").asInstanceOf[IAdapter]

inline def DEG_TO_RAD: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DEG_TO_RAD").asInstanceOf[Double]

inline def INSTALLED: js.Array[IResourcePlugin[Any, Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("INSTALLED").asInstanceOf[js.Array[IResourcePlugin[Any, Any]]]

inline def PI_2: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PI_2").asInstanceOf[Double]

inline def RAD_TO_DEG: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("RAD_TO_DEG").asInstanceOf[Double]

inline def VERSION: /* "$_VERSION" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[/* "$_VERSION" */ String]

inline def autoDetectRenderer(): IRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectRenderer")().asInstanceOf[IRenderer]
inline def autoDetectRenderer(options: IRendererOptionsAuto): IRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectRenderer")(options.asInstanceOf[js.Any]).asInstanceOf[IRenderer]

inline def autoDetectResource[R /* <: typings.pixiCore.libTexturesResourcesResourceMod.Resource */, RO](source: Any): R = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectResource")(source.asInstanceOf[js.Any]).asInstanceOf[R]
inline def autoDetectResource[R /* <: typings.pixiCore.libTexturesResourcesResourceMod.Resource */, RO](source: Any, options: RO): R = (^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectResource")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[R]

inline def checkMaxIfStatementsInShader(maxIfs: Double, gl: IRenderingContext): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checkMaxIfStatementsInShader")(maxIfs.asInstanceOf[js.Any], gl.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def createUBOElements(uniformData: js.Array[IUniformData]): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("createUBOElements")(uniformData.asInstanceOf[js.Any]).asInstanceOf[Size]

inline def defaultFilterVertex: String = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultFilterVertex").asInstanceOf[String]

inline def defaultVertex: String = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultVertex").asInstanceOf[String]

inline def generateProgram(gl: IRenderingContext, program: typings.pixiCore.libShaderProgramMod.Program): typings.pixiCore.libShaderGlprogramMod.GLProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("generateProgram")(gl.asInstanceOf[js.Any], program.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.libShaderGlprogramMod.GLProgram]

inline def generateUniformBufferSync(group: typings.pixiCore.libShaderUniformGroupMod.UniformGroup[Dict[Any]], uniformData: Dict[Any]): SyncFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("generateUniformBufferSync")(group.asInstanceOf[js.Any], uniformData.asInstanceOf[js.Any])).asInstanceOf[SyncFunc]

inline def getTestContext(): WebGLRenderingContext | WebGL2RenderingContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestContext")().asInstanceOf[WebGLRenderingContext | WebGL2RenderingContext]

inline def getUBOData(uniforms: Dict[Any], uniformData: Dict[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUBOData")(uniforms.asInstanceOf[js.Any], uniformData.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def isMobile: isMobileResult = ^.asInstanceOf[js.Dynamic].selectDynamic("isMobile").asInstanceOf[isMobileResult]

inline def settings: ISettings = ^.asInstanceOf[js.Dynamic].selectDynamic("settings").asInstanceOf[ISettings]

inline def uniformParsers: js.Array[IUniformParser] = ^.asInstanceOf[js.Dynamic].selectDynamic("uniformParsers").asInstanceOf[js.Array[IUniformParser]]
