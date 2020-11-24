package typings.parse.mod.global.Parse.Cloud

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadPreferenceOption extends js.Object
// Read preference describes how MongoDB driver route read operations to the members of a replica set.
@JSGlobal("Parse.Cloud.ReadPreferenceOption")
@js.native
object ReadPreferenceOption extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ReadPreferenceOption with String] = js.native
  
  @js.native
  sealed trait Nearest extends ReadPreferenceOption
  /* "NEAREST" */ @js.native
  object Nearest extends TopLevel[Nearest with String]
  
  @js.native
  sealed trait Primary extends ReadPreferenceOption
  /* "PRIMARY" */ @js.native
  object Primary extends TopLevel[Primary with String]
  
  @js.native
  sealed trait PrimaryPreferred extends ReadPreferenceOption
  /* "PRIMARY_PREFERRED" */ @js.native
  object PrimaryPreferred extends TopLevel[PrimaryPreferred with String]
  
  @js.native
  sealed trait Secondary extends ReadPreferenceOption
  /* "SECONDARY" */ @js.native
  object Secondary extends TopLevel[Secondary with String]
  
  @js.native
  sealed trait SecondaryPreferred extends ReadPreferenceOption
  /* "SECONDARY_PREFERRED" */ @js.native
  object SecondaryPreferred extends TopLevel[SecondaryPreferred with String]
}
