package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class responsible for management of shader passes, associated with a device.
  *
  * @ignore
  */
@JSGlobal("pc.ShaderPass")
@js.native
open class ShaderPass ()
  extends typings.playcanvas.mod.ShaderPass
object ShaderPass {
  
  @JSGlobal("pc.ShaderPass")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get access to the shader pass instance for the specified device.
    *
    * @param {import('./graphics-device.js').GraphicsDevice} device - The graphics device.
    * @returns { ShaderPass } The shader pass instance for the specified device.
    */
  /* static member */
  inline def get(device: Any): typings.playcanvas.mod.ShaderPass = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(device.asInstanceOf[js.Any]).asInstanceOf[typings.playcanvas.mod.ShaderPass]
}
