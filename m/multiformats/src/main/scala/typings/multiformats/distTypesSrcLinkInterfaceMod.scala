package typings.multiformats

import typings.multiformats.distTypesSrcBasesInterfaceMod.Multibase
import typings.multiformats.distTypesSrcBasesInterfaceMod.MultibaseEncoder
import typings.multiformats.distTypesSrcBlockInterfaceMod.ByteView
import typings.multiformats.distTypesSrcBlockInterfaceMod.Phantom
import typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashDigest
import typings.multiformats.multiformatsInts.`0`
import typings.multiformats.multiformatsInts.`0x12`
import typings.multiformats.multiformatsInts.`0x70`
import typings.multiformats.multiformatsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcLinkInterfaceMod {
  
  type DAG_PB = `0x70`
  
  type LegacyLink[T /* <: Any */] = Link[T, DAG_PB, SHA_256, `0`]
  
  @js.native
  trait Link[Data /* <: Any */, Format /* <: Double */, Alg /* <: Double */, V /* <: Version */]
    extends StObject
       with Phantom[Data] {
    
    val byteLength: Double = js.native
    
    val byteOffset: Double = js.native
    
    val bytes: ByteView[Link[Data, Format, Alg, V]] = js.native
    
    val code: Format = js.native
    
    def link(): Link[Data, Format, Alg, V] = js.native
    
    val multihash: MultihashDigest[Alg] = js.native
    
    def toString[Prefix /* <: String */](base: MultibaseEncoder[Prefix]): ToString[Link[Data, Format, Alg, Version], Prefix] = js.native
    
    def toV1(): Link[Data, Format, Alg, `1`] = js.native
    
    val version: V = js.native
  }
  
  trait LinkJSON[T /* <: UnknownLink */] extends StObject {
    
    @JSName("/")
    var Slash: ToString[T, String]
  }
  object LinkJSON {
    
    inline def apply[T /* <: UnknownLink */](Slash: ToString[T, String]): LinkJSON[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("/")(Slash.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkJSON[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkJSON[?], T /* <: UnknownLink */] (val x: Self & LinkJSON[T]) extends AnyVal {
      
      inline def setSlash(value: ToString[T, String]): Self = StObject.set(x, "/", value.asInstanceOf[js.Any])
    }
  }
  
  type SHA_256 = `0x12`
  
  type ToString[T, Prefix /* <: String */] = Multibase[Prefix] & Phantom[T]
  
  type UnknownLink = LegacyLink[Any] | (Link[Any, Double, Double, Version])
  
  /* Rewritten from type alias, can be one of: 
    - typings.multiformats.multiformatsInts.`0`
    - typings.multiformats.multiformatsInts.`1`
  */
  trait Version extends StObject
  object Version {
    
    inline def `0`: typings.multiformats.multiformatsInts.`0` = 0.asInstanceOf[typings.multiformats.multiformatsInts.`0`]
    
    inline def `1`: typings.multiformats.multiformatsInts.`1` = 1.asInstanceOf[typings.multiformats.multiformatsInts.`1`]
  }
}
