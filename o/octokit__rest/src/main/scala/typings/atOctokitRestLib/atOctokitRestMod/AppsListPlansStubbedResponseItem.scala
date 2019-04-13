package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListPlansStubbedResponseItem extends js.Object {
  var accounts_url: java.lang.String
  var bullets: js.Array[java.lang.String]
  var description: java.lang.String
  var has_free_trial: scala.Boolean
  var id: scala.Double
  var monthly_price_in_cents: scala.Double
  var name: java.lang.String
  var number: scala.Double
  var price_model: java.lang.String
  var state: java.lang.String
  var unit_name: scala.Null
  var url: java.lang.String
  var yearly_price_in_cents: scala.Double
}

object AppsListPlansStubbedResponseItem {
  @scala.inline
  def apply(
    accounts_url: java.lang.String,
    bullets: js.Array[java.lang.String],
    description: java.lang.String,
    has_free_trial: scala.Boolean,
    id: scala.Double,
    monthly_price_in_cents: scala.Double,
    name: java.lang.String,
    number: scala.Double,
    price_model: java.lang.String,
    state: java.lang.String,
    unit_name: scala.Null,
    url: java.lang.String,
    yearly_price_in_cents: scala.Double
  ): AppsListPlansStubbedResponseItem = {
    val __obj = js.Dynamic.literal(accounts_url = accounts_url, bullets = bullets, description = description, has_free_trial = has_free_trial, id = id, monthly_price_in_cents = monthly_price_in_cents, name = name, number = number, price_model = price_model, state = state, unit_name = unit_name, url = url, yearly_price_in_cents = yearly_price_in_cents)
  
    __obj.asInstanceOf[AppsListPlansStubbedResponseItem]
  }
}

