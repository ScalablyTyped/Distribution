package typings.nivoRadar

import typings.nivoCore.mod.Dimensions
import typings.nivoRadar.mod.RadarProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nivoRadarComponents extends nivoRadarProps {
  @scala.inline
  def Radar: ComponentType[RadarProps with Dimensions] = js.constructorOf[typings.nivoRadar.mod.Radar].asInstanceOf[ComponentType[RadarProps with Dimensions]]
  @scala.inline
  def ResponsiveRadar: ComponentType[ResponsiveRadarProps] = js.constructorOf[typings.nivoRadar.mod.ResponsiveRadar].asInstanceOf[ComponentType[ResponsiveRadarProps]]
}

