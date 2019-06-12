package typings
package npmDashNameLib.npmDashNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Registry URL to check name availability against.
  		Default: User's configured npm registry URL.
  		*/
  val registryUrl: java.lang.String
}

object Options {
  @scala.inline
  def apply(registryUrl: java.lang.String): Options = {
    val __obj = js.Dynamic.literal(registryUrl = registryUrl)
  
    __obj.asInstanceOf[Options]
  }
}

