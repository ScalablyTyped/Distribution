package typings.postmanDashCollection.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "Description")
@js.native
class Description () extends DescriptionDefinition {
  def this(definition: String) = this()
  def this(definition: DescriptionDefinition) = this()
  /* CompleteClass */
  override var content: String = js.native
  @JSName("type")
  var type_Description: String = js.native
  def toJSON(): DescriptionDefinition = js.native
  def update(content: String): Unit = js.native
  def update(content: String, `type`: String): Unit = js.native
  def update(content: DescriptionDefinition): Unit = js.native
}

/* static members */
@JSImport("postman-collection", "Description")
@js.native
object Description extends js.Object {
  def isDescription(obj: js.Any): Boolean = js.native
}

