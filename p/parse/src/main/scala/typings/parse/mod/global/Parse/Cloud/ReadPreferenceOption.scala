package typings.parse.mod.global.Parse.Cloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadPreferenceOption extends StObject
// Read preference describes how MongoDB driver route read operations to the members of a replica set.
@JSGlobal("Parse.Cloud.ReadPreferenceOption")
@js.native
object ReadPreferenceOption extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ReadPreferenceOption with String] = js.native
  
  @js.native
  sealed trait Nearest extends ReadPreferenceOption
  /* "NEAREST" */ val Nearest: typings.parse.mod.global.Parse.Cloud.ReadPreferenceOption.Nearest with String = js.native
  
  @js.native
  sealed trait Primary extends ReadPreferenceOption
  /* "PRIMARY" */ val Primary: typings.parse.mod.global.Parse.Cloud.ReadPreferenceOption.Primary with String = js.native
  
  @js.native
  sealed trait PrimaryPreferred extends ReadPreferenceOption
  /* "PRIMARY_PREFERRED" */ val PrimaryPreferred: typings.parse.mod.global.Parse.Cloud.ReadPreferenceOption.PrimaryPreferred with String = js.native
  
  @js.native
  sealed trait Secondary extends ReadPreferenceOption
  /* "SECONDARY" */ val Secondary: typings.parse.mod.global.Parse.Cloud.ReadPreferenceOption.Secondary with String = js.native
  
  @js.native
  sealed trait SecondaryPreferred extends ReadPreferenceOption
  /* "SECONDARY_PREFERRED" */ val SecondaryPreferred: typings.parse.mod.global.Parse.Cloud.ReadPreferenceOption.SecondaryPreferred with String = js.native
}
