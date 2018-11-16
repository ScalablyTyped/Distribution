package typings
package naturalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object naturalMod {
  type BayesClassifierCallback = js.Function2[/* err */ js.Any, /* classifier */ js.Any, scala.Unit]
  type LogisticRegressionClassifierCallback = js.Function2[/* err */ js.Any, /* classifier */ js.Any, scala.Unit]
  type TfIdfCallback = js.Function2[/* i */ scala.Double, /* measure */ scala.Double, scala.Unit]
  type WordNetGetCallback = js.Function1[/* results */ WordNetLookupResults, scala.Unit]
  type WordNetLookupCallback = js.Function1[/* results */ js.Array[WordNetLookupResults], scala.Unit]
}
