package typings.mobx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object decoratorsMod {
  type PropertyCreator = js.Function5[
    /* instance */ js.Any, 
    /* propertyName */ typings.std.PropertyKey, 
    /* descriptor */ js.UndefOr[typings.mobx.decoratorsMod.BabelDescriptor], 
    /* decoratorTarget */ js.Any, 
    /* decoratorArgs */ js.Array[js.Any], 
    scala.Unit
  ]
}
