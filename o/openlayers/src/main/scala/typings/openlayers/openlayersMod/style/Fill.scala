package typings.openlayers.openlayersMod.style

import typings.openlayers.openlayersMod.Color
import typings.openlayers.openlayersMod.ColorLike
import typings.openlayers.openlayersMod.olx.style.FillOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Set fill style for vector features.
  *
  * @param opt_options Options.
  * @api
  */
@JSImport("openlayers", "style.Fill")
@js.native
/**
  * @classdesc
  * Set fill style for vector features.
  *
  * @param opt_options Options.
  * @api
  */
class Fill () extends js.Object {
  def this(opt_options: FillOptions) = this()
  /**
    * Get the fill color.
    * @return Color.
    * @api
    */
  def getColor(): Color | ColorLike = js.native
  /**
    * Set the color.
    *
    * @param color Color.
    * @api
    */
  def setColor(color: Color | ColorLike): Unit = js.native
}

