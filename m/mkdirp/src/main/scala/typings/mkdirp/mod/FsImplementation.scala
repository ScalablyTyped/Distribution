package typings.mkdirp.mod

import typings.mkdirp.anon.Typeofmkdir
import typings.mkdirp.anon.Typeofstat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsImplementation extends js.Object {
  var mkdir: Typeofmkdir
  var stat: Typeofstat
}

object FsImplementation {
  @scala.inline
  def apply(mkdir: Typeofmkdir, stat: Typeofstat): FsImplementation = {
    val __obj = js.Dynamic.literal(mkdir = mkdir.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsImplementation]
  }
}

