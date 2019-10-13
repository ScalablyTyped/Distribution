package typings.atNivoVoronoi

import typings.atNivoCore.atNivoCoreMod.Dimensions
import typings.atNivoVoronoi.atNivoVoronoiMod.VoronoiProps
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atNivoVoronoiComponents extends atNivoVoronoiProps {
  @scala.inline
  def ResponsiveVoroinoi: ComponentType[ResponsiveVoroinoiProps] = js.constructorOf[typings.atNivoVoronoi.atNivoVoronoiMod.ResponsiveVoroinoi].asInstanceOf[typings.react.reactMod.ComponentType[ResponsiveVoroinoiProps]]
  @scala.inline
  def Voronoi: ComponentType[VoronoiProps with Dimensions] = js.constructorOf[typings.atNivoVoronoi.atNivoVoronoiMod.Voronoi].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.atNivoVoronoi.atNivoVoronoiMod.VoronoiProps with typings.atNivoCore.atNivoCoreMod.Dimensions]]
}

