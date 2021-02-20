package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorEventTypeMod {
  
  @JSImport("ol/source/VectorEventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VectorEventType with String] = js.native
    
    /* "addfeature" */ val ADDFEATURE: typings.ol.vectorEventTypeMod.VectorEventType.ADDFEATURE with String = js.native
    
    /* "changefeature" */ val CHANGEFEATURE: typings.ol.vectorEventTypeMod.VectorEventType.CHANGEFEATURE with String = js.native
    
    /* "clear" */ val CLEAR: typings.ol.vectorEventTypeMod.VectorEventType.CLEAR with String = js.native
    
    /* "removefeature" */ val REMOVEFEATURE: typings.ol.vectorEventTypeMod.VectorEventType.REMOVEFEATURE with String = js.native
  }
  
  @js.native
  sealed trait VectorEventType extends StObject
  @JSImport("ol/source/VectorEventType", "VectorEventType")
  @js.native
  object VectorEventType extends StObject {
    
    @js.native
    sealed trait ADDFEATURE extends VectorEventType
    
    @js.native
    sealed trait CHANGEFEATURE extends VectorEventType
    
    @js.native
    sealed trait CLEAR extends VectorEventType
    
    @js.native
    sealed trait REMOVEFEATURE extends VectorEventType
  }
}
