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
    itemDescription: IStyle = null,
    itemName: IStyle = null,
    itemProgress: IStyle = null,
    progressBar: IStyle = null,
    progressTrack: IStyle = null,
    root: IStyle = null
  ): IProgressIndicatorStyles = {
    val __obj = js.Dynamic.literal()
    if (itemDescription != null) __obj.updateDynamic("itemDescription")(itemDescription.asInstanceOf[js.Any])
    if (itemName != null) __obj.updateDynamic("itemName")(itemName.asInstanceOf[js.Any])
    if (itemProgress != null) __obj.updateDynamic("itemProgress")(itemProgress.asInstanceOf[js.Any])
    if (progressBar != null) __obj.updateDynamic("progressBar")(progressBar.asInstanceOf[js.Any])
    if (progressTrack != null) __obj.updateDynamic("progressTrack")(progressTrack.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressIndicatorStyles]
  }
}

