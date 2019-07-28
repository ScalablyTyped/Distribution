package typings.ol.webglBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLBuffer extends js.Object {
  def getArray(): js.Array[Double]
  def getUsage(): Double
}

object WebGLBuffer {
  @scala.inline
  def apply(getArray: () => js.Array[Double], getUsage: () => Double): WebGLBuffer = {
    val __obj = js.Dynamic.literal(getArray = js.Any.fromFunction0(getArray), getUsage = js.Any.fromFunction0(getUsage))
  
    __obj.asInstanceOf[WebGLBuffer]
  }
}

