package typings
package openlayersLib.openlayersMod.olxNs.formatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPXOptions extends js.Object {
  var readExtensions: js.UndefOr[
    js.Function2[/* feature */ openlayersLib.openlayersMod.Feature, /* node */ stdLib.Node, _]
  ] = js.undefined
}

object GPXOptions {
  @scala.inline
  def apply(
    readExtensions: (/* feature */ openlayersLib.openlayersMod.Feature, /* node */ stdLib.Node) => _ = null
  ): GPXOptions = {
    val __obj = js.Dynamic.literal()
    if (readExtensions != null) __obj.updateDynamic("readExtensions")(js.Any.fromFunction2(readExtensions))
    __obj.asInstanceOf[GPXOptions]
  }
}

