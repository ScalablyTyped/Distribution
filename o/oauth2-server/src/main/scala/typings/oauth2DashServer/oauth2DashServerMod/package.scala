package typings.oauth2DashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oauth2DashServerMod {
  import org.scalablytyped.runtime.StringDictionary

  /**
    * Represents a generic callback structure for model callbacks
    */
  type Callback[T] = js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[T], Unit]
  /**
    * For returning falsey parameters in cases of failure
    */
  /* Rewritten from type alias, can be one of: 
    - typings.oauth2DashServer.oauth2DashServerStrings.Empty
    - typings.oauth2DashServer.oauth2DashServerNumbers.`0`
    - typings.oauth2DashServer.oauth2DashServerNumbers.`false`
    - scala.Null
    - `js.undefined`
    - scala.Nothing
  */
  type Falsey = js.UndefOr[_Falsey | Null]
  /**
    * An interface representing the user.
    * A user object is completely transparent to oauth2-server and is simply used as input to model functions.
    */
  type User = StringDictionary[js.Any]
}
