package typings.parse.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a set of utilities for using Parse with Facebook.
  * Provides a set of utilities for using Parse with Facebook.
  */
@JSGlobal("Parse.FacebookUtils")
@js.native
object FacebookUtils extends js.Object {
  def init(): Unit = js.native
  def init(options: js.Any): Unit = js.native
  def isLinked(user: User[Attributes]): Boolean = js.native
  def link(user: User[Attributes], permissions: js.Any): Unit = js.native
  def link(user: User[Attributes], permissions: js.Any, options: SuccessFailureOptions): Unit = js.native
  def logIn(permissions: js.Any): Unit = js.native
  def logIn(permissions: js.Any, options: FullOptions): Unit = js.native
  def unlink(user: User[Attributes]): Unit = js.native
  def unlink(user: User[Attributes], options: SuccessFailureOptions): Unit = js.native
}

