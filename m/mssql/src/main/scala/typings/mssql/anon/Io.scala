package typings.mssql.anon

import typings.mssql.mod.ISqlType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Io extends js.Object {
  var io: Double = js.native
  var length: Double = js.native
  var name: String = js.native
  var precision: Double = js.native
  var scale: Double = js.native
  var tvpType: js.Any = js.native
  var `type`: js.Function0[ISqlType] | ISqlType = js.native
  var value: js.Any = js.native
}

object Io {
  @scala.inline
  def apply(
    io: Double,
    length: Double,
    name: String,
    precision: Double,
    scale: Double,
    tvpType: js.Any,
    `type`: js.Function0[ISqlType] | ISqlType,
    value: js.Any
  ): Io = {
    val __obj = js.Dynamic.literal(io = io.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], tvpType = tvpType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Io]
  }
  @scala.inline
  implicit class IoOps[Self <: Io] (val x: Self) extends AnyVal {
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
    def setIo(value: Double): Self = this.set("io", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setTvpType(value: js.Any): Self = this.set("tvpType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeFunction0(value: () => ISqlType): Self = this.set("type", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: js.Function0[ISqlType] | ISqlType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

