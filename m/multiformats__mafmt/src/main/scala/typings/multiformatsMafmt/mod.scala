package typings.multiformatsMafmt

import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@multiformats/mafmt", "Circuit")
  @js.native
  val Circuit: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "DNS")
  @js.native
  val DNS: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "DNS4")
  @js.native
  val DNS4: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "DNS6")
  @js.native
  val DNS6: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "DNSADDR")
  @js.native
  val DNSADDR: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "HTTP")
  @js.native
  val HTTP: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "HTTPS")
  @js.native
  val HTTPS: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "IP")
  @js.native
  val IP: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "IPFS")
  @js.native
  val IPFS: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "P2P")
  @js.native
  val P2P: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "QUIC")
  @js.native
  val QUIC: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "Reliable")
  @js.native
  val Reliable: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "Stardust")
  @js.native
  val Stardust: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "TCP")
  @js.native
  val TCP: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "UDP")
  @js.native
  val UDP: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "UTP")
  @js.native
  val UTP: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "WebRTCDirect")
  @js.native
  val WebRTCDirect: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "WebRTCStar")
  @js.native
  val WebRTCStar: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "WebSocketStar")
  @js.native
  val WebSocketStar: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "WebSockets")
  @js.native
  val WebSockets: Mafmt = js.native
  
  @JSImport("@multiformats/mafmt", "WebSocketsSecure")
  @js.native
  val WebSocketsSecure: Mafmt = js.native
  
  trait Mafmt extends StObject {
    
    var input: js.UndefOr[js.Array[Mafmt | js.Function0[this.type]]] = js.undefined
    
    def matches(a: String): Boolean
    def matches(a: js.typedarray.Uint8Array): Boolean
    def matches(a: Multiaddr_): Boolean
    @JSName("matches")
    var matches_Original: MatchesFunction
    
    def partialMatch(protos: js.Array[String]): Boolean | js.Array[String] | Null
    @JSName("partialMatch")
    var partialMatch_Original: PartialMatchesFunction
  }
  object Mafmt {
    
    inline def apply(
      matches: /* a */ String | js.typedarray.Uint8Array | Multiaddr_ => Boolean,
      partialMatch: /* protos */ js.Array[String] => Boolean | js.Array[String] | Null
    ): Mafmt = {
      val __obj = js.Dynamic.literal(matches = js.Any.fromFunction1(matches), partialMatch = js.Any.fromFunction1(partialMatch))
      __obj.asInstanceOf[Mafmt]
    }
    
    extension [Self <: Mafmt](x: Self) {
      
      inline def setInput(value: js.Array[Mafmt | js.Function0[Mafmt]]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setInputVarargs(value: (Mafmt | js.Function0[Mafmt])*): Self = StObject.set(x, "input", js.Array(value*))
      
      inline def setMatches(value: /* a */ String | js.typedarray.Uint8Array | Multiaddr_ => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
      
      inline def setPartialMatch(value: /* protos */ js.Array[String] => Boolean | js.Array[String] | Null): Self = StObject.set(x, "partialMatch", js.Any.fromFunction1(value))
    }
  }
  
  type MatchesFunction = js.Function1[/* a */ String | js.typedarray.Uint8Array | Multiaddr_, Boolean]
  
  type PartialMatchesFunction = js.Function1[/* protos */ js.Array[String], Boolean | js.Array[String] | Null]
}
