package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings._empty
import typings.oracleOraclejet.oracleOraclejetStrings.focus
import typings.oracleOraclejet.oracleOraclejetStrings.image
import typings.oracleOraclejet.oracleOraclejetStrings.now
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FooterLayout extends js.Object {
  
  var footerLayout: _empty | now = js.native
  
  var showOn: focus | image = js.native
  
  var timeIncrement: String = js.native
}
object FooterLayout {
  
  @scala.inline
  def apply(footerLayout: _empty | now, showOn: focus | image, timeIncrement: String): FooterLayout = {
    val __obj = js.Dynamic.literal(footerLayout = footerLayout.asInstanceOf[js.Any], showOn = showOn.asInstanceOf[js.Any], timeIncrement = timeIncrement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterLayout]
  }
  
  @scala.inline
  implicit class FooterLayoutOps[Self <: FooterLayout] (val x: Self) extends AnyVal {
    
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
    def setFooterLayout(value: _empty | now): Self = this.set("footerLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOn(value: focus | image): Self = this.set("showOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeIncrement(value: String): Self = this.set("timeIncrement", value.asInstanceOf[js.Any])
  }
}
