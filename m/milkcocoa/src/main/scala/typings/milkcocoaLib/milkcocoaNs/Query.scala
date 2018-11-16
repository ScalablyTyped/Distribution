package typings
package milkcocoaLib.milkcocoaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Query extends js.Object {
  def done(callback: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit
  def limit(number: scala.Double): Query
  def skip(index: scala.Double): Query
  // mode  asc, desc
  def sort(mode: java.lang.String): Query
}

