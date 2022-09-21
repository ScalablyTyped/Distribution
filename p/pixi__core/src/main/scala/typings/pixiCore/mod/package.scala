package typings.pixiCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pixiCore.anon.Size
import typings.pixiCore.anon.SyncFunc
import typings.pixiCore.mod.^
import typings.pixiMath.mod.ISize
import typings.pixiUtils.mod.Dict
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import typings.std.WebGL2RenderingContext
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def INSTALLED: js.Array[IResourcePlugin[Any, Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("INSTALLED").asInstanceOf[js.Array[IResourcePlugin[Any, Any]]]

inline def VERSION: /* "$_VERSION" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[/* "$_VERSION" */ String]

inline def autoDetectRenderer(): AbstractRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectRenderer")().asInstanceOf[AbstractRenderer]
inline def autoDetectRenderer(options: IRendererOptionsAuto): AbstractRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectRenderer")(options.asInstanceOf[js.Any]).asInstanceOf[AbstractRenderer]

inline def autoDetectResource[R /* <: Resource */, RO](source: Any): R = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectResource")(source.asInstanceOf[js.Any]).asInstanceOf[R]
inline def autoDetectResource[R /* <: Resource */, RO](source: Any, options: RO): R = (^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectResource")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[R]

inline def checkMaxIfStatementsInShader(maxIfs: Double, gl: IRenderingContext): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checkMaxIfStatementsInShader")(maxIfs.asInstanceOf[js.Any], gl.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def createUBOElements(uniformData: js.Array[IUniformData]): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("createUBOElements")(uniformData.asInstanceOf[js.Any]).asInstanceOf[Size]

inline def defaultFilterVertex: String = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultFilterVertex").asInstanceOf[String]

inline def defaultVertex: String = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultVertex").asInstanceOf[String]

inline def generateProgram(gl: IRenderingContext, program: Program): GLProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("generateProgram")(gl.asInstanceOf[js.Any], program.asInstanceOf[js.Any])).asInstanceOf[GLProgram]

inline def generateUniformBufferSync(group: UniformGroup[Dict[Any]], uniformData: Dict[Any]): SyncFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("generateUniformBufferSync")(group.asInstanceOf[js.Any], uniformData.asInstanceOf[js.Any])).asInstanceOf[SyncFunc]

inline def getTestContext(): WebGLRenderingContext | WebGL2RenderingContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestContext")().asInstanceOf[WebGLRenderingContext | WebGL2RenderingContext]

inline def getUBOData(uniforms: Dict[Any], uniformData: Dict[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUBOData")(uniforms.asInstanceOf[js.Any], uniformData.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def uniformParsers: js.Array[IUniformParser] = ^.asInstanceOf[js.Dynamic].selectDynamic("uniformParsers").asInstanceOf[js.Array[IUniformParser]]

type IArrayBuffer = js.typedarray.ArrayBuffer

/* Rewritten from type alias, can be one of: 
  - typings.pixiMath.mod.ISize
  - typings.pixiCore.mod.ICubeResourceOptions
  - typings.pixiCore.mod.IImageResourceOptions
  - typings.pixiCore.mod.ISVGResourceOptions
  - typings.pixiCore.mod.IVideoResourceOptions
  - typings.pixiCore.mod.IResourcePluginOptions
*/
type IAutoDetectOptions = _IAutoDetectOptions | ISize | IResourcePluginOptions

type IRendererPlugins = StringDictionary[Any]

type IRenderingContext = WebGL2RenderingContext

type IResourcePluginOptions = StringDictionary[Any]

type ImageSource = HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | ImageBitmap

type TextureSource = String | (BaseTexture[Resource, IAutoDetectOptions]) | ImageSource
