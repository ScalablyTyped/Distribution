package typings.paypalCheckoutComponents.callbackDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingOption extends js.Object {
  /**
    * The shipping cost for the selected option.
    */
  var amount: CurrencyAmount = js.native
  /**
    * A unique ID that identifies a payer-selected shipping option.
    */
  var id: String = js.native
  /**
    * A description that the payer sees, which helps them choose an appropriate shipping option.
    * For example, `Free Shipping`, `USPS Priority Shipping`, `Expédition prioritaire USPS`,
    * or `USPS yōuxiān fā huò`. Localize this description to the payer's locale.
    */
  var label: String = js.native
  /**
    * If `selected = true` is specified as part of the API request it represents the shipping
    * option that the payee/merchant expects to be pre-selected for the payer when they first view
    * the shipping options within the PayPal checkout experience. As part of the response if a
    * shipping option has `selected = true` it represents the shipping option that the payer
    * selected during the course of checkout with PayPal. Only 1 `shippingOption` can be set
    * to `selected = true`.
    */
  var selected: Boolean = js.native
  /**
    * The method by which the payer wants to get their items.
    */
  var `type`: ShippingOptionType = js.native
}

object ShippingOption {
  @scala.inline
  def apply(amount: CurrencyAmount, id: String, label: String, selected: Boolean, `type`: ShippingOptionType): ShippingOption = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingOption]
  }
  @scala.inline
  implicit class ShippingOptionOps[Self <: ShippingOption] (val x: Self) extends AnyVal {
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
    def setAmount(value: CurrencyAmount): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ShippingOptionType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

