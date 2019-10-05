package typings.ol

import typings.ol.imageStateMod.ImageState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/ImageState", JSImport.Namespace)
@js.native
object imageStateMod extends js.Object {
  @js.native
  sealed trait ImageState extends js.Object
  
  @js.native
  object ImageState extends js.Object {
    @js.native
    sealed trait ERROR extends ImageState
    
    @js.native
    sealed trait IDLE extends ImageState
    
    @js.native
    sealed trait LOADED extends ImageState
    
    @js.native
    sealed trait LOADING extends ImageState
    
  }
  
  @js.native
  object default extends js.Object {
    /* 3 */ val ERROR: typings.ol.imageStateMod.ImageState.ERROR with Double = js.native
    /* 0 */ val IDLE: typings.ol.imageStateMod.ImageState.IDLE with Double = js.native
    /* 2 */ val LOADED: typings.ol.imageStateMod.ImageState.LOADED with Double = js.native
    /* 1 */ val LOADING: typings.ol.imageStateMod.ImageState.LOADING with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ImageState with Double] = js.native
  }
  
}

