package typings
package nextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BuildId extends js.Object {
  var buildId: java.lang.String
  var config: nextLib.nextMod.nextNs.NextConfig
  var quiet: scala.Boolean
}

object Anon_BuildId {
  @scala.inline
  def apply(buildId: java.lang.String, config: nextLib.nextMod.nextNs.NextConfig, quiet: scala.Boolean): Anon_BuildId = {
    val __obj = js.Dynamic.literal(buildId = buildId, config = config, quiet = quiet)
  
    __obj.asInstanceOf[Anon_BuildId]
  }
}

