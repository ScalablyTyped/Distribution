package typings
package pDashEventLib.pDashEventMod.pEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IteratorOptions[T] extends Options[T] {
  /**
    * Maximum number of events for the iterator before it ends. When the limit is reached, the iterator will be
    * marked as `done`. This option is useful to paginate events, for example, fetching 10 events per page.
    * @default Infinity
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Events that will end the iterator.
    * @default []
    */
  var resolutionEvents: js.UndefOr[js.Array[java.lang.String | js.Symbol]] = js.undefined
}

