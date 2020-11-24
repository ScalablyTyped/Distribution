package typings.mockFs.filesystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Create a directory for `process.cwd()`. This is `true` by default.
    */
  var createCwd: js.UndefOr[Boolean] = js.native
  
  /**
    * Create a directory for `os.tmpdir()`. This is `true` by default.
    */
  var createTmp: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCreateCwd(value: Boolean): Self = this.set("createCwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateCwd: Self = this.set("createCwd", js.undefined)
    
    @scala.inline
    def setCreateTmp(value: Boolean): Self = this.set("createTmp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTmp: Self = this.set("createTmp", js.undefined)
  }
}
