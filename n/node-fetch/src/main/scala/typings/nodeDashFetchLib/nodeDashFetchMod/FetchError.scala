package typings
package nodeDashFetchLib.nodeDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "FetchError")
@js.native
class FetchError protected ()
  extends nodeLib.Error {
  def this(message: java.lang.String, `type`: java.lang.String, systemError: java.lang.String) = this()
  var code: js.UndefOr[java.lang.String] = js.native
  var errno: js.UndefOr[java.lang.String] = js.native
  var name: nodeDashFetchLib.nodeDashFetchLibStrings.FetchError = js.native
  var `type`: java.lang.String = js.native
}

