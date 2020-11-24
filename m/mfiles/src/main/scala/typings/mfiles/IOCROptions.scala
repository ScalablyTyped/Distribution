package typings.mfiles

import typings.mfiles.MFiles.MFOCRLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOCROptions extends js.Object {
  
  def Clone(): IOCROptions = js.native
  
  var PrimaryLanguage: MFOCRLanguage = js.native
  
  var SecondaryLanguage: MFOCRLanguage = js.native
}
object IOCROptions {
  
  @scala.inline
  def apply(Clone: () => IOCROptions, PrimaryLanguage: MFOCRLanguage, SecondaryLanguage: MFOCRLanguage): IOCROptions = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PrimaryLanguage = PrimaryLanguage.asInstanceOf[js.Any], SecondaryLanguage = SecondaryLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOCROptions]
  }
  
  @scala.inline
  implicit class IOCROptionsOps[Self <: IOCROptions] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IOCROptions): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrimaryLanguage(value: MFOCRLanguage): Self = this.set("PrimaryLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryLanguage(value: MFOCRLanguage): Self = this.set("SecondaryLanguage", value.asInstanceOf[js.Any])
  }
}
