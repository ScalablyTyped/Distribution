package typings.pQueue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lowerBoundMod {
  
  @JSImport("p-queue/dist/lower-bound", JSImport.Default)
  @js.native
  def default[T](array: js.Array[T], value: T, comparator: js.Function2[/* a */ T, /* b */ T, Double]): Double = js.native
}
