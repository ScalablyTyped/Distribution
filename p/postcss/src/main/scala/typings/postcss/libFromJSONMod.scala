package typings.postcss

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.JSONHydrator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFromJSONMod extends Shortcut {
  
  @JSImport("postcss/lib/fromJSON", JSImport.Namespace)
  @js.native
  val ^ : FromJSON = js.native
  
  @js.native
  trait FromJSON
    extends StObject
       with JSONHydrator {
    
    def default(data: js.Array[js.Object]): js.Array[typings.postcss.libNodeMod.default] = js.native
    def default(data: js.Object): typings.postcss.libNodeMod.default = js.native
    @JSName("default")
    var default_Original: FromJSON = js.native
  }
  
  type _To = FromJSON
  
  /* This means you don't have to write `^`, but can instead just say `libFromJSONMod.foo` */
  override def _to: FromJSON = ^
}
