package typings.onionoo.mod.Onionoo

import typings.onionoo.anon.PartialRecord6months1year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BridgeClients extends js.Object {
  /**
    * Object containing graph history objects with the average number of clients connecting to this bridge.
    * Keys are string representation of the time period covered by the graph history object. Keys are fixed strings
    * `6_months`, `1_year`, and `5_years`. Keys refer to the last known clients history of a bridge, not to the time
    * when the clients document was published. A graph history object is only contained if the time period it
    * covers is not already contained in another clients graph object with shorter time period and higher
    * data resolution. The unit is number of clients. Contained graph history objects may contain null values
    * if the bridge did not report client statistics for at least 50% of a given time period.
    */
  var average_clients: js.UndefOr[PartialRecord6months1year] = js.undefined
  /**
    * SHA-1 hash of the bridge fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var fingerprint: String
}

object BridgeClients {
  @scala.inline
  def apply(fingerprint: String, average_clients: PartialRecord6months1year = null): BridgeClients = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any])
    if (average_clients != null) __obj.updateDynamic("average_clients")(average_clients.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeClients]
  }
}

