package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnDragEndLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropLocation extends StObject {
  
  var dropLocation: js.UndefOr[ColumnDragEndLocation] = js.undefined
}
object DropLocation {
  
  inline def apply(): DropLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropLocation]
  }
  
  extension [Self <: DropLocation](x: Self) {
    
    inline def setDropLocation(value: ColumnDragEndLocation): Self = StObject.set(x, "dropLocation", value.asInstanceOf[js.Any])
    
    inline def setDropLocationUndefined: Self = StObject.set(x, "dropLocation", js.undefined)
  }
}
