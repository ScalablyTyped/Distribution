package typings.navermaps.naver.maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.ImageTile")
@js.native
class ImageTile protected () extends Tile {
  def this(imageTileOptions: ImageTileOptions) = this()
  def getImageElements(): js.Array[HTMLElement] = js.native
  def getUrls(): js.Array[String] = js.native
  def setUrls(urls: js.Array[String]): Unit = js.native
}

