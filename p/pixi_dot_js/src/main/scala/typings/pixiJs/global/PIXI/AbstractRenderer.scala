package typings.pixiJs.global.PIXI

import typings.pixiJs.anon.AutoDensity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The AbstractRenderer is the base for a PixiJS Renderer. It is extended by the {@link PIXI.CanvasRenderer}
  * and {@link PIXI.Renderer} which can be used for rendering a PixiJS scene.
  *
  * @abstract
  * @class
  * @extends PIXI.utils.EventEmitter
  * @memberof PIXI
  */
@JSGlobal("PIXI.AbstractRenderer")
@js.native
class AbstractRenderer protected ()
  extends typings.pixiJs.PIXI.AbstractRenderer {
  def this(system: String) = this()
  def this(system: String, options: AutoDensity) = this()
}
