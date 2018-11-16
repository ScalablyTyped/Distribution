package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(postmanDashCollectionLib.postmanDashCollectionMod.RequestBodyDefinition because Would inherit conflicting mutable fields List(description))*/
@JSImport("postman-collection", "RequestBody")
@js.native
class RequestBody protected () extends PropertyBase[RequestBodyDefinition] {
  def this(options: RequestBodyDefinition) = this()
  var file: js.UndefOr[postmanDashCollectionLib.Anon_Src] = js.native
  var formdata: js.UndefOr[PropertyList[FormParam]] = js.native
  var mode: java.lang.String = js.native
  var raw: js.UndefOr[java.lang.String] = js.native
  var urlencoded: js.UndefOr[PropertyList[QueryParam]] = js.native
  def isEmpty(): scala.Boolean = js.native
  def update(options: RequestBodyDefinition): scala.Unit = js.native
}

@JSImport("postman-collection", "RequestBody")
@js.native
object RequestBody extends js.Object {
  var MODES: postmanDashCollectionLib.Anon_Raw = js.native
}

