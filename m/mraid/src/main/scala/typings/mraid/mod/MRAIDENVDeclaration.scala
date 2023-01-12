package typings.mraid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  version :mraid.mraid.MRAIDVersion,   sdk :string | undefined,   sdkVersion :string | undefined,   appId :string | undefined,   ifa :string | undefined,   limitAdTracking :boolean | undefined,   coppa :boolean | undefined}> */
trait MRAIDENVDeclaration extends StObject {
  
  val appId: js.UndefOr[String] = js.undefined
  
  val coppa: js.UndefOr[Boolean] = js.undefined
  
  val ifa: js.UndefOr[String] = js.undefined
  
  val limitAdTracking: js.UndefOr[Boolean] = js.undefined
  
  val sdk: js.UndefOr[String] = js.undefined
  
  val sdkVersion: js.UndefOr[String] = js.undefined
  
  val version: MRAIDVersion
}
object MRAIDENVDeclaration {
  
  inline def apply(version: MRAIDVersion): MRAIDENVDeclaration = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MRAIDENVDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MRAIDENVDeclaration] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setCoppa(value: Boolean): Self = StObject.set(x, "coppa", value.asInstanceOf[js.Any])
    
    inline def setCoppaUndefined: Self = StObject.set(x, "coppa", js.undefined)
    
    inline def setIfa(value: String): Self = StObject.set(x, "ifa", value.asInstanceOf[js.Any])
    
    inline def setIfaUndefined: Self = StObject.set(x, "ifa", js.undefined)
    
    inline def setLimitAdTracking(value: Boolean): Self = StObject.set(x, "limitAdTracking", value.asInstanceOf[js.Any])
    
    inline def setLimitAdTrackingUndefined: Self = StObject.set(x, "limitAdTracking", js.undefined)
    
    inline def setSdk(value: String): Self = StObject.set(x, "sdk", value.asInstanceOf[js.Any])
    
    inline def setSdkUndefined: Self = StObject.set(x, "sdk", js.undefined)
    
    inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    inline def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
    
    inline def setVersion(value: MRAIDVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
