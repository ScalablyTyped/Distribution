package typings.mendixmodelsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transportationMod {
  type IResponseCallback[T] = js.Function2[
    /* data */ T, 
    /* response */ typings.mendixmodelsdk.transportationMod.IResponse, 
    scala.Unit
  ]
}
