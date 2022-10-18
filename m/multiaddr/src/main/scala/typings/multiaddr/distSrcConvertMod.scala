package typings.multiaddr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConvertMod {
  
  /**
    * @param {string} proto
    * @param {string | Uint8Array} a
    */
  inline def apply(proto: String, a: String): Any = (^.asInstanceOf[js.Dynamic].apply(proto.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(proto: String, a: js.typedarray.Uint8Array): Any = (^.asInstanceOf[js.Dynamic].apply(proto.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("multiaddr/dist/src/convert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toBytes(proto: String, str: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toBytes")(proto.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toBytes(proto: Double, str: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toBytes")(proto.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Convert [code,Uint8Array] to string
    *
    * @param {number|string} proto
    * @param {Uint8Array} buf
    * @returns {string}
    */
  inline def toString_(proto: String, buf: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(proto.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toString_(proto: Double, buf: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(proto.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String]
}
