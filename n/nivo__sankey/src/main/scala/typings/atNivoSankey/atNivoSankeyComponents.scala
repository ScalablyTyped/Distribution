package typings.atNivoSankey

import typings.atNivoSankey.atNivoSankeyMod.Data
import typings.atNivoSankey.atNivoSankeyMod.Dimensions
import typings.atNivoSankey.atNivoSankeyMod.SankeyProps
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atNivoSankeyComponents extends atNivoSankeyProps {
  @scala.inline
  def ResponsiveSankey: ComponentType[Data with SankeyProps] = js.constructorOf[typings.atNivoSankey.atNivoSankeyMod.ResponsiveSankey].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.atNivoSankey.atNivoSankeyMod.Data with typings.atNivoSankey.atNivoSankeyMod.SankeyProps]]
  @scala.inline
  def Sankey: ComponentType[Data with SankeyProps with Dimensions] = js.constructorOf[typings.atNivoSankey.atNivoSankeyMod.Sankey].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.atNivoSankey.atNivoSankeyMod.Data with typings.atNivoSankey.atNivoSankeyMod.SankeyProps with typings.atNivoSankey.atNivoSankeyMod.Dimensions]]
}

