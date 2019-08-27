package typings.nodeDashVagrant.nodeDashVagrantMod

import typings.node.eventsMod.EventEmitter
import typings.nodeDashVagrant.nodeDashVagrantStrings.progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressEmitter extends EventEmitter {
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
}

