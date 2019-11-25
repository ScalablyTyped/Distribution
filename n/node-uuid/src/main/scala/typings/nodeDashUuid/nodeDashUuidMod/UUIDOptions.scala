package typings.nodeDashUuid.nodeDashUuidMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UUIDOptions extends js.Object {
  /**
    * (Number between 0 - 0x3fff) RFC clock sequence.
    * Default: An internally maintained clockseq is used.
    */
  var clockseq: js.UndefOr[Double] = js.undefined
  /**
    * (Number | Date) Time in milliseconds since unix Epoch.
    * Default: The current time is used.
    */
  var msecs: js.UndefOr[Double | Date] = js.undefined
  /**
    * Node id as Array of 6 bytes (per 4.1.6).
    * Default: Randomly generated ID. See note 1.
    */
  var node: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * (Number between 0-9999) additional time, in 100-nanosecond units. Ignored if msecs is unspecified.
    * Default: internal uuid counter is used, as per 4.2.1.2.
    */
  var nsecs: js.UndefOr[Double] = js.undefined
}

object UUIDOptions {
  @scala.inline
  def apply(
    clockseq: Int | Double = null,
    msecs: Double | Date = null,
    node: js.Array[_] = null,
    nsecs: Int | Double = null
  ): UUIDOptions = {
    val __obj = js.Dynamic.literal()
    if (clockseq != null) __obj.updateDynamic("clockseq")(clockseq.asInstanceOf[js.Any])
    if (msecs != null) __obj.updateDynamic("msecs")(msecs.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (nsecs != null) __obj.updateDynamic("nsecs")(nsecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUIDOptions]
  }
}

