package typings.officeUiFabricReact.mod

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGridCellProps[T]
  extends StObject
     with typings.officeUiFabricReact.buttonGridCellTypesMod.IButtonGridCellProps[T]
object IGridCellProps {
  
  @scala.inline
  def apply[T](id: String, item: T, onRenderItem: T => Element): IGridCellProps[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], onRenderItem = js.Any.fromFunction1(onRenderItem))
    __obj.asInstanceOf[IGridCellProps[T]]
  }
}
