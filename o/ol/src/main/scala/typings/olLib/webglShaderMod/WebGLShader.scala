package typings
package olLib.webglShaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLShader extends js.Object {
  def getSource(): java.lang.String
  def getType(): scala.Double
  def isAnimated(): scala.Boolean
}

object WebGLShader {
  @scala.inline
  def apply(getSource: () => java.lang.String, getType: () => scala.Double, isAnimated: () => scala.Boolean): WebGLShader = {
    val __obj = js.Dynamic.literal(getSource = js.Any.fromFunction0(getSource), getType = js.Any.fromFunction0(getType), isAnimated = js.Any.fromFunction0(isAnimated))
  
    __obj.asInstanceOf[WebGLShader]
  }
}

