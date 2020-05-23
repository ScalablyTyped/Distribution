package typings.parse.mod.global.Parse.Cloud

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadPreferenceOption extends js.Object

// Read preference describes how MongoDB driver route read operations to the members of a replica set.
@JSGlobal("Parse.Cloud.ReadPreferenceOption")
@js.native
object ReadPreferenceOption extends js.Object {
  @js.native
  sealed trait Nearest extends ReadPreferenceOption
  
  @js.native
  sealed trait Primary extends ReadPreferenceOption
  
  @js.native
  sealed trait PrimaryPreferred extends ReadPreferenceOption
  
  @js.native
  sealed trait Secondary extends ReadPreferenceOption
  
  @js.native
  sealed trait SecondaryPreferred extends ReadPreferenceOption
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ReadPreferenceOption with String] = js.native
  /* "NEAREST" */ @js.native
  object Nearest extends TopLevel[Nearest with String]
  
  /* "PRIMARY" */ @js.native
  object Primary extends TopLevel[Primary with String]
  
  /* "PRIMARY_PREFERRED" */ @js.native
  object PrimaryPreferred extends TopLevel[PrimaryPreferred with String]
  
  /* "SECONDARY" */ @js.native
  object Secondary extends TopLevel[Secondary with String]
  
  /* "SECONDARY_PREFERRED" */ @js.native
  object SecondaryPreferred extends TopLevel[SecondaryPreferred with String]
  
}

