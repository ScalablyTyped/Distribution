package typings.plotlyJs.mod

import typings.plotlyJs.PartialLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  /**
  	 * The name of the frame into which this frame's properties are merged
  	 * before applying. This is used to unify properties and avoid needing
  	 * to specify the same values for the same properties in multiple frames.
  	 */
  var baseframe: String
  /**
  	 * A list of traces this frame modifies. The format is identical to the
  	 * normal trace definition.
  	 */
  var data: js.Array[Data]
  /**
  	 * An identifier that specifies the group to which the frame belongs,
  	 * used by animate to select a subset of frames.
  	 */
  var group: String
  /**
  	 * Layout properties which this frame modifies. The format is identical
  	 * to the normal layout definition.
  	 */
  var layout: PartialLayout
  /**
  	 * A label by which to identify the frame
  	 */
  var name: String
  /**
  	 * A list of trace indices that identify the respective traces in the
  	 * data attribute
  	 */
  var traces: js.Array[Double]
}

object Frame {
  @scala.inline
  def apply(
    baseframe: String,
    data: js.Array[Data],
    group: String,
    layout: PartialLayout,
    name: String,
    traces: js.Array[Double]
  ): Frame = {
    val __obj = js.Dynamic.literal(baseframe = baseframe.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], traces = traces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

