package typings.next.routeLoaderMod.global

import typings.next.buildManifestPluginMod.ClientBuildManifest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  var __BUILD_MANIFEST: js.UndefOr[ClientBuildManifest] = js.native
  
  var __BUILD_MANIFEST_CB: js.UndefOr[js.Function] = js.native
}
object Window {
  
  @scala.inline
  def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    
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
    def set__BUILD_MANIFEST(value: ClientBuildManifest): Self = this.set("__BUILD_MANIFEST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__BUILD_MANIFEST: Self = this.set("__BUILD_MANIFEST", js.undefined)
    
    @scala.inline
    def set__BUILD_MANIFEST_CB(value: js.Function): Self = this.set("__BUILD_MANIFEST_CB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__BUILD_MANIFEST_CB: Self = this.set("__BUILD_MANIFEST_CB", js.undefined)
  }
}
