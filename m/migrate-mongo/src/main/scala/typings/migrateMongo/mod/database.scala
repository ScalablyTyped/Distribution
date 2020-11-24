package typings.migrateMongo.mod

import typings.migrateMongo.anon.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("migrate-mongo", "database")
@js.native
object database extends js.Object {
  
  def connect(): js.Promise[Client] = js.native
}
