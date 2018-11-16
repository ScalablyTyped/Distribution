package typings
package mobxLib.libTypesObservablearrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IArrayChange[T] extends js.Object {
  var index: scala.Double
  var newValue: T
  var `object`: IObservableArray[T]
  var oldValue: T
  var `type`: mobxLib.mobxLibStrings.update
}

