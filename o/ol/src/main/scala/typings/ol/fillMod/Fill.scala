package typings.ol.fillMod

import typings.ol.colorMod.Color
import typings.ol.colorlikeMod.ColorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fill extends js.Object {
  
  /**
    * Get the fill color.
    */
  def getColor(): Color | ColorLike = js.native
  
  /**
    * Set the color.
    */
  def setColor(color: Color): Unit = js.native
  def setColor(color: ColorLike): Unit = js.native
}
