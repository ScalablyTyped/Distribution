package typings.oracleOraclejet.ojdatagridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ojDataGrid {
  
  type ojBeforeCurrentCell[K] = typings.std.CustomEvent[typings.oracleOraclejet.anon.CurrentCell[K]]
  
  type ojBeforeEdit[K, D] = typings.std.CustomEvent[typings.oracleOraclejet.anon.CellContext[K, D]]
  
  type ojBeforeEditEnd[K, D] = typings.std.CustomEvent[typings.oracleOraclejet.anon.CancelEdit[K, D]]
  
  type ojResize = typings.std.CustomEvent[typings.oracleOraclejet.anon.NewDimensions]
  
  type ojScroll = typings.std.CustomEvent[typings.oracleOraclejet.anon.ScrollX]
  
  type ojSort = typings.std.CustomEvent[typings.oracleOraclejet.anon.DictpropNameDirection]
}
