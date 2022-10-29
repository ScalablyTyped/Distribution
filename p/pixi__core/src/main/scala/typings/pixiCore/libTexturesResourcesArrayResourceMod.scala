package typings.pixiCore

import typings.pixiCore.libTexturesResourcesAbstractMultiResourceMod.AbstractMultiResource
import typings.pixiMath.mod.ISize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTexturesResourcesArrayResourceMod {
  
  @JSImport("@pixi/core/lib/textures/resources/ArrayResource", "ArrayResource")
  @js.native
  open class ArrayResource protected () extends AbstractMultiResource {
    def this(source: js.Array[Any]) = this()
    /**
      * @param source - Number of items in array or the collection
      *        of image URLs to use. Can also be resources, image elements, canvas, etc.
      * @param options - Options to apply to {@link PIXI.autoDetectResource}
      * @param {number} [options.width] - Width of the resource
      * @param {number} [options.height] - Height of the resource
      */
    def this(source: Double) = this()
    def this(source: js.Array[Any], options: ISize) = this()
    def this(source: Double, options: ISize) = this()
  }
}
