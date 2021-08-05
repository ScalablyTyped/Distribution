package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the environment in which the add-in is running.
  */
trait ContextInformation extends StObject {
  
  /**
    * Gets the Office application host in which the add-in is running.
    */
  var host: HostType
  
  /**
    * Gets the platform on which the add-in is running.
    */
  var platform: PlatformType
  
  /**
    * Gets the version of Office on which the add-in is running.
    */
  var version: String
}
object ContextInformation {
  
  inline def apply(host: HostType, platform: PlatformType, version: String): ContextInformation = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextInformation]
  }
  
  extension [Self <: ContextInformation](x: Self) {
    
    inline def setHost(value: HostType): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: PlatformType): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
