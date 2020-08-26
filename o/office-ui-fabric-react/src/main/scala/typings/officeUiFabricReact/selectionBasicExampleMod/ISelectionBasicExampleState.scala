package typings.officeUiFabricReact.selectionBasicExampleMod

import typings.officeUiFabricReact.officeUiFabricReactStrings.all
import typings.officeUiFabricReact.officeUiFabricReactStrings.vowels
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectionBasicExampleState extends js.Object {
  var canSelect: all | vowels = js.native
  var items: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
  ] = js.native
  var selection: ISelection[IObjectWithKey] = js.native
}

object ISelectionBasicExampleState {
  @scala.inline
  def apply(
    canSelect: all | vowels,
    items: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
    ],
    selection: ISelection[IObjectWithKey]
  ): ISelectionBasicExampleState = {
    val __obj = js.Dynamic.literal(canSelect = canSelect.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionBasicExampleState]
  }
  @scala.inline
  implicit class ISelectionBasicExampleStateOps[Self <: ISelectionBasicExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCanSelect(value: all | vowels): Self = this.set("canSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
        ]
    ): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelection(value: ISelection[IObjectWithKey]): Self = this.set("selection", value.asInstanceOf[js.Any])
  }
  
}

