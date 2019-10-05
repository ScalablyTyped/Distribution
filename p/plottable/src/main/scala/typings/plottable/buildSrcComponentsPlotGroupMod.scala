package typings.plottable

import typings.plottable.buildSrcComponentsGroupMod.Group
import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.plottable.buildSrcPlotsCommonsMod.IPlotEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components/plotGroup", JSImport.Namespace)
@js.native
object buildSrcComponentsPlotGroupMod extends js.Object {
  @js.native
  class PlotGroup () extends Group {
    def entityNearest(point: Point): IPlotEntity = js.native
  }
  
}

