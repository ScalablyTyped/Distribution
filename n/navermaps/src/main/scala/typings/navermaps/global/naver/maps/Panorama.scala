package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.PanoramaOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.Panorama")
@js.native
class Panorama protected ()
  extends typings.navermaps.naver.maps.Panorama {
  def this(panoramaDiv: String, panoramaOptions: PanoramaOptions) = this()
  def this(panoramaDiv: HTMLElement, panoramaOptions: PanoramaOptions) = this()
}

