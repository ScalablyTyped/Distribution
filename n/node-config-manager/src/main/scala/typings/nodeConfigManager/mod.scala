package typings.nodeConfigManager

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("node-config-manager", JSImport.Namespace)
  @js.native
  val ^ : ConfigManager = js.native
  
  @js.native
  trait ConfigManager extends StObject {
    
    def addConfig(configName: String): ConfigManager = js.native
    
    def count(): Double = js.native
    
    def get(key: String): String | Boolean = js.native
    
    def getConfig(configName: String): Any = js.native
    
    def init(options: Options): ConfigManager = js.native
    
    var method: Any = js.native
    
    def removeConfig(configName: String): ConfigManager = js.native
    
    def set(key: String, value: String): ConfigManager = js.native
    def set(key: String, value: Boolean): ConfigManager = js.native
  }
  
  trait Options extends StObject {
    
    var camelCase: Boolean
    
    var configDir: String
    
    var env: String
  }
  object Options {
    
    inline def apply(camelCase: Boolean, configDir: String, env: String): Options = {
      val __obj = js.Dynamic.literal(camelCase = camelCase.asInstanceOf[js.Any], configDir = configDir.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCamelCase(value: Boolean): Self = StObject.set(x, "camelCase", value.asInstanceOf[js.Any])
      
      inline def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ConfigManager
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ConfigManager = ^
}
