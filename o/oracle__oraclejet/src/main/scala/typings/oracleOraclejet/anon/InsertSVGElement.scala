package typings.oracleOraclejet.anon

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertSVGElement extends js.Object {
  var insert: SVGElement = js.native
}

object InsertSVGElement {
  @scala.inline
  def apply(insert: SVGElement): InsertSVGElement = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertSVGElement]
  }
  @scala.inline
  implicit class InsertSVGElementOps[Self <: InsertSVGElement] (val x: Self) extends AnyVal {
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
    def setInsert(value: SVGElement): Self = this.set("insert", value.asInstanceOf[js.Any])
  }
  
}

