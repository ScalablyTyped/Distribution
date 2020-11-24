package typings.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "Description")
@js.native
class Description () extends DescriptionDefinition {
  def this(definition: String) = this()
  def this(definition: DescriptionDefinition) = this()
  
  def toJSON(): DescriptionDefinition = js.native
  
  @JSName("type")
  var type_Description: String = js.native
  
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
