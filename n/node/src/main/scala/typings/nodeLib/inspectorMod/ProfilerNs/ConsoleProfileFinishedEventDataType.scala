package typings
package nodeLib.inspectorMod.ProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleProfileFinishedEventDataType extends js.Object {
  var id: java.lang.String
  /**
    * Location of console.profileEnd().
    */
  var location: nodeLib.inspectorMod.DebuggerNs.Location
  var profile: Profile
  /**
    * Profile title passed as an argument to console.profile().
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

