package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A WebGL implementation of the Buffer.
  *
  * @ignore
  */
@js.native
trait WebglBuffer extends StObject {
  
  var bufferId: Any = js.native
  
  def destroy(device: Any): Unit = js.native
  
  def initialized: Boolean = js.native
  
  def loseContext(): Unit = js.native
  
  def unlock(device: Any, usage: Any, target: Any, storage: Any): Unit = js.native
}
