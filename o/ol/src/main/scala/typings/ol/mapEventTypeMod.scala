package typings.ol

import typings.ol.mapEventTypeMod.MapEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/MapEventType", JSImport.Namespace)
@js.native
object mapEventTypeMod extends js.Object {
  @js.native
  sealed trait MapEventType extends js.Object
  
  @js.native
  object MapEventType extends js.Object {
    @js.native
    sealed trait MOVEEND extends MapEventType
    
    @js.native
    sealed trait MOVESTART extends MapEventType
    
    @js.native
    sealed trait POSTRENDER extends MapEventType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "moveend" */ val MOVEEND: typings.ol.mapEventTypeMod.MapEventType.MOVEEND with String = js.native
    /* "movestart" */ val MOVESTART: typings.ol.mapEventTypeMod.MapEventType.MOVESTART with String = js.native
    /* "postrender" */ val POSTRENDER: typings.ol.mapEventTypeMod.MapEventType.POSTRENDER with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MapEventType with String] = js.native
  }
  
}

