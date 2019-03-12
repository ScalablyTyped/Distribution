package typings
package newmanLib.newmanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("newman", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def run(options: NewmanRunOptions): nodeLib.eventsMod.EventEmitter = js.native
  def run(
    options: NewmanRunOptions,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* summary */ NewmanRunSummary, scala.Unit]
  ): nodeLib.eventsMod.EventEmitter = js.native
}

