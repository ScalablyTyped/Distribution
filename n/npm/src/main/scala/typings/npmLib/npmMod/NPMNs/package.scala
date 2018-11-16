package typings
package npmLib.npmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NPMNs {
  type CommandCallback = js.Function5[
    /* err */ js.UndefOr[nodeLib.Error], 
    /* result */ js.UndefOr[js.Any], 
    /* result2 */ js.UndefOr[js.Any], 
    /* result3 */ js.UndefOr[js.Any], 
    /* result4 */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type CommandFunction = js.Function2[/* args */ js.Array[java.lang.String], /* callback */ CommandCallback, scala.Unit]
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  type SimpleCallback[T] = js.Function2[/* err */ js.UndefOr[nodeLib.Error], /* result */ js.UndefOr[T], scala.Unit]
}
