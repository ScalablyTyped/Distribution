package typings.postmanCollection.mod

import typings.postmanCollection.anon.Info
import typings.postmanCollection.anon.WithRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "PropertyBase")
@js.native
class PropertyBase[TDefinition /* <: js.Object */] ()
  extends StObject
     with PropertyBaseDefinition {
  def this(definition: String) = this()
  def this(definition: Info) = this()
  def this(definition: PropertyBaseDefinition) = this()
  
  def findInParents(property: String): PropertyBase[PropertyBaseDefinition] = js.native
  def findInParents(
    property: String,
    customizer: js.Function1[/* item */ PropertyBase[PropertyBaseDefinition], Boolean]
  ): PropertyBase[PropertyBaseDefinition] = js.native
  
  def findParentContaining(
    property: js.Any,
    customizer: js.Function1[/* item */ PropertyBase[PropertyBaseDefinition], Boolean]
  ): PropertyBase[PropertyBaseDefinition] = js.native
  
  def forEachParent(iterator: js.Function1[/* item */ js.Any, Unit]): Unit = js.native
  def forEachParent(options: WithRoot, iterator: js.Function1[/* item */ js.Any, Unit]): Unit = js.native
  
  def meta(): js.Any = js.native
  
  def parent(): js.UndefOr[PropertyBase[PropertyBaseDefinition]] = js.native
  
  def setParent(parent: PropertyBase[PropertyBaseDefinition]): Unit = js.native
  
  def toJSON(): TDefinition = js.native
}
/* static members */
object PropertyBase {
  
  @JSImport("postman-collection", "PropertyBase")
  @js.native
  val ^ : js.Any = js.native
  
  inline def propertyIsMeta(_value: js.Any, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyIsMeta")(_value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def propertyUnprefixMeta(_value: js.Any, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyUnprefixMeta")(_value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toJSON(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
