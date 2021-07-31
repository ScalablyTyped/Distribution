package typings.officeUiFabricReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISelectionZone
  extends StObject
     with typings.officeUiFabricReact.selectionZoneMod.ISelectionZone
object ISelectionZone {
  
  @scala.inline
  def apply(ignoreNextFocus: () => Unit): ISelectionZone = {
    val __obj = js.Dynamic.literal(ignoreNextFocus = js.Any.fromFunction0(ignoreNextFocus))
    __obj.asInstanceOf[ISelectionZone]
  }
}
