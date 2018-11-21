package typings
package parseLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Contains functions to deal with Push in Parse
     * @name Parse.Push
     * @namespace
     */
@JSImport("parse/react-native", "Push")
@js.native
object PushNs extends js.Object {
  def send[T](data: parseLib.ParseNs.PushNs.PushData): stdLib.Promise[T] = js.native
  def send[T](data: parseLib.ParseNs.PushNs.PushData, options: parseLib.ParseNs.PushNs.SendOptions): stdLib.Promise[T] = js.native
}

