package typings.mjContextMenu

import typings.mjContextMenu.jsMenuElementMod.MenuElement
import typings.mjContextMenu.jsPostableMod.Postable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAbstractPostableMod {
  
  /* note: abstract class */ @JSImport("mj-context-menu/js/abstract_postable", "AbstractPostable")
  @js.native
  open class AbstractPostable ()
    extends MenuElement
       with Postable {
    
    /* protected */ def display(): Unit = js.native
    
    /* private */ var posted: Any = js.native
  }
}
