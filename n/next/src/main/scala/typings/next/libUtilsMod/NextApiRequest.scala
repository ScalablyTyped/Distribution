package typings.next.libUtilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.nextEnv.mod.Env
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NextApiRequest extends IncomingMessage {
  
  var body: js.Any = js.native
  
  /**
    * Object of `cookies` from header
    */
  var cookies: StringDictionary[String] = js.native
  
  var env: Env = js.native
  
  var preview: js.UndefOr[Boolean] = js.native
  
  /**
    * Preview data set on the request, if any
    * */
  var previewData: js.UndefOr[js.Any] = js.native
  
  /**
    * Object of `query` values from url
    */
  var query: StringDictionary[String | js.Array[String]] = js.native
}
