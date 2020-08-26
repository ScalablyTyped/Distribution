package typings.playcanvas.anon

import typings.playcanvas.pc.ScopeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataType extends js.Object {
  var dataType: Double = js.native
  var name: String = js.native
  var normalize: Boolean = js.native
  var numComponents: Double = js.native
  var offset: Double = js.native
  var scopeId: ScopeId = js.native
  var size: Double = js.native
  var stride: Double = js.native
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
  @scala.inline
  implicit class DataTypeOps[Self <: DataType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataType(value: Double): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalize(value: Boolean): Self = this.set("normalize", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumComponents(value: Double): Self = this.set("numComponents", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeId(value: ScopeId): Self = this.set("scopeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setStride(value: Double): Self = this.set("stride", value.asInstanceOf[js.Any])
  }
  
}

