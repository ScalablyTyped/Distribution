package typings.pgPromise.mod

import typings.pgPromise.anon.IgnoreErrors
import typings.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// General-purpose functions
// API: http://vitaly-t.github.io/pg-promise/utils.html
@js.native
trait IUtils extends js.Object {
  def camelize(text: String): String = js.native
  def camelizeVar(text: String): String = js.native
  def enumSql(dir: String): js.Any = js.native
  def enumSql(dir: String, options: IgnoreErrors): js.Any = js.native
  def enumSql(
    dir: String,
    options: IgnoreErrors,
    cb: js.Function3[/* file */ String, /* name */ String, /* path */ String, _]
  ): js.Any = js.native
  def taskArgs[T](args: IArguments): ITaskArguments[T] = js.native
}

