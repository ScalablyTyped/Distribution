package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkEventArgs extends StObject {
  
  val player: Double
}
object NetworkEventArgs {
  
  inline def apply(player: Double): NetworkEventArgs = {
    val __obj = js.Dynamic.literal(player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkEventArgs]
  }
  
  extension [Self <: NetworkEventArgs](x: Self) {
    
    inline def setPlayer(value: Double): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
  }
}
