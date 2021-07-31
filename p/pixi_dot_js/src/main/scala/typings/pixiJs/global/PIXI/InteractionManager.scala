package typings.pixiJs.global.PIXI

import typings.pixiJs.anon.AutoPreventDefault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interaction manager deals with mouse, touch and pointer events.
  *
  * Any DisplayObject can be interactive if its `interactive` property is set to true.
  *
  * This manager also supports multitouch.
  *
  * An instance of this class is automatically created by default, and can be found at `renderer.plugins.interaction`
  *
  * @class
  * @extends PIXI.utils.EventEmitter
  * @memberof PIXI
  */
@JSGlobal("PIXI.InteractionManager")
@js.native
class InteractionManager protected ()
  extends StObject
     with typings.pixiJs.PIXI.InteractionManager {
  def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
  def this(renderer: typings.pixiJs.PIXI.Renderer, options: AutoPreventDefault) = this()
}
