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
    val __obj = js.Dynamic.literal(bufoverflow = bufoverflow, frequence = frequence, maxbufsize = maxbufsize, readable = readable, writeable = writeable)
  
    __obj.asInstanceOf[Options]
  }
}

