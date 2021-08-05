package typings.officeUiFabricReact.mod

import typings.std.DragEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDragDropOptions
  extends StObject
     with typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropOptions
object IDragDropOptions {
  
  inline def apply(
    context: typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropContext,
    selectionIndex: Double,
    updateDropState: (Boolean, DragEvent) => Unit
  ): IDragDropOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], selectionIndex = selectionIndex.asInstanceOf[js.Any], updateDropState = js.Any.fromFunction2(updateDropState))
    __obj.asInstanceOf[IDragDropOptions]
  }
}
