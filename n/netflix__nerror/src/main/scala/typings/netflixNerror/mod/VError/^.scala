package typings.netflixNerror.mod.VError

import typings.netflixNerror.anon.Instantiable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@netflix/nerror", "VError")
@js.native
object ^ extends js.Object {
  
  var VError: Instantiable = js.native
  
  def cause(err: Error): Error | Null = js.native
  
  def errorForEach(err: Error, func: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  def errorFromList[T /* <: Error */](errors: js.Array[T]): Null | T | MultiError = js.native
  
  def findCauseByName(err: Error, name: String): Error | Null = js.native
  
  def fullStack(err: Error): String = js.native
  
  def hasCauseWithName(err: Error, name: String): Boolean = js.native
  
  def info(err: Error): Info = js.native
}
