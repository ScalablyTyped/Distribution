package typings.minimatch.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minimatch", "Minimatch")
@js.native
class Minimatch protected () extends IMinimatch {
  def this(pattern: String) = this()
  def this(pattern: String, options: IOptions) = this()
}

@JSImport("minimatch", "Minimatch")
@js.native
object Minimatch extends TopLevel[IMinimatchStatic]

