package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extentRelationshipMod {
  
  @JSImport("ol/extent/Relationship", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Relationship & Double] = js.native
    
    /* 2 */ val ABOVE: typings.ol.extentRelationshipMod.Relationship.ABOVE & Double = js.native
    
    /* 8 */ val BELOW: typings.ol.extentRelationshipMod.Relationship.BELOW & Double = js.native
    
    /* 1 */ val INTERSECTING: typings.ol.extentRelationshipMod.Relationship.INTERSECTING & Double = js.native
    
    /* 16 */ val LEFT: typings.ol.extentRelationshipMod.Relationship.LEFT & Double = js.native
    
    /* 4 */ val RIGHT: typings.ol.extentRelationshipMod.Relationship.RIGHT & Double = js.native
    
    /* 0 */ val UNKNOWN: typings.ol.extentRelationshipMod.Relationship.UNKNOWN & Double = js.native
  }
  
  @js.native
  sealed trait Relationship extends StObject
  @JSImport("ol/extent/Relationship", "Relationship")
  @js.native
  object Relationship extends StObject {
    
    @js.native
    sealed trait ABOVE
      extends StObject
         with Relationship
    
    @js.native
    sealed trait BELOW
      extends StObject
         with Relationship
    
    @js.native
    sealed trait INTERSECTING
      extends StObject
         with Relationship
    
    @js.native
    sealed trait LEFT
      extends StObject
         with Relationship
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with Relationship
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with Relationship
  }
}
