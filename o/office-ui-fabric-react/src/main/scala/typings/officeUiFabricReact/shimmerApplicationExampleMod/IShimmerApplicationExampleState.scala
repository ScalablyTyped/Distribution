package typings.officeUiFabricReact.shimmerApplicationExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerApplicationExampleState extends js.Object {
  var columns: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IColumn */ _
    ]
  ] = js.undefined
  var isDataLoaded: js.UndefOr[Boolean] = js.undefined
  var items: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
  ]
}

object IShimmerApplicationExampleState {
  @scala.inline
  def apply(
    items: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
    ],
    columns: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IColumn */ _
    ] = null,
    isDataLoaded: js.UndefOr[Boolean] = js.undefined
  ): IShimmerApplicationExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(isDataLoaded)) __obj.updateDynamic("isDataLoaded")(isDataLoaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerApplicationExampleState]
  }
}

