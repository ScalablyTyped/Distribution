package typings.onionoo.mod.Onionoo

import typings.onionoo.anon.PartialRecord3days1week1m
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeBandwidth extends js.Object {
  /**
    * Node fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var fingerprint: String = js.native
  /**
    * Object containing graph history objects with read bytes for different time periods. The specification
    * of graph history objects is similar to those in the `write_history` field.
    */
  var read_history: js.UndefOr[PartialRecord3days1week1m] = js.native
  /**
    * Object containing graph history objects with written bytes for different time periods. Keys are string
    * representation of the time period covered by the graph history object. Keys are fixed strings `3_days`,
    * `1_week`, `1_month`, `6_months`, `1_year`, and `5_years`. Keys refer to the last known bandwidth history
    * of a node, not to the time when the bandwidth document was published. A graph history object is only
    * ontained if the time period it covers is not already contained in another graph history object with shorter
    * time period and higher data resolution. Similarly, a graph history object is excluded if the node did not
    * provide bandwidth histories on the required level of detail. The unit is bytes per second. Contained
    * graph history objects may contain null values if the node did not provide any bandwidth data or only data
    * for less than 20% of a given time period.
    */
  var write_history: js.UndefOr[PartialRecord3days1week1m] = js.native
}

object NodeBandwidth {
  @scala.inline
  def apply(fingerprint: String): NodeBandwidth = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeBandwidth]
  }
  @scala.inline
  implicit class NodeBandwidthOps[Self <: NodeBandwidth] (val x: Self) extends AnyVal {
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
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead_history(value: PartialRecord3days1week1m): Self = this.set("read_history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead_history: Self = this.set("read_history", js.undefined)
    @scala.inline
    def setWrite_history(value: PartialRecord3days1week1m): Self = this.set("write_history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrite_history: Self = this.set("write_history", js.undefined)
  }
  
}

