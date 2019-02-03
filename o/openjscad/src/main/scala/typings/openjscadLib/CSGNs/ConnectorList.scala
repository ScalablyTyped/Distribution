package typings
package openjscadLib.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.ConnectorList")
@js.native
class ConnectorList protected () extends js.Object {
  def this(connectors: js.Array[Connector]) = this()
  var closed: scala.Boolean = js.native
  var `connectors_`: js.Array[Connector] = js.native
  def appendConnector(conn: Connector): scala.Unit = js.native
  def followWith(cagish: js.Any): openjscadLib.CSG = js.native
  def setClosed(bool: scala.Boolean): scala.Unit = js.native
  def verify(): scala.Unit = js.native
}

/* static members */
@JSGlobal("CSG.ConnectorList")
@js.native
object ConnectorList extends js.Object {
  var defaultNormal: js.Array[scala.Double] = js.native
  def _fromPath2DExplicit(path2D: js.Any, angleIsh: js.Any): openjscadLib.CSGNs.ConnectorList = js.native
  def _fromPath2DTangents(path2D: js.Any, start: js.Any, end: js.Any): openjscadLib.CSGNs.ConnectorList = js.native
  def fromPath2D(path2D: openjscadLib.CSGNs.Path2D, arg1: js.Any, arg2: js.Any): openjscadLib.CSGNs.ConnectorList = js.native
}

