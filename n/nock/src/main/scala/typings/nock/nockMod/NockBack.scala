package typings.nock.nockMod

import typings.nock.Anon_Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NockBack extends js.Object {
  var fixtures: String = js.native
  def apply(fixtureName: String): js.Promise[Anon_Context] = js.native
  def apply(fixtureName: String, nockedFn: js.Function1[/* nockDone */ js.Function0[Unit], Unit]): Unit = js.native
  def apply(fixtureName: String, options: NockBackOptions): js.Promise[Anon_Context] = js.native
  def apply(
    fixtureName: String,
    options: NockBackOptions,
    nockedFn: js.Function1[/* nockDone */ js.Function0[Unit], Unit]
  ): Unit = js.native
  def setMode(mode: NockBackMode): Unit = js.native
}

