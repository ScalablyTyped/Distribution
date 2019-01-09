package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- postmanDashCollectionLib.postmanDashCollectionMod.RequestBodyDefinition because var conflicts: description. Inlined mode, raw, urlencoded, file, formdata */ @JSImport("postman-collection", "RequestBody")
@js.native
class RequestBody protected () extends PropertyBase[RequestBodyDefinition] {
  def this(options: RequestBodyDefinition) = this()
  var file: js.UndefOr[postmanDashCollectionLib.Anon_SrcString | java.lang.String] = js.native
  var formdata: js.UndefOr[js.Array[FormParamDefinition] | PropertyList[FormParam]] = js.native
  var mode: java.lang.String = js.native
  var raw: js.UndefOr[java.lang.String] = js.native
  var urlencoded: js.UndefOr[js.Array[QueryParamDefinition] | PropertyList[QueryParam] | java.lang.String] = js.native
  def isEmpty(): scala.Boolean = js.native
  def update(options: RequestBodyDefinition): scala.Unit = js.native
}

@JSImport("postman-collection", "RequestBody")
@js.native
object RequestBody extends js.Object {
  var MODES: postmanDashCollectionLib.Anon_File = js.native
}

