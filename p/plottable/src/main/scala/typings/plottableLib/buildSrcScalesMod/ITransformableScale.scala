package typings
package plottableLib.buildSrcScalesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransformableScale extends js.Object {
  /**
    * Returns the current transformed domain of the scale. This must be a
    * numerical range in the same coordinate space used for
    * `scaleTransformation`.
    */
  def getTransformationDomain(): js.Tuple2[scala.Double, scala.Double]
  /**
    * Gets the full extent of the transformation domain.
    */
  def getTransformationExtent(): js.Tuple2[scala.Double, scala.Double]
  /**
    * Returns value in *Transformation Space* for the provided *screen space*.
    */
  def invertedTransformation(value: scala.Double): scala.Double
  /**
    * Translates the scale by a number of pixels.
    *
    * @param {number} [translateAmount] The translation amount in screen space
    */
  def pan(translateAmount: scala.Double): scala.Unit
  /**
    * Returns value in *screen space* for the given domain value.
    */
  def scaleTransformation(value: scala.Double): scala.Double
  /**
    * Directly set the transformation domain. Instead of calling `.zoom` or
    * `.pan` perform calculations relative to the current domain, this can but
    * used to pan/zoom to an exact domain interval (in transformation space).
    */
  def setTransformationDomain(domain: js.Tuple2[scala.Double, scala.Double]): scala.Unit
  /**
    * Apply the magnification with the floating point `magnifyAmount` centered
    * at the `centerValue` coordinate.
    *
    * @param {number} [magnifyAmount] The floating point zoom amount. `1.0` is
    * no zoom change.
    * @param {number} [centerValue] The coordinate of the mouse in screen
    * space.
    */
  def zoom(magnifyAmount: scala.Double, centerValue: scala.Double): scala.Unit
}

