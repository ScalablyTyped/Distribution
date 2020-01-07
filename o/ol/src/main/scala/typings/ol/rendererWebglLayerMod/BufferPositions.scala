package typings.ol.rendererWebglLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferPositions extends js.Object {
  var indexPosition: Double
  var vertexPosition: Double
}

object BufferPositions {
  @scala.inline
  def apply(indexPosition: Double, vertexPosition: Double): BufferPositions = {
    val __obj = js.Dynamic.literal(indexPosition = indexPosition.asInstanceOf[js.Any], vertexPosition = vertexPosition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BufferPositions]
  }
}

