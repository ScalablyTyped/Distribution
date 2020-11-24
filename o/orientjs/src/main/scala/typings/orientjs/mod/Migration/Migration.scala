package typings.orientjs.mod.Migration

import typings.orientjs.mod.ODB
import typings.orientjs.mod.OServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", "Migration.Migration")
@js.native
class Migration () extends js.Object {
  
  var db: ODB = js.native
  
  def down(): js.Promise[_] = js.native
  
  var name: String = js.native
  
  var server: OServer = js.native
  
  def up(): js.Promise[_] = js.native
}
