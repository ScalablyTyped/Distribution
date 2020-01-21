package typings.postmark.mod

import typings.postmark.accountClientMod.default
import typings.postmark.modelsMod.ClientOptions.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "AdminClient")
@js.native
class AdminClient protected () extends default {
  /**
    * Create a new AccountClient
    * @param accountToken The account token that should be used with requests.
    * @param configOptions Various options to customize client behavior.
    */
  def this(accountToken: String) = this()
  def this(accountToken: String, configOptions: Configuration) = this()
}

