package typings.multiformats

import typings.multiformats.distTypesSrcCidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Link
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcBlockInterfaceMod {
  
  trait Block[T, C /* <: Double */, A /* <: Double */, V /* <: Version */] extends StObject {
    
    var bytes: ByteView[T]
    
    var cid: Link[T, C, A, V]
  }
  object Block {
    
    inline def apply[T, C /* <: Double */, A /* <: Double */, V /* <: Version */](bytes: ByteView[T], cid: Link[T, C, A, V]): Block[T, C, A, V] = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block[T, C, A, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Block[?, ?, ?, ?], T, C /* <: Double */, A /* <: Double */, V /* <: Version */] (val x: Self & (Block[T, C, A, V])) extends AnyVal {
      
      inline def setBytes(value: ByteView[T]): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setCid(value: Link[T, C, A, V]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.multiformats.anon.Remaining[T]
    - typings.multiformats.anon.RemainingValue
  */
  trait BlockCursorView[T /* <: Any */] extends StObject
  object BlockCursorView {
    
    inline def Remaining[T /* <: Any */](remaining: Unit, value: T): typings.multiformats.anon.Remaining[T] = {
      val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.multiformats.anon.Remaining[T]]
    }
    
    inline def RemainingValue(remaining: String, value: CID[Any, Double, Double, Version]): typings.multiformats.anon.RemainingValue = {
      val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.multiformats.anon.RemainingValue]
    }
  }
  
  trait BlockView[T, C /* <: Double */, A /* <: Double */, V /* <: Version */]
    extends StObject
       with Block[T, C, A, V] {
    
    @JSName("cid")
    var cid_BlockView: CID[T, C, A, V]
    
    def get(path: String): BlockCursorView[Any]
    
    def links(): js.Iterable[js.Tuple2[String, CID[Any, Double, Double, Version]]]
    
    def tree(): js.Iterable[String]
    
    var value: T
  }
  object BlockView {
    
    inline def apply[T, C /* <: Double */, A /* <: Double */, V /* <: Version */](
      bytes: ByteView[T],
      cid: CID[T, C, A, V],
      get: String => BlockCursorView[Any],
      links: () => js.Iterable[js.Tuple2[String, CID[Any, Double, Double, Version]]],
      tree: () => js.Iterable[String],
      value: T
    ): BlockView[T, C, A, V] = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), links = js.Any.fromFunction0(links), tree = js.Any.fromFunction0(tree), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockView[T, C, A, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockView[?, ?, ?, ?], T, C /* <: Double */, A /* <: Double */, V /* <: Version */] (val x: Self & (BlockView[T, C, A, V])) extends AnyVal {
      
      inline def setCid(value: CID[T, C, A, V]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setGet(value: String => BlockCursorView[Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setLinks(value: () => js.Iterable[js.Tuple2[String, CID[Any, Double, Double, Version]]]): Self = StObject.set(x, "links", js.Any.fromFunction0(value))
      
      inline def setTree(value: () => js.Iterable[String]): Self = StObject.set(x, "tree", js.Any.fromFunction0(value))
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ByteView[Data]
    extends StObject
       with Uint8Array
       with Phantom[Data]
  
  @js.native
  trait Phantom[T] extends StObject
}
