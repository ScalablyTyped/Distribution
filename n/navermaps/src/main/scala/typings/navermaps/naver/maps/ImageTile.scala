package typings.navermaps.naver.maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageTile extends Tile {
  def getImageElements(): js.Array[HTMLElement] = js.native
  def getUrls(): js.Array[String] = js.native
  def setUrls(urls: js.Array[String]): Unit = js.native
}

