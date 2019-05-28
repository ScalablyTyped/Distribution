package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpower extends js.Object {
  def releaseKeepAwake(): scala.Unit
  def requestKeepAwake(level: java.lang.String): scala.Unit
}

object Typeofpower {
  @scala.inline
  def apply(releaseKeepAwake: () => scala.Unit, requestKeepAwake: java.lang.String => scala.Unit): Typeofpower = {
    val __obj = js.Dynamic.literal(releaseKeepAwake = js.Any.fromFunction0(releaseKeepAwake), requestKeepAwake = js.Any.fromFunction1(requestKeepAwake))
  
    __obj.asInstanceOf[Typeofpower]
  }
}

