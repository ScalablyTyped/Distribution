package typings.parchment

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleMod {
  
  @JSImport("parchment/dist/typings/attributor/style", JSImport.Default)
  @js.native
  open class default () extends StyleAttributor
  object default {
    
    @JSImport("parchment/dist/typings/attributor/style", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def keys(node: Element): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @js.native
  trait StyleAttributor
    extends typings.parchment.attributorMod.default
}
