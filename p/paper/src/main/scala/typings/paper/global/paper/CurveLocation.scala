package typings.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSGlobal("paper.CurveLocation")
@js.native
class CurveLocation protected ()
  extends StObject
     with typings.paper.paper.CurveLocation {
  /** 
    * Creates a new CurveLocation object.
    */
  def this(curve: typings.paper.paper.Curve, time: Double) = this()
  def this(curve: typings.paper.paper.Curve, time: Double, point: typings.paper.paper.Point) = this()
  
  /** 
    * The curvature of the {@link #curve} at the given location.
    */
  /* CompleteClass */
  override val curvature: Double = js.native
  
  /** 
    * The curve that this location belongs to.
    */
  /* CompleteClass */
  override val curve: typings.paper.paper.Curve = js.native
  
  /** 
    * The length of the curve from its beginning up to the location described
    * by this object.
    */
  /* CompleteClass */
  override val curveOffset: Double = js.native
  
  /** 
    * The distance from the queried point to the returned location.
    * 
    * @see Curve#getNearestLocation(point)
    * @see PathItem#getNearestLocation(point)
    */
  /* CompleteClass */
  override val distance: Double = js.native
  
  /** 
    * Checks whether tow CurveLocation objects are describing the same location
    * on a path, by applying the same tolerances as elsewhere when dealing with
    * curve-time parameters.
    * 
    * @return true if the locations are equal
    */
  /* CompleteClass */
  override def equals(location: typings.paper.paper.CurveLocation): Boolean = js.native
  
  /** 
    * Checks if the location is an intersection with another curve and is
    * part of an overlap between the two involved paths.
    * 
    * @see #isCrossing()
    * @see #isTouching()
    * 
    * @return true if the location is an intersection that is
    * part of an overlap between the two involved paths
    */
  /* CompleteClass */
  override def hasOverlap(): Boolean = js.native
  
  /** 
    * The index of the {@link #curve} within the {@link Path#curves} list, if
    * it is part of a {@link Path} item.
    */
  /* CompleteClass */
  override val index: Double = js.native
  
  /** 
    * The curve location on the intersecting curve, if this location is the
    * result of a call to {@link PathItem#getIntersections} /
    * {@link Curve#getIntersections}.
    */
  /* CompleteClass */
  override val intersection: typings.paper.paper.CurveLocation = js.native
  
  /** 
    * Checks if the location is an intersection with another curve and is
    * crossing the other curve, as opposed to just touching it.
    * 
    * @see #isTouching()
    * 
    * @return true if the location is an intersection that is
    * crossing another curve
    */
  /* CompleteClass */
  override def isCrossing(): Boolean = js.native
  
  /** 
    * Checks if the location is an intersection with another curve and is
    * merely touching the other curve, as opposed to crossing it.
    * 
    * @see #isCrossing()
    * 
    * @return true if the location is an intersection that is
    * merely touching another curve
    */
  /* CompleteClass */
  override def isTouching(): Boolean = js.native
  
  /** 
    * The normal vector to the {@link #curve} at the given location.
    */
  /* CompleteClass */
  override val normal: typings.paper.paper.Point = js.native
  
  /** 
    * The length of the path from its beginning up to the location described
    * by this object. If the curve is not part of a path, then the length
    * within the curve is returned instead.
    */
  /* CompleteClass */
  override val offset: Double = js.native
  
  /** 
    * The path that this locations is situated on.
    */
  /* CompleteClass */
  override val path: typings.paper.paper.Path = js.native
  
  /** 
    * The point which is defined by the {@link #curve} and
    * {@link #time}.
    */
  /* CompleteClass */
  override val point: typings.paper.paper.Point = js.native
  
  /** 
    * The segment of the curve which is closer to the described location.
    */
  /* CompleteClass */
  override val segment: typings.paper.paper.Segment = js.native
  
  /** 
    * The tangential vector to the {@link #curve} at the given location.
    */
  /* CompleteClass */
  override val tangent: typings.paper.paper.Point = js.native
  
  /** 
    * The curve-time parameter, as used by various bezier curve calculations.
    * It is value between `0` (beginning of the curve) and `1` (end of the
    * curve).
    */
  /* CompleteClass */
  override val time: Double = js.native
}
