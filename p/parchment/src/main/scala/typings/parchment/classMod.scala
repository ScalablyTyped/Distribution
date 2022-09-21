package typings.parchment

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classMod {
  
  @JSImport("parchment/dist/typings/attributor/class", JSImport.Default)
  @js.native
  open class default () extends ClassAttributor
  object default {
    
    @JSImport("parchment/dist/typings/attributor/class", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def keys(node: HTMLElement): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @js.native
  trait ClassAttributor
    extends typings.parchment.attributorMod.default
}
