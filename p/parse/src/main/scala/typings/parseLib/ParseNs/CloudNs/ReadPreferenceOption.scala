package typings
package parseLib.ParseNs.CloudNs

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
  sealed trait Nearest
    extends parseLib.ParseNs.CloudNs.ReadPreferenceOption
  
  @js.native
  sealed trait Primary
    extends parseLib.ParseNs.CloudNs.ReadPreferenceOption
  
  @js.native
  sealed trait PrimaryPreferred
    extends parseLib.ParseNs.CloudNs.ReadPreferenceOption
  
  @js.native
  sealed trait Secondary
    extends parseLib.ParseNs.CloudNs.ReadPreferenceOption
  
  @js.native
  sealed trait SecondaryPreferred
    extends parseLib.ParseNs.CloudNs.ReadPreferenceOption
  
  /* "NEAREST" */ val Nearest: Nearest with java.lang.String = js.native
  /* "PRIMARY" */ val Primary: Primary with java.lang.String = js.native
  /* "PRIMARY_PREFERRED" */ val PrimaryPreferred: PrimaryPreferred with java.lang.String = js.native
  /* "SECONDARY" */ val Secondary: Secondary with java.lang.String = js.native
  /* "SECONDARY_PREFERRED" */ val SecondaryPreferred: SecondaryPreferred with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[parseLib.ParseNs.CloudNs.ReadPreferenceOption with java.lang.String] = js.native
}

