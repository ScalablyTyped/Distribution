package typings.mitt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mitt {
  import org.scalablytyped.runtime.StringDictionary

  type Handler = js.Function1[/* event */ js.UndefOr[js.Any], Unit]
  type MittStatic = js.Function1[/* all */ js.UndefOr[StringDictionary[js.Array[Handler]]], Emitter]
  type WildcardHandler = js.Function2[/* type */ js.UndefOr[String], /* event */ js.UndefOr[js.Any], Unit]
}
