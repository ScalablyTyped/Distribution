package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhononI18nOptions extends js.Object {
  
  var directory: js.UndefOr[String] = js.native
  
  var localeFallback: js.UndefOr[String] = js.native
  
  var localePreferred: js.UndefOr[String] = js.native
}
object PhononI18nOptions {
  
  @scala.inline
  def apply(): PhononI18nOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhononI18nOptions]
  }
  
  @scala.inline
  implicit class PhononI18nOptionsOps[Self <: PhononI18nOptions] (val x: Self) extends AnyVal {
    
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
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectory: Self = this.set("directory", js.undefined)
    
    @scala.inline
    def setLocaleFallback(value: String): Self = this.set("localeFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaleFallback: Self = this.set("localeFallback", js.undefined)
    
    @scala.inline
    def setLocalePreferred(value: String): Self = this.set("localePreferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalePreferred: Self = this.set("localePreferred", js.undefined)
  }
}
