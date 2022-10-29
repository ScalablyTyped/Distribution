package typings.pixiCore

import typings.std.WebGLBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryGlbufferMod {
  
  @JSImport("@pixi/core/lib/geometry/GLBuffer", "GLBuffer")
  @js.native
  open class GLBuffer () extends StObject {
    def this(buffer: WebGLBuffer) = this()
    
    var buffer: WebGLBuffer = js.native
    
    var byteLength: Double = js.native
    
    var refCount: Double = js.native
    
    var updateID: Double = js.native
  }
}
