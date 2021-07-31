package typings.next

import typings.next.nextServerMod.ServerConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nextMod {
  
  @JSImport("next/dist/server/next", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(options: NextServerConstructor): typings.next.nextServerMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[typings.next.nextServerMod.default]
  
  trait NextServerConstructor
    extends StObject
       with ServerConstructor
  object NextServerConstructor {
    
    @scala.inline
    def apply(): NextServerConstructor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NextServerConstructor]
    }
  }
}
