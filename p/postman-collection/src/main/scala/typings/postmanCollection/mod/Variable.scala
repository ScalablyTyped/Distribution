package typings.postmanCollection.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typings.postmanCollection.mod.PropertyDefinition because Already inherited
- typings.postmanCollection.mod.VariableDefinition because var conflicts: description, disabled, id, name. Inlined value, `type`, key */ @JSImport("postman-collection", "Variable")
@js.native
open class Variable () extends Property[VariableDefinition] {
  def this(definition: StringDictionary[VariableDefinition]) = this()
  def this(definition: VariableDefinition) = this()
  
  def cast(value: Any): Any = js.native
  
  def castIn(value: Any): Any = js.native
  
  def castOut(value: Any): Any = js.native
  
  def get(): Any = js.native
  
  var key: js.UndefOr[String] = js.native
  
  def set(value: Any): Unit = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  def update(options: VariableDefinition): Unit = js.native
  
  var value: js.UndefOr[Any] = js.native
  
  def valueOf(value: Any): Any = js.native
  
  def valueType(typeName: String, _noCast: Boolean): String = js.native
}
/* static members */
object Variable {
  
  @JSImport("postman-collection", "Variable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isVariable(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariable")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("postman-collection", "Variable.types")
  @js.native
  def types: typings.postmanCollection.anon.Any = js.native
  inline def types_=(x: typings.postmanCollection.anon.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
}
