package typings.navermaps.naver.maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Control
@js.native
trait CustomControl extends KVO {
  def getElement(): HTMLElement = js.native
  def getMap(): Map | Null = js.native
  def getOptions(): js.Any = js.native
  def getOptions(key: String): js.Any = js.native
  def html(): js.UndefOr[String] = js.native
  def html(html: String): js.UndefOr[String] = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setOptions(newOptions: ControlOptions): Unit = js.native
  def setPosition(position: Position): Unit = js.native
}

