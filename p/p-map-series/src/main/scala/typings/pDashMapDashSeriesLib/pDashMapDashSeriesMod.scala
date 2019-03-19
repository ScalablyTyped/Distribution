package typings
package pDashMapDashSeriesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-map-series", JSImport.Namespace)
@js.native
object pDashMapDashSeriesMod extends js.Object {
  def default[ValueType, MappedValueType](
    input: stdLib.Iterable[js.Thenable[ValueType] | ValueType],
    mapper: js.Function2[
      /* element */ ValueType, 
      /* index */ scala.Double, 
      js.Thenable[MappedValueType] | MappedValueType
    ]
  ): js.Promise[js.Array[MappedValueType]] = js.native
}

