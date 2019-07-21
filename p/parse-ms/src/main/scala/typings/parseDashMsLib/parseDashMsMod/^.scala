package typings
package parseDashMsLib.parseDashMsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse-ms", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Parse milliseconds into an object.
  @example
  ```
  import parseMilliseconds = require('parse-ms');
  parseMilliseconds(1337000001);
  // {
  // 	days: 15,
  // 	hours: 11,
  // 	minutes: 23,
  // 	seconds: 20,
  // 	milliseconds: 1,
  // 	microseconds: 0,
  // 	nanoseconds: 0
  // }
  ```
  */
  def apply(milliseconds: scala.Double): Parsed = js.native
}

