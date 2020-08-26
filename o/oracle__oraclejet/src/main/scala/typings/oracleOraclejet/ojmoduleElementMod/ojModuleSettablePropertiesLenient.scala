package typings.oracleOraclejet.ojmoduleElementMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.CleanupMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojmodule-element.ojModuleSettableProperties> */
@js.native
trait ojModuleSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var animation: js.UndefOr[js.Object] = js.native
  var config: js.UndefOr[CleanupMode] = js.native
}

object ojModuleSettablePropertiesLenient {
  @scala.inline
  def apply(): ojModuleSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojModuleSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojModuleSettablePropertiesLenientOps[Self <: ojModuleSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def setAnimation(value: js.Object): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setConfig(value: CleanupMode): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
  }
  
}

