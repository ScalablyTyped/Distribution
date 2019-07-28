package typings.ol.extentRelationshipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Relationship extends js.Object

@JSImport("ol/extent/Relationship", "Relationship")
@js.native
object Relationship extends js.Object {
  @js.native
  sealed trait ABOVE extends Relationship
  
  @js.native
  sealed trait BELOW extends Relationship
  
  @js.native
  sealed trait INTERSECTING extends Relationship
  
  @js.native
  sealed trait LEFT extends Relationship
  
  @js.native
  sealed trait RIGHT extends Relationship
  
  @js.native
  sealed trait UNKNOWN extends Relationship
  
}

