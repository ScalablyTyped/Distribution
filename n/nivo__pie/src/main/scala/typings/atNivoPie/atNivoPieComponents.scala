package typings.atNivoPie

import typings.atNivoCore.atNivoCoreMod.Dimensions
import typings.atNivoPie.atNivoPieMod.PieCanvasProps
import typings.atNivoPie.atNivoPieMod.PieSvgProps
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atNivoPieComponents extends atNivoPieProps {
  @scala.inline
  def Pie: ComponentType[PieSvgProps with Dimensions] = js.constructorOf[typings.atNivoPie.atNivoPieMod.Pie].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.atNivoPie.atNivoPieMod.PieSvgProps with typings.atNivoCore.atNivoCoreMod.Dimensions]]
  @scala.inline
  def PieCanvas: ComponentType[PieCanvasProps with Dimensions] = js.constructorOf[typings.atNivoPie.atNivoPieMod.PieCanvas].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.atNivoPie.atNivoPieMod.PieCanvasProps with typings.atNivoCore.atNivoCoreMod.Dimensions]]
  @scala.inline
  def ResponsivePie: ComponentType[ResponsivePieProps] = js.constructorOf[typings.atNivoPie.atNivoPieMod.ResponsivePie].asInstanceOf[typings.react.reactMod.ComponentType[ResponsivePieProps]]
  @scala.inline
  def ResponsivePieCanvas: ComponentType[ResponsivePieCanvasProps] = js.constructorOf[typings.atNivoPie.atNivoPieMod.ResponsivePieCanvas].asInstanceOf[typings.react.reactMod.ComponentType[ResponsivePieCanvasProps]]
}

