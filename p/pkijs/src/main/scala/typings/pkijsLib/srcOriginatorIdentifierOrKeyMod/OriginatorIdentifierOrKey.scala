package typings
package pkijsLib.srcOriginatorIdentifierOrKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OriginatorIdentifierOrKey extends js.Object {
  var value: js.UndefOr[js.Any] = js.undefined
  var variant: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

