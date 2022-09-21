package typings.oidcProvider.mod

import typings.oidcProvider.anon.Name
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionPolicy {
  
  @JSImport("oidc-provider", "interactionPolicy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("oidc-provider", "interactionPolicy.Check")
  @js.native
  open class Check protected () extends StObject {
    def this(
      reason: String,
      description: String,
      check: js.Function1[/* ctx */ KoaContextWithOIDC, CanBePromise[Boolean]]
    ) = this()
    def this(
      reason: String,
      description: String,
      check: js.Function1[/* ctx */ KoaContextWithOIDC, CanBePromise[Boolean]],
      details: js.Function1[/* ctx */ KoaContextWithOIDC, CanBePromise[UnknownObject]]
    ) = this()
    def this(
      reason: String,
      description: String,
      error: String,
      check: js.Function1[/* ctx */ KoaContextWithOIDC, CanBePromise[Boolean]]
    ) = this()
    def this(
      reason: String,
      description: String,
      error: String,
      check: js.Function1[/* ctx */ KoaContextWithOIDC, CanBePromise[Boolean]],
      details: js.Function1[/* ctx */ KoaContextWithOIDC, CanBePromise[UnknownObject]]
    ) = this()
    
    def check(ctx: KoaContextWithOIDC): CanBePromise[Boolean] = js.native
    
    var description: String = js.native
    
    def details(ctx: KoaContextWithOIDC): CanBePromise[UnknownObject] = js.native
    
    var error: String = js.native
    
    var reason: String = js.native
  }
  
  @JSImport("oidc-provider", "interactionPolicy.Prompt")
  @js.native
  open class Prompt protected () extends StObject {
    def this(info: Name, checks: Check*) = this()
    def this(
      info: Name,
      details: js.Function1[/* ctx */ KoaContextWithOIDC, CanBePromise[UnknownObject]],
      checks: Check*
    ) = this()
    
    var checks: Checks = js.native
    
    var details: js.UndefOr[js.Function1[/* ctx */ KoaContextWithOIDC, js.Promise[UnknownObject]]] = js.native
    
    var name: String = js.native
    
    var requestable: Boolean = js.native
  }
  
  inline def base(): DefaultPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("base")().asInstanceOf[DefaultPolicy]
  
  @js.native
  trait DefaultPolicy
    extends StObject
       with Array[Prompt] {
    
    def add(prompt: Prompt): Unit = js.native
    def add(prompt: Prompt, index: Double): Unit = js.native
    
    def clear(): Unit = js.native
    
    def get(name: String): js.UndefOr[Prompt] = js.native
    
    def remove(name: String): Unit = js.native
  }
}
