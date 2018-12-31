package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(postmanDashCollectionLib.postmanDashCollectionMod.RequestAuthDefinition because Would inherit conflicting mutable fields List(description, disabled, id, name))*/
@JSImport("postman-collection", "RequestAuth")
@js.native
class RequestAuth protected () extends Property[RequestAuthDefinition] {
  def this(options: RequestAuthDefinition) = this()
  def this(options: RequestAuthDefinition, parent: Property[PropertyDefinition]) = this()
  def this(options: RequestAuthDefinition, parent: PropertyList[RequestAuth]) = this()
  var `type`: java.lang.String = js.native
  def clear(`type`: java.lang.String): scala.Unit = js.native
  def current(): js.Any = js.native
  def parameters(): VariableList = js.native
  def update(options: js.Array[postmanDashCollectionLib.Anon_Key]): scala.Unit = js.native
  def update(options: js.Array[postmanDashCollectionLib.Anon_Key], `type`: java.lang.String): scala.Unit = js.native
  def update(options: postmanDashCollectionLib.Anon_Key): scala.Unit = js.native
  def update(options: postmanDashCollectionLib.Anon_Key, `type`: java.lang.String): scala.Unit = js.native
  def update(options: VariableList): scala.Unit = js.native
  def update(options: VariableList, `type`: java.lang.String): scala.Unit = js.native
  def use(`type`: java.lang.String, options: js.Array[postmanDashCollectionLib.Anon_Key]): scala.Unit = js.native
  def use(`type`: java.lang.String, options: postmanDashCollectionLib.Anon_Key): scala.Unit = js.native
  def use(`type`: java.lang.String, options: VariableList): scala.Unit = js.native
}

@JSImport("postman-collection", "RequestAuth")
@js.native
object RequestAuth extends js.Object {
  def isValidType(`type`: js.Any): scala.Boolean = js.native
}

