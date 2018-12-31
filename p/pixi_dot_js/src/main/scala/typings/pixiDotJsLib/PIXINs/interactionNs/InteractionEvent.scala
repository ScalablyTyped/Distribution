package typings
package pixiDotJsLib.PIXINs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionEvent extends js.Object {
  var currentTarget: pixiDotJsLib.PIXINs.DisplayObject
  var data: InteractionData
  var stopped: scala.Boolean
  var target: pixiDotJsLib.PIXINs.DisplayObject
  var `type`: java.lang.String
  def reset(): scala.Unit
  def stopPropagation(): scala.Unit
}

