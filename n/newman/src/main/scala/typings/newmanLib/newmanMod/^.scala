package typings
package newmanLib.newmanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("newman", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def run(options: newmanLib.newmanMod.NewmanRunOptions): nodeLib.eventsMod.EventEmitter = js.native
  def run(
    options: newmanLib.newmanMod.NewmanRunOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* summary */ newmanLib.newmanMod.NewmanRunSummary, 
      scala.Unit
    ]
  ): nodeLib.eventsMod.EventEmitter = js.native
}

