package typings
package memDashFsLib.memDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store
  extends nodeLib.eventsMod.EventEmitter {
  def add(file: vinylLib.vinylMod.File): this.type = js.native
  def each(callback: js.Function2[/* file */ vinylLib.vinylMod.File, /* index */ scala.Double, scala.Unit]): this.type = js.native
  def get(filepath: java.lang.String): vinylLib.vinylMod.File = js.native
  def stream(): nodeLib.streamMod.Transform = js.native
}

