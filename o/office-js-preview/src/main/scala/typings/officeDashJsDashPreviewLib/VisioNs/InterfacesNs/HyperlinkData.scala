package typings
package officeDashJsDashPreviewLib.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "hyperlink.toJSON()". */
trait HyperlinkData extends js.Object {
  /**
    *
    * Gets the address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the description of a hyperlink. Read-only.
    *
    * [Api set:  1.1]
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the extra URL request information used to resolve the hyperlink's URL. Read-only.
    *
    * [Api set:  1.1]
    */
  var extraInfo: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the sub-address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var subAddress: js.UndefOr[java.lang.String] = js.undefined
}

object HyperlinkData {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    description: java.lang.String = null,
    extraInfo: java.lang.String = null,
    subAddress: java.lang.String = null
  ): HyperlinkData = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extraInfo != null) __obj.updateDynamic("extraInfo")(extraInfo)
    if (subAddress != null) __obj.updateDynamic("subAddress")(subAddress)
    __obj.asInstanceOf[HyperlinkData]
  }
}

