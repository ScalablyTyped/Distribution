package typings.npm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NPM {
  type CommandCallback = js.Function5[
    /* err */ js.UndefOr[typings.std.Error], 
    /* result */ js.UndefOr[js.Any], 
    /* result2 */ js.UndefOr[js.Any], 
    /* result3 */ js.UndefOr[js.Any], 
    /* result4 */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type CommandFunction = js.Function2[
    /* args */ js.Array[java.lang.String], 
    /* callback */ typings.npm.mod.NPM.CommandCallback, 
    scala.Unit
  ]
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[typings.std.Error], scala.Unit]
  type SimpleCallback[T] = js.Function2[/* err */ js.UndefOr[typings.std.Error], /* result */ js.UndefOr[T], scala.Unit]
}
