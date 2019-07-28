package typings.opentypeDotJs.opentypeDotJsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table
  extends /* propName */ StringDictionary[js.Any] {
  var fields: js.Array[Field]
  var tableName: String
  var tables: js.Array[Table]
  def encode(): js.Array[Double]
  def sizeOf(): Double
}

object Table {
  @scala.inline
  def apply(
    encode: () => js.Array[Double],
    fields: js.Array[Field],
    sizeOf: () => Double,
    tableName: String,
    tables: js.Array[Table],
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Table = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction0(encode), fields = fields, sizeOf = js.Any.fromFunction0(sizeOf), tableName = tableName, tables = tables)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Table]
  }
}

