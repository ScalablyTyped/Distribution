package typings.npmDashName.npmDashNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Registry URL to check name availability against.
  		Default: User's configured npm registry URL.
  		*/
  val registryUrl: String
}

object Options {
  @scala.inline
  def apply(registryUrl: String): Options = {
    val __obj = js.Dynamic.literal(registryUrl = registryUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

