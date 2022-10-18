package typings.multiformatsMultiaddr

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcProtocolsTableMod {
  
  @JSImport("@multiformats/multiaddr/dist/src/protocols-table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@multiformats/multiaddr/dist/src/protocols-table", "codes")
  @js.native
  val codes: Record[Double, Protocol] = js.native
  
  inline def createProtocol(code: Double, size: Double, name: String): Protocol = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocol")(code.asInstanceOf[js.Any], size.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Protocol]
  inline def createProtocol(code: Double, size: Double, name: String, resolvable: Any): Protocol = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocol")(code.asInstanceOf[js.Any], size.asInstanceOf[js.Any], name.asInstanceOf[js.Any], resolvable.asInstanceOf[js.Any])).asInstanceOf[Protocol]
  inline def createProtocol(code: Double, size: Double, name: String, resolvable: Any, path: Any): Protocol = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocol")(code.asInstanceOf[js.Any], size.asInstanceOf[js.Any], name.asInstanceOf[js.Any], resolvable.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Protocol]
  inline def createProtocol(code: Double, size: Double, name: String, resolvable: Unit, path: Any): Protocol = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocol")(code.asInstanceOf[js.Any], size.asInstanceOf[js.Any], name.asInstanceOf[js.Any], resolvable.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Protocol]
  
  inline def getProtocol(proto: String): Protocol = ^.asInstanceOf[js.Dynamic].applyDynamic("getProtocol")(proto.asInstanceOf[js.Any]).asInstanceOf[Protocol]
  inline def getProtocol(proto: Double): Protocol = ^.asInstanceOf[js.Dynamic].applyDynamic("getProtocol")(proto.asInstanceOf[js.Any]).asInstanceOf[Protocol]
  
  @JSImport("@multiformats/multiaddr/dist/src/protocols-table", "names")
  @js.native
  val names: Record[String, Protocol] = js.native
  
  @JSImport("@multiformats/multiaddr/dist/src/protocols-table", "table")
  @js.native
  val table: js.Array[js.Tuple5[Double, Double, String, js.UndefOr[Boolean], js.UndefOr[Boolean]]] = js.native
  
  trait Protocol extends StObject {
    
    var code: Double
    
    var name: String
    
    var path: js.UndefOr[Boolean] = js.undefined
    
    var resolvable: js.UndefOr[Boolean] = js.undefined
    
    var size: Double
  }
  object Protocol {
    
    inline def apply(code: Double, name: String, size: Double): Protocol = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Protocol]
    }
    
    extension [Self <: Protocol](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Boolean): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setResolvable(value: Boolean): Self = StObject.set(x, "resolvable", value.asInstanceOf[js.Any])
      
      inline def setResolvableUndefined: Self = StObject.set(x, "resolvable", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
