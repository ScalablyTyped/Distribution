package typings
package postalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IEnvelope[T] extends js.Object {
  /*Uses DEFAULT_CHANNEL if no channel is provided*/
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[T] = js.undefined
  var timeStamp: js.UndefOr[java.lang.String] = js.undefined
  var topic: java.lang.String
}

