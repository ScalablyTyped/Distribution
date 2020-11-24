package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the environment in which the add-in is running.
  */
@js.native
trait ContextInformation extends js.Object {
  
  /**
    * Gets the Office application host in which the add-in is running.
    */
  var host: HostType = js.native
  
  /**
    * Gets the platform on which the add-in is running.
    */
  var platform: PlatformType = js.native
  
  /**
    * Gets the version of Office on which the add-in is running.
    */
  var version: String = js.native
}
object ContextInformation {
  
  @scala.inline
  def apply(host: HostType, platform: PlatformType, version: String): ContextInformation = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextInformation]
  }
  
  @scala.inline
  implicit class ContextInformationOps[Self <: ContextInformation] (val x: Self) extends AnyVal {
    
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
    def setHost(value: HostType): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: PlatformType): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
