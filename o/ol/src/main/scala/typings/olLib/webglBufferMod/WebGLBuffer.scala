package typings
package olLib.webglBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLBuffer extends js.Object {
  def getArray(): js.Array[scala.Double]
  def getUsage(): scala.Double
}

object WebGLBuffer {
  @scala.inline
  def apply(getArray: () => js.Array[scala.Double], getUsage: () => scala.Double): WebGLBuffer = {
    val __obj = js.Dynamic.literal(getArray = js.Any.fromFunction0(getArray), getUsage = js.Any.fromFunction0(getUsage))
  
    __obj.asInstanceOf[WebGLBuffer]
  }
}

