package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/CollectionEventType", JSImport.Namespace)
@js.native
object collectionEventTypeMod extends js.Object {
  
  @js.native
  sealed trait CollectionEventType extends js.Object
  @js.native
  object CollectionEventType extends js.Object {
    
    @js.native
    sealed trait ADD extends CollectionEventType
    
    @js.native
    sealed trait REMOVE extends CollectionEventType
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CollectionEventType with String] = js.native
    
    /* "add" */ val ADD: typings.ol.collectionEventTypeMod.CollectionEventType.ADD with String = js.native
    
    /* "remove" */ val REMOVE: typings.ol.collectionEventTypeMod.CollectionEventType.REMOVE with String = js.native
  }
}
