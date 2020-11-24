package typings.oauth2Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Represents a generic callback structure for model callbacks
    */
  type Callback[T] = js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[T], scala.Unit]
  
  /**
    * For returning falsey parameters in cases of failure
    */
  /* Rewritten from type alias, can be one of: 
    - typings.oauth2Server.oauth2ServerStrings._empty
    - typings.oauth2Server.oauth2ServerNumbers.`0`
    - typings.oauth2Server.oauth2ServerBooleans.`false`
    - scala.Null
    - js.UndefOr[scala.Nothing]
  */
  type Falsey = js.UndefOr[typings.oauth2Server.mod._Falsey | scala.Null]
  
  /**
    * An interface representing the user.
    * A user object is completely transparent to oauth2-server and is simply used as input to model functions.
    */
  type User = org.scalablytyped.runtime.StringDictionary[js.Any]
}
