package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppBundle extends js.Object {
  
  /** .aab file representing the app bundle under test. */
  var bundleLocation: js.UndefOr[FileReference] = js.native
}
object AppBundle {
  
  @scala.inline
  def apply(): AppBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppBundle]
  }
  
  @scala.inline
  implicit class AppBundleOps[Self <: AppBundle] (val x: Self) extends AnyVal {
    
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
    def setBundleLocation(value: FileReference): Self = this.set("bundleLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleLocation: Self = this.set("bundleLocation", js.undefined)
  }
}
