package typings.next

import typings.next.anon.PageString
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebErrorMod {
  
  @JSImport("next/dist/server/web/error", "PageSignatureError")
  @js.native
  open class PageSignatureError protected ()
    extends StObject
       with Error {
    def this(param0: PageString) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("next/dist/server/web/error", "RemovedPageError")
  @js.native
  open class RemovedPageError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("next/dist/server/web/error", "RemovedUAError")
  @js.native
  open class RemovedUAError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
