package typings.ospec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AssertionDescriber = js.Function1[/* description */ java.lang.String, scala.Unit]
  
  type Definer = js.Function2[
    /* done */ js.Function1[/* error */ js.UndefOr[typings.std.Error | scala.Null], scala.Unit], 
    /* timeout */ js.Function1[/* delay */ scala.Double, scala.Unit], 
    scala.Unit | js.Thenable[js.Any]
  ]
  
  type ObjectConstructor = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any]
  
  type Reporter = js.Function1[/* results */ js.Array[typings.ospec.mod.Result], scala.Double]
}
