package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @name pc.Curve
     * @class A curve is a collection of keys (time/value pairs). The shape of the
     * curve is defined by its type that specifies an interpolation scheme for the keys.
     * @description Creates a new curve.
     * @param {Number[]} [data] An array of keys (pairs of numbers with the time first and
     * value second)
     * @property {Number} length The number of keys in the curve. [read only]
     */
@JSGlobal("pc.Curve")
@js.native
class Curve () extends js.Object {
  def this(data: js.Array[scala.Double]) = this()
  var length: scala.Double = js.native
  /**
           * @function
           * @name pc.Curve#add
           * @description Add a new key to the curve.
           * @param {Number} time Time to add new key
           * @param {Number} value Value of new key
           * @returns {Number[]} [time, value] pair
           */
  def add(time: scala.Double, value: scala.Double): js.Array[scala.Double] = js.native
  /**
           * @function
           * @name pc.Curve#get
           * @description Return a specific key.
           * @param {Number} index The index of the key to return
           * @returns {Number[]} The key at the specified index
           */
  def get(index: scala.Double): js.Array[scala.Double] = js.native
  /**
           * @function
           * @name pc.Curve#sort
           * @description Sort keys by time.
           */
  def sort(): scala.Unit = js.native
  /**
           * @function
           * @name pc.Curve#value
           * @description Returns the interpolated value of the curve at specified time.
           * @param {Number} time The time at which to calculate the value
           * @return {Number} The interpolated value
           */
  def value(time: scala.Double): scala.Double = js.native
}

