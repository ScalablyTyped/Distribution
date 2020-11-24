package typings.nodePgMigrate.migrationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilenameFormat extends js.Object
@JSImport("node-pg-migrate/dist/migration", "FilenameFormat")
@js.native
object FilenameFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilenameFormat with String] = js.native
  
  @js.native
  sealed trait timestamp extends FilenameFormat
  /* "timestamp" */ @js.native
  object timestamp extends TopLevel[timestamp with String]
  
  @js.native
  sealed trait utc extends FilenameFormat
  /* "utc" */ @js.native
  object utc extends TopLevel[utc with String]
}
