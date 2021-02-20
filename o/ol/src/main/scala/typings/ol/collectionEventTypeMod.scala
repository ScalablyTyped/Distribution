package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectionEventTypeMod {
  
  @JSImport("ol/CollectionEventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CollectionEventType with String] = js.native
    
    /* "add" */ val ADD: typings.ol.collectionEventTypeMod.CollectionEventType.ADD with String = js.native
    
    /* "remove" */ val REMOVE: typings.ol.collectionEventTypeMod.CollectionEventType.REMOVE with String = js.native
  }
  
  @js.native
  sealed trait CollectionEventType extends StObject
  @JSImport("ol/CollectionEventType", "CollectionEventType")
  @js.native
  object CollectionEventType extends StObject {
    
    @js.native
    sealed trait ADD extends CollectionEventType
    
    @js.native
    sealed trait REMOVE extends CollectionEventType
  }
}
