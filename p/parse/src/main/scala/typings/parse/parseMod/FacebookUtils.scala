package typings.parse.parseMod

import typings.parse.parseMod._Global_.Parse.Attributes
import typings.parse.parseMod._Global_.Parse.FullOptions
import typings.parse.parseMod._Global_.Parse.SuccessFailureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a set of utilities for using Parse with Facebook.
  * Provides a set of utilities for using Parse with Facebook.
  */
@JSImport("parse", "FacebookUtils")
@js.native
object FacebookUtils extends js.Object {
  def init(): Unit = js.native
  def init(options: js.Any): Unit = js.native
  def isLinked(user: typings.parse.parseMod._Global_.Parse.User[Attributes]): Boolean = js.native
  def link(user: typings.parse.parseMod._Global_.Parse.User[Attributes], permissions: js.Any): Unit = js.native
  def link(
    user: typings.parse.parseMod._Global_.Parse.User[Attributes],
    permissions: js.Any,
    options: SuccessFailureOptions
  ): Unit = js.native
  def logIn(permissions: js.Any): Unit = js.native
  def logIn(permissions: js.Any, options: FullOptions): Unit = js.native
  def unlink(user: typings.parse.parseMod._Global_.Parse.User[Attributes]): Unit = js.native
  def unlink(user: typings.parse.parseMod._Global_.Parse.User[Attributes], options: SuccessFailureOptions): Unit = js.native
}

