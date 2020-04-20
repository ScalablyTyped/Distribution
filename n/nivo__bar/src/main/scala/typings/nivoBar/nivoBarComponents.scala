package typings.nivoBar

import typings.nivoBar.mod.BarCanvasProps
import typings.nivoBar.mod.BarSvgProps
import typings.nivoCore.mod.Dimensions
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nivoBarComponents extends nivoBarProps {
  @scala.inline
  def Bar: ComponentType[BarSvgProps with Dimensions] = js.constructorOf[typings.nivoBar.mod.Bar].asInstanceOf[ComponentType[BarSvgProps with Dimensions]]
  @scala.inline
  def BarCanvas: ComponentType[BarCanvasProps with Dimensions] = js.constructorOf[typings.nivoBar.mod.BarCanvas].asInstanceOf[ComponentType[BarCanvasProps with Dimensions]]
  @scala.inline
  def ResponsiveBar: ComponentType[ResponsiveBarProps] = js.constructorOf[typings.nivoBar.mod.ResponsiveBar].asInstanceOf[ComponentType[ResponsiveBarProps]]
  @scala.inline
  def ResponsiveBarCanvas: ComponentType[ResponsiveBarCanvasProps] = js.constructorOf[typings.nivoBar.mod.ResponsiveBarCanvas].asInstanceOf[ComponentType[ResponsiveBarCanvasProps]]
}

