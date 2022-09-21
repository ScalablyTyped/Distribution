package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A WebGL implementation of the IndexBuffer.
  *
  * @ignore
  */
@js.native
trait WebglIndexBuffer
  extends StObject
     with WebglBuffer {
  
  var glFormat: Any = js.native
  
  def unlock(indexBuffer: Any): Unit = js.native
}
