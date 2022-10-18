package typings.obliterator

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  @JSImport("obliterator/range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(start: Double, end: Double, step: Double): IterableIterator[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Double]]
}
