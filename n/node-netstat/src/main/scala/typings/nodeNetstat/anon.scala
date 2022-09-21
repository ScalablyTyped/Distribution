package typings.nodeNetstat

import typings.nodeNetstat.mod.RecursivePartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined node-netstat.node-netstat.RecursivePartial<node-netstat.node-netstat.Address> */
  trait RecursivePartialAddress extends StObject {
    
    var address: js.UndefOr[RecursivePartial[String | Null]] = js.undefined
    
    var port: js.UndefOr[RecursivePartial[Double | Null]] = js.undefined
  }
  object RecursivePartialAddress {
    
    inline def apply(): RecursivePartialAddress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecursivePartialAddress]
    }
    
    extension [Self <: RecursivePartialAddress](x: Self) {
      
      inline def setAddress(value: RecursivePartial[String | Null]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setPort(value: RecursivePartial[Double | Null]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
