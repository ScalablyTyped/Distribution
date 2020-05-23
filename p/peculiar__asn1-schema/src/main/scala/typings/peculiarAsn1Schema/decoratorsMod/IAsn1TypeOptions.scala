package typings.peculiarAsn1Schema.decoratorsMod

import typings.peculiarAsn1Schema.enumsMod.AsnPropTypes
import typings.peculiarAsn1Schema.enumsMod.AsnTypeTypes
import typings.peculiarAsn1Schema.typesMod.IEmptyConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsn1TypeOptions extends js.Object {
  var itemType: js.UndefOr[AsnPropTypes | IEmptyConstructor[_]] = js.undefined
  var `type`: AsnTypeTypes
}

object IAsn1TypeOptions {
  @scala.inline
  def apply(`type`: AsnTypeTypes, itemType: AsnPropTypes | IEmptyConstructor[_] = null): IAsn1TypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsn1TypeOptions]
  }
}

