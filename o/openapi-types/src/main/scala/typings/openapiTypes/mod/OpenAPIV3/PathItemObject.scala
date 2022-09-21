package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathItemObject[T /* <: js.Object */] extends StObject {
  
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var parameters: js.UndefOr[js.Array[ReferenceObject | ParameterObject]] = js.native
  
  var servers: js.UndefOr[js.Array[ServerObject]] = js.native
  
  var summary: js.UndefOr[String] = js.native
}
