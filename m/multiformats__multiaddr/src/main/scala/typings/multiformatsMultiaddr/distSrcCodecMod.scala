package typings.multiformatsMultiaddr

import typings.multiformatsMultiaddr.mod.Protocol
import typings.multiformatsMultiaddr.mod.StringTuple
import typings.multiformatsMultiaddr.mod.Tuple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCodecMod {
  
  @JSImport("@multiformats/multiaddr/dist/src/codec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ParseError(str: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseError")(str.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def bytesToString(buf: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToString")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def bytesToTuples(buf: js.typedarray.Uint8Array): js.Array[Tuple] = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToTuples")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Array[Tuple]]
  
  inline def cleanPath(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanPath")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fromBytes(buf: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(buf.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def fromString(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def isValidBytes(buf: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidBytes")(buf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def protoFromTuple(tup: js.Array[Any]): Protocol = ^.asInstanceOf[js.Dynamic].applyDynamic("protoFromTuple")(tup.asInstanceOf[js.Any]).asInstanceOf[Protocol]
  
  inline def sizeForAddr(p: Protocol, addr: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sizeForAddr")(p.asInstanceOf[js.Any], addr.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def sizeForAddr(p: Protocol, addr: js.typedarray.Uint8Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sizeForAddr")(p.asInstanceOf[js.Any], addr.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def stringToBytes(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToBytes")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def stringToStringTuples(str: String): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToStringTuples")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
  
  inline def stringTuplesToString(tuples: js.Array[StringTuple]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringTuplesToString")(tuples.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringTuplesToTuples(tuples: js.Array[js.Array[String] | String]): js.Array[Tuple] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringTuplesToTuples")(tuples.asInstanceOf[js.Any]).asInstanceOf[js.Array[Tuple]]
  
  inline def tuplesToBytes(tuples: js.Array[Tuple]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("tuplesToBytes")(tuples.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def tuplesToStringTuples(tuples: js.Array[Tuple]): js.Array[StringTuple] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuplesToStringTuples")(tuples.asInstanceOf[js.Any]).asInstanceOf[js.Array[StringTuple]]
  
  inline def validateBytes(buf: js.typedarray.Uint8Array): js.UndefOr[js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateBytes")(buf.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Error]]
}
