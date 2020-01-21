package typings.ncp.mod

import typings.ncp.AnonErrs
import typings.ncp.AnonErrsPathLike
import typings.ncp.AnonStopOnErr
import typings.node.fsMod.WriteStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ncp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ncp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ncp */ js.Any = js.native
  def apply(
    source: String,
    destination: String,
    callback: js.Function1[/* err */ js.Array[Error] | Null, Unit]
  ): Unit = js.native
  def apply(
    source: String,
    destination: String,
    options: (Options with AnonStopOnErr with AnonErrs with AnonErrsPathLike) | Options,
    callback: js.Function1[js.Array[Error] | Error | Null | WriteStream, Unit]
  ): Unit = js.native
  /**
  	 * **NOTE:** This function provides design-time support for util.promisify.
  	 *
  	 * It does not exist at runtime.
  	 */
  def __promisify__(source: String, destination: String): js.Promise[Unit] = js.native
  def __promisify__(source: String, destination: String, options: Options): js.Promise[Unit] = js.native
}

