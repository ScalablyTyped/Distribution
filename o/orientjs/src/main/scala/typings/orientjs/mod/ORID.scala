package typings.orientjs.mod

import typings.std.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", "ORID")
@js.native
open class ORID ()
  extends StObject
     with String {
  
  var cluster: js.UndefOr[Double] = js.native
  
  @JSName("equals")
  var equals_FORID: js.UndefOr[js.Function1[/* rid */ java.lang.String | this.type, Boolean]] = js.native
  
  var isValid: js.UndefOr[
    js.Function1[/* input */ js.UndefOr[java.lang.String | this.type | Any], Boolean]
  ] = js.native
  
  var parse: js.UndefOr[js.Function1[/* input */ java.lang.String, Boolean]] = js.native
  
  var position: js.UndefOr[Double] = js.native
  
  var toRid: js.UndefOr[js.Function2[/* cluster */ Double, /* position */ Double, Any]] = js.native
}
