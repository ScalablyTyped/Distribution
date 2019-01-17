package typings
package atOracleOraclejetLib.ojdiagramMod.ojDiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RendererContext[K1, D1] extends js.Object {
  var componentElement: stdLib.Element
  var content: atOracleOraclejetLib.Anon_Element
  var data: js.Object
  var id: K1
  var itemData: D1
  var parentElement: stdLib.Element
  var previousState: atOracleOraclejetLib.Anon_Expanded
  var state: atOracleOraclejetLib.Anon_Expanded
  var `type`: java.lang.String
  def renderDefaultFocus(): scala.Unit
  def renderDefaultHover(): scala.Unit
  def renderDefaultSelection(): scala.Unit
}

