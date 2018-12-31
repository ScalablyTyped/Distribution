package typings
package nodeLib.httpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentOptions
  extends nodeLib.tlsMod.ConnectionOptions
     with nodeLib.httpMod.AgentOptions {
  var maxCachedSessions: js.UndefOr[scala.Double] = js.undefined
}

