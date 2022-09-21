package typings.nats.anon

import typings.nats.typesMod.DnsResolveFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  fn :nats.nats/lib/nats-base-client/types.DnsResolveFn,   randomize :boolean}> */
trait PartialfnDnsResolveFnrandFn extends StObject {
  
  var fn: js.UndefOr[DnsResolveFn] = js.undefined
  
  var randomize: js.UndefOr[Boolean] = js.undefined
}
object PartialfnDnsResolveFnrandFn {
  
  inline def apply(): PartialfnDnsResolveFnrandFn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialfnDnsResolveFnrandFn]
  }
  
  extension [Self <: PartialfnDnsResolveFnrandFn](x: Self) {
    
    inline def setFn(value: /* h */ String => js.Promise[js.Array[String]]): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
    
    inline def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
    
    inline def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
  }
}
