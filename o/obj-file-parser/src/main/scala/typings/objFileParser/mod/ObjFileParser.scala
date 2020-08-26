package typings.objFileParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Class module */
@js.native
trait ObjFileParser extends js.Object {
  def parse(): ObjFile = js.native
}

object ObjFileParser {
  @scala.inline
  def apply(parse: () => ObjFile): ObjFileParser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction0(parse))
    __obj.asInstanceOf[ObjFileParser]
  }
  @scala.inline
  implicit class ObjFileParserOps[Self <: ObjFileParser] (val x: Self) extends AnyVal {
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
    def setParse(value: () => ObjFile): Self = this.set("parse", js.Any.fromFunction0(value))
  }
  
}

