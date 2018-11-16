package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.MapTypeRegistry")
@js.native
class MapTypeRegistry () extends KVO {
  def this(mapTypeInfo: js.Any) = this()
  def this(mapTypeInfo: js.Any, defaultMapTypeId: java.lang.String) = this()
  def getPreviousTypeId(): java.lang.String = js.native
  def getSelectedType(): MapType = js.native
  def getSelectedTypeId(): java.lang.String = js.native
  def getTypeIds(): js.Array[java.lang.String] = js.native
  def set(mapTypeId: java.lang.String, mapType: MapType): scala.Unit = js.native
  def setSelectedTypeId(mapTypeId: java.lang.String): scala.Unit = js.native
}

