package typings.oauthDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object OAuthNs {
  import org.scalablytyped.runtime.StringDictionary

  /** An Array of name-value pairs [[name, value], [name2, value2]]. */
  type ParameterList = js.Array[js.Tuple2[String, String]]
  type ParameterListOrMap = ParameterList | ParameterMap
  /** A map {name: value, name2: value2}. */
  type ParameterMap = StringDictionary[String]
}
