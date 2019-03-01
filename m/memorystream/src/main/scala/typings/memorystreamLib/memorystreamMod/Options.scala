package typings
package memorystreamLib.memorystreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bufoverflow: scala.Double
  var frequence: scala.Double
  var maxbufsize: scala.Double
  var readable: scala.Boolean
  var writeable: scala.Boolean
}

object Options {
  @scala.inline
  def apply(
    bufoverflow: scala.Double,
    frequence: scala.Double,
    maxbufsize: scala.Double,
    readable: scala.Boolean,
    writeable: scala.Boolean
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bufoverflow")(bufoverflow)
    __obj.updateDynamic("frequence")(frequence)
    __obj.updateDynamic("maxbufsize")(maxbufsize)
    __obj.updateDynamic("readable")(readable)
    __obj.updateDynamic("writeable")(writeable)
    __obj.asInstanceOf[Options]
  }
}

