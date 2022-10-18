package typings.multiaddr

import typings.multiaddr.multiaddrInts.`-1`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcProtocolsTableMod {
  
  inline def apply(proto: String): Protocol = ^.asInstanceOf[js.Dynamic].apply(proto.asInstanceOf[js.Any]).asInstanceOf[Protocol]
  /** @typedef {import("./types").Protocol} Protocol */
  /**
    * Protocols
    *
    * @param {number | string} proto
    * @returns {Protocol}
    */
  inline def apply(proto: Double): Protocol = ^.asInstanceOf[js.Dynamic].apply(proto.asInstanceOf[js.Any]).asInstanceOf[Protocol]
  
  @JSImport("multiaddr/dist/src/protocols-table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multiaddr/dist/src/protocols-table", "V")
  @js.native
  val V: `-1` = js.native
  
  @JSImport("multiaddr/dist/src/protocols-table", "codes")
  @js.native
  def codes: Record[Double, Protocol] = js.native
  inline def codes_=(x: Record[Double, Protocol]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codes")(x.asInstanceOf[js.Any])
  
  @JSImport("multiaddr/dist/src/protocols-table", "lengthPrefixedVarSize")
  @js.native
  val lengthPrefixedVarSize: `-1` = js.native
  
  @JSImport("multiaddr/dist/src/protocols-table", "names")
  @js.native
  def names: Record[String, Protocol] = js.native
  inline def names_=(x: Record[String, Protocol]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("names")(x.asInstanceOf[js.Any])
  
  /**
    *
    * Create a protocol
    *
    * @param {number} code
    * @param {number} size
    * @param {string} name
    * @param {any} [resolvable]
    * @param {any} [path]
    * @returns {Protocol}
    */
  inline def `object`(code: Double, size: Double, name: String): Protocol = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(code.asInstanceOf[js.Any], size.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Protocol]
  inline def `object`(code: Double, size: Double, name: String, resolvable: Any): Protocol = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(code.asInstanceOf[js.Any], size.asInstanceOf[js.Any], name.asInstanceOf[js.Any], resolvable.asInstanceOf[js.Any])).asInstanceOf[Protocol]
  inline def `object`(code: Double, size: Double, name: String, resolvable: Any, path: Any): Protocol = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(code.asInstanceOf[js.Any], size.asInstanceOf[js.Any], name.asInstanceOf[js.Any], resolvable.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Protocol]
  inline def `object`(code: Double, size: Double, name: String, resolvable: Unit, path: Any): Protocol = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(code.asInstanceOf[js.Any], size.asInstanceOf[js.Any], name.asInstanceOf[js.Any], resolvable.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Protocol]
  
  @JSImport("multiaddr/dist/src/protocols-table", "table")
  @js.native
  def table: js.Array[
    js.Tuple5[Double, Double, String, js.UndefOr[String | Boolean], js.UndefOr[String]]
  ] = js.native
  inline def table_=(
    x: js.Array[
      js.Tuple5[Double, Double, String, js.UndefOr[String | Boolean], js.UndefOr[String]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("table")(x.asInstanceOf[js.Any])
  
  type Protocol = typings.multiaddr.distSrcTypesMod.Protocol
}
