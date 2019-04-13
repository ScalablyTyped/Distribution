package typings
package natsDashHemeraLib.natsDashHemeraMod

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
    add: js.Any => CodecPipeline,
    reset: js.Any => CodecPipeline,
    run: (js.Any, js.Any) => js.Any,
    unshift: js.Any => CodecPipeline
  ): CodecPipeline = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), reset = js.Any.fromFunction1(reset), run = js.Any.fromFunction2(run), unshift = js.Any.fromFunction1(unshift))
  
    __obj.asInstanceOf[CodecPipeline]
  }
}

