package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenOptions
  extends /* key */ StringDictionary[js.Any] {
  var openOptions: typings.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions = js.native
}

object OpenOptions {
  @scala.inline
  def apply(openOptions: typings.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions): OpenOptions = {
    val __obj = js.Dynamic.literal(openOptions = openOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenOptions]
  }
  @scala.inline
  implicit class OpenOptionsOps[Self <: OpenOptions] (val x: Self) extends AnyVal {
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
    def setOpenOptions(value: typings.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions): Self = this.set("openOptions", value.asInstanceOf[js.Any])
  }
  
}

