package typings.officeUiFabricReact.mod

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGridProps
  extends StObject
     with typings.officeUiFabricReact.buttonGridTypesMod.IButtonGridProps
object IGridProps {
  
  inline def apply(columnCount: Double, items: js.Array[js.Any], onRenderItem: (js.Any, Double) => Element): IGridProps = {
    val __obj = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onRenderItem = js.Any.fromFunction2(onRenderItem))
    __obj.asInstanceOf[IGridProps]
  }
}
