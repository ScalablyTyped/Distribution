package typings.ol

import typings.ol.extentRelationshipMod.Relationship
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/extent/Relationship", JSImport.Namespace)
@js.native
object extentRelationshipMod extends js.Object {
  @js.native
  sealed trait Relationship extends js.Object
  
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
  
  @js.native
  object default extends js.Object {
    /* 2 */ val ABOVE: typings.ol.extentRelationshipMod.Relationship.ABOVE with Double = js.native
    /* 8 */ val BELOW: typings.ol.extentRelationshipMod.Relationship.BELOW with Double = js.native
    /* 1 */ val INTERSECTING: typings.ol.extentRelationshipMod.Relationship.INTERSECTING with Double = js.native
    /* 16 */ val LEFT: typings.ol.extentRelationshipMod.Relationship.LEFT with Double = js.native
    /* 4 */ val RIGHT: typings.ol.extentRelationshipMod.Relationship.RIGHT with Double = js.native
    /* 0 */ val UNKNOWN: typings.ol.extentRelationshipMod.Relationship.UNKNOWN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Relationship with Double] = js.native
  }
  
}

