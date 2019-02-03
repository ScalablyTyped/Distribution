package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "Description")
@js.native
class Description () extends DescriptionDefinition {
  def this(definition: java.lang.String) = this()
  def this(definition: DescriptionDefinition) = this()
  /* CompleteClass */
  override var content: java.lang.String = js.native
  @JSName("type")
  var type_Description: java.lang.String = js.native
  def toJSON(): DescriptionDefinition = js.native
  def update(content: java.lang.String): scala.Unit = js.native
  def update(content: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  def update(content: DescriptionDefinition): scala.Unit = js.native
}

/* static members */
@JSImport("postman-collection", "Description")
@js.native
object Description extends js.Object {
  def isDescription(obj: js.Any): scala.Boolean = js.native
}

