package typings.nock.nockMod

import typings.nock.Anon_Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Back extends js.Object {
  var fixtures: String = js.native
  def apply(fixtureName: String): js.Promise[Anon_Context] = js.native
  def apply(fixtureName: String, nockedFn: js.Function1[/* nockDone */ js.Function0[Unit], Unit]): Unit = js.native
  def apply(fixtureName: String, options: BackOptions): js.Promise[Anon_Context] = js.native
  def apply(
    fixtureName: String,
    options: BackOptions,
    nockedFn: js.Function1[/* nockDone */ js.Function0[Unit], Unit]
  ): Unit = js.native
  def setMode(mode: BackMode): Unit = js.native
}

