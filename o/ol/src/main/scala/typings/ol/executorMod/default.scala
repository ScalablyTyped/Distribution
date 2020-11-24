package typings.ol.executorMod

import typings.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/render/canvas/Executor", JSImport.Default)
@js.native
class default protected () extends Executor {
  def this(
    resolution: Double,
    pixelRatio: Double,
    overlaps: Boolean,
    instructions: SerializableInstructions,
    renderBuffer: Size
  ) = this()
}
