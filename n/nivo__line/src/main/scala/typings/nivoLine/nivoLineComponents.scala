package typings.nivoLine

import typings.nivoCore.mod.Dimensions
import typings.nivoLine.mod.LineCanvasProps
import typings.nivoLine.mod.LineSvgProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nivoLineComponents extends nivoLineProps {
  @scala.inline
  def Line: ComponentType[LineSvgProps with Dimensions] = js.constructorOf[typings.nivoLine.mod.Line].asInstanceOf[ComponentType[LineSvgProps with Dimensions]]
  @scala.inline
  def LineCanvas: ComponentType[LineCanvasProps with Dimensions] = js.constructorOf[typings.nivoLine.mod.LineCanvas].asInstanceOf[ComponentType[LineCanvasProps with Dimensions]]
  @scala.inline
  def ResponsiveLine: ComponentType[ResponsiveLineProps] = js.constructorOf[typings.nivoLine.mod.ResponsiveLine].asInstanceOf[ComponentType[ResponsiveLineProps]]
  @scala.inline
  def ResponsiveLineCanvas: ComponentType[ResponsiveLineCanvasProps] = js.constructorOf[typings.nivoLine.mod.ResponsiveLineCanvas].asInstanceOf[ComponentType[ResponsiveLineCanvasProps]]
}

