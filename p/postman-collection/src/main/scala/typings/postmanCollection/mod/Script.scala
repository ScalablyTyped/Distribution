package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typings.postmanCollection.mod.PropertyDefinition because Already inherited
- typings.postmanCollection.mod.ScriptDefinition because var conflicts: description, disabled, id, name. Inlined `type`, src, exec */ @JSImport("postman-collection", "Script")
@js.native
class Script () extends Property[ScriptDefinition] {
  def this(options: String) = this()
  def this(options: js.Array[String]) = this()
  def this(options: ScriptDefinition) = this()
  
  var exec: js.UndefOr[js.Array[String] | String] = js.native
  
  var src: js.UndefOr[String | Url] = js.native
  
  def toSource(): js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  def update(options: String): Unit = js.native
  def update(options: js.Array[String]): Unit = js.native
  def update(options: ScriptDefinition): Unit = js.native
}
/* static members */
object Script {
  
  @JSImport("postman-collection", "Script")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isScript(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScript")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
