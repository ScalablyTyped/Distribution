package typings.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
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
  var value: js.UndefOr[String] = js.native
  def update(options: HeaderDefinition): Unit = js.native
}

/* static members */
@JSImport("postman-collection", "Header")
@js.native
object Header extends js.Object {
  def create(): Header = js.native
  def create(value: String): Header = js.native
  def create(value: String, name: String): Header = js.native
  def create(value: HeaderDefinition): Header = js.native
  def create(value: HeaderDefinition, name: String): Header = js.native
  def isHeader(obj: js.Any): Boolean = js.native
  def parse(headerString: String): js.Array[HeaderDefinition] = js.native
  def parseSingle(header: String): HeaderDefinition = js.native
  def unparse(headers: js.Array[HeaderDefinition]): String = js.native
  def unparse(headers: js.Array[HeaderDefinition], separator: String): String = js.native
  def unparse(headers: HeaderList): String = js.native
  def unparse(headers: HeaderList, separator: String): String = js.native
  def unparseSingle(header: HeaderDefinition): String = js.native
}

