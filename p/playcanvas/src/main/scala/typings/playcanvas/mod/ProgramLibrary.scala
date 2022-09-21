package typings.playcanvas.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class responsible for creation and caching of required shaders.
  * There is a two level cache. The first level generates the shader based on the provided options.
  * The second level processes this generated shader using processing options - in most cases
  * modifies it to support uniform buffers.
  *
  * @ignore
  */
@JSImport("playcanvas", "ProgramLibrary")
@js.native
open class ProgramLibrary protected () extends StObject {
  def this(device: Any) = this()
  
  var _device: Any = js.native
  
  def _getDefaultStdMatOptions(pass: Any): js.Object = js.native
  
  var _isClearingCache: Boolean = js.native
  
  var _precached: Boolean = js.native
  
  var _programsCollection: js.Array[Any] = js.native
  
  def clearCache(): Unit = js.native
  
  def dumpPrograms(): Unit = js.native
  
  def generateShader(generator: Any, name: Any, key: Any, options: Any): Any = js.native
  
  def getProgram(name: Any, options: Any, processingOptions: Any): Shader = js.native
  
  def isRegistered(name: Any): Boolean = js.native
  
  def precompile(cache: Any): Unit = js.native
  
  /**
    * A cache of shaders processed using processing options.
    *
    * @type {Map<string, Shader>}
    */
  var processedCache: Map[String, Shader] = js.native
  
  def register(name: Any, generator: Any): Unit = js.native
  
  def removeFromCache(shader: Any): Unit = js.native
  
  def storeNewProgram(name: Any, options: Any): Unit = js.native
  
  def unregister(name: Any): Unit = js.native
}
