package typings.picomatch.anon

import typings.picomatch.picomatchStrings.Asterisk
import typings.picomatch.picomatchStrings.AsteriskAsterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _empty extends js.Object {
  @JSName("***")
  var AsteriskAsteriskAsterisk: Asterisk
  @JSName("**/**")
  var AsteriskAsteriskSlashAsteriskAsterisk: AsteriskAsterisk
  @JSName("**/**/**")
  var AsteriskAsteriskSlashAsteriskAsteriskSlashAsteriskAsterisk: AsteriskAsterisk
}

object _empty {
  @scala.inline
  def apply(
    AsteriskAsteriskAsterisk: Asterisk,
    AsteriskAsteriskSlashAsteriskAsterisk: AsteriskAsterisk,
    AsteriskAsteriskSlashAsteriskAsteriskSlashAsteriskAsterisk: AsteriskAsterisk
  ): _empty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("***")(AsteriskAsteriskAsterisk.asInstanceOf[js.Any])
    __obj.updateDynamic("**/**")(AsteriskAsteriskSlashAsteriskAsterisk.asInstanceOf[js.Any])
    __obj.updateDynamic("**/**/**")(AsteriskAsteriskSlashAsteriskAsteriskSlashAsteriskAsterisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
}

