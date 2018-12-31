package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  /**
  	 * The name of the frame into which this frame's properties are merged
  	 * before applying. This is used to unify properties and avoid needing
  	 * to specify the same values for the same properties in multiple frames.
  	 */
  var baseframe: java.lang.String
  /**
  	 * A list of traces this frame modifies. The format is identical to the
  	 * normal trace definition.
  	 */
  var data: js.Array[Data]
  /**
  	 * An identifier that specifies the group to which the frame belongs,
  	 * used by animate to select a subset of frames.
  	 */
  var group: java.lang.String
  /**
  	 * Layout properties which this frame modifies. The format is identical
  	 * to the normal layout definition.
  	 */
  var layout: stdLib.Partial[Layout]
  /**
  	 * A label by which to identify the frame
  	 */
  var name: java.lang.String
  /**
  	 * A list of trace indices that identify the respective traces in the
  	 * data attribute
  	 */
  var traces: js.Array[scala.Double]
}

