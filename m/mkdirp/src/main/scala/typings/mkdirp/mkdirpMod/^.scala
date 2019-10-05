package typings.mkdirp.mkdirpMod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mkdirp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(dir: String, cb: js.Function2[/* err */ ErrnoException, /* made */ Made, Unit]): Unit = js.native
  def apply(dir: String, opts: Mode, cb: js.Function2[/* err */ ErrnoException, /* made */ Made, Unit]): Unit = js.native
  def apply(dir: String, opts: Options, cb: js.Function2[/* err */ ErrnoException, /* made */ Made, Unit]): Unit = js.native
}

