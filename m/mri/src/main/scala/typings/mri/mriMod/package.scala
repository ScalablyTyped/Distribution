package typings.mri

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mriMod {
  /** A string or array of strings */
  type ArrayOrString = String | js.Array[String]
  /** An object with any keys whose values conform to a specific type */
  type DictionaryObject[T] = StringDictionary[T]
}
