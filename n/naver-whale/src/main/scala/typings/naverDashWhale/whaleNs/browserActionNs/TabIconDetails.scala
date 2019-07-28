package typings.naverDashWhale.whaleNs.browserActionNs

import org.scalablytyped.runtime.NumberDictionary
import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabIconDetails extends js.Object {
  /** Optional. Either an ImageData object or a dictionary {size -> ImageData} representing icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals scale, then image with size scale * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.imageData = foo' is equivalent to 'details.imageData = {'19': foo}'  */
  var imageData: js.UndefOr[ImageData | NumberDictionary[ImageData]] = js.undefined
  /** Optional. Either a relative image path or a dictionary {size -> relative image path} pointing to icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals scale, then image with size scale * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.path = foo' is equivalent to 'details.imageData = {'19': foo}'  */
  var path: js.UndefOr[js.Any] = js.undefined
  /** Optional. Limits the change to when a particular tab is selected. Automatically resets when the tab is closed.  */
  var tabId: js.UndefOr[Double] = js.undefined
}

object TabIconDetails {
  @scala.inline
  def apply(
    imageData: ImageData | NumberDictionary[ImageData] = null,
    path: js.Any = null,
    tabId: Int | Double = null
  ): TabIconDetails = {
    val __obj = js.Dynamic.literal()
    if (imageData != null) __obj.updateDynamic("imageData")(imageData.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabIconDetails]
  }
}

