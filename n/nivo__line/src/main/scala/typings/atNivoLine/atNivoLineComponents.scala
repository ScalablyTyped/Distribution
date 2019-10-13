package typings.atNivoLine

import typings.atNivoCore.atNivoCoreMod.Dimensions
import typings.atNivoLine.atNivoLineMod.LineCanvasProps
import typings.atNivoLine.atNivoLineMod.LineSvgProps
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atNivoLineComponents extends atNivoLineProps {
  @scala.inline
  def Line: ComponentType[LineSvgProps with Dimensions] = js.constructorOf[typings.atNivoLine.atNivoLineMod.Line].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.atNivoLine.atNivoLineMod.LineSvgProps with typings.atNivoCore.atNivoCoreMod.Dimensions]]
  @scala.inline
  def LineCanvas: ComponentType[LineCanvasProps with Dimensions] = js.constructorOf[typings.atNivoLine.atNivoLineMod.LineCanvas].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.atNivoLine.atNivoLineMod.LineCanvasProps with typings.atNivoCore.atNivoCoreMod.Dimensions]]
  @scala.inline
  def ResponsiveLine: ComponentType[ResponsiveLineProps] = js.constructorOf[typings.atNivoLine.atNivoLineMod.ResponsiveLine].asInstanceOf[typings.react.reactMod.ComponentType[ResponsiveLineProps]]
  @scala.inline
  def ResponsiveLineCanvas: ComponentType[ResponsiveLineCanvasProps] = js.constructorOf[typings.atNivoLine.atNivoLineMod.ResponsiveLineCanvas].asInstanceOf[typings.react.reactMod.ComponentType[ResponsiveLineCanvasProps]]
}

