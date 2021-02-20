package typings.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an operation yielding a value incremented continuously across a range.
  */
@js.native
trait EmitterOpEaseConfig extends _EmitterOpOnUpdateType {
  
  /**
    * The name of the easing function.
    */
  var ease: js.UndefOr[String] = js.native
  
  /**
    * The ending value.
    */
  var end: Double = js.native
  
  /**
    * The starting value.
    */
  var start: Double = js.native
}
object EmitterOpEaseConfig {
  
  @scala.inline
  def apply(end: Double, start: Double): EmitterOpEaseConfig = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitterOpEaseConfig]
  }
  
  @scala.inline
  implicit class EmitterOpEaseConfigMutableBuilder[Self <: EmitterOpEaseConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEase(value: String): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
