package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Layer
@JSGlobal("naver.maps.Layer")
@js.native
class Layer protected () extends KVO {
  def this(name: java.lang.String, MapTypeRegistry: MapTypeRegistry, options: LayerOptions) = this()
  def getLayerType(): MapType = js.native
  def getLayerTypeId(): java.lang.String = js.native
  def getMap(): Map | scala.Null = js.native
  def getOpacity(): scala.Double = js.native
  def getPaneElement(): stdLib.HTMLElement = js.native
  def refresh(): scala.Unit = js.native
  def refresh(noEffect: scala.Boolean): scala.Unit = js.native
  def setLayerTypeId(typeId: java.lang.String): scala.Unit = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
}

