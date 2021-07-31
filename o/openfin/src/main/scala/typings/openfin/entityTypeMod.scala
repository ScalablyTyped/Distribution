package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityTypeMod {
  
  @js.native
  sealed trait EntityType extends StObject
  @JSImport("openfin/_v2/shapes/EntityType", "EntityType")
  @js.native
  object EntityType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EntityType & String] = js.native
    
    @js.native
    sealed trait EXTERNAL
      extends StObject
         with EntityType
    /* "external connection" */ val EXTERNAL: typings.openfin.entityTypeMod.EntityType.EXTERNAL & String = js.native
    
    @js.native
    sealed trait IFRAME
      extends StObject
         with EntityType
    /* "iframe" */ val IFRAME: typings.openfin.entityTypeMod.EntityType.IFRAME & String = js.native
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with EntityType
    /* "unknown" */ val UNKNOWN: typings.openfin.entityTypeMod.EntityType.UNKNOWN & String = js.native
    
    @js.native
    sealed trait VIEW
      extends StObject
         with EntityType
    /* "view" */ val VIEW: typings.openfin.entityTypeMod.EntityType.VIEW & String = js.native
    
    @js.native
    sealed trait WINDOW
      extends StObject
         with EntityType
    /* "window" */ val WINDOW: typings.openfin.entityTypeMod.EntityType.WINDOW & String = js.native
  }
}
