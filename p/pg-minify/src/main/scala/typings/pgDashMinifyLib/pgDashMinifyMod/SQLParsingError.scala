package typings
package pgDashMinifyLib.pgDashMinifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-minify", "SQLParsingError")
@js.native
class SQLParsingError ()
  extends stdLib.Error {
  var code: parsingErrorCode = js.native
  var error: java.lang.String = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var position: IErrorPosition = js.native
  @JSName("stack")
  var stack_SQLParsingError: java.lang.String = js.native
}

