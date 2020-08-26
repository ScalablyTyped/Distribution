package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.Asterisk
import typings.nodeSqlParser.nodeSqlParserStrings.star
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Star extends js.Object {
  var `type`: star = js.native
  var value: Asterisk = js.native
}

object Star {
  @scala.inline
  def apply(`type`: star, value: Asterisk): Star = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Star]
  }
  @scala.inline
  implicit class StarOps[Self <: Star] (val x: Self) extends AnyVal {
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
    def setType(value: star): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Asterisk): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

