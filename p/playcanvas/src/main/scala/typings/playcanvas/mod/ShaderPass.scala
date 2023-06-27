package typings.playcanvas.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class responsible for management of shader passes, associated with a device.
  *
  * @ignore
  */
@JSImport("playcanvas", "ShaderPass")
@js.native
open class ShaderPass () extends StObject {
  
  /**
    * Allocates a shader pass with the specified name and options.
    *
    * @param {string} name - A name of the shader pass.
    * @param {object} options - Options for the shader pass, which are added as properties to the
    * shader pass info.
    * @returns {ShaderPassInfo} The allocated shader pass info.
    */
  def allocate(name: String, options: js.Object): ShaderPassInfo = js.native
  
  /**
    * Return the shader pass info for the specified index.
    *
    * @param {number} index - The shader pass index.
    * @returns {ShaderPassInfo} - The shader pass info.
    */
  def getByIndex(index: Double): ShaderPassInfo = js.native
  
  def getByName(name: Any): ShaderPassInfo = js.native
  
  /** Next available index */
  var nextIndex: Double = js.native
  
  /**
    * Allocated shader passes, indexed by their index.
    *
    * @type {Array<ShaderPassInfo>}
    */
  var passesIndexed: js.Array[ShaderPassInfo] = js.native
  
  /**
    * Allocated shader passes, map of a shader pass name to info.
    *
    * @type {Map<string, ShaderPassInfo>}
    */
  var passesNamed: Map[String, ShaderPassInfo] = js.native
}
object ShaderPass {
  
  @JSImport("playcanvas", "ShaderPass")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get access to the shader pass instance for the specified device.
    *
    * @param {import('../platform/graphics/graphics-device.js').GraphicsDevice} device - The
    * graphics device.
    * @returns { ShaderPass } The shader pass instance for the specified device.
    */
  /* static member */
  inline def get(device: GraphicsDevice): ShaderPass = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(device.asInstanceOf[js.Any]).asInstanceOf[ShaderPass]
}
