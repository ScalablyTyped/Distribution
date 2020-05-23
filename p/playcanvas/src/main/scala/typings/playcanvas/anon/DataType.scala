package typings.playcanvas.anon

import typings.playcanvas.pc.ScopeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataType extends js.Object {
  var dataType: Double
  var name: String
  var normalize: Boolean
  var numComponents: Double
  var offset: Double
  var scopeId: ScopeId
  var size: Double
  var stride: Double
}

object DataType {
  @scala.inline
  def apply(
    dataType: Double,
    name: String,
    normalize: Boolean,
    numComponents: Double,
    offset: Double,
    scopeId: ScopeId,
    size: Double,
    stride: Double
  ): DataType = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], normalize = normalize.asInstanceOf[js.Any], numComponents = numComponents.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], scopeId = scopeId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataType]
  }
}

