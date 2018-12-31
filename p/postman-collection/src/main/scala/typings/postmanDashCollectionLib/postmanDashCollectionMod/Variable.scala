package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(postmanDashCollectionLib.postmanDashCollectionMod.VariableDefinition because Would inherit conflicting mutable fields List(description, disabled, id, name))*/
@JSImport("postman-collection", "Variable")
@js.native
class Variable () extends Property[VariableDefinition] {
  def this(definition: org.scalablytyped.runtime.StringDictionary[VariableDefinition]) = this()
  def this(definition: VariableDefinition) = this()
  var key: js.UndefOr[java.lang.String] = js.native
  var `type`: java.lang.String = js.native
  var value: js.Any = js.native
  def cast(value: js.Any): js.Any = js.native
  def castIn(value: js.Any): js.Any = js.native
  def castOut(value: js.Any): js.Any = js.native
  def get(): js.Any = js.native
  def set(value: js.Any): scala.Unit = js.native
  def update(options: VariableDefinition): scala.Unit = js.native
  def valueOf(value: js.Any): js.Any = js.native
  def valueType(typeName: java.lang.String, _noCast: scala.Boolean): java.lang.String = js.native
}

@JSImport("postman-collection", "Variable")
@js.native
object Variable extends js.Object {
  var types: postmanDashCollectionLib.Anon_Number = js.native
  def isVariable(obj: js.Any): scala.Boolean = js.native
}

