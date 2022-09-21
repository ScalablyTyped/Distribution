package typings.openseadragon.mod

import typings.openseadragon.anon.AnimationTime
import typings.openseadragon.anon.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "Spring")
@js.native
open class Spring protected () extends StObject {
  def this(options: AnimationTime) = this()
  
  var animationTime: Double = js.native
  
  var current: Time = js.native
  
  def isAtTargetValue(): Boolean = js.native
  
  def resetTo(target: Double): Unit = js.native
  
  def shiftBy(delta: Double): Unit = js.native
  
  var springStiffness: Double = js.native
  
  def springTo(target: Double): Unit = js.native
  
  var start: Time = js.native
  
  def update(): Unit = js.native
}
