package typings.onionoo.mod.Onionoo

import org.scalablytyped.runtime.StringDictionary
import typings.onionoo.anon.PartialRecord1week1month6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayUptime extends js.Object {
  /**
    * Relay fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var fingerprint: String = js.native
  /**
    * Object containing fractional times of this relay having relay flags assigned. Keys are flag names like
    * `Running` or `Exit`, values are objects similar to the uptime field above, again with keys like
    * `1_week` etc. If a relay never had a given relay flag assigned, no object is included for that flag.
    */
  var flags: js.UndefOr[StringDictionary[PartialRecord1week1month6]] = js.native
  /**
    * Object containing graph history objects with the fractional uptime of this relay. Keys are string
    * representation of the time period covered by the graph history object. Keys are fixed strings
    * `1_week`, `1_month`, `6_months`, `1_year`, and `5_years`. Keys refer to the last known uptime history
    * of a relay, not to the time when the uptime document was published. A graph history object is only
    * contained if the time period it covers is not already contained in another graph history object with
    * shorter time period and higher data resolution. The unit is fractional uptime from `0` to `1`.
    * Contained graph history objects may contain null values if less than 20% of network statuses have been
    * processed for a given time period.
    */
  var uptime: js.UndefOr[PartialRecord1week1month6] = js.native
}

object RelayUptime {
  @scala.inline
  def apply(fingerprint: String): RelayUptime = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayUptime]
  }
  @scala.inline
  implicit class RelayUptimeOps[Self <: RelayUptime] (val x: Self) extends AnyVal {
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
    def setFlags(value: StringDictionary[PartialRecord1week1month6]): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setUptime(value: PartialRecord1week1month6): Self = this.set("uptime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUptime: Self = this.set("uptime", js.undefined)
  }
  
}

