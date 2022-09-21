package typings.nodePgMigrate.distTypesMod

import typings.pg.mod.ClientBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunnerOptionClient extends StObject {
  
  /**
    * Instance of [new pg.Client](https://node-postgres.com/api/client).
    *
    * Instance should be connected to DB and after finishing migration, user is responsible to close connection.
    */
  var dbClient: ClientBase
}
object RunnerOptionClient {
  
  inline def apply(dbClient: ClientBase): RunnerOptionClient = {
    val __obj = js.Dynamic.literal(dbClient = dbClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnerOptionClient]
  }
  
  extension [Self <: RunnerOptionClient](x: Self) {
    
    inline def setDbClient(value: ClientBase): Self = StObject.set(x, "dbClient", value.asInstanceOf[js.Any])
  }
}
