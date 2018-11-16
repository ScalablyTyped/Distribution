package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IRow extends js.Object {
  var config: IRowConfig
  var cursor: java.lang.String
  var entity: js.Any
  var offsetTop: scala.Double
  var rowDisplayIndex: scala.Double
  var rowIndex: scala.Double
  var selected: scala.Boolean
  var selectionProvider: ISelectionProvider
  var utils: js.Any
  def afterSelectionChange(): scala.Unit
  def alternatingRowClass(): scala.Unit
  def beforeSelectionChange(): scala.Unit
  def continueSelection(event: js.Any): scala.Unit
  def copy(): IRow
  def ensureEntity(expected: js.Any): scala.Unit
  def getProperty(path: java.lang.String): js.Any
  def setSelection(isSelected: scala.Boolean): scala.Unit
  def setVars(fromRow: IRow): scala.Unit
  def toggleSelected(event: js.Any): scala.Boolean
}

