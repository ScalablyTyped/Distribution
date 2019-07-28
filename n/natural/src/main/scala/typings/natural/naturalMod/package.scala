package typings.natural

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object naturalMod {
  type BayesClassifierCallback = js.Function2[/* err */ js.Any, /* classifier */ js.Any, Unit]
  type LogisticRegressionClassifierCallback = js.Function2[/* err */ js.Any, /* classifier */ js.Any, Unit]
  type TfIdfCallback = js.Function2[/* i */ Double, /* measure */ Double, Unit]
  type WordNetGetCallback = js.Function1[/* results */ WordNetLookupResults, Unit]
  type WordNetLookupCallback = js.Function1[/* results */ js.Array[WordNetLookupResults], Unit]
}
