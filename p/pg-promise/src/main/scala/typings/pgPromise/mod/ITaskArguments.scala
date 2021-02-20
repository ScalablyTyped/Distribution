package typings.pgPromise.mod

import typings.pgPromise.anon.CndMode
import typings.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITaskArguments[T] extends IArguments {
  
  def cb(): js.Any = js.native
  
  var options: CndMode with T = js.native
}
