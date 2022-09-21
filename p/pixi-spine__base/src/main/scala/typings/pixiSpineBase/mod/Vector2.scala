package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/base", "Vector2")
@js.native
open class Vector2 () extends StObject {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  
  def length(): Double = js.native
  
  def normalize(): this.type = js.native
  
  def set(x: Double, y: Double): Vector2 = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
