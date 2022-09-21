package typings.mnemonist.mod

import typings.mnemonist.defaultMapMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "DefaultMap")
@js.native
open class DefaultMap[K, V] protected () extends default[K, V] {
  // Constructor
  def this(factory: js.Function2[/* key */ K, /* index */ Double, V]) = this()
}
/* static members */
object DefaultMap {
  
  @JSImport("mnemonist", "DefaultMap")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def autoIncrement(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("autoIncrement")().asInstanceOf[Double]
}
