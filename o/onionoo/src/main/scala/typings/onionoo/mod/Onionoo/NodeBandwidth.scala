package typings.onionoo.mod.Onionoo

import typings.onionoo.anon.PartialRecord3days1week1m
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeBandwidth extends js.Object {
  /**
    * Node fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var fingerprint: String
  /**
    * Object containing graph history objects with read bytes for different time periods. The specification
    * of graph history objects is similar to those in the `write_history` field.
    */
  var read_history: js.UndefOr[PartialRecord3days1week1m] = js.undefined
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
  var write_history: js.UndefOr[PartialRecord3days1week1m] = js.undefined
}

object NodeBandwidth {
  @scala.inline
  def apply(
    fingerprint: String,
    read_history: PartialRecord3days1week1m = null,
    write_history: PartialRecord3days1week1m = null
  ): NodeBandwidth = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any])
    if (read_history != null) __obj.updateDynamic("read_history")(read_history.asInstanceOf[js.Any])
    if (write_history != null) __obj.updateDynamic("write_history")(write_history.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeBandwidth]
  }
}

