package typings
package mobservableLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrayChange[T] extends js.Object {
  var index: scala.Double
  var `object`: IObservableArray[T]
  var oldValue: T
  var `type`: java.lang.String
}

