package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object streamMod {
  type TransformCallback = js.Function2[
    /* error */ js.UndefOr[nodeLib.Error | scala.Null], 
    /* data */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
