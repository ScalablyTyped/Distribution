package typings.officeDashUiDashFabricDashReact.libUtilitiesSelectionExamplesSelectionDotBasicDotExampleMod

import typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.ISelection
import typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.all
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.vowels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectionBasicExampleState extends js.Object {
  var canSelect: all | vowels
  var items: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
  ]
  var selection: ISelection
  var selectionMode: SelectionMode
}

object ISelectionBasicExampleState {
  @scala.inline
  def apply(
    canSelect: all | vowels,
    items: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
    ],
    selection: ISelection,
    selectionMode: SelectionMode
  ): ISelectionBasicExampleState = {
    val __obj = js.Dynamic.literal(canSelect = canSelect.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISelectionBasicExampleState]
  }
}

