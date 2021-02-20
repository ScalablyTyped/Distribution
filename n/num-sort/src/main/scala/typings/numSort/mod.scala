package typings.numSort

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("num-sort", "ascending")
  @js.native
  val ascending: NumberComparator = js.native
  
  @JSImport("num-sort", "descending")
  @js.native
  val descending: NumberComparator = js.native
  
  type NumberComparator = js.Function2[/* left */ Double, /* right */ Double, Double]
}
