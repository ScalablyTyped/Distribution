package typings.pizzicato.mod.Effects

import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("pizzicato", "Effects.Compressor")
@js.native
open class CompressorCls ()
  extends StObject
     with Compressor {
  def this(options: CompressorOptions) = this()
  
  /* CompleteClass */
  var attack: Double = js.native
  
  /* CompleteClass */
  override def connect(audioNode: AudioNode): this.type = js.native
  
  /* CompleteClass */
  override def disconnect(audioNode: AudioNode): this.type = js.native
  
  /* CompleteClass */
  var knee: Double = js.native
  
  /* CompleteClass */
  var mix: Double = js.native
  
  /* CompleteClass */
  var ratio: Double = js.native
  
  /* CompleteClass */
  var release: Double = js.native
  
  /* CompleteClass */
  var threshold: Double = js.native
}
