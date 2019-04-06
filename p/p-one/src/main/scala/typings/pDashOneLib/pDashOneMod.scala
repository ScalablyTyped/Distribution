package typings
package pDashOneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-one", JSImport.Namespace)
@js.native
object pDashOneMod extends js.Object {
  def default[ValueType](
    input: stdLib.Iterable[js.Thenable[ValueType] | ValueType],
    testFunction: js.Function2[
      /* element */ ValueType, 
      /* index */ scala.Double, 
      scala.Boolean | js.Promise[scala.Boolean]
    ]
  ): js.Promise[scala.Boolean] = js.native
  def default[ValueType](
    input: stdLib.Iterable[js.Thenable[ValueType] | ValueType],
    testFunction: js.Function2[
      /* element */ ValueType, 
      /* index */ scala.Double, 
      scala.Boolean | js.Promise[scala.Boolean]
    ],
    options: pDashMapLib.pDashMapMod.pMapNs.Options
  ): js.Promise[scala.Boolean] = js.native
}

