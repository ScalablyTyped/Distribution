package typings.pgMinify.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg-minify", "SQLParsingError")
@js.native
class SQLParsingError () extends Error {
  
  var code: parsingErrorCode = js.native
  
  var error: String = js.native
  
  var position: IErrorPosition = js.native
  
  @JSName("stack")
  var stack_SQLParsingError: String = js.native
}
