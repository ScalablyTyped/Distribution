package typings.nssm.nssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NssmOptions extends js.Object {
  var nssmExe: js.UndefOr[String] = js.undefined
}

object NssmOptions {
  @scala.inline
  def apply(nssmExe: String = null): NssmOptions = {
    val __obj = js.Dynamic.literal()
    if (nssmExe != null) __obj.updateDynamic("nssmExe")(nssmExe.asInstanceOf[js.Any])
    __obj.asInstanceOf[NssmOptions]
  }
}

