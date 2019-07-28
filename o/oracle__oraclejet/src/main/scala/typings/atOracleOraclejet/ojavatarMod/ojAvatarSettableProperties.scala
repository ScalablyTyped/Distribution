package typings.atOracleOraclejet.ojavatarMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.lg
import typings.atOracleOraclejet.atOracleOraclejetStrings.md
import typings.atOracleOraclejet.atOracleOraclejetStrings.sm
import typings.atOracleOraclejet.atOracleOraclejetStrings.xl
import typings.atOracleOraclejet.atOracleOraclejetStrings.xs
import typings.atOracleOraclejet.atOracleOraclejetStrings.xxl
import typings.atOracleOraclejet.atOracleOraclejetStrings.xxs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojAvatarSettableProperties extends JetSettableProperties {
  var initials: String
  var size: xxs | xs | sm | md | lg | xl | xxl
  var src: String
}

object ojAvatarSettableProperties {
  @scala.inline
  def apply(initials: String, size: xxs | xs | sm | md | lg | xl | xxl, src: String): ojAvatarSettableProperties = {
    val __obj = js.Dynamic.literal(initials = initials, size = size.asInstanceOf[js.Any], src = src)
  
    __obj.asInstanceOf[ojAvatarSettableProperties]
  }
}

