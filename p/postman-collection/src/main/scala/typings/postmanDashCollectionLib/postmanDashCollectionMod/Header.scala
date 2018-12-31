package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(postmanDashCollectionLib.postmanDashCollectionMod.HeaderDefinition because Would inherit conflicting mutable fields List(description, disabled, id, name))*/
@JSImport("postman-collection", "Header")
@js.native
class Header protected () extends Property[HeaderDefinition] {
  def this(options: java.lang.String) = this()
  def this(options: HeaderDefinition) = this()
  def this(options: java.lang.String, name: java.lang.String) = this()
  def this(options: HeaderDefinition, name: java.lang.String) = this()
  var key: java.lang.String = js.native
  var value: java.lang.String = js.native
  def update(options: HeaderDefinition): scala.Unit = js.native
}

@JSImport("postman-collection", "Header")
@js.native
object Header extends js.Object {
  def create(): postmanDashCollectionLib.postmanDashCollectionMod.Header = js.native
  def create(value: java.lang.String): postmanDashCollectionLib.postmanDashCollectionMod.Header = js.native
  def create(value: java.lang.String, name: java.lang.String): postmanDashCollectionLib.postmanDashCollectionMod.Header = js.native
  def create(value: postmanDashCollectionLib.postmanDashCollectionMod.HeaderDefinition): postmanDashCollectionLib.postmanDashCollectionMod.Header = js.native
  def create(value: postmanDashCollectionLib.postmanDashCollectionMod.HeaderDefinition, name: java.lang.String): postmanDashCollectionLib.postmanDashCollectionMod.Header = js.native
  def isHeader(obj: js.Any): scala.Boolean = js.native
  def parse(headerString: java.lang.String): js.Array[postmanDashCollectionLib.postmanDashCollectionMod.HeaderDefinition] = js.native
  def parseSingle(header: java.lang.String): postmanDashCollectionLib.postmanDashCollectionMod.HeaderDefinition = js.native
  def unparse(headers: js.Array[postmanDashCollectionLib.postmanDashCollectionMod.HeaderDefinition]): java.lang.String = js.native
  def unparse(
    headers: js.Array[postmanDashCollectionLib.postmanDashCollectionMod.HeaderDefinition],
    separator: java.lang.String
  ): java.lang.String = js.native
  def unparse(headers: postmanDashCollectionLib.postmanDashCollectionMod.HeaderList): java.lang.String = js.native
  def unparse(headers: postmanDashCollectionLib.postmanDashCollectionMod.HeaderList, separator: java.lang.String): java.lang.String = js.native
  def unparseSingle(header: postmanDashCollectionLib.postmanDashCollectionMod.HeaderDefinition): java.lang.String = js.native
}

