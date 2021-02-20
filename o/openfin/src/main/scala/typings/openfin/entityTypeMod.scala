package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityTypeMod {
  
  @js.native
  sealed trait EntityType extends StObject
  @JSImport("openfin/_v2/shapes/EntityType", "EntityType")
  @js.native
  object EntityType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EntityType with String] = js.native
    
    @js.native
    sealed trait EXTERNAL extends EntityType
    /* "external connection" */ val EXTERNAL: typings.openfin.entityTypeMod.EntityType.EXTERNAL with String = js.native
    
    @js.native
    sealed trait IFRAME extends EntityType
    /* "iframe" */ val IFRAME: typings.openfin.entityTypeMod.EntityType.IFRAME with String = js.native
    
    @js.native
    sealed trait UNKNOWN extends EntityType
    /* "unknown" */ val UNKNOWN: typings.openfin.entityTypeMod.EntityType.UNKNOWN with String = js.native
    
    @js.native
    sealed trait VIEW extends EntityType
    /* "view" */ val VIEW: typings.openfin.entityTypeMod.EntityType.VIEW with String = js.native
    
    @js.native
    sealed trait WINDOW extends EntityType
    /* "window" */ val WINDOW: typings.openfin.entityTypeMod.EntityType.WINDOW with String = js.native
  }
}
