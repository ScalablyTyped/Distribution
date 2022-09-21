package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "Description")
@js.native
open class Description ()
  extends StObject
     with DescriptionDefinition {
  def this(definition: String) = this()
  def this(definition: DescriptionDefinition) = this()
  
  /* CompleteClass */
  var content: String = js.native
  
  def toJSON(): DescriptionDefinition = js.native
  
  @JSName("type")
  var type_Description: String = js.native
  
  def update(content: String): Unit = js.native
  def update(content: String, `type`: String): Unit = js.native
  def update(content: DescriptionDefinition): Unit = js.native
}
/* static members */
object Description {
  
  @JSImport("postman-collection", "Description")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDescription(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDescription")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
