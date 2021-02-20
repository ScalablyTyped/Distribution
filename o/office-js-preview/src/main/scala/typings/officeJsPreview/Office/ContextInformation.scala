package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the environment in which the add-in is running.
  */
@js.native
trait ContextInformation extends StObject {
  
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
  implicit class ContextInformationMutableBuilder[Self <: ContextInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: HostType): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: PlatformType): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
