package typings.npm.npmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NPMNs {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type CommandCallback = js.Function5[
    /* err */ js.UndefOr[Error], 
    /* result */ js.UndefOr[js.Any], 
    /* result2 */ js.UndefOr[js.Any], 
    /* result3 */ js.UndefOr[js.Any], 
    /* result4 */ js.UndefOr[js.Any], 
    Unit
  ]
  type CommandFunction = js.Function2[/* args */ js.Array[String], /* callback */ CommandCallback, Unit]
  type Dictionary[T] = StringDictionary[T]
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[Error], Unit]
  type SimpleCallback[T] = js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[T], Unit]
}
