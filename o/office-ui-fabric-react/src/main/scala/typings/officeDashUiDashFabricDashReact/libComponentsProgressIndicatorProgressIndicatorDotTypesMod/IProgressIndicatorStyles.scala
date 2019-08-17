package typings.officeDashUiDashFabricDashReact.libComponentsProgressIndicatorProgressIndicatorDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
    itemDescription: IStyle,
    itemName: IStyle,
    itemProgress: IStyle,
    progressBar: IStyle,
    progressTrack: IStyle,
    root: IStyle
  ): IProgressIndicatorStyles = {
    val __obj = js.Dynamic.literal(itemDescription = itemDescription.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], itemProgress = itemProgress.asInstanceOf[js.Any], progressBar = progressBar.asInstanceOf[js.Any], progressTrack = progressTrack.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IProgressIndicatorStyles]
  }
}

