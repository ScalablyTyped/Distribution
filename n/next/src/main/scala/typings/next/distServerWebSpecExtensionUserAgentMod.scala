package typings.next

import typings.next.anon.Architecture
import typings.next.anon.HeadersHeaders
import typings.next.anon.Model
import typings.next.anon.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebSpecExtensionUserAgentMod {
  
  @JSImport("next/dist/server/web/spec-extension/user-agent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isBot(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBot")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def userAgent(param0: HeadersHeaders): UserAgent_ = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgent")(param0.asInstanceOf[js.Any]).asInstanceOf[UserAgent_]
  
  inline def userAgentFromString(): UserAgent_ = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentFromString")().asInstanceOf[UserAgent_]
  inline def userAgentFromString(input: String): UserAgent_ = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentFromString")(input.asInstanceOf[js.Any]).asInstanceOf[UserAgent_]
  
  trait UserAgent_ extends StObject {
    
    var browser: Version
    
    var cpu: Architecture
    
    var device: Model
    
    var engine: Version
    
    var isBot: Boolean
    
    var os: Version
    
    var ua: String
  }
  object UserAgent_ {
    
    inline def apply(
      browser: Version,
      cpu: Architecture,
      device: Model,
      engine: Version,
      isBot: Boolean,
      os: Version,
      ua: String
    ): UserAgent_ = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], isBot = isBot.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], ua = ua.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgent_]
    }
    
    extension [Self <: UserAgent_](x: Self) {
      
      inline def setBrowser(value: Version): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setCpu(value: Architecture): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setDevice(value: Model): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setEngine(value: Version): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setIsBot(value: Boolean): Self = StObject.set(x, "isBot", value.asInstanceOf[js.Any])
      
      inline def setOs(value: Version): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setUa(value: String): Self = StObject.set(x, "ua", value.asInstanceOf[js.Any])
    }
  }
}
