package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpMod {
  // although RequestOptions are passed as ClientRequestArgs to ClientRequest directly,
  // create interface RequestOptions would make the naming more clear to developers
  type RequestOptions = ClientRequestArgs
}
