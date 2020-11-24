package typings.ol.iconMod

import typings.ol.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Icon
  extends typings.ol.styleImageMod.default {
  
  /**
    * Get the icon color.
    */
  def getColor(): Color = js.native
  
  /**
    * Get the pixel ratio.
    */
  def getPixelRatio(pixelRatio: Double): Double = js.native
  
  /**
    * Get the image URL.
    */
  def getSrc(): js.UndefOr[String] = js.native
  
  /**
    * Set the anchor point. The anchor determines the center point for the
    * symbolizer.
    */
  def setAnchor(anchor: js.Array[Double]): Unit = js.native
}
