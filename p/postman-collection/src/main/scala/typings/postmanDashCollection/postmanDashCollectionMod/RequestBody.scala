package typings.postmanDashCollection.postmanDashCollectionMod

import typings.postmanDashCollection.Anon_File
import typings.postmanDashCollection.Anon_SrcString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.postmanDashCollection.postmanDashCollectionMod.PropertyBaseDefinition because Already inherited
- typings.postmanDashCollection.postmanDashCollectionMod.RequestBodyDefinition because var conflicts: description. Inlined mode, raw, urlencoded, file, formdata */ @JSImport("postman-collection", "RequestBody")
@js.native
class RequestBody protected () extends PropertyBase[RequestBodyDefinition] {
  def this(options: RequestBodyDefinition) = this()
  var file: js.UndefOr[Anon_SrcString | String] = js.native
  var formdata: js.UndefOr[js.Array[FormParamDefinition] | PropertyList[FormParam]] = js.native
  var mode: String = js.native
  var raw: js.UndefOr[String] = js.native
  var urlencoded: js.UndefOr[js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String] = js.native
  def isEmpty(): Boolean = js.native
  def update(options: RequestBodyDefinition): Unit = js.native
}

/* static members */
@JSImport("postman-collection", "RequestBody")
@js.native
object RequestBody extends js.Object {
  var MODES: Anon_File = js.native
}

