package typings
package nodeLib.pathMod

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

