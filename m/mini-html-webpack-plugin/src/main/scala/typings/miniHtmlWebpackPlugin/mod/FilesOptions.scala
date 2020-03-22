package typings.miniHtmlWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesOptions extends js.Object {
  var files: js.UndefOr[js.Array[String]] = js.undefined
  var publicPath: js.UndefOr[String] = js.undefined
}

object FilesOptions {
  @scala.inline
  def apply(files: js.Array[String] = null, publicPath: String = null): FilesOptions = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesOptions]
  }
}

