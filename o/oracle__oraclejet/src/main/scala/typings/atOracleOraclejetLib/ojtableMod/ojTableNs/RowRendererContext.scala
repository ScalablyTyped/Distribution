package typings
package atOracleOraclejetLib.ojtableMod.ojTableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RowRendererContext[K, D] extends js.Object {
  var componentElement: stdLib.Element
  var data: org.scalablytyped.runtime.StringDictionary[js.Any]
  var parentElement: stdLib.Element
  var rowContext: atOracleOraclejetLib.Anon_Datasource[K, D]
}

object RowRendererContext {
  @scala.inline
  def apply[K, D](
    componentElement: stdLib.Element,
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    parentElement: stdLib.Element,
    rowContext: atOracleOraclejetLib.Anon_Datasource[K, D]
  ): RowRendererContext[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("componentElement")(componentElement)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("parentElement")(parentElement)
    __obj.updateDynamic("rowContext")(rowContext)
    __obj.asInstanceOf[RowRendererContext[K, D]]
  }
}

