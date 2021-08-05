package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.othersTypesMod.Sql
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object otherMod {
  
  @JSImport("node-pg-migrate/dist/operations/other", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sql(mOptions: MigrationOptions): Sql = ^.asInstanceOf[js.Dynamic].applyDynamic("sql")(mOptions.asInstanceOf[js.Any]).asInstanceOf[Sql]
}
