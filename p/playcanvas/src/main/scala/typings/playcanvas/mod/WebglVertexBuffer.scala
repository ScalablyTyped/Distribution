package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A WebGL implementation of the VertexBuffer.
  *
  * @ignore
  */
@js.native
trait WebglVertexBuffer
  extends StObject
     with WebglBuffer {
  
  def unlock(vertexBuffer: Any): Unit = js.native
  
  var vao: Any = js.native
}
