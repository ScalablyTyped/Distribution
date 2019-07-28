package typings.plottable.buildSrcScalesMod

import typings.plottable.buildSrcScalesTickGeneratorsMod.ITickGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/scales", "TickGenerators")
@js.native
object TickGeneratorsNs extends js.Object {
  def integerTickGenerator(): ITickGenerator[Double] = js.native
  def intervalTickGenerator(interval: Double): ITickGenerator[Double] = js.native
}

