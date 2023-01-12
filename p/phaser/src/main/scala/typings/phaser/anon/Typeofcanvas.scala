package typings.phaser.anon

import org.scalablytyped.runtime.Instantiable1
import typings.phaser.spine.canvas.AssetManager
import typings.phaser.spine.canvas.CanvasTexture
import typings.phaser.spine.canvas.SkeletonRenderer
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofcanvas extends StObject {
  
  var AssetManager: Instantiable1[/* pathPrefix */ js.UndefOr[String], typings.phaser.spine.canvas.AssetManager]
  
  var CanvasTexture: Instantiable1[/* image */ HTMLImageElement, typings.phaser.spine.canvas.CanvasTexture]
  
  var SkeletonRenderer: Instantiable1[
    /* context */ CanvasRenderingContext2D, 
    typings.phaser.spine.canvas.SkeletonRenderer
  ]
}
object Typeofcanvas {
  
  inline def apply(
    AssetManager: Instantiable1[/* pathPrefix */ js.UndefOr[String], AssetManager],
    CanvasTexture: Instantiable1[/* image */ HTMLImageElement, CanvasTexture],
    SkeletonRenderer: Instantiable1[/* context */ CanvasRenderingContext2D, SkeletonRenderer]
  ): Typeofcanvas = {
    val __obj = js.Dynamic.literal(AssetManager = AssetManager.asInstanceOf[js.Any], CanvasTexture = CanvasTexture.asInstanceOf[js.Any], SkeletonRenderer = SkeletonRenderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcanvas]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofcanvas] (val x: Self) extends AnyVal {
    
    inline def setAssetManager(value: Instantiable1[/* pathPrefix */ js.UndefOr[String], AssetManager]): Self = StObject.set(x, "AssetManager", value.asInstanceOf[js.Any])
    
    inline def setCanvasTexture(value: Instantiable1[/* image */ HTMLImageElement, CanvasTexture]): Self = StObject.set(x, "CanvasTexture", value.asInstanceOf[js.Any])
    
    inline def setSkeletonRenderer(value: Instantiable1[/* context */ CanvasRenderingContext2D, SkeletonRenderer]): Self = StObject.set(x, "SkeletonRenderer", value.asInstanceOf[js.Any])
  }
}
