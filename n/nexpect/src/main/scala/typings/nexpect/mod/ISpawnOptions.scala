package typings.nexpect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpawnOptions extends js.Object {
  
  var cwd: js.UndefOr[String] = js.native
  
  var env: js.UndefOr[js.Any] = js.native
  
  var ignoreCase: js.UndefOr[js.Any] = js.native
  
  var stream: js.UndefOr[js.Any] = js.native
  
  var stripColors: js.UndefOr[js.Any] = js.native
  
  var verbose: js.UndefOr[js.Any] = js.native
}
object ISpawnOptions {
  
  @scala.inline
  def apply(): ISpawnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpawnOptions]
  }
  
  @scala.inline
  implicit class ISpawnOptionsOps[Self <: ISpawnOptions] (val x: Self) extends AnyVal {
    
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setEnv(value: js.Any): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setIgnoreCase(value: js.Any): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
    
    @scala.inline
    def setStream(value: js.Any): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setStripColors(value: js.Any): Self = this.set("stripColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripColors: Self = this.set("stripColors", js.undefined)
    
    @scala.inline
    def setVerbose(value: js.Any): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
