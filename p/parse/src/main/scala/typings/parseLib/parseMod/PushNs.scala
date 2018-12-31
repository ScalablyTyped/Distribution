package typings
package parseLib.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains functions to deal with Push in Parse
  * @name Parse.Push
  * @namespace
  */
@JSImport("parse", "Push")
@js.native
object PushNs extends js.Object {
  def send[T](data: parseLib.ParseNs.PushNs.PushData): js.Promise[T] = js.native
  def send[T](data: parseLib.ParseNs.PushNs.PushData, options: parseLib.ParseNs.PushNs.SendOptions): js.Promise[T] = js.native
}

