package typings.pizzicato.mod.Effects

import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("pizzicato", "Effects.Quadrafuzz")
@js.native
open class QuadrafuzzCls ()
  extends StObject
     with Quadrafuzz {
  def this(options: QuadrafuzzOptions) = this()
  
  /* CompleteClass */
  override def connect(audioNode: AudioNode): this.type = js.native
  
  /* CompleteClass */
  override def disconnect(audioNode: AudioNode): this.type = js.native
  
  /* CompleteClass */
  var highGain: Double = js.native
  
  /* CompleteClass */
  var lowGain: Double = js.native
  
  /* CompleteClass */
  var midHighGain: Double = js.native
  
  /* CompleteClass */
  var midLowGain: Double = js.native
}
