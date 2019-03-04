package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodecPipeline extends js.Object {
  def add(step: js.Any): CodecPipeline
  def reset(step: js.Any): CodecPipeline
  def run(msg: js.Any, cb: js.Any): js.Any
  def unshift(step: js.Any): CodecPipeline
}

object CodecPipeline {
  @scala.inline
  def apply(
    add: js.Function1[js.Any, CodecPipeline],
    reset: js.Function1[js.Any, CodecPipeline],
    run: js.Function2[js.Any, js.Any, js.Any],
    unshift: js.Function1[js.Any, CodecPipeline]
  ): CodecPipeline = {
    val __obj = js.Dynamic.literal(add = add, reset = reset, run = run, unshift = unshift)
  
    __obj.asInstanceOf[CodecPipeline]
  }
}

