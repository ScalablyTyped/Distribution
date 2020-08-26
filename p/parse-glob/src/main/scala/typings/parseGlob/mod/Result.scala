package typings.parseGlob.mod

import typings.parseGlob.anon.Basename
import typings.parseGlob.anon.Braces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  /**
    * The non-glob part of the string, if any.
    */
  var base: String = js.native
  /**
    * The glob pattern part of the string, if any.
    */
  var glob: String = js.native
  /**
    * An object with boolean information about the glob.
    */
  var is: Braces = js.native
  /**
    * A copy of the original, unmodified glob pattern.
    */
  var orig: String = js.native
  /**
    * File path segments.
    */
  var path: Basename = js.native
}

object Result {
  @scala.inline
  def apply(base: String, glob: String, is: Braces, orig: String, path: Basename): Result = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], orig = orig.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlob(value: String): Self = this.set("glob", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs(value: Braces): Self = this.set("is", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrig(value: String): Self = this.set("orig", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: Basename): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

