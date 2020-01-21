package typings.mysql

import typings.mysql.mod.GeometryType
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuffer extends js.Object {
  var length: Double
  var `type`: String
  def buffer(): Buffer
  def geometry(): Null | GeometryType
  def string(): String
}

object AnonBuffer {
  @scala.inline
  def apply(
    buffer: () => Buffer,
    geometry: () => Null | GeometryType,
    length: Double,
    string: () => String,
    `type`: String
  ): AnonBuffer = {
    val __obj = js.Dynamic.literal(buffer = js.Any.fromFunction0(buffer), geometry = js.Any.fromFunction0(geometry), length = length.asInstanceOf[js.Any], string = js.Any.fromFunction0(string))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuffer]
  }
}

