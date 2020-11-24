package typings.muiDatatables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Display = scala.Boolean | typings.muiDatatables.muiDatatablesStrings.excluded
  
  type DisplayData = js.Array[typings.muiDatatables.anon.Data]
  
  type MUIDataTableColumnDef = java.lang.String | typings.muiDatatables.mod.MUIDataTableColumn
  
  type RenderCustomComponent[P] = js.Function1[/* props */ P, typings.react.mod.ReactNode]
  
  type ToolbarButton = scala.Boolean | typings.muiDatatables.muiDatatablesStrings.disabled
}
