package typings.next

import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_As extends js.Object {
  val asPath: String = js.native
  val pathname: String = js.native
  val query: ParsedUrlQuery = js.native
  def back(): Unit = js.native
  def push(url: String): js.Promise[Boolean] = js.native
  def push(url: String, as: String): js.Promise[Boolean] = js.native
  def pushTo(href: String): js.Promise[Boolean] = js.native
  def pushTo(href: String, as: String): js.Promise[Boolean] = js.native
  def replace(url: String): js.Promise[Boolean] = js.native
  def replace(url: String, as: String): js.Promise[Boolean] = js.native
  def replaceTo(href: String): js.Promise[Boolean] = js.native
  def replaceTo(href: String, as: String): js.Promise[Boolean] = js.native
}

