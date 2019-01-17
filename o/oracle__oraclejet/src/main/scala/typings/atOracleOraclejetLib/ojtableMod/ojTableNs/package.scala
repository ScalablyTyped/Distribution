package typings
package atOracleOraclejetLib.ojtableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojTableNs {
  // tslint:disable-next-line interface-over-type-literal
  type ColumnSelectionEnd[K] = atOracleOraclejetLib.Anon_EndIndex[K] | atOracleOraclejetLib.Anon_EndIndexEndKey[K]
  // tslint:disable-next-line interface-over-type-literal
  type ColumnSelectionStart[K] = atOracleOraclejetLib.Anon_StartIndex[K] | atOracleOraclejetLib.Anon_StartIndexStartKey[K]
  // tslint:disable-next-line interface-over-type-literal
  type CurrentRow[K] = atOracleOraclejetLib.Anon_RowIndex[K] | atOracleOraclejetLib.Anon_RowIndexRowKey[K]
  // tslint:disable-next-line interface-over-type-literal
  type RowSelectionEnd[K] = atOracleOraclejetLib.Anon_EndIndexEndKeyAnonRow[K] | atOracleOraclejetLib.Anon_EndIndexEndKeyAnonRowAnonRowK[K]
  // tslint:disable-next-line interface-over-type-literal
  type RowSelectionStart[K] = atOracleOraclejetLib.Anon_StartIndexStartKeyAnonRow[K] | atOracleOraclejetLib.Anon_StartIndexStartKeyAnonRowAnonRowK[K]
  type ojAnimateEnd = stdLib.CustomEvent[atOracleOraclejetLib.Anon_ActionAdd]
  type ojAnimateStart = stdLib.CustomEvent[atOracleOraclejetLib.Anon_ActionAddElement]
  type ojBeforeCurrentRow[K] = stdLib.CustomEvent[atOracleOraclejetLib.Anon_CurrentRow[K]]
  type ojBeforeRowEdit = stdLib.CustomEvent[atOracleOraclejetLib.Anon_PropNameRowContext]
  type ojBeforeRowEditEnd = stdLib.CustomEvent[atOracleOraclejetLib.Anon_CancelEditPropName]
  type ojSort = stdLib.CustomEvent[atOracleOraclejetLib.Anon_AscendingDescending]
}
