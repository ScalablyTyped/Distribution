package typings.plottable.scalesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITransformableScale extends js.Object {
  
  /**
    * Returns the current transformed domain of the scale. This must be a
    * numerical range in the same coordinate space used for
    * `scaleTransformation`.
    */
  def getTransformationDomain(): js.Tuple2[Double, Double] = js.native
  
  /**
    * Gets the full extent of the transformation domain.
    */
  def getTransformationExtent(): js.Tuple2[Double, Double] = js.native
  
  /**
    * Returns value in *Transformation Space* for the provided *screen space*.
    */
  def invertedTransformation(value: Double): Double = js.native
  
  /**
    * Translates the scale by a number of pixels.
    *
    * @param {number} [translateAmount] The translation amount in screen space
    */
  def pan(translateAmount: Double): Unit = js.native
  
  /**
    * Returns value in *screen space* for the given domain value.
    */
  def scaleTransformation(value: Double): Double = js.native
  
  /**
    * Directly set the transformation domain. Instead of calling `.zoom` or
    * `.pan` perform calculations relative to the current domain, this can but
    * used to pan/zoom to an exact domain interval (in transformation space).
    */
  def setTransformationDomain(domain: js.Tuple2[Double, Double]): Unit = js.native
  
  /**
    * Apply the magnification with the floating point `magnifyAmount` centered
    * at the `centerValue` coordinate.
    *
    * @param {number} [magnifyAmount] The floating point zoom amount. `1.0` is
    * no zoom change.
    * @param {number} [centerValue] The coordinate of the mouse in screen
    * space.
    */
  def zoom(magnifyAmount: Double, centerValue: Double): Unit = js.native
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
  
  @scala.inline
  implicit class ITransformableScaleOps[Self <: ITransformableScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetTransformationDomain(value: () => js.Tuple2[Double, Double]): Self = this.set("getTransformationDomain", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTransformationExtent(value: () => js.Tuple2[Double, Double]): Self = this.set("getTransformationExtent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInvertedTransformation(value: Double => Double): Self = this.set("invertedTransformation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPan(value: Double => Unit): Self = this.set("pan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScaleTransformation(value: Double => Double): Self = this.set("scaleTransformation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTransformationDomain(value: js.Tuple2[Double, Double] => Unit): Self = this.set("setTransformationDomain", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoom(value: (Double, Double) => Unit): Self = this.set("zoom", js.Any.fromFunction2(value))
  }
}
