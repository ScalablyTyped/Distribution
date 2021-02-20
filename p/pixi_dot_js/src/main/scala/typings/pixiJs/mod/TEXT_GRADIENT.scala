package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Constants that define the type of gradient on text.
  *
  * @static
  * @constant
  * @name TEXT_GRADIENT
  * @memberof PIXI
  * @type {object}
  * @property {number} LINEAR_VERTICAL Vertical gradient
  * @property {number} LINEAR_HORIZONTAL Linear gradient
  */
object TEXT_GRADIENT {
  
  @JSImport("pixi.js", "TEXT_GRADIENT")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pixi.js", "TEXT_GRADIENT.LINEAR_HORIZONTAL")
  @js.native
  def LINEAR_HORIZONTAL: Double = js.native
  @scala.inline
  def LINEAR_HORIZONTAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINEAR_HORIZONTAL")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "TEXT_GRADIENT.LINEAR_VERTICAL")
  @js.native
  def LINEAR_VERTICAL: Double = js.native
  @scala.inline
  def LINEAR_VERTICAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINEAR_VERTICAL")(x.asInstanceOf[js.Any])
}
