package typings.nextSeo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var canonical: js.UndefOr[String] = js.native
  
  var dangerouslySetAllPagesToNoIndex: js.UndefOr[Boolean] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var facebook: js.UndefOr[Facebook] = js.native
  
  var noindex: js.UndefOr[Boolean] = js.native
  
  var openGraph: js.UndefOr[OpenGraph] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleTemplate: js.UndefOr[String] = js.native
  
  var twitter: js.UndefOr[Twitter] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setCanonical(value: String): Self = this.set("canonical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanonical: Self = this.set("canonical", js.undefined)
    
    @scala.inline
    def setDangerouslySetAllPagesToNoIndex(value: Boolean): Self = this.set("dangerouslySetAllPagesToNoIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDangerouslySetAllPagesToNoIndex: Self = this.set("dangerouslySetAllPagesToNoIndex", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFacebook(value: Facebook): Self = this.set("facebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacebook: Self = this.set("facebook", js.undefined)
    
    @scala.inline
    def setNoindex(value: Boolean): Self = this.set("noindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoindex: Self = this.set("noindex", js.undefined)
    
    @scala.inline
    def setOpenGraph(value: OpenGraph): Self = this.set("openGraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenGraph: Self = this.set("openGraph", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleTemplate(value: String): Self = this.set("titleTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTemplate: Self = this.set("titleTemplate", js.undefined)
    
    @scala.inline
    def setTwitter(value: Twitter): Self = this.set("twitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwitter: Self = this.set("twitter", js.undefined)
  }
}
