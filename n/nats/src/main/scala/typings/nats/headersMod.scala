package typings.nats

import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headersMod {
  
  @JSImport("nats/lib/nats-base-client/headers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Match extends StObject
  @JSImport("nats/lib/nats-base-client/headers", "Match")
  @js.native
  object Match extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Match & Double] = js.native
    
    @js.native
    sealed trait CanonicalMIME
      extends StObject
         with Match
    /* 1 */ val CanonicalMIME: typings.nats.headersMod.Match.CanonicalMIME & Double = js.native
    
    @js.native
    sealed trait Exact
      extends StObject
         with Match
    /* 0 */ val Exact: typings.nats.headersMod.Match.Exact & Double = js.native
    
    @js.native
    sealed trait IgnoreCase
      extends StObject
         with Match
    /* 2 */ val IgnoreCase: typings.nats.headersMod.Match.IgnoreCase & Double = js.native
  }
  
  @JSImport("nats/lib/nats-base-client/headers", "MsgHdrsImpl")
  @js.native
  open class MsgHdrsImpl ()
    extends StObject
       with MsgHdrs {
    
    def encode(): js.typedarray.Uint8Array = js.native
    
    def equals(mh: MsgHdrsImpl): Boolean = js.native
    
    def findKeys(k: String): js.Array[String] = js.native
    def findKeys(k: String, `match`: Match): js.Array[String] = js.native
    
    @JSName("hasError")
    def hasError_MMsgHdrsImpl: Boolean = js.native
    
    var headers: Map[String, js.Array[String]] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_MsgHdrsImpl: js.Function0[IterableIterator[js.Tuple2[String, js.Array[String]]]] = js.native
    
    def size(): Double = js.native
    
    @JSName("status")
    def status_MMsgHdrsImpl: String = js.native
  }
  /* static members */
  object MsgHdrsImpl {
    
    @JSImport("nats/lib/nats-base-client/headers", "MsgHdrsImpl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(a: js.typedarray.Uint8Array): MsgHdrsImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(a.asInstanceOf[js.Any]).asInstanceOf[MsgHdrsImpl]
    
    inline def validHeaderValue(k: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("validHeaderValue")(k.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def canonicalMIMEHeaderKey(k: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("canonicalMIMEHeaderKey")(k.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def headers(): MsgHdrs = ^.asInstanceOf[js.Dynamic].applyDynamic("headers")().asInstanceOf[MsgHdrs]
  
  @js.native
  trait MsgHdrs
    extends StObject
       with Iterable[js.Tuple2[String, js.Array[String]]] {
    
    def append(k: String, v: String): Unit = js.native
    def append(k: String, v: String, `match`: Match): Unit = js.native
    
    var code: Double = js.native
    
    def delete(k: String): Unit = js.native
    def delete(k: String, `match`: Match): Unit = js.native
    
    var description: String = js.native
    
    def get(k: String): String = js.native
    def get(k: String, `match`: Match): String = js.native
    
    def has(k: String): Boolean = js.native
    def has(k: String, `match`: Match): Boolean = js.native
    
    var hasError: Boolean = js.native
    
    def keys(): js.Array[String] = js.native
    
    def set(k: String, v: String): Unit = js.native
    def set(k: String, v: String, `match`: Match): Unit = js.native
    
    var status: String = js.native
    
    def values(k: String): js.Array[String] = js.native
    def values(k: String, `match`: Match): js.Array[String] = js.native
  }
}
