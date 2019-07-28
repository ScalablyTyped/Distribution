package typings.node.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatInputPathObject extends js.Object {
  /**
    * The file name including extension (if any) such as 'index.html'
    */
  var base: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The full directory path such as '/home/user/dir' or 'c:\path\dir'
    */
  var dir: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The file extension (if any) such as '.html'
    */
  var ext: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The file name without extension (if any) such as 'index'
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The root of the path such as '/' or 'c:\'
    */
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object FormatInputPathObject {
  @scala.inline
  def apply(
    base: java.lang.String = null,
    dir: java.lang.String = null,
    ext: java.lang.String = null,
    name: java.lang.String = null,
    root: java.lang.String = null
  ): FormatInputPathObject = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (name != null) __obj.updateDynamic("name")(name)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[FormatInputPathObject]
  }
}

