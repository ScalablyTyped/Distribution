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
    val __obj = js.Dynamic.literal(bufoverflow = bufoverflow.asInstanceOf[js.Any], frequence = frequence.asInstanceOf[js.Any], maxbufsize = maxbufsize.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], writeable = writeable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

