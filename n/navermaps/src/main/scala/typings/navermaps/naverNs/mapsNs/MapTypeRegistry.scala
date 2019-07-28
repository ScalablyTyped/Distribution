package typings.navermaps.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.MapTypeRegistry")
@js.native
class MapTypeRegistry () extends KVO {
  def this(mapTypeInfo: js.Any) = this()
  def this(mapTypeInfo: js.Any, defaultMapTypeId: String) = this()
  def getPreviousTypeId(): String = js.native
  def getSelectedType(): MapType = js.native
  def getSelectedTypeId(): String = js.native
  def getTypeIds(): js.Array[String] = js.native
  def set(mapTypeId: String, mapType: MapType): Unit = js.native
  def setSelectedTypeId(mapTypeId: String): Unit = js.native
}

