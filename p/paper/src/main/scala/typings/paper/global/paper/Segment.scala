package typings.paper.global.paper

import typings.paper.paper.PointLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The Segment object represents the points of a path through which its
  * {@link Curve} objects pass. The segments of a path can be accessed through
  * its {@link Path#segments} array.
  * 
  * Each segment consists of an anchor point ({@link Segment#point}) and
  * optionally an incoming and an outgoing handle ({@link Segment#handleIn} and
  * {@link Segment#handleOut}), describing the tangents of the two {@link Curve}
  * objects that are connected by this segment.
  */
@JSGlobal("paper.Segment")
@js.native
/** 
  * Creates a new Segment object.
  * 
  * @param point - the anchor point of the segment
  * @param handleIn - the handle point relative to the
  *     anchor point of the segment that describes the in tangent of the
  *     segment
  * @param handleOut - the handle point relative to the
  *     anchor point of the segment that describes the out tangent of the
  *     segment
  */
open class Segment ()
  extends StObject
     with typings.paper.paper.Segment {
  /** 
    * Creates a new Segment object.
    * 
    * @param object - an object containing properties to be set on the
    *     segment
    */
  def this(point: js.Object | PointLike) = this()
  def this(point: Unit, handleIn: PointLike) = this()
  def this(point: PointLike, handleIn: PointLike) = this()
  def this(point: Unit, handleIn: Unit, handleOut: PointLike) = this()
  def this(point: Unit, handleIn: PointLike, handleOut: PointLike) = this()
  def this(point: PointLike, handleIn: Unit, handleOut: PointLike) = this()
  def this(point: PointLike, handleIn: PointLike, handleOut: PointLike) = this()
}
