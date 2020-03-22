package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChangePlan extends js.Object {
  var accounts_url: String
  var bullets: js.Array[String]
  var description: String
  var has_free_trial: Boolean
  var id: Double
  var monthly_price_in_cents: Double
  var name: String
  var number: Double
  var price_model: String
  var state: String
  var unit_name: Null
  var url: String
  var yearly_price_in_cents: Double
}

object AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChangePlan {
  @scala.inline
  def apply(
    accounts_url: String,
    bullets: js.Array[String],
    description: String,
    has_free_trial: Boolean,
    id: Double,
    monthly_price_in_cents: Double,
    name: String,
    number: Double,
    price_model: String,
    state: String,
    unit_name: Null,
    url: String,
    yearly_price_in_cents: Double
  ): AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChangePlan = {
    val __obj = js.Dynamic.literal(accounts_url = accounts_url.asInstanceOf[js.Any], bullets = bullets.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], has_free_trial = has_free_trial.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], monthly_price_in_cents = monthly_price_in_cents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], price_model = price_model.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], unit_name = unit_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], yearly_price_in_cents = yearly_price_in_cents.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChangePlan]
  }
}

