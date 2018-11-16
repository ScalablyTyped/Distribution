package typings
package pkijsLib.srcExtKeyUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExtKeyUsage extends js.Object {
  var keyPurposes: js.Array[java.lang.String]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

