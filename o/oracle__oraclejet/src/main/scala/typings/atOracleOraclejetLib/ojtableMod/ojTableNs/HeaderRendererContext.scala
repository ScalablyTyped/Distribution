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

object HeaderRendererContext {
  @scala.inline
  def apply[K, D](
    columnIndex: scala.Double,
    componentElement: stdLib.Element,
    data: java.lang.String,
    headerContext: atOracleOraclejetLib.Anon_DatasourceD[K, D],
    parentElement: stdLib.Element,
    columnHeaderDefaultRenderer: js.Function2[
      /* param0 */ js.Object, 
      /* param1 */ js.Function1[/* param0 */ js.Object, scala.Unit], 
      scala.Unit
    ] = null,
    columnHeaderSortableIconRenderer: js.Function2[
      /* param0 */ js.Object, 
      /* param1 */ js.Function1[/* param0 */ js.Object, scala.Unit], 
      scala.Unit
    ] = null
  ): HeaderRendererContext[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columnIndex")(columnIndex)
    __obj.updateDynamic("componentElement")(componentElement)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("headerContext")(headerContext)
    __obj.updateDynamic("parentElement")(parentElement)
    if (columnHeaderDefaultRenderer != null) __obj.updateDynamic("columnHeaderDefaultRenderer")(columnHeaderDefaultRenderer)
    if (columnHeaderSortableIconRenderer != null) __obj.updateDynamic("columnHeaderSortableIconRenderer")(columnHeaderSortableIconRenderer)
    __obj.asInstanceOf[HeaderRendererContext[K, D]]
  }
}

