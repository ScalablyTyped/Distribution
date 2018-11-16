package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Table
  extends /* propName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  var fields: js.Array[Field]
  var tableName: java.lang.String
  var tables: js.Array[Table]
  def encode(): js.Array[scala.Double]
  def sizeOf(): scala.Double
}

