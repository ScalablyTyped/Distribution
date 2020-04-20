package typings.oracleOraclejet.ojavatarMod

import typings.oracleOraclejet.mod.JetSettableProperties
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

trait ojAvatarSettableProperties extends JetSettableProperties {
  var initials: String
  var size: xxs | xs | sm | md | lg | xl | xxl
  var src: String
}

object ojAvatarSettableProperties {
  @scala.inline
  def apply(initials: String, size: xxs | xs | sm | md | lg | xl | xxl, src: String): ojAvatarSettableProperties = {
    val __obj = js.Dynamic.literal(initials = initials.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojAvatarSettableProperties]
  }
}

