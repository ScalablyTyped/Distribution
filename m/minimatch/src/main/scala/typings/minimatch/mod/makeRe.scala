package typings.minimatch.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("minimatch", "makeRe")
@js.native
object makeRe extends js.Object {
  
  /**
    * Make a regular expression object from the pattern.
    */
  def apply(pattern: String): RegExp = js.native
  def apply(pattern: String, options: IOptions): RegExp = js.native
}
