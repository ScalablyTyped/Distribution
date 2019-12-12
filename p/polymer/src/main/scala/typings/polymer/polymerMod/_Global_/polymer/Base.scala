package typings.polymer.polymerMod._Global_.polymer

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base
  extends CommonBase
     with /** Need to allow all properties for callback methods. */
/* prop */ StringDictionary[js.Any] {
  // Has to live on Base because it is incompatible with
  // HTMLElement#toggleAttribute
  var toggleAttribute: js.UndefOr[
    js.Function3[
      /* name */ String, 
      /* bool */ js.UndefOr[Boolean], 
      /* node */ js.UndefOr[HTMLElement], 
      Unit
    ]
  ] = js.native
}

