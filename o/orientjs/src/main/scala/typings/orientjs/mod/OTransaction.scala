package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", "OTransaction")
@js.native
class OTransaction () extends js.Object {
  
  def commit(): js.Promise[_] = js.native
  
  def create(record: ORecord): OTransaction = js.native
  
  var db: ODB = js.native
  
  def delete(record: ORecord): OTransaction = js.native
  
  var id: Double = js.native
  
  def update(record: ORecord): OTransaction = js.native
}
