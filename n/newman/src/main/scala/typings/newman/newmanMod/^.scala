package typings.newman.newmanMod

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("newman", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def run(options: NewmanRunOptions): EventEmitter = js.native
  def run(
    options: NewmanRunOptions,
    callback: js.Function2[/* err */ Error | Null, /* summary */ NewmanRunSummary, Unit]
  ): EventEmitter = js.native
}

