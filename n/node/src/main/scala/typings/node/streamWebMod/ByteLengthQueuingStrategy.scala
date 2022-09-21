package typings.node.streamWebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Streams API interface provides a built-in byte length queuing
  * strategy that can be used when constructing streams.
  */
@js.native
trait ByteLengthQueuingStrategy
  extends StObject
     with QueuingStrategy[js.typedarray.ArrayBufferView] {
  
  @JSName("highWaterMark")
  val highWaterMark_ByteLengthQueuingStrategy: Double = js.native
  
  @JSName("size")
  def size_MByteLengthQueuingStrategy(): Double = js.native
  @JSName("size")
  def size_MByteLengthQueuingStrategy(chunk: js.typedarray.ArrayBufferView): Double = js.native
}
