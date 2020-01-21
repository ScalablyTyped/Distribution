package typings.officeUiFabricReact.shimmerLoadDataExampleMod

import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerLoadDataExampleState extends js.Object {
  var contentOne: js.UndefOr[String] = js.undefined
  var examplePersona: js.UndefOr[IPersonaProps] = js.undefined
  var isDataLoadedOne: js.UndefOr[Boolean] = js.undefined
  var isDataLoadedTwo: js.UndefOr[Boolean] = js.undefined
}

object IShimmerLoadDataExampleState {
  @scala.inline
  def apply(
    contentOne: String = null,
    examplePersona: IPersonaProps = null,
    isDataLoadedOne: js.UndefOr[Boolean] = js.undefined,
    isDataLoadedTwo: js.UndefOr[Boolean] = js.undefined
  ): IShimmerLoadDataExampleState = {
    val __obj = js.Dynamic.literal()
    if (contentOne != null) __obj.updateDynamic("contentOne")(contentOne.asInstanceOf[js.Any])
    if (examplePersona != null) __obj.updateDynamic("examplePersona")(examplePersona.asInstanceOf[js.Any])
    if (!js.isUndefined(isDataLoadedOne)) __obj.updateDynamic("isDataLoadedOne")(isDataLoadedOne.asInstanceOf[js.Any])
    if (!js.isUndefined(isDataLoadedTwo)) __obj.updateDynamic("isDataLoadedTwo")(isDataLoadedTwo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerLoadDataExampleState]
  }
}

