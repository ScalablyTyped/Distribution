package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openid-client", "Issuer")
@js.native
open class Issuer[TClient /* <: BaseClient */] protected ()
  extends StObject
     with /* key */ StringDictionary[Any] {
  def this(metadata: IssuerMetadata) = this()
  
  var Client: TypeOfGenericClient[TClient] = js.native
  
  var FAPI1Client: TypeOfGenericClient[TClient] = js.native
  
  var metadata: IssuerMetadata = js.native
  
  var static: Any = js.native
}
/* static members */
object Issuer {
  
  @JSImport("openid-client", "Issuer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def discover(issuer: String): js.Promise[Issuer[BaseClient]] = ^.asInstanceOf[js.Dynamic].applyDynamic("discover")(issuer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Issuer[BaseClient]]]
  
  inline def webfinger(input: String): js.Promise[Issuer[BaseClient]] = ^.asInstanceOf[js.Dynamic].applyDynamic("webfinger")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Issuer[BaseClient]]]
}
