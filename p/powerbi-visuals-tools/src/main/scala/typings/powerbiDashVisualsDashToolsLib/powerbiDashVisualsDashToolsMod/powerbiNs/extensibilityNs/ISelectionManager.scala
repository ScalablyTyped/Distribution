package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectionManager extends js.Object {
  def applySelectionFilter(): scala.Unit = js.native
  def clear(): powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.IPromise[js.Object] = js.native
  def getSelectionIds(): js.Array[
    powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs.ISelectionId
  ] = js.native
  def hasSelection(): scala.Boolean = js.native
  def registerOnSelectCallback(
    callback: js.Function1[
      /* ids */ js.Array[
        powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs.ISelectionId
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def select(
    selectionId: js.Array[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs.ISelectionId
    ]
  ): powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.IPromise[
    js.Array[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs.ISelectionId
    ]
  ] = js.native
  def select(
    selectionId: js.Array[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs.ISelectionId
    ],
    multiSelect: scala.Boolean
  ): powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.IPromise[
    js.Array[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs.ISelectionId
    ]
  ] = js.native
  def select(
    selectionId: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs.ISelectionId
  ): powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.IPromise[
    js.Array[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs.ISelectionId
    ]
  ] = js.native
  def select(
    selectionId: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs.ISelectionId,
    multiSelect: scala.Boolean
  ): powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.IPromise[
    js.Array[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs.ISelectionId
    ]
  ] = js.native
}

