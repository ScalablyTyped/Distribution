package typings
package olLib.formatGPXMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var readExtensions: js.UndefOr[
    js.Function2[/* param0 */ olLib.featureMod.default, /* param1 */ stdLib.Node, scala.Unit]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    readExtensions: (/* param0 */ olLib.featureMod.default, /* param1 */ stdLib.Node) => scala.Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (readExtensions != null) __obj.updateDynamic("readExtensions")(js.Any.fromFunction2(readExtensions))
    __obj.asInstanceOf[Options]
  }
}

