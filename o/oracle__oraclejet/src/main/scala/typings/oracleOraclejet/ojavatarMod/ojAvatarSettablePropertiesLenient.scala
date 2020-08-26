package typings.oracleOraclejet.ojavatarMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.lg
import typings.oracleOraclejet.oracleOraclejetStrings.md
import typings.oracleOraclejet.oracleOraclejetStrings.sm
import typings.oracleOraclejet.oracleOraclejetStrings.xl
import typings.oracleOraclejet.oracleOraclejetStrings.xs
import typings.oracleOraclejet.oracleOraclejetStrings.xxl
import typings.oracleOraclejet.oracleOraclejetStrings.xxs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojavatar.ojAvatarSettableProperties> */
@js.native
trait ojAvatarSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var initials: js.UndefOr[String] = js.native
  var size: js.UndefOr[xxs | xs | sm | md | lg | xl | xxl] = js.native
  var src: js.UndefOr[String] = js.native
}

object ojAvatarSettablePropertiesLenient {
  @scala.inline
  def apply(): ojAvatarSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojAvatarSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojAvatarSettablePropertiesLenientOps[Self <: ojAvatarSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def setInitials(value: String): Self = this.set("initials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitials: Self = this.set("initials", js.undefined)
    @scala.inline
    def setSize(value: xxs | xs | sm | md | lg | xl | xxl): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
  
}

