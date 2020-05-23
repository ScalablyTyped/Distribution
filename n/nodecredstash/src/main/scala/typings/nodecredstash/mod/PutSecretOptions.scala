package typings.nodecredstash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutSecretOptions extends js.Object {
  var context: CredstashContext
  var digest: js.UndefOr[String] = js.undefined
  var name: String
  var secret: String
  var version: js.UndefOr[Double] = js.undefined
}

object PutSecretOptions {
  @scala.inline
  def apply(
    context: CredstashContext,
    name: String,
    secret: String,
    digest: String = null,
    version: js.UndefOr[Double] = js.undefined
  ): PutSecretOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSecretOptions]
  }
}

