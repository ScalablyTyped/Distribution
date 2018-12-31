package typings
package polymerLib.polymerMod.Global.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base
  extends CommonBase
     with /** Need to allow all properties for callback methods. */
/* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  // Has to live on Base because it is incompatible with
  // HTMLElement#toggleAttribute
  var toggleAttribute: js.UndefOr[
    js.Function3[
      /* name */ java.lang.String, 
      /* bool */ js.UndefOr[scala.Boolean], 
      /* node */ js.UndefOr[stdLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
}

