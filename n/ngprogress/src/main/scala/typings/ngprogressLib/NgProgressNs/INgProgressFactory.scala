package typings
package ngprogressLib.NgProgressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INgProgressFactory extends js.Object {
  def createInstance(): INgProgress
}

object INgProgressFactory {
  @scala.inline
  def apply(createInstance: js.Function0[INgProgress]): INgProgressFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createInstance")(createInstance)
    __obj.asInstanceOf[INgProgressFactory]
  }
}

