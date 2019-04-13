package typings
package mkdirpLib.mkdirpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mkdirp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    dir: java.lang.String,
    cb: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* made */ Made, scala.Unit]
  ): scala.Unit = js.native
  def apply(
    dir: java.lang.String,
    opts: Mode | Options,
    cb: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* made */ Made, scala.Unit]
  ): scala.Unit = js.native
  def sync(dir: java.lang.String): Made = js.native
  def sync(dir: java.lang.String, opts: Mode): Made = js.native
  def sync(dir: java.lang.String, opts: OptionsSync): Made = js.native
}

