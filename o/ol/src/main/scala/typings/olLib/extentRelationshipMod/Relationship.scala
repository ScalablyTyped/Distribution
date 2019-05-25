package typings
package olLib.extentRelationshipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Relationship extends js.Object

@JSImport("ol/extent/Relationship", "Relationship")
@js.native
object Relationship extends js.Object {
  @js.native
  sealed trait ABOVE
    extends olLib.extentRelationshipMod.Relationship
  
  @js.native
  sealed trait BELOW
    extends olLib.extentRelationshipMod.Relationship
  
  @js.native
  sealed trait INTERSECTING
    extends olLib.extentRelationshipMod.Relationship
  
  @js.native
  sealed trait LEFT
    extends olLib.extentRelationshipMod.Relationship
  
  @js.native
  sealed trait RIGHT
    extends olLib.extentRelationshipMod.Relationship
  
  @js.native
  sealed trait UNKNOWN
    extends olLib.extentRelationshipMod.Relationship
  
}

