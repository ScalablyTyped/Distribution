package typings.mobx

import typings.mobx.Anon_Initializer
import typings.std.PropertyDescriptor
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilsDecoratorsMod {
  type BabelDescriptor = PropertyDescriptor with Anon_Initializer
  type PropertyCreator = js.Function5[
    /* instance */ js.Any, 
    /* propertyName */ PropertyKey, 
    /* descriptor */ js.UndefOr[BabelDescriptor], 
    /* decoratorTarget */ js.Any, 
    /* decoratorArgs */ js.Array[js.Any], 
    Unit
  ]
}
