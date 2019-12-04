package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListExamplesDetailsListDotCustomColumnsDotExampleMod

import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsListCustomColumnsExampleState extends js.Object {
  var columns: js.Array[IColumn]
  var sortedItems: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
  ]
}

object IDetailsListCustomColumnsExampleState {
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    sortedItems: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
    ]
  ): IDetailsListCustomColumnsExampleState = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], sortedItems = sortedItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDetailsListCustomColumnsExampleState]
  }
}

