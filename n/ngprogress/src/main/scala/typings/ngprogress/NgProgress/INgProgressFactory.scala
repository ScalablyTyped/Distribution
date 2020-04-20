package typings.ngprogress.NgProgress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INgProgressFactory extends js.Object {
  def createInstance(): INgProgress
}

object INgProgressFactory {
  @scala.inline
  def apply(createInstance: () => INgProgress): INgProgressFactory = {
    val __obj = js.Dynamic.literal(createInstance = js.Any.fromFunction0(createInstance))
    __obj.asInstanceOf[INgProgressFactory]
  }
}

