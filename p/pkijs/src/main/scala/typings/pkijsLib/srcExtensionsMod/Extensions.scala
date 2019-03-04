package typings
package pkijsLib.srcExtensionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extensions extends js.Object {
  var extensions: js.Array[pkijsLib.srcExtensionMod.default]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object Extensions {
  @scala.inline
  def apply(
    extensions: js.Array[pkijsLib.srcExtensionMod.default],
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): Extensions = {
    val __obj = js.Dynamic.literal(extensions = extensions, fromSchema = fromSchema, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[Extensions]
  }
}

