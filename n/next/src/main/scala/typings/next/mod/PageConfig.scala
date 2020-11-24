package typings.next.mod

import typings.next.anon.BodyParser
import typings.next.nextBooleans.`false`
import typings.next.nextStrings.hybrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageConfig extends js.Object {
  
  var amp: js.UndefOr[Boolean | hybrid] = js.native
  
  var api: js.UndefOr[BodyParser] = js.native
  
  var env: js.UndefOr[js.Array[String]] = js.native
  
  var unstable_runtimeJS: js.UndefOr[`false`] = js.native
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
    def setEnvVarargs(value: String*): Self = this.set("env", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[String]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setUnstable_runtimeJS(value: `false`): Self = this.set("unstable_runtimeJS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnstable_runtimeJS: Self = this.set("unstable_runtimeJS", js.undefined)
  }
}
