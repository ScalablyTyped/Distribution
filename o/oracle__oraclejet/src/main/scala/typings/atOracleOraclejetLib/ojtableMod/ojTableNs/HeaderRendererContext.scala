package typings
package atOracleOraclejetLib.ojtableMod.ojTableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait HeaderRendererContext[K, D] extends js.Object {
  var columnHeaderDefaultRenderer: js.UndefOr[
    js.Function2[
      /* param0 */ js.Object, 
      /* param1 */ js.Function1[/* param0 */ js.Object, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var columnHeaderSortableIconRenderer: js.UndefOr[
    js.Function2[
      /* param0 */ js.Object, 
      /* param1 */ js.Function1[/* param0 */ js.Object, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var columnIndex: scala.Double
  var componentElement: stdLib.Element
  var data: java.lang.String
  var headerContext: atOracleOraclejetLib.Anon_DatasourceD[K, D]
  var parentElement: stdLib.Element
}

