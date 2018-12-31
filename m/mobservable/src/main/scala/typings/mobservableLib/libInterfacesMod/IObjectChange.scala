package typings
package mobservableLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectChange[T, R] extends js.Object {
  var name: java.lang.String
  var `object`: R
  var oldValue: js.UndefOr[T] = js.undefined
  var `type`: java.lang.String
}

