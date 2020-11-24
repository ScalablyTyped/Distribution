package typings.openfin.applicationMod

import typings.openfin.anon.Version
import typings.openfin.applicationOptionMod.ApplicationOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationInfo extends js.Object {
  
  var initialOptions: ApplicationOption = js.native
  
  var launchMode: String = js.native
  
  var manifest: js.Object = js.native
  
  var manifestUrl: String = js.native
  
  var parentUuid: js.UndefOr[String] = js.native
  
  var runtime: Version = js.native
}
object ApplicationInfo {
  
  @scala.inline
  def apply(
    initialOptions: ApplicationOption,
    launchMode: String,
    manifest: js.Object,
    manifestUrl: String,
    runtime: Version
  ): ApplicationInfo = {
    val __obj = js.Dynamic.literal(initialOptions = initialOptions.asInstanceOf[js.Any], launchMode = launchMode.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], manifestUrl = manifestUrl.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationInfo]
  }
  
  @scala.inline
  implicit class ApplicationInfoOps[Self <: ApplicationInfo] (val x: Self) extends AnyVal {
    
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
    def setInitialOptions(value: ApplicationOption): Self = this.set("initialOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchMode(value: String): Self = this.set("launchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifest(value: js.Object): Self = this.set("manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestUrl(value: String): Self = this.set("manifestUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntime(value: Version): Self = this.set("runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUuid(value: String): Self = this.set("parentUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentUuid: Self = this.set("parentUuid", js.undefined)
  }
}
