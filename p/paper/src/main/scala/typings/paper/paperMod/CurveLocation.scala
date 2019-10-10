package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * CurveLocation objects describe a location on {@link Curve} objects, as
  *     defined by the curve-time {@link #time}, a value between `0` (beginning
  *     of the curve) and `1` (end of the curve). If the curve is part of a
  *     {@link Path} item, its {@link #index} inside the {@link Path#curves}
  *     array is also provided.
  * 
  * The class is in use in many places, such as
  * {@link Path#getLocationAt},
  * {@link Path#getLocationOf},
  * {@link PathItem#getNearestLocation},
  * {@link PathItem#getIntersections},
  * etc.
  */
@JSImport("paper", "CurveLocation")
@js.native
class CurveLocation protected ()
  extends typings.paper.paper.CurveLocation {
  /** 
    * Creates a new CurveLocation object.
    */
  def this(curve: typings.paper.paper.Curve, time: Double) = this()
  def this(curve: typings.paper.paper.Curve, time: Double, point: typings.paper.paper.Point) = this()
}

