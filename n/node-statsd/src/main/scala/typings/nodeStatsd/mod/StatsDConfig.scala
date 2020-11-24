package typings.nodeStatsd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatsDConfig extends js.Object {
  
  var cacheDns: js.UndefOr[Boolean] = js.native
  
  var global_tags: js.UndefOr[js.Array[String]] = js.native
  
  var globalize: js.UndefOr[Boolean] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var mock: js.UndefOr[Boolean] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var suffix: js.UndefOr[String] = js.native
}
object StatsDConfig {
  
  @scala.inline
  def apply(): StatsDConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatsDConfig]
  }
  
  @scala.inline
  implicit class StatsDConfigOps[Self <: StatsDConfig] (val x: Self) extends AnyVal {
    
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
    def setCacheDns(value: Boolean): Self = this.set("cacheDns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheDns: Self = this.set("cacheDns", js.undefined)
    
    @scala.inline
    def setGlobal_tagsVarargs(value: String*): Self = this.set("global_tags", js.Array(value :_*))
    
    @scala.inline
    def setGlobal_tags(value: js.Array[String]): Self = this.set("global_tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobal_tags: Self = this.set("global_tags", js.undefined)
    
    @scala.inline
    def setGlobalize(value: Boolean): Self = this.set("globalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalize: Self = this.set("globalize", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setMock(value: Boolean): Self = this.set("mock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMock: Self = this.set("mock", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
}
