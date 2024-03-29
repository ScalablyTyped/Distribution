package typings.multiformatsMultiaddr

import typings.multiformatsMultiaddr.mod.Protocol
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
}
