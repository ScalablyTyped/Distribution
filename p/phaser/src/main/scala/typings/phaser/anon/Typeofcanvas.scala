package typings.phaser.anon

import org.scalablytyped.runtime.Instantiable1
import typings.phaser.spine.canvas.AssetManager
import typings.phaser.spine.canvas.CanvasTexture
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcanvas extends js.Object {
  
  var AssetManager: Instantiable1[/* pathPrefix */ js.UndefOr[String], typings.phaser.spine.canvas.AssetManager] = js.native
  
  var CanvasTexture: Instantiable1[/* image */ HTMLImageElement, typings.phaser.spine.canvas.CanvasTexture] = js.native
  
  var SkeletonRenderer: TypeofSkeletonRenderer = js.native
}
object Typeofcanvas {
  
  @scala.inline
  def apply(
    AssetManager: Instantiable1[/* pathPrefix */ js.UndefOr[String], AssetManager],
    CanvasTexture: Instantiable1[/* image */ HTMLImageElement, CanvasTexture],
    SkeletonRenderer: TypeofSkeletonRenderer
  ): Typeofcanvas = {
    val __obj = js.Dynamic.literal(AssetManager = AssetManager.asInstanceOf[js.Any], CanvasTexture = CanvasTexture.asInstanceOf[js.Any], SkeletonRenderer = SkeletonRenderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcanvas]
  }
  
  @scala.inline
  implicit class TypeofcanvasOps[Self <: Typeofcanvas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssetManager(value: Instantiable1[/* pathPrefix */ js.UndefOr[String], AssetManager]): Self = this.set("AssetManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasTexture(value: Instantiable1[/* image */ HTMLImageElement, CanvasTexture]): Self = this.set("CanvasTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkeletonRenderer(value: TypeofSkeletonRenderer): Self = this.set("SkeletonRenderer", value.asInstanceOf[js.Any])
  }
}
