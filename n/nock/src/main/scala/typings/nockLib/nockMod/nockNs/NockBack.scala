package typings
package nockLib.nockMod.nockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NockBack extends js.Object {
  var fixtures: java.lang.String = js.native
  def apply(fixtureName: java.lang.String): js.Promise[nockLib.Anon_NockDone] = js.native
  def apply(
    fixtureName: java.lang.String,
    nockedFn: js.Function1[/* nockDone */ js.Function0[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def apply(fixtureName: java.lang.String, options: NockBackOptions): js.Promise[nockLib.Anon_NockDone] = js.native
  def apply(
    fixtureName: java.lang.String,
    options: NockBackOptions,
    nockedFn: js.Function1[/* nockDone */ js.Function0[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def setMode(mode: NockBackMode): scala.Unit = js.native
}

