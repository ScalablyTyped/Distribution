package typings.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typings.minappEnv.RegExpConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("RegExp")
@js.native
class RegExp protected ()
  extends typings.minappEnv.RegExp {
  def this(pattern: java.lang.String) = this()
  def this(pattern: typings.minappEnv.RegExp) = this()
  def this(pattern: java.lang.String, flags: java.lang.String) = this()
  def this(pattern: typings.minappEnv.RegExp, flags: java.lang.String) = this()
}
@JSGlobal("RegExp")
@js.native
object RegExp extends TopLevel[RegExpConstructor]
