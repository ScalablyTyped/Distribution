package typings
package oauth2DashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oauth2DashServerMod {
  /**
    * Represents a generic callback structure for model callbacks
    */
  type Callback[T] = js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[T], scala.Unit]
  /**
    * For returning falsey parameters in cases of failure
    */
  /* Rewritten from type alias, can be one of: 
    - oauth2DashServerLib.oauth2DashServerLibStrings.Empty
    - oauth2DashServerLib.oauth2DashServerLibNumbers.`0`
    - oauth2DashServerLib.oauth2DashServerLibNumbers.`false`
    - scala.Null
    - `js.undefined`
    - scala.Nothing
  */
  type Falsey = js.UndefOr[_Falsey | scala.Null]
  /**
    * An interface representing the user.
    * A user object is completely transparent to oauth2-server and is simply used as input to model functions.
    */
  type User = org.scalablytyped.runtime.StringDictionary[js.Any]
}
