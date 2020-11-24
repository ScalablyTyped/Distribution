package typings.ol.imageStaticMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static
  extends typings.ol.sourceImageMod.default {
  
  /**
    * Returns the image extent
    */
  def getImageExtent(): Extent = js.native
  
  /**
    * Return the URL used for this image source.
    */
  def getUrl(): String = js.native
}
