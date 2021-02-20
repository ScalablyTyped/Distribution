package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typings.postmanCollection.mod.PropertyDefinition because Already inherited
- typings.postmanCollection.mod.HeaderDefinition because var conflicts: description, disabled, id, name. Inlined key, value, system */ @JSImport("postman-collection", "Header")
@js.native
class Header protected () extends Property[HeaderDefinition] {
  def this(options: String) = this()
  def this(options: HeaderDefinition) = this()
  def this(options: String, name: String) = this()
  def this(options: HeaderDefinition, name: String) = this()
  
  var key: js.UndefOr[String] = js.native
  
  var system: js.UndefOr[Boolean] = js.native
  
  def update(options: HeaderDefinition): Unit = js.native
  
  var value: js.UndefOr[String] = js.native
}
/* static members */
object Header {
  
  @JSImport("postman-collection", "Header.create")
  @js.native
  def create(): Header = js.native
  @JSImport("postman-collection", "Header.create")
  @js.native
  def create(value: js.UndefOr[scala.Nothing], name: String): Header = js.native
  @JSImport("postman-collection", "Header.create")
  @js.native
  def create(value: String): Header = js.native
  @JSImport("postman-collection", "Header.create")
  @js.native
  def create(value: String, name: String): Header = js.native
  @JSImport("postman-collection", "Header.create")
  @js.native
  def create(value: HeaderDefinition): Header = js.native
  @JSImport("postman-collection", "Header.create")
  @js.native
  def create(value: HeaderDefinition, name: String): Header = js.native
  
  @JSImport("postman-collection", "Header.isHeader")
  @js.native
  def isHeader(obj: js.Any): Boolean = js.native
  
  @JSImport("postman-collection", "Header.parse")
  @js.native
  def parse(headerString: String): js.Array[HeaderDefinition] = js.native
  
  @JSImport("postman-collection", "Header.parseSingle")
  @js.native
  def parseSingle(header: String): HeaderDefinition = js.native
  
  @JSImport("postman-collection", "Header.unparse")
  @js.native
  def unparse(headers: js.Array[HeaderDefinition]): String = js.native
  @JSImport("postman-collection", "Header.unparse")
  @js.native
  def unparse(headers: js.Array[HeaderDefinition], separator: String): String = js.native
  @JSImport("postman-collection", "Header.unparse")
  @js.native
  def unparse(headers: HeaderList): String = js.native
  @JSImport("postman-collection", "Header.unparse")
  @js.native
  def unparse(headers: HeaderList, separator: String): String = js.native
  
  @JSImport("postman-collection", "Header.unparseSingle")
  @js.native
  def unparseSingle(header: HeaderDefinition): String = js.native
}
