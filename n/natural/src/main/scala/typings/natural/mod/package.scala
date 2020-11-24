package typings.natural

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BayesClassifierCallback = js.Function2[/* err */ js.Any, /* classifier */ js.Any, scala.Unit]
  
  type LogisticRegressionClassifierCallback = js.Function2[/* err */ js.Any, /* classifier */ js.Any, scala.Unit]
  
  type TfIdfCallback = js.Function2[/* i */ scala.Double, /* measure */ scala.Double, scala.Unit]
  
  type WordNetGetCallback = js.Function1[/* results */ typings.natural.mod.WordNetLookupResults, scala.Unit]
  
  type WordNetLookupCallback = js.Function1[/* results */ js.Array[typings.natural.mod.WordNetLookupResults], scala.Unit]
}
