package typings.navermaps.naverNs.mapsNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Layer
@JSGlobal("naver.maps.Layer")
@js.native
class Layer protected () extends KVO {
  def this(name: String, MapTypeRegistry: MapTypeRegistry, options: LayerOptions) = this()
  def getLayerType(): MapType = js.native
  def getLayerTypeId(): String = js.native
  def getMap(): Map | Null = js.native
  def getOpacity(): Double = js.native
  def getPaneElement(): HTMLElement = js.native
  def refresh(): Unit = js.native
  def refresh(noEffect: Boolean): Unit = js.native
  def setLayerTypeId(typeId: String): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setOpacity(opacity: Double): Unit = js.native
}

