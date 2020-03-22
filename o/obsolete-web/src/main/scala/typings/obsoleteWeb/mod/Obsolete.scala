package typings.obsoleteWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Obsolete extends js.Object {
  /**
    * Test browser compatibility.
    */
  def test(browsers: js.Array[String]): Boolean = js.native
  def test(browsers: js.Array[String], done: js.Function0[Unit]): Boolean = js.native
}

