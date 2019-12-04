package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListExamplesDetailsListDotDragDropDotExampleMod

import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsListDragDropExampleState extends js.Object {
  var columns: js.Array[IColumn]
  var frozenColumnCountFromEnd: String
  var frozenColumnCountFromStart: String
  var isColumnReorderEnabled: Boolean
  var items: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
  ]
}

object IDetailsListDragDropExampleState {
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    frozenColumnCountFromEnd: String,
    frozenColumnCountFromStart: String,
    isColumnReorderEnabled: Boolean,
    items: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
    ]
  ): IDetailsListDragDropExampleState = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], frozenColumnCountFromEnd = frozenColumnCountFromEnd.asInstanceOf[js.Any], frozenColumnCountFromStart = frozenColumnCountFromStart.asInstanceOf[js.Any], isColumnReorderEnabled = isColumnReorderEnabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDetailsListDragDropExampleState]
  }
}

