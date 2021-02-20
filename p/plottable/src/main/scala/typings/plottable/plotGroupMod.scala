package typings.plottable

import typings.plottable.commonsMod.IPlotEntity
import typings.plottable.componentMod.Component
import typings.plottable.groupMod.Group
import typings.plottable.interfacesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plotGroupMod {
  
  @JSImport("plottable/build/src/components/plotGroup", "PlotGroup")
  @js.native
  /**
    * Constructs a Group.
    *
    * A Group contains Components that will be rendered on top of each other.
    * Components added later will be rendered above Components already in the Group.
    *
    * @constructor
    * @param {Component[]} [components=[]] Components to be added to the Group.
    */
  class PlotGroup () extends Group {
    def this(components: js.Array[Component]) = this()
    
    def entityNearest(point: Point): IPlotEntity = js.native
  }
}
