package typings.pixiMixinCacheAsBitmap

import typings.pixiCore.mod.AbstractRenderer
import typings.pixiCore.mod.MaskData
import typings.pixiCore.mod.Renderer
import typings.pixiDisplay.anon.DisplayObject
import typings.pixiDisplay.mod.Container
import typings.pixiDisplay.mod.IDestroyOptions
import typings.pixiMath.mod.IPointData
import typings.pixiMath.mod.Rectangle
import typings.pixiSprite.mod.Sprite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/mixin-cache-as-bitmap", "CacheData")
  @js.native
  open class CacheData () extends StObject {
    
    def originalCalculateBounds(): Unit = js.native
    
    def originalContainsPoint(point: IPointData): Boolean = js.native
    
    def originalDestroy(): Unit = js.native
    def originalDestroy(options: Boolean): Unit = js.native
    def originalDestroy(options: IDestroyOptions): Unit = js.native
    
    var originalFilterArea: Rectangle = js.native
    
    def originalGetLocalBounds(): Rectangle = js.native
    def originalGetLocalBounds(rect: Rectangle): Rectangle = js.native
    
    var originalMask: Container[DisplayObject] | MaskData = js.native
    
    def originalRender(renderer: Renderer): Unit = js.native
    
    def originalRenderCanvas(renderer: AbstractRenderer): Unit = js.native
    
    def originalUpdateTransform(): Unit = js.native
    
    var sprite: Sprite = js.native
    
    var textureCacheId: String = js.native
  }
}
