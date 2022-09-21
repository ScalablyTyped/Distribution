package typings.node.streamWebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Streams API interface provides a built-in byte length queuing
  * strategy that can be used when constructing streams.
  */
@js.native
trait CountQueuingStrategy
  extends StObject
     with QueuingStrategy[Any] {
  
  @JSName("highWaterMark")
  val highWaterMark_CountQueuingStrategy: Double = js.native
  
  @JSName("size")
  def size_MCountQueuingStrategy(): Double = js.native
  @JSName("size")
  def size_MCountQueuingStrategy(chunk: Any): Double = js.native
}
