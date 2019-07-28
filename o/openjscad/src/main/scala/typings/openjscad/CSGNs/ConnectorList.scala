package typings.openjscad.CSGNs

import typings.openjscad.CSG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.ConnectorList")
@js.native
class ConnectorList protected () extends js.Object {
  def this(connectors: js.Array[Connector]) = this()
  var closed: Boolean = js.native
  var connectors_ : js.Array[Connector] = js.native
  def appendConnector(conn: Connector): Unit = js.native
  def followWith(cagish: js.Any): CSG = js.native
  def setClosed(bool: Boolean): Unit = js.native
  def verify(): Unit = js.native
}

/* static members */
@JSGlobal("CSG.ConnectorList")
@js.native
object ConnectorList extends js.Object {
  var defaultNormal: js.Array[Double] = js.native
  def _fromPath2DExplicit(path2D: js.Any, angleIsh: js.Any): ConnectorList = js.native
  def _fromPath2DTangents(path2D: js.Any, start: js.Any, end: js.Any): ConnectorList = js.native
  def fromPath2D(path2D: Path2D, arg1: js.Any, arg2: js.Any): ConnectorList = js.native
}

