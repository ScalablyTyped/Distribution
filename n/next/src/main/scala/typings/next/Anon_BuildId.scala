package typings.next

import typings.next.nextMod.NextConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BuildId extends js.Object {
  var buildId: String
  var config: NextConfig
  var quiet: Boolean
}

object Anon_BuildId {
  @scala.inline
  def apply(buildId: String, config: NextConfig, quiet: Boolean): Anon_BuildId = {
    val __obj = js.Dynamic.literal(buildId = buildId, config = config, quiet = quiet)
  
    __obj.asInstanceOf[Anon_BuildId]
  }
}

