package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a player within a network game.
  */
trait Player extends StObject {
  
  val commandsRan: Double
  
  var group: Double
  
  val id: Double
  
  val ipAddress: String
  
  val moneySpent: Double
  
  val name: String
  
  val ping: Double
  
  val publicKeyHash: String
}
object Player {
  
  inline def apply(
    commandsRan: Double,
    group: Double,
    id: Double,
    ipAddress: String,
    moneySpent: Double,
    name: String,
    ping: Double,
    publicKeyHash: String
  ): Player = {
    val __obj = js.Dynamic.literal(commandsRan = commandsRan.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], moneySpent = moneySpent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any], publicKeyHash = publicKeyHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Player] (val x: Self) extends AnyVal {
    
    inline def setCommandsRan(value: Double): Self = StObject.set(x, "commandsRan", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Double): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setMoneySpent(value: Double): Self = StObject.set(x, "moneySpent", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPing(value: Double): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyHash(value: String): Self = StObject.set(x, "publicKeyHash", value.asInstanceOf[js.Any])
  }
}
