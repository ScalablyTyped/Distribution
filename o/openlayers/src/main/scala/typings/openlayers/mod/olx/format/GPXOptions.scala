package typings.openlayers.mod.olx.format

import typings.openlayers.mod.Feature
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPXOptions extends js.Object {
  var readExtensions: js.UndefOr[js.Function2[/* feature */ Feature, /* node */ Node, _]] = js.undefined
}

object GPXOptions {
  @scala.inline
  def apply(readExtensions: (/* feature */ Feature, /* node */ Node) => _ = null): GPXOptions = {
    val __obj = js.Dynamic.literal()
    if (readExtensions != null) __obj.updateDynamic("readExtensions")(js.Any.fromFunction2(readExtensions))
    __obj.asInstanceOf[GPXOptions]
  }
}

