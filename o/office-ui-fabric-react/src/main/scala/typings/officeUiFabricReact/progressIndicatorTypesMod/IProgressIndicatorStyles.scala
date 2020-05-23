package typings.officeUiFabricReact.progressIndicatorTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgressIndicatorStyles extends js.Object {
  var itemDescription: IStyle
  var itemName: IStyle
  var itemProgress: IStyle
  var progressBar: IStyle
  var progressTrack: IStyle
  /**
    * Style for the root element.
    */
  var root: IStyle
}

object IProgressIndicatorStyles {
  @scala.inline
  def apply(
    itemDescription: js.UndefOr[Null | IStyle] = js.undefined,
    itemName: js.UndefOr[Null | IStyle] = js.undefined,
    itemProgress: js.UndefOr[Null | IStyle] = js.undefined,
    progressBar: js.UndefOr[Null | IStyle] = js.undefined,
    progressTrack: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): IProgressIndicatorStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(itemDescription)) __obj.updateDynamic("itemDescription")(itemDescription.asInstanceOf[js.Any])
    if (!js.isUndefined(itemName)) __obj.updateDynamic("itemName")(itemName.asInstanceOf[js.Any])
    if (!js.isUndefined(itemProgress)) __obj.updateDynamic("itemProgress")(itemProgress.asInstanceOf[js.Any])
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar.asInstanceOf[js.Any])
    if (!js.isUndefined(progressTrack)) __obj.updateDynamic("progressTrack")(progressTrack.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressIndicatorStyles]
  }
}

