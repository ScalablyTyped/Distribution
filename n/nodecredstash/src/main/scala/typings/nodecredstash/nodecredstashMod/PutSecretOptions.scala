package typings.nodecredstash.nodecredstashMod

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
    version: Int | Double = null
  ): PutSecretOptions = {
    val __obj = js.Dynamic.literal(context = context, name = name, secret = secret)
    if (digest != null) __obj.updateDynamic("digest")(digest)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSecretOptions]
  }
}

