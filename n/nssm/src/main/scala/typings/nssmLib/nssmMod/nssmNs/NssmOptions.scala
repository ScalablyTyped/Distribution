package typings
package nssmLib.nssmMod.nssmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NssmOptions extends js.Object {
  var nssmExe: js.UndefOr[java.lang.String] = js.undefined
}

object NssmOptions {
  @scala.inline
  def apply(nssmExe: java.lang.String = null): NssmOptions = {
    val __obj = js.Dynamic.literal()
    if (nssmExe != null) __obj.updateDynamic("nssmExe")(nssmExe)
    __obj.asInstanceOf[NssmOptions]
  }
}

