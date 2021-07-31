package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", "OTransaction")
@js.native
class OTransaction () extends StObject {
  
  def commit(): js.Promise[js.Any] = js.native
  
  def create(record: ORecord): OTransaction = js.native
  
  var db: ODB = js.native
  
  def delete(record: ORecord): OTransaction = js.native
  
  var id: Double = js.native
  
  def update(record: ORecord): OTransaction = js.native
}
