package typings.atOracleOraclejet.ojtableMod.ojTable

import typings.atOracleOraclejet.Anon_DatasourceD
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait HeaderRendererContext[K, D] extends js.Object {
  var columnHeaderDefaultRenderer: js.UndefOr[
    js.Function2[
      /* param0 */ js.Object, 
      /* param1 */ js.Function1[/* param0 */ js.Object, Unit], 
      Unit
    ]
  ] = js.undefined
  var columnHeaderSortableIconRenderer: js.UndefOr[
    js.Function2[
      /* param0 */ js.Object, 
      /* param1 */ js.Function1[/* param0 */ js.Object, Unit], 
      Unit
    ]
  ] = js.undefined
  var columnIndex: Double
  var componentElement: Element
  var data: String
  var headerContext: Anon_DatasourceD[K, D]
  var parentElement: Element
}

object HeaderRendererContext {
  @scala.inline
  def apply[K, D](
    columnIndex: Double,
    componentElement: Element,
    data: String,
    headerContext: Anon_DatasourceD[K, D],
    parentElement: Element,
    columnHeaderDefaultRenderer: (/* param0 */ js.Object, /* param1 */ js.Function1[/* param0 */ js.Object, Unit]) => Unit = null,
    columnHeaderSortableIconRenderer: (/* param0 */ js.Object, /* param1 */ js.Function1[/* param0 */ js.Object, Unit]) => Unit = null
  ): HeaderRendererContext[K, D] = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headerContext = headerContext.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    if (columnHeaderDefaultRenderer != null) __obj.updateDynamic("columnHeaderDefaultRenderer")(js.Any.fromFunction2(columnHeaderDefaultRenderer))
    if (columnHeaderSortableIconRenderer != null) __obj.updateDynamic("columnHeaderSortableIconRenderer")(js.Any.fromFunction2(columnHeaderSortableIconRenderer))
    __obj.asInstanceOf[HeaderRendererContext[K, D]]
  }
}

