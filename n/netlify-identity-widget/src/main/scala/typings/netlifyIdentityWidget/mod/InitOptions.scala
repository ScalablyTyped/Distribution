package typings.netlifyIdentityWidget.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitOptions extends js.Object {
  
  // Absolute url to endpoint. ONLY USE IN SPECIAL CASES!
  // e.g. https://www.example.com/.netlify/functions/identity
  // Generally avoid setting the APIUrl. You should only set this when
  // your app is served from a domain that differs from where the
  // identity endpoint is served.This is common for Cordova or Electron
  // apps where you host from localhost or a file.
  var APIUrl: js.UndefOr[String] = js.native
  
  // The container to attach to. e.g.: '#some-query-selector'
  var container: js.UndefOr[String] = js.native
  
  // Initial language
  var locale: js.UndefOr[String] = js.native
  
  // Enable Netlify logo
  var logo: js.UndefOr[Boolean] = js.native
  
  // custom placeholder for name input form
  var namePlaceholder: js.UndefOr[String] = js.native
}
object InitOptions {
  
  @scala.inline
  def apply(): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOptions]
  }
  
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
    
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
    def setAPIUrl(value: String): Self = this.set("APIUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAPIUrl: Self = this.set("APIUrl", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLogo(value: Boolean): Self = this.set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    
    @scala.inline
    def setNamePlaceholder(value: String): Self = this.set("namePlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamePlaceholder: Self = this.set("namePlaceholder", js.undefined)
  }
}
