package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accountsurl extends js.Object {
  var accounts_url: String = js.native
  var bullets: js.Array[String] = js.native
  var description: String = js.native
  var has_free_trial: Boolean = js.native
  var id: Double = js.native
  var monthly_price_in_cents: Double = js.native
  var name: String = js.native
  var number: Double = js.native
  var price_model: String = js.native
  var state: String = js.native
  var unit_name: String = js.native
  var url: String = js.native
  var yearly_price_in_cents: Double = js.native
}

object Accountsurl {
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
    unit_name: String,
    url: String,
    yearly_price_in_cents: Double
  ): Accountsurl = {
    val __obj = js.Dynamic.literal(accounts_url = accounts_url.asInstanceOf[js.Any], bullets = bullets.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], has_free_trial = has_free_trial.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], monthly_price_in_cents = monthly_price_in_cents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], price_model = price_model.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], unit_name = unit_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], yearly_price_in_cents = yearly_price_in_cents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accountsurl]
  }
  @scala.inline
  implicit class AccountsurlOps[Self <: Accountsurl] (val x: Self) extends AnyVal {
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
    def setAccounts_url(value: String): Self = this.set("accounts_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setBulletsVarargs(value: String*): Self = this.set("bullets", js.Array(value :_*))
    @scala.inline
    def setBullets(value: js.Array[String]): Self = this.set("bullets", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setHas_free_trial(value: Boolean): Self = this.set("has_free_trial", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthly_price_in_cents(value: Double): Self = this.set("monthly_price_in_cents", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrice_model(value: String): Self = this.set("price_model", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnit_name(value: String): Self = this.set("unit_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setYearly_price_in_cents(value: Double): Self = this.set("yearly_price_in_cents", value.asInstanceOf[js.Any])
  }
  
}

