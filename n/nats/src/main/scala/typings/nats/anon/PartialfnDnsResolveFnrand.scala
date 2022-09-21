package typings.nats.anon

import typings.nats.typesMod.DnsResolveFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  fn :nats.nats/lib/nats-base-client/types.DnsResolveFn,   randomize :boolean,   resolve :boolean}> */
trait PartialfnDnsResolveFnrand extends StObject {
  
  var fn: js.UndefOr[DnsResolveFn] = js.undefined
  
  var randomize: js.UndefOr[Boolean] = js.undefined
  
  var resolve: js.UndefOr[Boolean] = js.undefined
}
object PartialfnDnsResolveFnrand {
  
  inline def apply(): PartialfnDnsResolveFnrand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialfnDnsResolveFnrand]
  }
  
  extension [Self <: PartialfnDnsResolveFnrand](x: Self) {
    
    inline def setFn(value: /* h */ String => js.Promise[js.Array[String]]): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
    
    inline def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
    
    inline def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
    
    inline def setResolve(value: Boolean): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
  }
}
