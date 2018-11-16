package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilsDecoratorsMod {
  type BabelDescriptor = stdLib.PropertyDescriptor with mobxLib.Anon_Initializer
  type PropertyCreator = js.Function5[
    /* instance */ js.Any, 
    /* propertyName */ java.lang.String, 
    /* descriptor */ js.UndefOr[BabelDescriptor], 
    /* decoratorTarget */ js.Any, 
    /* decoratorArgs */ js.Array[js.Any], 
    scala.Unit
  ]
}
