package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePurchasePlan extends js.Object {
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

object AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePurchasePlan {
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
  ): AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePurchasePlan = {
    val __obj = js.Dynamic.literal(accounts_url = accounts_url, bullets = bullets, description = description, has_free_trial = has_free_trial, id = id, monthly_price_in_cents = monthly_price_in_cents, name = name, number = number, price_model = price_model, state = state, unit_name = unit_name, url = url, yearly_price_in_cents = yearly_price_in_cents)
  
    __obj.asInstanceOf[AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePurchasePlan]
  }
}

