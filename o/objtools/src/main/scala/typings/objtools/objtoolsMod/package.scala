package typings.objtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object objtoolsMod {
  import typings.std.Record

  type Mask = MaskObj | js.Array[MaskObj] | Boolean
  type MaskedOutHook = js.Function1[/* path */ String, Unit]
  type MergeCustomizer = js.Function4[
    /* objectValue */ js.Any, 
    /* sourceValue */ js.Any, 
    /* key */ String, 
    /* object */ js.Any, 
    js.Any
  ]
  type OnFieldHook = js.Function4[
    /* field */ String, 
    /* toVal */ js.Any, 
    /* fromVal */ js.Any, 
    /* parentObj */ Record[String, js.Any], 
    js.Any
  ]
}
