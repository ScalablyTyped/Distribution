package typings
package atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RendererContext[K1, K2, K3, D1, D2, D3] extends js.Object {
  var color: java.lang.String
  var componentElement: stdLib.Element
  var data: js.Object
  var id: K1 | K2 | K3
  var itemData: D1 | D2 | D3
  var label: java.lang.String
  var location: java.lang.String | scala.Null
  var parentElement: stdLib.Element
  var previousState: atOracleOraclejetLib.Anon_Focused
  var root: stdLib.Element | scala.Null
  var state: atOracleOraclejetLib.Anon_Focused
  var x: scala.Double | scala.Null
  var y: scala.Double | scala.Null
  def renderDefaultFocus(): scala.Unit
  def renderDefaultHover(): scala.Unit
  def renderDefaultSelection(): scala.Unit
}

