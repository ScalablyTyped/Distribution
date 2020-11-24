package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.PanoramaOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("naver.maps.Panorama")
@js.native
class Panorama protected ()
  extends typings.navermaps.naver.maps.Panorama {
  def this(panoramaDiv: String, panoramaOptions: PanoramaOptions) = this()
  def this(panoramaDiv: HTMLElement, panoramaOptions: PanoramaOptions) = this()
}
