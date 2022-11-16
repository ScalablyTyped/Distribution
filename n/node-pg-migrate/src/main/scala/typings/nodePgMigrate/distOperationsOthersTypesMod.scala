package typings.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typings.nodePgMigrate.distOperationsGeneralTypesMod.Name
import typings.nodePgMigrate.distOperationsGeneralTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsOthersTypesMod {
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Sql = (sqlStr : string, args : {[key: string] : node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Name | node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value} | undefined): string | std.Array<string>
  }}}
  to avoid circular code involving: 
  - node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value
  - node-pg-migrate.node-pg-migrate/dist/operations/othersTypes.Sql
  */
  @js.native
  trait Sql extends StObject {
    
    def apply(sqlStr: String): String | js.Array[String] = js.native
    def apply(sqlStr: String, args: StringDictionary[Name | Value]): String | js.Array[String] = js.native
  }
}
