package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorList extends js.Object {
  var closed: Boolean
  var connectors_ : js.Array[Connector]
  def appendConnector(conn: Connector): Unit
  def followWith(cagish: js.Any): typings.openjscad.CSG
  def setClosed(bool: Boolean): Unit
  def verify(): Unit
}

object ConnectorList {
  @scala.inline
  def apply(
    appendConnector: Connector => Unit,
    closed: Boolean,
    connectors_ : js.Array[Connector],
    followWith: js.Any => typings.openjscad.CSG,
    setClosed: Boolean => Unit,
    verify: () => Unit
  ): ConnectorList = {
    val __obj = js.Dynamic.literal(appendConnector = js.Any.fromFunction1(appendConnector), closed = closed.asInstanceOf[js.Any], connectors_ = connectors_.asInstanceOf[js.Any], followWith = js.Any.fromFunction1(followWith), setClosed = js.Any.fromFunction1(setClosed), verify = js.Any.fromFunction0(verify))
    __obj.asInstanceOf[ConnectorList]
  }
}

