package typings.pixiCore.mod

import typings.pixiConstants.mod.MSAA_QUALITY
import typings.pixiMath.mod.Matrix
import typings.pixiMath.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "FilterState")
@js.native
open class FilterState () extends StObject {
  
  /** Original render-target destination frame. */
  var bindingDestinationFrame: Rectangle = js.native
  
  /** Original render-target source frame. */
  var bindingSourceFrame: Rectangle = js.native
  
  /** Clears the state */
  def clear(): Unit = js.native
  
  /** Destination frame. */
  var destinationFrame: Rectangle = js.native
  
  /** Collection of filters. */
  var filters: js.Array[Filter] = js.native
  
  /**
    * Compatibility with PixiJS v4 filters
    * @default false
    */
  var legacy: Boolean = js.native
  
  /**
    * Number of samples
    * @default MSAA_QUALITY.NONE
    */
  var multisample: MSAA_QUALITY = js.native
  
  var renderTexture: RenderTexture = js.native
  
  /**
    * Resolution of filters
    * @default 1
    */
  var resolution: Double = js.native
  
  /** Source frame. */
  var sourceFrame: Rectangle = js.native
  
  /**
    * Target of the filters
    * We store for case when custom filter wants to know the element it was applied on
    * @member {PIXI.DisplayObject}
    */
  var target: IFilterTarget = js.native
  
  /** Projection system transform saved by link. */
  var transform: Matrix = js.native
}
