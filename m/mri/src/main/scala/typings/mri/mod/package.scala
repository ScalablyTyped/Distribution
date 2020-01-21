package typings.mri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /** A string or array of strings */
  type ArrayOrString = java.lang.String | js.Array[java.lang.String]
  /** An object with any keys whose values conform to a specific type */
  type DictionaryObject[T] = org.scalablytyped.runtime.StringDictionary[T]
}
