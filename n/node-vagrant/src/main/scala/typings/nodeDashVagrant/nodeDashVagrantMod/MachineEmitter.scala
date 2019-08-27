package typings.nodeDashVagrant.nodeDashVagrantMod

import typings.node.eventsMod.EventEmitter
import typings.nodeDashVagrant.nodeDashVagrantStrings.`up-progress`
import typings.nodeDashVagrant.nodeDashVagrantStrings.progress
import typings.nodeDashVagrant.nodeDashVagrantStrings.stderr
import typings.nodeDashVagrant.nodeDashVagrantStrings.stdout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MachineEmitter extends EventEmitter {
  @JSName("on")
  def on_progress(
    event: progress,
    listener: js.Function4[
      /* machine */ String, 
      /* progress */ String, 
      /* rate */ String, 
      /* remaining */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_stderr(event: stderr, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_stdout(event: stdout, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_upprogress(event: `up-progress`, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
}

