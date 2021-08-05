package typings.postmanCollection.mod

import org.scalablytyped.runtime.StringDictionary
import typings.postmanCollection.anon.Created
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "Collection")
@js.native
class Collection () extends ItemGroup[Item] {
  def this(definition: CollectionDefinition) = this()
  def this(definition: Unit, environments: js.Array[js.Any]) = this()
  def this(definition: CollectionDefinition, environments: js.Array[js.Any]) = this()
  
  def syncVariablesFrom(obj: StringDictionary[VariableDefinition]): js.UndefOr[Created] = js.native
  def syncVariablesFrom(obj: StringDictionary[VariableDefinition], track: Boolean): js.UndefOr[Created] = js.native
  def syncVariablesFrom(obj: StringDictionary[VariableDefinition], track: Boolean, prune: Boolean): js.UndefOr[Created] = js.native
  def syncVariablesFrom(obj: StringDictionary[VariableDefinition], track: Unit, prune: Boolean): js.UndefOr[Created] = js.native
  
  def syncVariablesTo(): StringDictionary[VariableDefinition] = js.native
  def syncVariablesTo(obj: StringDictionary[VariableDefinition]): StringDictionary[VariableDefinition] = js.native
  
  var variables: VariableList = js.native
  
  var version: js.UndefOr[Version] = js.native
}
/* static members */
object Collection {
  
  @JSImport("postman-collection", "Collection")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isCollection(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
