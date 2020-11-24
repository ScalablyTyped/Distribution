package typings.murmurhashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Murmur2 extends js.Object {
    
    def murmur2(str: String): Double = js.native
    def murmur2(str: String, seed: Double): Double = js.native
    @JSName("murmur2")
    var murmur2_Original: js.Function2[/* str */ String, /* seed */ js.UndefOr[Double], Double] = js.native
    
    def murmur3(str: String): Double = js.native
    def murmur3(str: String, seed: Double): Double = js.native
    @JSName("murmur3")
    var murmur3_Original: js.Function2[/* str */ String, /* seed */ js.UndefOr[Double], Double] = js.native
  }
}
