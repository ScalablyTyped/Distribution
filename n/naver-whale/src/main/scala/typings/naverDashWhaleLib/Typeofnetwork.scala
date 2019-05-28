package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofnetwork extends js.Object {
  var onNavigated: chromeLib.chromeNs.devtoolsNs.networkNs.NavigatedEvent
  var onRequestFinished: chromeLib.chromeNs.devtoolsNs.networkNs.RequestFinishedEvent
  def getHAR(callback: js.Function1[/* harLog */ js.Object, scala.Unit]): scala.Unit
}

object Typeofnetwork {
  @scala.inline
  def apply(
    getHAR: js.Function1[/* harLog */ js.Object, scala.Unit] => scala.Unit,
    onNavigated: chromeLib.chromeNs.devtoolsNs.networkNs.NavigatedEvent,
    onRequestFinished: chromeLib.chromeNs.devtoolsNs.networkNs.RequestFinishedEvent
  ): Typeofnetwork = {
    val __obj = js.Dynamic.literal(getHAR = js.Any.fromFunction1(getHAR), onNavigated = onNavigated, onRequestFinished = onRequestFinished)
  
    __obj.asInstanceOf[Typeofnetwork]
  }
}

