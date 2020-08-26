package typings.nodeUuid.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UUIDOptions extends js.Object {
  /**
    * (Number between 0 - 0x3fff) RFC clock sequence.
    * Default: An internally maintained clockseq is used.
    */
  var clockseq: js.UndefOr[Double] = js.native
  /**
    * (Number | Date) Time in milliseconds since unix Epoch.
    * Default: The current time is used.
    */
  var msecs: js.UndefOr[Double | Date] = js.native
  /**
    * Node id as Array of 6 bytes (per 4.1.6).
    * Default: Randomly generated ID. See note 1.
    */
  var node: js.UndefOr[js.Array[_]] = js.native
  /**
    * (Number between 0-9999) additional time, in 100-nanosecond units. Ignored if msecs is unspecified.
    * Default: internal uuid counter is used, as per 4.2.1.2.
    */
  var nsecs: js.UndefOr[Double] = js.native
}

object UUIDOptions {
  @scala.inline
  def apply(): UUIDOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UUIDOptions]
  }
  @scala.inline
  implicit class UUIDOptionsOps[Self <: UUIDOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClockseq(value: Double): Self = this.set("clockseq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClockseq: Self = this.set("clockseq", js.undefined)
    @scala.inline
    def setMsecs(value: Double | Date): Self = this.set("msecs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsecs: Self = this.set("msecs", js.undefined)
    @scala.inline
    def setNodeVarargs(value: js.Any*): Self = this.set("node", js.Array(value :_*))
    @scala.inline
    def setNode(value: js.Array[_]): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    @scala.inline
    def setNsecs(value: Double): Self = this.set("nsecs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNsecs: Self = this.set("nsecs", js.undefined)
  }
  
}

