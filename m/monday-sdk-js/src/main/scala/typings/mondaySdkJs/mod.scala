package typings.mondaySdkJs

import typings.mondaySdkJs.anon.PartialclientIdstringapiT
import typings.mondaySdkJs.anon.Partialtokenstring
import typings.mondaySdkJs.anon.Partialtokenstringvariabl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): MondayClientSdk = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[MondayClientSdk]
  inline def apply(config: PartialclientIdstringapiT): MondayClientSdk = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[MondayClientSdk]
  inline def apply(config: Partialtokenstring): MondayServerSdk = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[MondayServerSdk]
  
  @JSImport("monday-sdk-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientData * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientExecute * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientApi * / any */ trait MondayClientSdk extends StObject
  
  @js.native
  trait MondayServerSdk extends StObject {
    
    def api(query: String): js.Promise[Any] = js.native
    def api(query: String, options: Partialtokenstringvariabl): js.Promise[Any] = js.native
    
    def oauthToken(code: String, clientId: String, clientSecret: String): js.Promise[Any] = js.native
    
    def setToken(token: String): Unit = js.native
  }
}
