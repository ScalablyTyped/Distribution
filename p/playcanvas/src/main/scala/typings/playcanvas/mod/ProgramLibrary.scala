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
  def this(device: Any, standardMaterial: Any) = this()
  
  var _defaultStdMatOption: StandardMaterialOptions = js.native
  
  var _defaultStdMatOptionMin: StandardMaterialOptions = js.native
  
  var _device: Any = js.native
  
  def _getDefaultStdMatOptions(pass: Any): StandardMaterialOptions = js.native
  
  var _isClearingCache: Boolean = js.native
  
  var _precached: Boolean = js.native
  
  var _programsCollection: js.Array[Any] = js.native
  
  def clearCache(): Unit = js.native
  
  /**
    * A cache of shader definitions before processing.
    *
    * @type {Map<string, object>}
    */
  var definitionsCache: Map[String, js.Object] = js.native
  
  def destroy(): Unit = js.native
  
  def dumpPrograms(): Unit = js.native
  
  def generateShaderDefinition(generator: Any, name: Any, key: Any, options: Any): Any = js.native
  
  def getCachedShader(key: Any): Shader = js.native
  
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
  
  /**
    * Remove shader from the cache. This function does not destroy it, that is the responsibility
    * of the caller.
    *
    * @param {Shader} shader - The shader to be removed.
    */
  def removeFromCache(shader: Shader): Unit = js.native
  
  def setCachedShader(key: Any, shader: Any): Unit = js.native
  
  def storeNewProgram(name: Any, options: Any): Unit = js.native
  
  def unregister(name: Any): Unit = js.native
}
