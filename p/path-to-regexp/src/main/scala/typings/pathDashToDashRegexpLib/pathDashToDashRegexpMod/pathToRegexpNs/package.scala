package typings
package pathDashToDashRegexpLib.pathDashToDashRegexpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pathToRegexpNs {
  type Path = java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])
  type PathFunction = js.Function2[
    /* data */ js.UndefOr[js.Object], 
    /* options */ js.UndefOr[PathFunctionOptions], 
    java.lang.String
  ]
  type Token = java.lang.String | Key
}
