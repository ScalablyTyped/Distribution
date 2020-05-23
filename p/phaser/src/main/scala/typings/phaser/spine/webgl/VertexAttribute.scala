package typings.phaser.spine.webgl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexAttribute extends js.Object {
  var name: String
  var numElements: Double
  var `type`: VertexAttributeType
}

object VertexAttribute {
  @scala.inline
  def apply(name: String, numElements: Double, `type`: VertexAttributeType): VertexAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], numElements = numElements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexAttribute]
  }
}

