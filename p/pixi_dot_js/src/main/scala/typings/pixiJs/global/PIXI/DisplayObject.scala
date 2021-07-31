package typings.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class for all objects that are rendered on the screen.
  *
  * This is an abstract class and should not be used on its own; rather it should b e extended.
  *
  * @class
  * @extends PIXI.utils.EventEmitter
  * @memberof PIXI
  */
@JSGlobal("PIXI.DisplayObject")
@js.native
class DisplayObject ()
  extends StObject
     with typings.pixiJs.PIXI.DisplayObject
object DisplayObject {
  
  @JSGlobal("PIXI.DisplayObject")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Mixes all enumerable properties and methods from a source object to DisplayObject.
    *
    * @param {object} source - The source of properties and methods to mix in.
    */
  /* static member */
  @scala.inline
  def mixin(source: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
