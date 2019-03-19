package typings
package pDashEveryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-every", JSImport.Namespace)
@js.native
object pDashEveryMod extends js.Object {
  def default[ValueType](
    input: stdLib.Iterable[js.Thenable[ValueType] | ValueType],
    testFunction: js.Function2[
      /* element */ ValueType, 
      /* index */ scala.Double, 
      scala.Boolean | js.Thenable[scala.Boolean]
    ]
  ): js.Promise[scala.Boolean] = js.native
  def default[ValueType](
    input: stdLib.Iterable[js.Thenable[ValueType] | ValueType],
    testFunction: js.Function2[
      /* element */ ValueType, 
      /* index */ scala.Double, 
      scala.Boolean | js.Thenable[scala.Boolean]
    ],
    options: pDashMapLib.pDashMapMod.Options
  ): js.Promise[scala.Boolean] = js.native
}

