package typings.minimatch.minimatchMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minimatch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Minimatch: IMinimatchStatic = js.native
  def apply(target: String, pattern: String): Boolean = js.native
  def apply(target: String, pattern: String, options: IOptions): Boolean = js.native
  /**
    * Returns a function that tests its supplied argument, suitable for use with Array.filter
    */
  def filter(pattern: String): js.Function3[/* element */ String, /* indexed */ Double, /* array */ js.Array[String], Boolean] = js.native
  def filter(pattern: String, options: IOptions): js.Function3[/* element */ String, /* indexed */ Double, /* array */ js.Array[String], Boolean] = js.native
  /**
    * Make a regular expression object from the pattern.
    */
  def makeRe(pattern: String): RegExp = js.native
  def makeRe(pattern: String, options: IOptions): RegExp = js.native
  /**
    * Match against the list of files, in the style of fnmatch or glob.
    * If nothing is matched, and options.nonull is set,
    * then return a list containing the pattern itself.
    */
  def `match`(list: js.Array[String], pattern: String): js.Array[String] = js.native
  def `match`(list: js.Array[String], pattern: String, options: IOptions): js.Array[String] = js.native
}

