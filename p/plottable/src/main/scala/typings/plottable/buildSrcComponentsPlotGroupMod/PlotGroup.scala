package typings.plottable.buildSrcComponentsPlotGroupMod

import typings.plottable.buildSrcComponentsGroupMod.Group
import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.plottable.buildSrcPlotsCommonsMod.IPlotEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components/plotGroup", "PlotGroup")
@js.native
class PlotGroup () extends Group {
  def entityNearest(point: Point): IPlotEntity = js.native
}

