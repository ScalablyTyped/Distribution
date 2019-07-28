package typings.postmanDashCollection.postmanDashCollectionMod

import typings.postmanDashCollection.Anon_Info
import typings.postmanDashCollection.Anon_WithRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "PropertyBase")
@js.native
class PropertyBase[TDefinition /* <: js.Object */] () extends PropertyBaseDefinition {
  def this(definition: String) = this()
  def this(definition: Anon_Info) = this()
  def this(definition: PropertyBaseDefinition) = this()
  def findInParents(property: String): PropertyBase[PropertyBaseDefinition] = js.native
  def findInParents(
    property: String,
    customizer: js.Function1[/* item */ PropertyBase[PropertyBaseDefinition], Boolean]
  ): PropertyBase[PropertyBaseDefinition] = js.native
  def findParentContaining(
    property: js.Any,
    customizer: js.Function1[/* item */ PropertyBase[PropertyBaseDefinition], Boolean]
  ): PropertyBase[PropertyBaseDefinition] = js.native
  def forEachParent(iterator: js.Function1[/* item */ js.Any, Unit]): Unit = js.native
  def forEachParent(options: Anon_WithRoot, iterator: js.Function1[/* item */ js.Any, Unit]): Unit = js.native
  def meta(): js.Any = js.native
  def parent(): js.UndefOr[PropertyBase[PropertyBaseDefinition]] = js.native
  def setParent(parent: PropertyBase[PropertyBaseDefinition]): Unit = js.native
  def toJSON(): TDefinition = js.native
}

/* static members */
@JSImport("postman-collection", "PropertyBase")
@js.native
object PropertyBase extends js.Object {
  def propertyIsMeta(_value: js.Any, key: String): Boolean = js.native
  def propertyUnprefixMeta(_value: js.Any, key: String): String = js.native
  def toJSON(obj: js.Any): js.Any = js.native
}

