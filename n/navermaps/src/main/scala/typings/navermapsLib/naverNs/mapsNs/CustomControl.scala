package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Control
@JSGlobal("naver.maps.CustomControl")
@js.native
class CustomControl protected () extends KVO {
  def this(html: java.lang.String, ControlOptions: ControlOptions) = this()
  def getElement(): stdLib.HTMLElement = js.native
  def getMap(): Map | scala.Null = js.native
  def getOptions(): js.Any = js.native
  def getOptions(key: java.lang.String): js.Any = js.native
  def html(): js.UndefOr[java.lang.String] = js.native
  def html(html: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
  def setOptions(newOptions: ControlOptions): scala.Unit = js.native
  def setPosition(position: Position): scala.Unit = js.native
}

