package typings.mz.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Completer extends js.Object {
  def apply(line: String): (js.Promise[js.Tuple2[js.Array[String], String]]) | (js.Tuple2[js.Array[String], String]) = js.native
  def apply(
    line: String,
    callback: js.Function2[/* err */ js.Any, /* result */ js.Tuple2[js.Array[String], String], Unit]
  ): Unit = js.native
}

