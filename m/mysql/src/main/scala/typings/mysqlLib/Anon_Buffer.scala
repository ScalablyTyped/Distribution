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
    buffer: js.Function0[nodeLib.Buffer],
    geometry: js.Function0[scala.Null | mysqlLib.mysqlMod.GeometryType],
    length: scala.Double,
    string: js.Function0[java.lang.String],
    `type`: java.lang.String
  ): Anon_Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer, geometry = geometry, length = length, string = string)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Buffer]
  }
}

