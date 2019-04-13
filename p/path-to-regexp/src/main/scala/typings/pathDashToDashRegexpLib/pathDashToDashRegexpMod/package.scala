package typings
package pathDashToDashRegexpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pathDashToDashRegexpMod {
  type Path = java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])
  type PathFunction[P /* <: js.Object */] = js.Function2[
    /* data */ js.UndefOr[P], 
    /* options */ js.UndefOr[PathFunctionOptions], 
    java.lang.String
  ]
  type Token = java.lang.String | Key
}
