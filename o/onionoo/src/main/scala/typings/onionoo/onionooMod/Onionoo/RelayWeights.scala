package typings.onionoo.onionooMod.Onionoo

import typings.onionoo.onionooStrings.`1_month`
import typings.onionoo.onionooStrings.`1_week`
import typings.onionoo.onionooStrings.`1_year`
import typings.onionoo.onionooStrings.`5_years`
import typings.onionoo.onionooStrings.`6_months`
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayWeights extends js.Object {
  /**
    * History object containing the absolute consensus weight of this relay. The specification of this history
    * object is similar to that in the `consensus_weight_fraction` field above.
    */
  var consensus_weight: js.UndefOr[
    Partial[Record[`1_week` | `1_month` | `6_months` | `1_year` | `5_years`, Histogram]]
  ] = js.undefined
  /**
    * History object containing the fraction of this relay's consensus weight compared to the sum of all consensus
    * weights in the network. This fraction is a very rough approximation of the probability of this relay to be
    * selected by clients. Keys are string representation of the time period covered by the graph history object.
    * Keys are fixed strings `1_week`, `1_month`, `6_months`, `1_year`, and `5_years`. Keys refer to the last known
    * weights history of a relay, not to the time when the weights document was published. A graph history object is
    * only contained if the time period it covers is not already contained in another graph history object with shorter
    * time period and higher data resolution. The unit is path-selection probability. Contained graph history objects
    * may contain null values if the relay was running less than 20% of a given time period.
    */
  var consensus_weight_fraction: js.UndefOr[
    Partial[Record[`1_week` | `1_month` | `6_months` | `1_year` | `5_years`, Histogram]]
  ] = js.undefined
  /**
    * History object containing the probability of this relay to be selected for the exit position.
    * This probability is calculated based on consensus weights, relay flags, and bandwidth weights in the consensus.
    * Path selection depends on more factors, so that this probability can only be an approximation.
    * The specification of this history object is similar to that in the `consensus_weight_fraction` field above.
    */
  var exit_probability: js.UndefOr[
    Partial[Record[`1_week` | `1_month` | `6_months` | `1_year` | `5_years`, Histogram]]
  ] = js.undefined
  /**
    * Node fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var fingerprint: String
  /**
    * History object containing the probability of this relay to be selected for the guard position.
    * This probability is calculated based on consensus weights, relay flags, and bandwidth weights in the consensus.
    * Path selection depends on more factors, so that this probability can only be an approximation.
    * The specification of this history object is similar to that in the `consensus_weight_fraction` field above.
    */
  var guard_probability: js.UndefOr[
    Partial[Record[`1_week` | `1_month` | `6_months` | `1_year` | `5_years`, Histogram]]
  ] = js.undefined
  /**
    * History object containing the probability of this relay to be selected for the middle position.
    * This probability is calculated based on consensus weights, relay flags, and bandwidth weights in the consensus.
    * Path selection depends on more factors, so that this probability can only be an approximation.
    * The specification of this history object is similar to that in the `consensus_weight_fraction` field above.
    */
  var middle_probability: js.UndefOr[
    Partial[Record[`1_week` | `1_month` | `6_months` | `1_year` | `5_years`, Histogram]]
  ] = js.undefined
}

object RelayWeights {
  @scala.inline
  def apply(
    fingerprint: String,
    consensus_weight: Partial[Record[`1_week` | `1_month` | `6_months` | `1_year` | `5_years`, Histogram]] = null,
    consensus_weight_fraction: Partial[Record[`1_week` | `1_month` | `6_months` | `1_year` | `5_years`, Histogram]] = null,
    exit_probability: Partial[Record[`1_week` | `1_month` | `6_months` | `1_year` | `5_years`, Histogram]] = null,
    guard_probability: Partial[Record[`1_week` | `1_month` | `6_months` | `1_year` | `5_years`, Histogram]] = null,
    middle_probability: Partial[Record[`1_week` | `1_month` | `6_months` | `1_year` | `5_years`, Histogram]] = null
  ): RelayWeights = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any])
    if (consensus_weight != null) __obj.updateDynamic("consensus_weight")(consensus_weight.asInstanceOf[js.Any])
    if (consensus_weight_fraction != null) __obj.updateDynamic("consensus_weight_fraction")(consensus_weight_fraction.asInstanceOf[js.Any])
    if (exit_probability != null) __obj.updateDynamic("exit_probability")(exit_probability.asInstanceOf[js.Any])
    if (guard_probability != null) __obj.updateDynamic("guard_probability")(guard_probability.asInstanceOf[js.Any])
    if (middle_probability != null) __obj.updateDynamic("middle_probability")(middle_probability.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayWeights]
  }
}

