package typings.mjContextMenu

import typings.mjContextMenu.cjsMenuElementMod.MenuElement
import typings.mjContextMenu.cjsPostableMod.Postable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsAbstractPostableMod {
  
  /* note: abstract class */ @JSImport("mj-context-menu/cjs/abstract_postable", "AbstractPostable")
  @js.native
  open class AbstractPostable ()
    extends MenuElement
       with Postable {
    
    /* protected */ def display(): Unit = js.native
    
    /* private */ var posted: Any = js.native
  }
}
