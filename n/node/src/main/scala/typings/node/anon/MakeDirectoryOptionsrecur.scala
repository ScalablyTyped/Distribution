package typings.node.anon

import typings.node.fsMod.Mode
import typings.node.nodeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.MakeDirectoryOptions & {  recursive :true} */
@js.native
trait MakeDirectoryOptionsrecur extends js.Object {
  /**
    * A file mode. If a string is passed, it is parsed as an octal integer. If not specified
    * @default 0o777
    */
  var mode: js.UndefOr[Mode] = js.native
  /**
    * Indicates whether parent folders should be created.
    * If a folder was created, the path to the first created folder will be returned.
    * @default false
    */
  var recursive: js.UndefOr[Boolean] with `true` = js.native
}

object MakeDirectoryOptionsrecur {
  @scala.inline
  def apply(recursive: js.UndefOr[Boolean] with `true`): MakeDirectoryOptionsrecur = {
    val __obj = js.Dynamic.literal(recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeDirectoryOptionsrecur]
  }
  @scala.inline
  implicit class MakeDirectoryOptionsrecurOps[Self <: MakeDirectoryOptionsrecur] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRecursive(value: js.UndefOr[Boolean] with `true`): Self = this.set("recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

