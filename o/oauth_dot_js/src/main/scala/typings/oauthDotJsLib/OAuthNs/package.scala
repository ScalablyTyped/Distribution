package typings
package oauthDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object OAuthNs {
  /** An Array of name-value pairs [[name, value], [name2, value2]]. */
  type ParameterList = js.Array[js.Tuple2[java.lang.String, java.lang.String]]
  type ParameterListOrMap = ParameterList | ParameterMap
  /** A map {name: value, name2: value2}. */
  type ParameterMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
