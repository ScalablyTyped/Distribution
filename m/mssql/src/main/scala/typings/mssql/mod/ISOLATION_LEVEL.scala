package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ISOLATION_LEVEL {
  
  @JSImport("mssql", "ISOLATION_LEVEL")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mssql", "ISOLATION_LEVEL.READ_COMMITTED")
  @js.native
  def READ_COMMITTED: IIsolationLevel = js.native
  @scala.inline
  def READ_COMMITTED_=(x: IIsolationLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("READ_COMMITTED")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "ISOLATION_LEVEL.READ_UNCOMMITTED")
  @js.native
  def READ_UNCOMMITTED: IIsolationLevel = js.native
  @scala.inline
  def READ_UNCOMMITTED_=(x: IIsolationLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("READ_UNCOMMITTED")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "ISOLATION_LEVEL.REPEATABLE_READ")
  @js.native
  def REPEATABLE_READ: IIsolationLevel = js.native
  @scala.inline
  def REPEATABLE_READ_=(x: IIsolationLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REPEATABLE_READ")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "ISOLATION_LEVEL.SERIALIZABLE")
  @js.native
  def SERIALIZABLE: IIsolationLevel = js.native
  @scala.inline
  def SERIALIZABLE_=(x: IIsolationLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SERIALIZABLE")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "ISOLATION_LEVEL.SNAPSHOT")
  @js.native
  def SNAPSHOT: IIsolationLevel = js.native
  @scala.inline
  def SNAPSHOT_=(x: IIsolationLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SNAPSHOT")(x.asInstanceOf[js.Any])
}
