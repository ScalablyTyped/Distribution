package typings.minilog.minilogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minilog", "Console")
@js.native
class Console () extends Transform {
  //Only available on client
  var color: Transform = js.native
  //Only available on backend
  var formatClean: Transform = js.native
  var formatColor: Transform = js.native
  var formatLearnboost: Transform = js.native
  var formatMinilog: Transform = js.native
  var formatNpm: Transform = js.native
  var formatWithStack: Transform = js.native
  /**
    * List of available formatters
    */
  var formatters: js.Array[String] = js.native
  var minilog: Transform = js.native
}

