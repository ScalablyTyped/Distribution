package typings
package nodecredstashLib.nodecredstashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutSecretOptions extends js.Object {
  var context: CredstashContext
  var digest: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var secret: java.lang.String
  var version: js.UndefOr[scala.Double] = js.undefined
}

object PutSecretOptions {
  @scala.inline
  def apply(
    context: CredstashContext,
    name: java.lang.String,
    secret: java.lang.String,
    digest: java.lang.String = null,
    version: scala.Int | scala.Double = null
  ): PutSecretOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("secret")(secret)
    if (digest != null) __obj.updateDynamic("digest")(digest)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSecretOptions]
  }
}

