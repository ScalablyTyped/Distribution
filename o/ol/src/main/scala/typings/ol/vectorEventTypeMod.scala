package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorEventTypeMod {
  
  @JSImport("ol/source/VectorEventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VectorEventType & String] = js.native
    
    /* "addfeature" */ val ADDFEATURE: typings.ol.vectorEventTypeMod.VectorEventType.ADDFEATURE & String = js.native
    
    /* "changefeature" */ val CHANGEFEATURE: typings.ol.vectorEventTypeMod.VectorEventType.CHANGEFEATURE & String = js.native
    
    /* "clear" */ val CLEAR: typings.ol.vectorEventTypeMod.VectorEventType.CLEAR & String = js.native
    
    /* "featuresloadend" */ val FEATURESLOADEND: typings.ol.vectorEventTypeMod.VectorEventType.FEATURESLOADEND & String = js.native
    
    /* "featuresloaderror" */ val FEATURESLOADERROR: typings.ol.vectorEventTypeMod.VectorEventType.FEATURESLOADERROR & String = js.native
    
    /* "featuresloadstart" */ val FEATURESLOADSTART: typings.ol.vectorEventTypeMod.VectorEventType.FEATURESLOADSTART & String = js.native
    
    /* "removefeature" */ val REMOVEFEATURE: typings.ol.vectorEventTypeMod.VectorEventType.REMOVEFEATURE & String = js.native
  }
  
  @js.native
  sealed trait VectorEventType extends StObject
  @JSImport("ol/source/VectorEventType", "VectorEventType")
  @js.native
  object VectorEventType extends StObject {
    
    @js.native
    sealed trait ADDFEATURE
      extends StObject
         with VectorEventType
    
    @js.native
    sealed trait CHANGEFEATURE
      extends StObject
         with VectorEventType
    
    @js.native
    sealed trait CLEAR
      extends StObject
         with VectorEventType
    
    @js.native
    sealed trait FEATURESLOADEND
      extends StObject
         with VectorEventType
    
    @js.native
    sealed trait FEATURESLOADERROR
      extends StObject
         with VectorEventType
    
    @js.native
    sealed trait FEATURESLOADSTART
      extends StObject
         with VectorEventType
    
    @js.native
    sealed trait REMOVEFEATURE
      extends StObject
         with VectorEventType
  }
}
