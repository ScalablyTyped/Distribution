package typings.nativeFetch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.nativeFetch.anon.Error
import typings.nativeFetch.anon.FnCall
import typings.nativeFetch.anon.Instantiable
import typings.nativeFetch.anon.InstantiableRequest
import typings.nativeFetch.anon.TypeofResponse
import typings.undici.mod.Request_
import typings.undici.typesFetchMod.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcIndexNodeMod {
  
  @JSImport("native-fetch/types/src/index-node", "Headers")
  @js.native
  val Headers: Instantiable | Instantiable0[typings.undici.mod.Headers] = js.native
  
  @JSImport("native-fetch/types/src/index-node", "Request")
  @js.native
  val Request: InstantiableRequest | (Instantiable1[/* input */ RequestInfo, Request_]) = js.native
  
  @JSImport("native-fetch/types/src/index-node", "Response")
  @js.native
  val Response: Error | TypeofResponse = js.native
  
  @JSImport("native-fetch/types/src/index-node", "fetch")
  @js.native
  val fetch: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.fetch */ Any) | FnCall = js.native
}
