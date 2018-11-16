package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IShellUIEvents extends IEvents {
  var OnNewCommonDialogShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, scala.Unit | IShellFrameEvents]] = js.undefined
  var OnNewEmbeddedShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, scala.Unit | IShellFrameEvents]] = js.undefined
  var OnNewNormalShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, scala.Unit | IShellFrameEvents]] = js.undefined
  var OnNewShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, scala.Unit | IShellFrameEvents]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

