package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/ObjectEventType", JSImport.Namespace)
@js.native
object objectEventTypeMod extends js.Object {
  @js.native
  sealed trait ObjectEventType extends js.Object
  
  @js.native
  object ObjectEventType extends js.Object {
    @js.native
    sealed trait PROPERTYCHANGE extends ObjectEventType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "propertychange" */ val PROPERTYCHANGE: typings.ol.objectEventTypeMod.ObjectEventType.PROPERTYCHANGE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ObjectEventType with String] = js.native
  }
  
}

