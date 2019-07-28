package typings.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FactorType extends js.Object {
  var factor: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_FactorType {
  @scala.inline
  def apply(factor: Int | Double = null, `type`: String = null): Anon_FactorType = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_FactorType]
  }
}

