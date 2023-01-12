package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiPreviewServiceTypesMod {
  
  trait IFramePositionInSprite extends StObject {
    
    var horz: Double
    
    var vert: Double
  }
  object IFramePositionInSprite {
    
    inline def apply(horz: Double, vert: Double): IFramePositionInSprite = {
      val __obj = js.Dynamic.literal(horz = horz.asInstanceOf[js.Any], vert = vert.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFramePositionInSprite]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFramePositionInSprite] (val x: Self) extends AnyVal {
      
      inline def setHorz(value: Double): Self = StObject.set(x, "horz", value.asInstanceOf[js.Any])
      
      inline def setVert(value: Double): Self = StObject.set(x, "vert", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFrameSize extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object IFrameSize {
    
    inline def apply(height: Double, width: Double): IFrameSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFrameSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFrameSize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFramesData extends StObject {
    
    var framesCount: Double
    
    var qualities: js.Array[IFramesQuality]
  }
  object IFramesData {
    
    inline def apply(framesCount: Double, qualities: js.Array[IFramesQuality]): IFramesData = {
      val __obj = js.Dynamic.literal(framesCount = framesCount.asInstanceOf[js.Any], qualities = qualities.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFramesData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFramesData] (val x: Self) extends AnyVal {
      
      inline def setFramesCount(value: Double): Self = StObject.set(x, "framesCount", value.asInstanceOf[js.Any])
      
      inline def setQualities(value: js.Array[IFramesQuality]): Self = StObject.set(x, "qualities", value.asInstanceOf[js.Any])
      
      inline def setQualitiesVarargs(value: IFramesQuality*): Self = StObject.set(x, "qualities", js.Array(value*))
    }
  }
  
  trait IFramesQuality extends StObject {
    
    var frameSize: IFrameSize
    
    var framesInSprite: IMaxFramesInSprite
    
    var spriteUrlMask: String
  }
  object IFramesQuality {
    
    inline def apply(frameSize: IFrameSize, framesInSprite: IMaxFramesInSprite, spriteUrlMask: String): IFramesQuality = {
      val __obj = js.Dynamic.literal(frameSize = frameSize.asInstanceOf[js.Any], framesInSprite = framesInSprite.asInstanceOf[js.Any], spriteUrlMask = spriteUrlMask.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFramesQuality]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFramesQuality] (val x: Self) extends AnyVal {
      
      inline def setFrameSize(value: IFrameSize): Self = StObject.set(x, "frameSize", value.asInstanceOf[js.Any])
      
      inline def setFramesInSprite(value: IMaxFramesInSprite): Self = StObject.set(x, "framesInSprite", value.asInstanceOf[js.Any])
      
      inline def setSpriteUrlMask(value: String): Self = StObject.set(x, "spriteUrlMask", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMaxFramesInSprite extends StObject {
    
    var horz: Double
    
    var vert: Double
  }
  object IMaxFramesInSprite {
    
    inline def apply(horz: Double, vert: Double): IMaxFramesInSprite = {
      val __obj = js.Dynamic.literal(horz = horz.asInstanceOf[js.Any], vert = vert.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMaxFramesInSprite]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMaxFramesInSprite] (val x: Self) extends AnyVal {
      
      inline def setHorz(value: Double): Self = StObject.set(x, "horz", value.asInstanceOf[js.Any])
      
      inline def setVert(value: Double): Self = StObject.set(x, "vert", value.asInstanceOf[js.Any])
    }
  }
  
  trait INormalizedFramesQuality extends StObject {
    
    var framePositionInSprite: IFramePositionInSprite
    
    var frameSize: IFrameSize
    
    var framesInSprite: ITotalFramesInSprite
    
    var spriteUrl: String
  }
  object INormalizedFramesQuality {
    
    inline def apply(
      framePositionInSprite: IFramePositionInSprite,
      frameSize: IFrameSize,
      framesInSprite: ITotalFramesInSprite,
      spriteUrl: String
    ): INormalizedFramesQuality = {
      val __obj = js.Dynamic.literal(framePositionInSprite = framePositionInSprite.asInstanceOf[js.Any], frameSize = frameSize.asInstanceOf[js.Any], framesInSprite = framesInSprite.asInstanceOf[js.Any], spriteUrl = spriteUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[INormalizedFramesQuality]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INormalizedFramesQuality] (val x: Self) extends AnyVal {
      
      inline def setFramePositionInSprite(value: IFramePositionInSprite): Self = StObject.set(x, "framePositionInSprite", value.asInstanceOf[js.Any])
      
      inline def setFrameSize(value: IFrameSize): Self = StObject.set(x, "frameSize", value.asInstanceOf[js.Any])
      
      inline def setFramesInSprite(value: ITotalFramesInSprite): Self = StObject.set(x, "framesInSprite", value.asInstanceOf[js.Any])
      
      inline def setSpriteUrl(value: String): Self = StObject.set(x, "spriteUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPreviewAPI extends StObject {
    
    var setFramesMap: js.UndefOr[js.Function1[/* map */ IFramesData, Unit]] = js.undefined
  }
  object IPreviewAPI {
    
    inline def apply(): IPreviewAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPreviewAPI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPreviewAPI] (val x: Self) extends AnyVal {
      
      inline def setSetFramesMap(value: /* map */ IFramesData => Unit): Self = StObject.set(x, "setFramesMap", js.Any.fromFunction1(value))
      
      inline def setSetFramesMapUndefined: Self = StObject.set(x, "setFramesMap", js.undefined)
    }
  }
  
  trait IPreviewService extends StObject {
    
    def destroy(): Unit
    
    def getAt(second: Double): js.Array[INormalizedFramesQuality]
    
    def setFramesMap(map: IFramesData): Unit
  }
  object IPreviewService {
    
    inline def apply(
      destroy: () => Unit,
      getAt: Double => js.Array[INormalizedFramesQuality],
      setFramesMap: IFramesData => Unit
    ): IPreviewService = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getAt = js.Any.fromFunction1(getAt), setFramesMap = js.Any.fromFunction1(setFramesMap))
      __obj.asInstanceOf[IPreviewService]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPreviewService] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetAt(value: Double => js.Array[INormalizedFramesQuality]): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setSetFramesMap(value: IFramesData => Unit): Self = StObject.set(x, "setFramesMap", js.Any.fromFunction1(value))
    }
  }
  
  trait ITotalFramesInSprite extends StObject {
    
    var horz: Double
    
    var vert: Double
  }
  object ITotalFramesInSprite {
    
    inline def apply(horz: Double, vert: Double): ITotalFramesInSprite = {
      val __obj = js.Dynamic.literal(horz = horz.asInstanceOf[js.Any], vert = vert.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITotalFramesInSprite]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITotalFramesInSprite] (val x: Self) extends AnyVal {
      
      inline def setHorz(value: Double): Self = StObject.set(x, "horz", value.asInstanceOf[js.Any])
      
      inline def setVert(value: Double): Self = StObject.set(x, "vert", value.asInstanceOf[js.Any])
    }
  }
}
