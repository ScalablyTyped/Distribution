package typings.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pollyjsCore.pollyjsCoreStrings.beforeResponse
  - typings.pollyjsCore.pollyjsCoreStrings.response
*/
trait ResponseRouteEvent extends js.Object

object ResponseRouteEvent {
  @scala.inline
  def beforeResponse: typings.pollyjsCore.pollyjsCoreStrings.beforeResponse = this.cast("beforeResponse")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def response: typings.pollyjsCore.pollyjsCoreStrings.response = this.cast("response")
}

