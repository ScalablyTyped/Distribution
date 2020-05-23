package typings.next.utilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.next.loadEnvConfigMod.Env
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextApiRequest extends IncomingMessage {
  var body: js.Any = js.native
  /**
    * Object of `cookies` from header
    */
  var cookies: StringDictionary[String] = js.native
  var env: Env = js.native
  /**
    * Object of `query` values from url
    */
  var query: StringDictionary[String | js.Array[String]] = js.native
}

