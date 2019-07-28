package typings.postmanDashCollection.postmanDashCollectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.postmanDashCollection.Anon_Any
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.postmanDashCollection.postmanDashCollectionMod.VariableDefinition because var conflicts: description, disabled, id, name. Inlined value, `type`, key */ @JSImport("postman-collection", "Variable")
@js.native
class Variable () extends Property[VariableDefinition] {
  def this(definition: StringDictionary[VariableDefinition]) = this()
  def this(definition: VariableDefinition) = this()
  var key: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Any] = js.native
  def cast(value: js.Any): js.Any = js.native
  def castIn(value: js.Any): js.Any = js.native
  def castOut(value: js.Any): js.Any = js.native
  def get(): js.Any = js.native
  def set(value: js.Any): Unit = js.native
  def update(options: VariableDefinition): Unit = js.native
  def valueOf(value: js.Any): js.Any = js.native
  def valueType(typeName: String, _noCast: Boolean): String = js.native
}

/* static members */
@JSImport("postman-collection", "Variable")
@js.native
object Variable extends js.Object {
  var types: Anon_Any = js.native
  def isVariable(obj: js.Any): Boolean = js.native
}

