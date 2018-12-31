package typings
package minilogLib.minilogMod.MinilogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Console extends Transform {
  //Only available on client
  var color: Transform
  //Only available on backend
  var formatClean: Transform
  var formatColor: Transform
  var formatLearnboost: Transform
  var formatMinilog: Transform
  var formatNpm: Transform
  var formatWithStack: Transform
  /**
    * List of available formatters
    */
  var formatters: js.Array[java.lang.String]
  var minilog: Transform
}

