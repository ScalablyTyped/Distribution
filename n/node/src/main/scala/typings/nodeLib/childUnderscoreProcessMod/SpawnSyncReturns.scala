package typings
package nodeLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnSyncReturns[T] extends js.Object {
  var error: nodeLib.Error
  var output: js.Array[java.lang.String]
  var pid: scala.Double
  var signal: java.lang.String
  var status: scala.Double
  var stderr: T
  var stdout: T
}

