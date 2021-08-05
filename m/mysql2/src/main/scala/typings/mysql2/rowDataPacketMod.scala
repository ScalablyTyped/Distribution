package typings.mysql2

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.mysql2.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowDataPacketMod {
  
  trait RowDataPacket
    extends StObject
       with /* column */ NumberDictionary[js.Any]
       with /* column */ StringDictionary[js.Any] {
    
    var constructor: `3`
  }
  object RowDataPacket {
    
    inline def apply(constructor: `3`): RowDataPacket = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDataPacket]
    }
    
    extension [Self <: RowDataPacket](x: Self) {
      
      inline def setConstructor(value: `3`): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    }
  }
}
