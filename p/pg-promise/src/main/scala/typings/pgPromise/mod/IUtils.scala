package typings.pgPromise.mod

import typings.pgPromise.anon.IgnoreErrors
import typings.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// General-purpose functions
// API: http://vitaly-t.github.io/pg-promise/utils.html
@js.native
trait IUtils extends StObject {
  
  def camelize(text: String): String = js.native
  
  def camelizeVar(text: String): String = js.native
  
  def enumSql(dir: String): Any = js.native
  def enumSql(
    dir: String,
    options: Unit,
    cb: js.Function3[/* file */ String, /* name */ String, /* path */ String, Any]
  ): Any = js.native
  def enumSql(dir: String, options: IgnoreErrors): Any = js.native
  def enumSql(
    dir: String,
    options: IgnoreErrors,
    cb: js.Function3[/* file */ String, /* name */ String, /* path */ String, Any]
  ): Any = js.native
  
  def taskArgs[T](args: IArguments): ITaskArguments[T] = js.native
}
