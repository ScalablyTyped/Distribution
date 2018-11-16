package typings
package mendixmodelsdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSdkInternalTransportationMod {
  type IResponseCallback[T] = js.Function2[/* data */ T, /* response */ IResponse, scala.Unit]
  type RequestMethod = mendixmodelsdkLib.mendixmodelsdkLibStrings.get | mendixmodelsdkLib.mendixmodelsdkLibStrings.put | mendixmodelsdkLib.mendixmodelsdkLibStrings.post | mendixmodelsdkLib.mendixmodelsdkLibStrings.delete
}
