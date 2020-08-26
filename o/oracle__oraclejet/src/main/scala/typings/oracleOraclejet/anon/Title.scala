package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Title extends js.Object {
  var title: String = js.native
  var titleHalign: center | end | start = js.native
  var titleStyle: js.Object = js.native
}

object Title {
  @scala.inline
  def apply(title: String, titleHalign: center | end | start, titleStyle: js.Object): Title = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], titleHalign = titleHalign.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  @scala.inline
  implicit class TitleOps[Self <: Title] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleHalign(value: center | end | start): Self = this.set("titleHalign", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleStyle(value: js.Object): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
  }
  
}

