package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateParagraphBulletsRequest extends js.Object {
  
  /** The kinds of bullet glyphs to be used. */
  var bulletPreset: js.UndefOr[String] = js.native
  
  /** The range to apply the bullet preset to. */
  var range: js.UndefOr[Range] = js.native
}
object CreateParagraphBulletsRequest {
  
  @scala.inline
  def apply(): CreateParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateParagraphBulletsRequest]
  }
  
  @scala.inline
  implicit class CreateParagraphBulletsRequestOps[Self <: CreateParagraphBulletsRequest] (val x: Self) extends AnyVal {
    
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
    def setBulletPreset(value: String): Self = this.set("bulletPreset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulletPreset: Self = this.set("bulletPreset", js.undefined)
    
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
