package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "OTransaction")
@js.native
class OTransaction () extends js.Object {
  var db: ODB = js.native
  var id: Double = js.native
  def commit(): js.Promise[_] = js.native
  def create(record: ORecord): OTransaction = js.native
  def delete(record: ORecord): OTransaction = js.native
  def update(record: ORecord): OTransaction = js.native
}

