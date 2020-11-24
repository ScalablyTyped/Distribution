package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatsResponse extends js.Object {
  
  /** Average session length in minutes of the player. E.g., 1, 30, 60, ... . Not populated if there is not enough information. */
  var avg_session_length_minutes: js.UndefOr[Double] = js.native
  
  /** The probability of the player not returning to play the game in the next day. E.g., 0, 0.1, 0.5, ..., 1.0. Not populated if there is not enough information. */
  var churn_probability: js.UndefOr[Double] = js.native
  
  /** Number of days since the player last played this game. E.g., 0, 1, 5, 10, ... . Not populated if there is not enough information. */
  var days_since_last_played: js.UndefOr[Double] = js.native
  
  /** The probability of the player going to spend beyond a threshold amount of money. E.g., 0, 0.25, 0.50, 0.75. Not populated if there is not enough information. */
  var high_spender_probability: js.UndefOr[Double] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#statsResponse`. */
  var kind: js.UndefOr[String] = js.native
  
  /** Number of in-app purchases made by the player in this game. E.g., 0, 1, 5, 10, ... . Not populated if there is not enough information. */
  var num_purchases: js.UndefOr[Double] = js.native
  
  /**
    * The approximate number of sessions of the player within the last 28 days, where a session begins when the player is connected to Play Games Services and ends when they are
    * disconnected. E.g., 0, 1, 5, 10, ... . Not populated if there is not enough information.
    */
  var num_sessions: js.UndefOr[Double] = js.native
  
  /**
    * The approximation of the sessions percentile of the player within the last 30 days, where a session begins when the player is connected to Play Games Services and ends when they are
    * disconnected. E.g., 0, 0.25, 0.5, 0.75. Not populated if there is not enough information.
    */
  var num_sessions_percentile: js.UndefOr[Double] = js.native
  
  /** The approximate spend percentile of the player in this game. E.g., 0, 0.25, 0.5, 0.75. Not populated if there is not enough information. */
  var spend_percentile: js.UndefOr[Double] = js.native
  
  /** The probability of the player going to spend the game in the next seven days. E.g., 0, 0.25, 0.50, 0.75. Not populated if there is not enough information. */
  var spend_probability: js.UndefOr[Double] = js.native
  
  /** The predicted amount of money that the player going to spend in the next 28 days. E.g., 1, 30, 60, ... . Not populated if there is not enough information. */
  var total_spend_next_28_days: js.UndefOr[Double] = js.native
}
object StatsResponse {
  
  @scala.inline
  def apply(): StatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatsResponse]
  }
  
  @scala.inline
  implicit class StatsResponseOps[Self <: StatsResponse] (val x: Self) extends AnyVal {
    
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
    def setAvg_session_length_minutes(value: Double): Self = this.set("avg_session_length_minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvg_session_length_minutes: Self = this.set("avg_session_length_minutes", js.undefined)
    
    @scala.inline
    def setChurn_probability(value: Double): Self = this.set("churn_probability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChurn_probability: Self = this.set("churn_probability", js.undefined)
    
    @scala.inline
    def setDays_since_last_played(value: Double): Self = this.set("days_since_last_played", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDays_since_last_played: Self = this.set("days_since_last_played", js.undefined)
    
    @scala.inline
    def setHigh_spender_probability(value: Double): Self = this.set("high_spender_probability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigh_spender_probability: Self = this.set("high_spender_probability", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNum_purchases(value: Double): Self = this.set("num_purchases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNum_purchases: Self = this.set("num_purchases", js.undefined)
    
    @scala.inline
    def setNum_sessions(value: Double): Self = this.set("num_sessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNum_sessions: Self = this.set("num_sessions", js.undefined)
    
    @scala.inline
    def setNum_sessions_percentile(value: Double): Self = this.set("num_sessions_percentile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNum_sessions_percentile: Self = this.set("num_sessions_percentile", js.undefined)
    
    @scala.inline
    def setSpend_percentile(value: Double): Self = this.set("spend_percentile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpend_percentile: Self = this.set("spend_percentile", js.undefined)
    
    @scala.inline
    def setSpend_probability(value: Double): Self = this.set("spend_probability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpend_probability: Self = this.set("spend_probability", js.undefined)
    
    @scala.inline
    def setTotal_spend_next_28_days(value: Double): Self = this.set("total_spend_next_28_days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal_spend_next_28_days: Self = this.set("total_spend_next_28_days", js.undefined)
  }
}
