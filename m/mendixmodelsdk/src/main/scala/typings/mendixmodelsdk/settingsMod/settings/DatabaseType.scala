package typings.mendixmodelsdk.settingsMod.settings

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/settings", "settings.DatabaseType")
@js.native
class DatabaseType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object DatabaseType {
  
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.DatabaseType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.DatabaseType.Db2")
  @js.native
  def Db2: DatabaseType = js.native
  @scala.inline
  def Db2_=(x: DatabaseType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Db2")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.DatabaseType.Hsqldb")
  @js.native
  def Hsqldb: DatabaseType = js.native
  @scala.inline
  def Hsqldb_=(x: DatabaseType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hsqldb")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.DatabaseType.MySql")
  @js.native
  def MySql: DatabaseType = js.native
  @scala.inline
  def MySql_=(x: DatabaseType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MySql")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.DatabaseType.Oracle")
  @js.native
  def Oracle: DatabaseType = js.native
  @scala.inline
  def Oracle_=(x: DatabaseType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Oracle")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.DatabaseType.PostgreSql")
  @js.native
  def PostgreSql: DatabaseType = js.native
  @scala.inline
  def PostgreSql_=(x: DatabaseType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PostgreSql")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.DatabaseType.SqlServer")
  @js.native
  def SqlServer: DatabaseType = js.native
  @scala.inline
  def SqlServer_=(x: DatabaseType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SqlServer")(x.asInstanceOf[js.Any])
}
