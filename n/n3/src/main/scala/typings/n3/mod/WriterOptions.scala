package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriterOptions extends js.Object {
  var end: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[String] = js.native
  var prefixes: js.UndefOr[Prefixes[typings.rdfJs.mod.NamedNode[String] | String]] = js.native
}

object WriterOptions {
  @scala.inline
  def apply(): WriterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriterOptions]
  }
  @scala.inline
  implicit class WriterOptionsOps[Self <: WriterOptions] (val x: Self) extends AnyVal {
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
    def setEnd(value: Boolean): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setPrefixes(value: Prefixes[typings.rdfJs.mod.NamedNode[String] | String]): Self = this.set("prefixes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixes: Self = this.set("prefixes", js.undefined)
  }
  
}

