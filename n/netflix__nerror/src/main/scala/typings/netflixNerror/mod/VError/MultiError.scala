package typings.netflixNerror.mod.VError

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * Represents a collection of errors for the purpose of consumers that generally
  * only deal with one error.  Callers can extract the individual errors
  * contained in this object, but may also just treat it as a normal single
  * error, in which case a summary message will be printed.
  */
@JSImport("@netflix/nerror", "VError.MultiError")
@js.native
class MultiError protected ()
  extends typings.netflixNerror.mod.VError {
  def this(errors: js.Array[Error]) = this()
  
  def errors(): js.Array[Error] = js.native
}
