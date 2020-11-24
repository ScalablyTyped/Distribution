package typings.nodelibFsStat.settingsMod

import typings.nodelibFsStat.anon.PartialFileSystemAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var followSymbolicLink: js.UndefOr[Boolean] = js.native
  
  var fs: js.UndefOr[PartialFileSystemAdapter] = js.native
  
  var markSymbolicLink: js.UndefOr[Boolean] = js.native
  
  var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.native
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
    def setFollowSymbolicLink(value: Boolean): Self = this.set("followSymbolicLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowSymbolicLink: Self = this.set("followSymbolicLink", js.undefined)
    
    @scala.inline
    def setFs(value: PartialFileSystemAdapter): Self = this.set("fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    
    @scala.inline
    def setMarkSymbolicLink(value: Boolean): Self = this.set("markSymbolicLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkSymbolicLink: Self = this.set("markSymbolicLink", js.undefined)
    
    @scala.inline
    def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = this.set("throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrowErrorOnBrokenSymbolicLink: Self = this.set("throwErrorOnBrokenSymbolicLink", js.undefined)
  }
}
