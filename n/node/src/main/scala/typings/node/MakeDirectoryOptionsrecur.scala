package typings.node

import typings.node.nodeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined node.fs.MakeDirectoryOptions & {  recursive  :true} */
trait MakeDirectoryOptionsrecur extends js.Object {
  /**
    * A file mode. If a string is passed, it is parsed as an octal integer. If not specified
    * @default 0o777
    */
  var mode: js.UndefOr[Double | java.lang.String] = js.undefined
  /**
    * Indicates whether parent folders should be created.
    * If a folder was created, the path to the first created folder will be returned.
    * @default false
    */
  var recursive: js.UndefOr[Boolean with `true`] = js.undefined
}

object MakeDirectoryOptionsrecur {
  @scala.inline
  def apply(mode: Double | java.lang.String = null, recursive: js.UndefOr[Boolean with `true`] = js.undefined): MakeDirectoryOptionsrecur = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeDirectoryOptionsrecur]
  }
}

