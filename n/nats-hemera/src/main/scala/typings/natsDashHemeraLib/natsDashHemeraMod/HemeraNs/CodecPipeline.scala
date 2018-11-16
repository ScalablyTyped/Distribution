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

