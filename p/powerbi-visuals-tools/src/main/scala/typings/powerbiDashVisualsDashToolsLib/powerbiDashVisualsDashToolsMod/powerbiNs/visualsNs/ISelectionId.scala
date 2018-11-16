package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectionId extends js.Object {
  def equals(other: ISelectionId): scala.Boolean = js.native
  def getKey(): java.lang.String = js.native
  def getSelector(): powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.Selector = js.native
  def getSelectorsByColumn(): powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.SelectorsByColumn = js.native
  def hasIdentity(): scala.Boolean = js.native
  def includes(other: ISelectionId): scala.Boolean = js.native
  def includes(other: ISelectionId, ignoreHighlight: scala.Boolean): scala.Boolean = js.native
}

