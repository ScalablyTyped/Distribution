package typings.openfin

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/shapes/EntityType", JSImport.Namespace)
@js.native
object entityTypeMod extends js.Object {
  @js.native
  sealed trait EntityType extends js.Object
  
  @js.native
  object EntityType extends js.Object {
    @js.native
    sealed trait EXTERNAL extends EntityType
    
    @js.native
    sealed trait IFRAME extends EntityType
    
    @js.native
    sealed trait UNKNOWN extends EntityType
    
    @js.native
    sealed trait VIEW extends EntityType
    
    @js.native
    sealed trait WINDOW extends EntityType
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EntityType with String] = js.native
    /* "external connection" */ @js.native
    object EXTERNAL extends TopLevel[EXTERNAL with String]
    
    /* "iframe" */ @js.native
    object IFRAME extends TopLevel[IFRAME with String]
    
    /* "unknown" */ @js.native
    object UNKNOWN extends TopLevel[UNKNOWN with String]
    
    /* "view" */ @js.native
    object VIEW extends TopLevel[VIEW with String]
    
    /* "window" */ @js.native
    object WINDOW extends TopLevel[WINDOW with String]
    
  }
  
}

