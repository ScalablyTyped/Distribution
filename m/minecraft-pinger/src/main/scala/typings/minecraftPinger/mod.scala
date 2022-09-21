package typings.minecraftPinger

import typings.minecraftPinger.anon.Extra
import typings.minecraftPinger.anon.Max
import typings.minecraftPinger.anon.ModList
import typings.minecraftPinger.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("minecraft-pinger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ping(
    /**
    * The Host Name
    */
  hostname: String,
    /**
    *  The Port of the server , most servers default to 25565
    */
  port: Double
  ): Data = (^.asInstanceOf[js.Dynamic].applyDynamic("ping")(hostname.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Data]
  
  inline def pingPromise(
    /**
    * * The Host Name
    */
  hostname: String,
    /**
    *  The Port of the server , most servers default to 25565
    */
  port: Double
  ): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("pingPromise")(hostname.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
  
  trait Data extends StObject {
    
    /**
      * Server Description , May not exist
      */
    var description: js.UndefOr[Extra] = js.undefined
    
    /**
      * Server Favicon , Can be more than 1000 Characters
      */
    var favicon: js.UndefOr[String] = js.undefined
    
    /**
      * Moderator Info
      */
    var modinfo: js.UndefOr[ModList] = js.undefined
    
    /**
      * RoundTrip Latency in milliseconds
      */
    var ping: Double
    
    var players: Max
    
    var version: Name
  }
  object Data {
    
    inline def apply(ping: Double, players: Max, version: Name): Data = {
      val __obj = js.Dynamic.literal(ping = ping.asInstanceOf[js.Any], players = players.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setDescription(value: Extra): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      inline def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      inline def setModinfo(value: ModList): Self = StObject.set(x, "modinfo", value.asInstanceOf[js.Any])
      
      inline def setModinfoUndefined: Self = StObject.set(x, "modinfo", js.undefined)
      
      inline def setPing(value: Double): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
      
      inline def setPlayers(value: Max): Self = StObject.set(x, "players", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Name): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
