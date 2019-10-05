package typings.postmanDashCollection.postmanDashCollectionMod

import typings.postmanDashCollection.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.postmanDashCollection.postmanDashCollectionMod.PropertyBaseDefinition because Already inherited
- typings.postmanDashCollection.postmanDashCollectionMod.PropertyDefinition because Already inherited
- typings.postmanDashCollection.postmanDashCollectionMod.RequestAuthDefinition because var conflicts: description, disabled, id, name. Inlined `type` */ @JSImport("postman-collection", "RequestAuth")
@js.native
class RequestAuth protected () extends Property[RequestAuthDefinition] {
  def this(options: RequestAuthDefinition) = this()
  def this(options: RequestAuthDefinition, parent: Property[PropertyDefinition]) = this()
  def this(options: RequestAuthDefinition, parent: PropertyList[RequestAuth]) = this()
  var `type`: js.UndefOr[String] = js.native
  def clear(`type`: String): Unit = js.native
  def current(): js.Any = js.native
  def parameters(): VariableList = js.native
  def update(options: js.Array[Anon_Key]): Unit = js.native
  def update(options: js.Array[Anon_Key], `type`: String): Unit = js.native
  def update(options: Anon_Key): Unit = js.native
  def update(options: Anon_Key, `type`: String): Unit = js.native
  def update(options: VariableList): Unit = js.native
  def update(options: VariableList, `type`: String): Unit = js.native
  def use(`type`: String, options: js.Array[Anon_Key]): Unit = js.native
  def use(`type`: String, options: Anon_Key): Unit = js.native
  def use(`type`: String, options: VariableList): Unit = js.native
}

/* static members */
@JSImport("postman-collection", "RequestAuth")
@js.native
object RequestAuth extends js.Object {
  def isValidType(`type`: js.Any): Boolean = js.native
}

