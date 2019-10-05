package typings.newman.newmanMod

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("newman", "run")
@js.native
object run extends js.Object {
  def apply(options: NewmanRunOptions): EventEmitter = js.native
  def apply(
    options: NewmanRunOptions,
    callback: js.Function2[/* err */ Error | Null, /* summary */ NewmanRunSummary, Unit]
  ): EventEmitter = js.native
}

