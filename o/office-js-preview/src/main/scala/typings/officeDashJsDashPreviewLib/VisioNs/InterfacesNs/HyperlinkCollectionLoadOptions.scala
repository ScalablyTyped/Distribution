package typings
package officeDashJsDashPreviewLib.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Hyperlink Collection.
  *
  * [Api set:  1.1]
  */
trait HyperlinkCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var address: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the description of a hyperlink. Read-only.
    *
    * [Api set:  1.1]
    */
  var description: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the extra URL request information used to resolve the hyperlink's URL. Read-only.
    *
    * [Api set:  1.1]
    */
  var extraInfo: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the sub-address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var subAddress: js.UndefOr[scala.Boolean] = js.undefined
}

object HyperlinkCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    address: js.UndefOr[scala.Boolean] = js.undefined,
    description: js.UndefOr[scala.Boolean] = js.undefined,
    extraInfo: js.UndefOr[scala.Boolean] = js.undefined,
    subAddress: js.UndefOr[scala.Boolean] = js.undefined
  ): HyperlinkCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address)
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(extraInfo)) __obj.updateDynamic("extraInfo")(extraInfo)
    if (!js.isUndefined(subAddress)) __obj.updateDynamic("subAddress")(subAddress)
    __obj.asInstanceOf[HyperlinkCollectionLoadOptions]
  }
}

