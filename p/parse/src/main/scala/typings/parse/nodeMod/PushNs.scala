package typings.parse.nodeMod

import typings.parse.ParseNs.PushNs.PushData
import typings.parse.ParseNs.PushNs.SendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains functions to deal with Push in Parse
  * @name Parse.Push
  * @namespace
  */
@JSImport("parse/node", "Push")
@js.native
object PushNs extends js.Object {
  def send[T](data: PushData): js.Promise[T] = js.native
  def send[T](data: PushData, options: SendOptions): js.Promise[T] = js.native
}

