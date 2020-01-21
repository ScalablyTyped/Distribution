package typings.next.checkCustomRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.next.nextStrings.rewrite
  - typings.next.nextStrings.redirect
  - typings.next.nextStrings.header
*/
trait RouteType extends js.Object

object RouteType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def header: typings.next.nextStrings.header = this.cast("header")
  @scala.inline
  def redirect: typings.next.nextStrings.redirect = this.cast("redirect")
  @scala.inline
  def rewrite: typings.next.nextStrings.rewrite = this.cast("rewrite")
}

