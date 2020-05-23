package typings.nodeVagrant.anon

import typings.nodeVagrant.mod.ErrorArg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cb extends js.Object {
  var command: String = js.native
  def cb(err: ErrorArg): Unit = js.native
  def cb(err: ErrorArg, out: js.Any): Unit = js.native
}

