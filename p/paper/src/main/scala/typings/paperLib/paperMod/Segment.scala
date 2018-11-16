package typings
package paperLib.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Segment")
@js.native
class Segment ()
  extends paperLib.paperNs.Segment {
  /**
           * Creates a new Segment object.
           * @param object - an object literal containing properties to be set on the segment.
           */
  def this(`object`: js.Any) = this()
  /**
           * Creates a new Segment object.
           * @param point [optional] - the anchor point of the segment default: {x: 0, y: 0}
           * @param handleIn [optional] - the handle point relative to the anchor point of the segment that describes the in tangent of the segment default: {x: 0, y: 0}
           * @param handleOut [optional] - the handle point relative to the anchor point of the segment that describes the out tangent of the segment default: {x: 0, y: 0}
           */
  def this(point: paperLib.paperNs.Point) = this()
  /**
           * Creates a new Segment object.
           * @param point [optional] - the anchor point of the segment default: {x: 0, y: 0}
           * @param handleIn [optional] - the handle point relative to the anchor point of the segment that describes the in tangent of the segment default: {x: 0, y: 0}
           * @param handleOut [optional] - the handle point relative to the anchor point of the segment that describes the out tangent of the segment default: {x: 0, y: 0}
           */
  def this(point: paperLib.paperNs.Point, handleIn: paperLib.paperNs.Point) = this()
  /**
           * Creates a new Segment object.
           * @param point [optional] - the anchor point of the segment default: {x: 0, y: 0}
           * @param handleIn [optional] - the handle point relative to the anchor point of the segment that describes the in tangent of the segment default: {x: 0, y: 0}
           * @param handleOut [optional] - the handle point relative to the anchor point of the segment that describes the out tangent of the segment default: {x: 0, y: 0}
           */
  def this(point: paperLib.paperNs.Point, handleIn: paperLib.paperNs.Point, handleOut: paperLib.paperNs.Point) = this()
}

