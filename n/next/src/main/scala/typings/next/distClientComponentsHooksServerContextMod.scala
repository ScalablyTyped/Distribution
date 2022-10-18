package typings.next

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsHooksServerContextMod {
  
  object CONTEXT_NAMES {
    
    @JSImport("next/dist/client/components/hooks-server-context", "CONTEXT_NAMES.CookiesContext")
    @js.native
    val CookiesContext: typings.next.nextStrings.CookiesContext = js.native
    
    @JSImport("next/dist/client/components/hooks-server-context", "CONTEXT_NAMES.FetchRevalidateContext")
    @js.native
    val FetchRevalidateContext: typings.next.nextStrings.FetchRevalidateContext = js.native
    
    @JSImport("next/dist/client/components/hooks-server-context", "CONTEXT_NAMES.HeadersContext")
    @js.native
    val HeadersContext: typings.next.nextStrings.HeadersContext = js.native
    
    @JSImport("next/dist/client/components/hooks-server-context", "CONTEXT_NAMES.PreviewDataContext")
    @js.native
    val PreviewDataContext: typings.next.nextStrings.PreviewDataContext = js.native
    
    @JSImport("next/dist/client/components/hooks-server-context", "CONTEXT_NAMES.StaticGenerationContext")
    @js.native
    val StaticGenerationContext: typings.next.nextStrings.StaticGenerationContext = js.native
  }
  
  @JSImport("next/dist/client/components/hooks-server-context", "CookiesContext")
  @js.native
  val CookiesContext: Any = js.native
  
  @JSImport("next/dist/client/components/hooks-server-context", "DynamicServerError")
  @js.native
  open class DynamicServerError protected ()
    extends StObject
       with Error {
    def this(`type`: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("next/dist/client/components/hooks-server-context", "HeadersContext")
  @js.native
  val HeadersContext: Any = js.native
  
  @JSImport("next/dist/client/components/hooks-server-context", "PreviewDataContext")
  @js.native
  val PreviewDataContext: Any = js.native
  
  @JSImport("next/dist/client/components/hooks-server-context", "StaticGenerationContext")
  @js.native
  val StaticGenerationContext: Any = js.native
}
