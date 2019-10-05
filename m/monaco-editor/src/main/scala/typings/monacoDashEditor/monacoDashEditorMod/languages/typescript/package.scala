package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typescript {
  import org.scalablytyped.runtime.StringDictionary

  type CompilerOptionsValue = js.UndefOr[
    String | Double | Boolean | (js.Array[Double | String]) | MapLike[js.Array[String]] | Null
  ]
  type MapLike[T] = StringDictionary[T]
}
