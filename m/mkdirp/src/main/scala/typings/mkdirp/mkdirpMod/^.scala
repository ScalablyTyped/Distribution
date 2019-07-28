package typings.mkdirp.mkdirpMod

import typings.node.NodeJSNs.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mkdirp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(dir: String, cb: js.Function2[/* err */ ErrnoException, /* made */ Made, Unit]): Unit = js.native
  def apply(
    dir: String,
    opts: Mode | Options,
    cb: js.Function2[/* err */ ErrnoException, /* made */ Made, Unit]
  ): Unit = js.native
  def sync(dir: String): Made = js.native
  def sync(dir: String, opts: Mode): Made = js.native
  def sync(dir: String, opts: OptionsSync): Made = js.native
}

