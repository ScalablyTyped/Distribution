package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageStateMod {
  
  @JSImport("ol/ImageState", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ImageState with Double] = js.native
    
    /* 4 */ val EMPTY: typings.ol.imageStateMod.ImageState.EMPTY with Double = js.native
    
    /* 3 */ val ERROR: typings.ol.imageStateMod.ImageState.ERROR with Double = js.native
    
    /* 0 */ val IDLE: typings.ol.imageStateMod.ImageState.IDLE with Double = js.native
    
    /* 2 */ val LOADED: typings.ol.imageStateMod.ImageState.LOADED with Double = js.native
    
    /* 1 */ val LOADING: typings.ol.imageStateMod.ImageState.LOADING with Double = js.native
  }
  
  @js.native
  sealed trait ImageState extends StObject
  @JSImport("ol/ImageState", "ImageState")
  @js.native
  object ImageState extends StObject {
    
    @js.native
    sealed trait EMPTY extends ImageState
    
    @js.native
    sealed trait ERROR extends ImageState
    
    @js.native
    sealed trait IDLE extends ImageState
    
    @js.native
    sealed trait LOADED extends ImageState
    
    @js.native
    sealed trait LOADING extends ImageState
  }
}
