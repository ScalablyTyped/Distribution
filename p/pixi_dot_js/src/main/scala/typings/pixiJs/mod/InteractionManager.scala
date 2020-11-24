package typings.pixiJs.mod

import typings.pixiJs.anon.AutoPreventDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@JSImport("pixi.js", "InteractionManager")
@js.native
class InteractionManager protected ()
  extends typings.pixiJs.PIXI.InteractionManager {
  def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
  def this(renderer: typings.pixiJs.PIXI.Renderer, options: AutoPreventDefault) = this()
}
