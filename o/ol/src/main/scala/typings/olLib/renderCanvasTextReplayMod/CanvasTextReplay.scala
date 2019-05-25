package typings
package olLib.renderCanvasTextReplayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasTextReplay
  extends olLib.renderCanvasReplayMod.default {
  def getImage(
    text: java.lang.String,
    textKey: java.lang.String,
    fillKey: java.lang.String,
    strokeKey: java.lang.String
  ): stdLib.HTMLCanvasElement = js.native
}

