package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectorList extends js.Object {
  var closed: Boolean = js.native
  var connectors_ : js.Array[Connector] = js.native
  def appendConnector(conn: Connector): Unit = js.native
  def followWith(cagish: js.Any): typings.openjscad.CSG = js.native
  def setClosed(bool: Boolean): Unit = js.native
  def verify(): Unit = js.native
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
  @scala.inline
  implicit class ConnectorListOps[Self <: ConnectorList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppendConnector(value: Connector => Unit): Self = this.set("appendConnector", js.Any.fromFunction1(value))
    @scala.inline
    def setClosed(value: Boolean): Self = this.set("closed", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectors_Varargs(value: Connector*): Self = this.set("connectors_", js.Array(value :_*))
    @scala.inline
    def setConnectors_(value: js.Array[Connector]): Self = this.set("connectors_", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollowWith(value: js.Any => typings.openjscad.CSG): Self = this.set("followWith", js.Any.fromFunction1(value))
    @scala.inline
    def setSetClosed(value: Boolean => Unit): Self = this.set("setClosed", js.Any.fromFunction1(value))
    @scala.inline
    def setVerify(value: () => Unit): Self = this.set("verify", js.Any.fromFunction0(value))
  }
  
}

