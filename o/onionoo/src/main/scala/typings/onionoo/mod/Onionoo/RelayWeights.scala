package typings.onionoo.mod.Onionoo

import typings.onionoo.anon.PartialRecord1week1month6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayWeights extends js.Object {
  /**
    * History object containing the absolute consensus weight of this relay. The specification of this history
    * object is similar to that in the `consensus_weight_fraction` field above.
    */
  var consensus_weight: js.UndefOr[PartialRecord1week1month6] = js.native
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
  var consensus_weight_fraction: js.UndefOr[PartialRecord1week1month6] = js.native
  /**
    * History object containing the probability of this relay to be selected for the exit position.
    * This probability is calculated based on consensus weights, relay flags, and bandwidth weights in the consensus.
    * Path selection depends on more factors, so that this probability can only be an approximation.
    * The specification of this history object is similar to that in the `consensus_weight_fraction` field above.
    */
  var exit_probability: js.UndefOr[PartialRecord1week1month6] = js.native
  /**
    * Node fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var fingerprint: String = js.native
  /**
    * History object containing the probability of this relay to be selected for the guard position.
    * This probability is calculated based on consensus weights, relay flags, and bandwidth weights in the consensus.
    * Path selection depends on more factors, so that this probability can only be an approximation.
    * The specification of this history object is similar to that in the `consensus_weight_fraction` field above.
    */
  var guard_probability: js.UndefOr[PartialRecord1week1month6] = js.native
  /**
    * History object containing the probability of this relay to be selected for the middle position.
    * This probability is calculated based on consensus weights, relay flags, and bandwidth weights in the consensus.
    * Path selection depends on more factors, so that this probability can only be an approximation.
    * The specification of this history object is similar to that in the `consensus_weight_fraction` field above.
    */
  var middle_probability: js.UndefOr[PartialRecord1week1month6] = js.native
}

object RelayWeights {
  @scala.inline
  def apply(fingerprint: String): RelayWeights = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayWeights]
  }
  @scala.inline
  implicit class RelayWeightsOps[Self <: RelayWeights] (val x: Self) extends AnyVal {
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
    def setConsensus_weight(value: PartialRecord1week1month6): Self = this.set("consensus_weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsensus_weight: Self = this.set("consensus_weight", js.undefined)
    @scala.inline
    def setConsensus_weight_fraction(value: PartialRecord1week1month6): Self = this.set("consensus_weight_fraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsensus_weight_fraction: Self = this.set("consensus_weight_fraction", js.undefined)
    @scala.inline
    def setExit_probability(value: PartialRecord1week1month6): Self = this.set("exit_probability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExit_probability: Self = this.set("exit_probability", js.undefined)
    @scala.inline
    def setGuard_probability(value: PartialRecord1week1month6): Self = this.set("guard_probability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuard_probability: Self = this.set("guard_probability", js.undefined)
    @scala.inline
    def setMiddle_probability(value: PartialRecord1week1month6): Self = this.set("middle_probability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddle_probability: Self = this.set("middle_probability", js.undefined)
  }
  
}

