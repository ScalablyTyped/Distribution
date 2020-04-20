package typings.plottable.scalesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransformableScale extends js.Object {
  /**
    * Returns the current transformed domain of the scale. This must be a
    * numerical range in the same coordinate space used for
    * `scaleTransformation`.
    */
  def getTransformationDomain(): js.Tuple2[Double, Double]
  /**
    * Gets the full extent of the transformation domain.
    */
  def getTransformationExtent(): js.Tuple2[Double, Double]
  /**
    * Returns value in *Transformation Space* for the provided *screen space*.
    */
  def invertedTransformation(value: Double): Double
  /**
    * Translates the scale by a number of pixels.
    *
    * @param {number} [translateAmount] The translation amount in screen space
    */
  def pan(translateAmount: Double): Unit
  /**
    * Returns value in *screen space* for the given domain value.
    */
  def scaleTransformation(value: Double): Double
  /**
    * Directly set the transformation domain. Instead of calling `.zoom` or
    * `.pan` perform calculations relative to the current domain, this can but
    * used to pan/zoom to an exact domain interval (in transformation space).
    */
  def setTransformationDomain(domain: js.Tuple2[Double, Double]): Unit
  /**
    * Apply the magnification with the floating point `magnifyAmount` centered
    * at the `centerValue` coordinate.
    *
    * @param {number} [magnifyAmount] The floating point zoom amount. `1.0` is
    * no zoom change.
    * @param {number} [centerValue] The coordinate of the mouse in screen
    * space.
    */
  def zoom(magnifyAmount: Double, centerValue: Double): Unit
}

object ITransformableScale {
  @scala.inline
  def apply(
    getTransformationDomain: () => js.Tuple2[Double, Double],
    getTransformationExtent: () => js.Tuple2[Double, Double],
    invertedTransformation: Double => Double,
    pan: Double => Unit,
    scaleTransformation: Double => Double,
    setTransformationDomain: js.Tuple2[Double, Double] => Unit,
    zoom: (Double, Double) => Unit
  ): ITransformableScale = {
    val __obj = js.Dynamic.literal(getTransformationDomain = js.Any.fromFunction0(getTransformationDomain), getTransformationExtent = js.Any.fromFunction0(getTransformationExtent), invertedTransformation = js.Any.fromFunction1(invertedTransformation), pan = js.Any.fromFunction1(pan), scaleTransformation = js.Any.fromFunction1(scaleTransformation), setTransformationDomain = js.Any.fromFunction1(setTransformationDomain), zoom = js.Any.fromFunction2(zoom))
    __obj.asInstanceOf[ITransformableScale]
  }
}

