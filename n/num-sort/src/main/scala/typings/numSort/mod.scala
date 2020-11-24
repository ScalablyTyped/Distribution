package typings.numSort

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("num-sort", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ascending: NumberComparator = js.native
  
  val descending: NumberComparator = js.native
  
  type NumberComparator = js.Function2[/* left */ Double, /* right */ Double, Double]
}
