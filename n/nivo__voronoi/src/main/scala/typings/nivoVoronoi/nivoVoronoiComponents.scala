package typings.nivoVoronoi

import typings.nivoCore.mod.Dimensions
import typings.nivoVoronoi.mod.VoronoiProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nivoVoronoiComponents extends nivoVoronoiProps {
  @scala.inline
  def ResponsiveVoroinoi: ComponentType[ResponsiveVoroinoiProps] = js.constructorOf[typings.nivoVoronoi.mod.ResponsiveVoroinoi].asInstanceOf[typings.react.mod.ComponentType[ResponsiveVoroinoiProps]]
  @scala.inline
  def Voronoi: ComponentType[VoronoiProps with Dimensions] = js.constructorOf[typings.nivoVoronoi.mod.Voronoi].asInstanceOf[typings.react.mod.ComponentType[typings.nivoVoronoi.mod.VoronoiProps with typings.nivoCore.mod.Dimensions]]
}

