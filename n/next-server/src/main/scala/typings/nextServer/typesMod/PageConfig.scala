package typings.nextServer.typesMod

import typings.nextServer.anon.BodyParser
import typings.nextServer.nextServerStrings.hybrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageConfig extends js.Object {
  
  var amp: js.UndefOr[Boolean | hybrid] = js.native
  
  var api: js.UndefOr[BodyParser] = js.native
  
  var experimentalPrerender: js.UndefOr[Boolean] = js.native
}
object PageConfig {
  
  @scala.inline
  def apply(): PageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageConfig]
  }
  
  @scala.inline
  implicit class PageConfigOps[Self <: PageConfig] (val x: Self) extends AnyVal {
    
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
    def setAmp(value: Boolean | hybrid): Self = this.set("amp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmp: Self = this.set("amp", js.undefined)
    
    @scala.inline
    def setApi(value: BodyParser): Self = this.set("api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApi: Self = this.set("api", js.undefined)
    
    @scala.inline
    def setExperimentalPrerender(value: Boolean): Self = this.set("experimentalPrerender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimentalPrerender: Self = this.set("experimentalPrerender", js.undefined)
  }
}
