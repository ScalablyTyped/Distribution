package typings.memorystream.memorystreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bufoverflow: Double
  var frequence: Double
  var maxbufsize: Double
  var readable: Boolean
  var writeable: Boolean
}

object Options {
  @scala.inline
  def apply(bufoverflow: Double, frequence: Double, maxbufsize: Double, readable: Boolean, writeable: Boolean): Options = {
    val __obj = js.Dynamic.literal(bufoverflow = bufoverflow, frequence = frequence, maxbufsize = maxbufsize, readable = readable, writeable = writeable)
  
    __obj.asInstanceOf[Options]
  }
}

