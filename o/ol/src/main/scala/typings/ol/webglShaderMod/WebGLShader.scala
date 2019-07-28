package typings.ol.webglShaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLShader extends js.Object {
  def getSource(): String
  def getType(): Double
  def isAnimated(): Boolean
}

object WebGLShader {
  @scala.inline
  def apply(getSource: () => String, getType: () => Double, isAnimated: () => Boolean): WebGLShader = {
    val __obj = js.Dynamic.literal(getSource = js.Any.fromFunction0(getSource), getType = js.Any.fromFunction0(getType), isAnimated = js.Any.fromFunction0(isAnimated))
  
    __obj.asInstanceOf[WebGLShader]
  }
}

