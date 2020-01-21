package typings.plottable.mod.Components

import typings.plottable.scaleMod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Components.Gridlines")
@js.native
class Gridlines ()
  extends typings.plottable.componentsMod.Gridlines {
  def this(xScale: Scale[_, _]) = this()
  def this(xScale: Null, yScale: Scale[_, _]) = this()
  /**
    * @constructor
    * @param {Scale} xScale The scale to base the x gridlines on. Pass null if no gridlines are desired.
    * @param {Scale} yScale The scale to base the y gridlines on. Pass null if no gridlines are desired.
    */
  def this(xScale: Scale[_, _], yScale: Scale[_, _]) = this()
}

