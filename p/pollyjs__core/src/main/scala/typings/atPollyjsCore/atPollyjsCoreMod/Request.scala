package typings.atPollyjsCore.atPollyjsCoreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends HTTPBase {
  val absoluteUrl: String = js.native
  var action: ACTION | Null = js.native
  var didRespond: Boolean = js.native
  var hash: String = js.native
  val hostname: String = js.native
  var id: js.UndefOr[String] = js.native
  var method: String = js.native
  var order: js.UndefOr[Double] = js.native
  val params: StringDictionary[String] = js.native
  val pathname: String = js.native
  val port: String = js.native
  val protocol: String = js.native
  var query: StringDictionary[String | js.Array[String]] = js.native
  var recordingName: String = js.native
  var responseTime: js.UndefOr[Double] = js.native
  var timestamp: js.UndefOr[String] = js.native
  var url: String = js.native
}

