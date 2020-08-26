package typings.moonjs.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoonConfig extends js.Object {
  var delimiters: js.Array[String] = js.native
  var prefix: String = js.native
  var silent: Boolean = js.native
  var version: String = js.native
  def keycodes(codemap: Record[String, Double]): Unit = js.native
}

object MoonConfig {
  @scala.inline
  def apply(
    delimiters: js.Array[String],
    keycodes: Record[String, Double] => Unit,
    prefix: String,
    silent: Boolean,
    version: String
  ): MoonConfig = {
    val __obj = js.Dynamic.literal(delimiters = delimiters.asInstanceOf[js.Any], keycodes = js.Any.fromFunction1(keycodes), prefix = prefix.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoonConfig]
  }
  @scala.inline
  implicit class MoonConfigOps[Self <: MoonConfig] (val x: Self) extends AnyVal {
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
    def setDelimitersVarargs(value: String*): Self = this.set("delimiters", js.Array(value :_*))
    @scala.inline
    def setDelimiters(value: js.Array[String]): Self = this.set("delimiters", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeycodes(value: Record[String, Double] => Unit): Self = this.set("keycodes", js.Any.fromFunction1(value))
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

