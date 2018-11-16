package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "PropertyBase")
@js.native
class PropertyBase[TDefinition] () extends PropertyBaseDefinition {
  def this(definition: java.lang.String) = this()
  def this(definition: postmanDashCollectionLib.Anon_Info) = this()
  def this(definition: PropertyBaseDefinition) = this()
  def findInParents(property: java.lang.String): PropertyBase[PropertyBaseDefinition] = js.native
  def findInParents(
    property: java.lang.String,
    customizer: js.Function1[/* item */ PropertyBase[PropertyBaseDefinition], scala.Boolean]
  ): PropertyBase[PropertyBaseDefinition] = js.native
  def findParentContaining(
    property: js.Any,
    customizer: js.Function1[/* item */ PropertyBase[PropertyBaseDefinition], scala.Boolean]
  ): PropertyBase[PropertyBaseDefinition] = js.native
  def forEachParent(iterator: js.Function1[/* item */ js.Any, scala.Unit]): scala.Unit = js.native
  def forEachParent(
    options: postmanDashCollectionLib.Anon_WithRoot,
    iterator: js.Function1[/* item */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def meta(): js.Any = js.native
  def parent(): js.UndefOr[PropertyBase[PropertyBaseDefinition]] = js.native
  def setParent(parent: PropertyBase[PropertyBaseDefinition]): scala.Unit = js.native
  def toJSON(): TDefinition = js.native
}

@JSImport("postman-collection", "PropertyBase")
@js.native
object PropertyBase extends js.Object {
  def propertyIsMeta(_value: js.Any, key: java.lang.String): scala.Boolean = js.native
  def propertyUnprefixMeta(_value: js.Any, key: java.lang.String): java.lang.String = js.native
  def toJSON(obj: js.Any): js.Any = js.native
}

