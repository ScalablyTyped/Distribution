package typings.mcpingJs

import typings.mcpingJs.anon.Max
import typings.mcpingJs.anon.Name
import typings.mcpingJs.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mcping-js", "MinecraftServer")
  @js.native
  open class MinecraftServer protected () extends StObject {
    def this(host: String) = this()
    def this(host: String, port: Double) = this()
    
    def ping(
      timeout: Double,
      protocolVersion: Double,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* res */ js.UndefOr[PingResponse], Unit]
    ): Unit = js.native
    def ping(
      timeout: Double,
      protocolVersion: Unit,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* res */ js.UndefOr[PingResponse], Unit]
    ): Unit = js.native
  }
  
  trait PingResponse extends StObject {
    
    var description: Text
    
    var favicon: String
    
    var players: Max
    
    var version: Name
  }
  object PingResponse {
    
    inline def apply(description: Text, favicon: String, players: Max, version: Name): PingResponse = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], favicon = favicon.asInstanceOf[js.Any], players = players.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PingResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PingResponse] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: Text): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      inline def setPlayers(value: Max): Self = StObject.set(x, "players", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Name): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
