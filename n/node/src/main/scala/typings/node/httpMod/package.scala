package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpMod {
  import org.scalablytyped.runtime.StringDictionary

  // outgoing headers allows numbers (as they are converted internally to strings)
  type OutgoingHttpHeaders = StringDictionary[js.UndefOr[Double | java.lang.String | js.Array[java.lang.String]]]
  type RequestListener = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, Unit]
  // although RequestOptions are passed as ClientRequestArgs to ClientRequest directly,
  // create interface RequestOptions would make the naming more clear to developers
  type RequestOptions = ClientRequestArgs
}
