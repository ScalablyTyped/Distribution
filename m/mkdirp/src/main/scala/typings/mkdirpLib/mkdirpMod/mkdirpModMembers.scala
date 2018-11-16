package typings
package mkdirpLib.mkdirpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mkdirp", JSImport.Namespace)
@js.native
object mkdirpModMembers extends js.Object {
  def apply(
    dir: java.lang.String,
    cb: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* made */ mkdirpLib.mkdirpMod.mkdirpNs.Made, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(
    dir: java.lang.String,
    opts: mkdirpLib.mkdirpMod.mkdirpNs.Mode | mkdirpLib.mkdirpMod.mkdirpNs.Options,
    cb: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* made */ mkdirpLib.mkdirpMod.mkdirpNs.Made, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def sync(dir: java.lang.String): mkdirpLib.mkdirpMod.mkdirpNs.Made = js.native
  def sync(dir: java.lang.String, opts: mkdirpLib.mkdirpMod.mkdirpNs.Mode): mkdirpLib.mkdirpMod.mkdirpNs.Made = js.native
  def sync(dir: java.lang.String, opts: mkdirpLib.mkdirpMod.mkdirpNs.OptionsSync): mkdirpLib.mkdirpMod.mkdirpNs.Made = js.native
}

