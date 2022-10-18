package typings.parchment

import typings.parchment.distTypingsScopeMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsBlotAbstractContainerMod {
  
  @JSImport("parchment/dist/typings/blot/abstract/container", JSImport.Default)
  @js.native
  open class default () extends ContainerBlot
  object default {
    
    @JSImport("parchment/dist/typings/blot/abstract/container", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/abstract/container", "default.blotName")
    @js.native
    def blotName: String = js.native
    inline def blotName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blotName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/abstract/container", "default.scope")
    @js.native
    def scope: Scope = js.native
    inline def scope_=(x: Scope): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/abstract/container", "default.tagName")
    @js.native
    def tagName: String = js.native
    inline def tagName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tagName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ContainerBlot
    extends typings.parchment.distTypingsBlotAbstractParentMod.default {
    
    def checkMerge(): Boolean = js.native
    
    @JSName("next")
    var next_ContainerBlot: typings.parchment.distTypingsBlotBlockMod.default | ContainerBlot | Null = js.native
    
    @JSName("prev")
    var prev_ContainerBlot: typings.parchment.distTypingsBlotBlockMod.default | ContainerBlot | Null = js.native
  }
}
