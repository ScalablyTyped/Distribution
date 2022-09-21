package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISlot extends StObject {
  
  var blendMode: Double
  
  var bone: IBone
  
  var clippingContainer: js.UndefOr[Any] = js.undefined
  
  var color: Color
  
  var currentGraphics: js.UndefOr[Any] = js.undefined
  
  var currentMesh: js.UndefOr[Any] = js.undefined
  
  var currentMeshId: js.UndefOr[Double] = js.undefined
  
  var currentMeshName: js.UndefOr[String] = js.undefined
  
  var currentSprite: js.UndefOr[Any] = js.undefined
  
  var currentSpriteName: js.UndefOr[String] = js.undefined
  
  var darkColor: Color
  
  var data: ISlotData
  
  def getAttachment(): IAttachment
  
  var hackAttachment: js.UndefOr[IAttachment] = js.undefined
  
  var hackRegion: js.UndefOr[TextureRegion] = js.undefined
  
  var meshes: js.UndefOr[Any] = js.undefined
  
  var sprites: js.UndefOr[Any] = js.undefined
}
object ISlot {
  
  inline def apply(
    blendMode: Double,
    bone: IBone,
    color: Color,
    darkColor: Color,
    data: ISlotData,
    getAttachment: () => IAttachment
  ): ISlot = {
    val __obj = js.Dynamic.literal(blendMode = blendMode.asInstanceOf[js.Any], bone = bone.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], darkColor = darkColor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getAttachment = js.Any.fromFunction0(getAttachment))
    __obj.asInstanceOf[ISlot]
  }
  
  extension [Self <: ISlot](x: Self) {
    
    inline def setBlendMode(value: Double): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setBone(value: IBone): Self = StObject.set(x, "bone", value.asInstanceOf[js.Any])
    
    inline def setClippingContainer(value: Any): Self = StObject.set(x, "clippingContainer", value.asInstanceOf[js.Any])
    
    inline def setClippingContainerUndefined: Self = StObject.set(x, "clippingContainer", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setCurrentGraphics(value: Any): Self = StObject.set(x, "currentGraphics", value.asInstanceOf[js.Any])
    
    inline def setCurrentGraphicsUndefined: Self = StObject.set(x, "currentGraphics", js.undefined)
    
    inline def setCurrentMesh(value: Any): Self = StObject.set(x, "currentMesh", value.asInstanceOf[js.Any])
    
    inline def setCurrentMeshId(value: Double): Self = StObject.set(x, "currentMeshId", value.asInstanceOf[js.Any])
    
    inline def setCurrentMeshIdUndefined: Self = StObject.set(x, "currentMeshId", js.undefined)
    
    inline def setCurrentMeshName(value: String): Self = StObject.set(x, "currentMeshName", value.asInstanceOf[js.Any])
    
    inline def setCurrentMeshNameUndefined: Self = StObject.set(x, "currentMeshName", js.undefined)
    
    inline def setCurrentMeshUndefined: Self = StObject.set(x, "currentMesh", js.undefined)
    
    inline def setCurrentSprite(value: Any): Self = StObject.set(x, "currentSprite", value.asInstanceOf[js.Any])
    
    inline def setCurrentSpriteName(value: String): Self = StObject.set(x, "currentSpriteName", value.asInstanceOf[js.Any])
    
    inline def setCurrentSpriteNameUndefined: Self = StObject.set(x, "currentSpriteName", js.undefined)
    
    inline def setCurrentSpriteUndefined: Self = StObject.set(x, "currentSprite", js.undefined)
    
    inline def setDarkColor(value: Color): Self = StObject.set(x, "darkColor", value.asInstanceOf[js.Any])
    
    inline def setData(value: ISlotData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGetAttachment(value: () => IAttachment): Self = StObject.set(x, "getAttachment", js.Any.fromFunction0(value))
    
    inline def setHackAttachment(value: IAttachment): Self = StObject.set(x, "hackAttachment", value.asInstanceOf[js.Any])
    
    inline def setHackAttachmentUndefined: Self = StObject.set(x, "hackAttachment", js.undefined)
    
    inline def setHackRegion(value: TextureRegion): Self = StObject.set(x, "hackRegion", value.asInstanceOf[js.Any])
    
    inline def setHackRegionUndefined: Self = StObject.set(x, "hackRegion", js.undefined)
    
    inline def setMeshes(value: Any): Self = StObject.set(x, "meshes", value.asInstanceOf[js.Any])
    
    inline def setMeshesUndefined: Self = StObject.set(x, "meshes", js.undefined)
    
    inline def setSprites(value: Any): Self = StObject.set(x, "sprites", value.asInstanceOf[js.Any])
    
    inline def setSpritesUndefined: Self = StObject.set(x, "sprites", js.undefined)
  }
}
