package typings
package mysqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var length: scala.Double
  var `type`: java.lang.String
  def buffer(): nodeLib.Buffer
  def geometry(): scala.Null | mysqlLib.mysqlMod.GeometryType
  def string(): java.lang.String
}

object Anon_Buffer {
  @scala.inline
  def apply(
    buffer: () => nodeLib.Buffer,
    geometry: () => scala.Null | mysqlLib.mysqlMod.GeometryType,
    length: scala.Double,
    string: () => java.lang.String,
    `type`: java.lang.String
  ): Anon_Buffer = {
    val __obj = js.Dynamic.literal(buffer = js.Any.fromFunction0(buffer), geometry = js.Any.fromFunction0(geometry), length = length, string = js.Any.fromFunction0(string))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Buffer]
  }
}

