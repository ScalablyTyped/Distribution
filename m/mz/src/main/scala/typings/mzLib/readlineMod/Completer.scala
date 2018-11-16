package typings
package mzLib.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Completer extends js.Object {
  def apply(line: java.lang.String): (stdLib.Promise[js.Tuple2[js.Array[java.lang.String], java.lang.String]]) | (js.Tuple2[js.Array[java.lang.String], java.lang.String]) = js.native
  def apply(
    line: java.lang.String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* result */ js.Tuple2[js.Array[java.lang.String], java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

