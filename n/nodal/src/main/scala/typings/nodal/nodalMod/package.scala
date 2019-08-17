package typings.nodal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodalMod {
  import org.scalablytyped.runtime.StringDictionary

  type IAnyObject = StringDictionary[js.Any]
  type IArrInterface = StringDictionary[js.Array[String]]
  type ICalculations = StringDictionary[ICalculation]
  type IModelData = StringDictionary[js.Array[js.Any]]
  type InterfaceType = IArrInterface | String
  type Query = js.Any
}
