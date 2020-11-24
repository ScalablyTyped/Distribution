package typings.maximMazurokGapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundImageLink extends js.Object {
  
  /** Deprecated - use driveThemes/backgroundImageLink instead. */
  var backgroundImageLink: js.UndefOr[String] = js.native
  
  /** Deprecated - use driveThemes/colorRgb instead. */
  var colorRgb: js.UndefOr[String] = js.native
  
  /** Deprecated - use driveThemes/id instead. */
  var id: js.UndefOr[String] = js.native
}
object BackgroundImageLink {
  
  @scala.inline
  def apply(): BackgroundImageLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundImageLink]
  }
  
  @scala.inline
  implicit class BackgroundImageLinkOps[Self <: BackgroundImageLink] (val x: Self) extends AnyVal {
    
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
    def setBackgroundImageLink(value: String): Self = this.set("backgroundImageLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundImageLink: Self = this.set("backgroundImageLink", js.undefined)
    
    @scala.inline
    def setColorRgb(value: String): Self = this.set("colorRgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorRgb: Self = this.set("colorRgb", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
