package typings
package atPhosphorWidgetsLib.libBoxengineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/boxengine", "BoxSizer")
@js.native
class BoxSizer () extends js.Object {
  /**
    * An internal storage property for the layout algorithm.
    *
    * #### Notes
    * This value is used as temporary storage by the layout algorithm.
    *
    * Changing this value will have no effect.
    */
  var done: scala.Boolean = js.native
  /**
    * The maximum size of the sizer.
    *
    * #### Notes
    * The sizer will never be sized greater than this value, even if
    * it means the sizer will underflow the available layout space.
    *
    * It is assumed that this value lies in the range `[0, Infinity]`
    * and that it is `>=` to [[minSize]]. Failure to adhere to this
    * constraint will yield undefined results.
    *
    * The default value is `Infinity`.
    */
  var maxSize: scala.Double = js.native
  /**
    * The minimum size of the sizer.
    *
    * #### Notes
    * The sizer will never be sized less than this value, even if
    * it means the sizer will overflow the available layout space.
    *
    * It is assumed that this value lies in the range `[0, Infinity)`
    * and that it is `<=` to [[maxSize]]. Failure to adhere to this
    * constraint will yield undefined results.
    *
    * The default value is `0`.
    */
  var minSize: scala.Double = js.native
  /**
    * The computed size of the sizer.
    *
    * #### Notes
    * This value is the output of a call to [[boxCalc]]. It represents
    * the computed size for the object along the layout orientation,
    * and will always lie in the range `[minSize, maxSize]`.
    *
    * This value is output only.
    *
    * Changing this value will have no effect.
    */
  var size: scala.Double = js.native
  /**
    * The preferred size for the sizer.
    *
    * #### Notes
    * The sizer will be given this initial size subject to its size
    * bounds. The sizer will not deviate from this size unless such
    * deviation is required to fit into the available layout space.
    *
    * There is no limit to this value, but it will be clamped to the
    * bounds defined by [[minSize]] and [[maxSize]].
    *
    * The default value is `0`.
    */
  var sizeHint: scala.Double = js.native
  /**
    * The stretch factor for the sizer.
    *
    * #### Notes
    * This controls how much the sizer stretches relative to its sibling
    * sizers when layout space is distributed. A stretch factor of zero
    * is special and will cause the sizer to only be resized after all
    * other sizers with a stretch factor greater than zero have been
    * resized to their limits.
    *
    * It is assumed that this value is an integer that lies in the range
    * `[0, Infinity)`. Failure to adhere to this constraint will yield
    * undefined results.
    *
    * The default value is `1`.
    */
  var stretch: scala.Double = js.native
}

