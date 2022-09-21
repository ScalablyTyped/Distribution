package typings.mojangMinecraftServerAdmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mojang-minecraft-server-admin", "SecretString")
  @js.native
  open class SecretString protected () extends StObject {
    def this(value: String) = this()
  }
  
  @JSImport("mojang-minecraft-server-admin", "ServerSecrets")
  @js.native
  /* protected */ open class ServerSecrets () extends StObject {
    
    /**
      * @remarks
      * Returns a SecretString that is a placeholder for a secret
      * configured in a JSON file. In certain objects, like an
      * HttpHeader, this Secret is resolved at the time of execution
      * but is not made available to the script environment.
      * @param name
      */
    def get(name: String): SecretString = js.native
    
    /**
      * A list of available, configured server secrets.
      */
    val names: js.Array[String] = js.native
  }
  
  @JSImport("mojang-minecraft-server-admin", "ServerVariables")
  @js.native
  /* protected */ open class ServerVariables () extends StObject {
    
    /**
      * @remarks
      * Returns the value of variable that has been configured in a
      * dedicated server configuration JSON file.
      * @param name
      */
    def get(name: String): Any = js.native
    
    /**
      * A list of available, configured server variables.
      */
    val names: js.Array[String] = js.native
  }
  
  @JSImport("mojang-minecraft-server-admin", "secrets")
  @js.native
  val secrets: ServerSecrets = js.native
  
  @JSImport("mojang-minecraft-server-admin", "variables")
  @js.native
  val variables: ServerVariables = js.native
}
