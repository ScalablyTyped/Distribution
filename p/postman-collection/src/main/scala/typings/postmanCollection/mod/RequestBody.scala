package typings.postmanCollection.mod

import typings.postmanCollection.anon.File
import typings.postmanCollection.anon.SrcString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typings.postmanCollection.mod.RequestBodyDefinition because var conflicts: description. Inlined mode, raw, urlencoded, file, formdata */ @JSImport("postman-collection", "RequestBody")
@js.native
class RequestBody protected () extends PropertyBase[RequestBodyDefinition] {
  def this(options: RequestBodyDefinition) = this()
  
  var file: js.UndefOr[SrcString | String] = js.native
  
  var formdata: js.UndefOr[js.Array[FormParamDefinition] | PropertyList[FormParam]] = js.native
  
  def isEmpty(): Boolean = js.native
  
  var mode: String = js.native
  
  var raw: js.UndefOr[String] = js.native
  
  def update(options: RequestBodyDefinition): Unit = js.native
  
  var urlencoded: js.UndefOr[js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String] = js.native
}
/* static members */
object RequestBody {
  
  @JSImport("postman-collection", "RequestBody")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("postman-collection", "RequestBody.MODES")
  @js.native
  def MODES: File = js.native
  inline def MODES_=(x: File): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODES")(x.asInstanceOf[js.Any])
}
