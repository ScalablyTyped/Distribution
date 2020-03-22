package typings.next.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.next.nextStrings.replaceState
  - typings.next.nextStrings.pushState
*/
trait HistoryMethod extends js.Object

object HistoryMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pushState: typings.next.nextStrings.pushState = this.cast("pushState")
  @scala.inline
  def replaceState: typings.next.nextStrings.replaceState = this.cast("replaceState")
}

