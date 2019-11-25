package typings.openapiDashFramework.distSrcBasePathMod

import org.scalablytyped.runtime.StringDictionary
import typings.openapiDashFramework.Anon_Enum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePath extends js.Object {
  val path: String
  val variables: StringDictionary[Anon_Enum]
  def hasVariables(): Boolean
}

object BasePath {
  @scala.inline
  def apply(hasVariables: () => Boolean, path: String, variables: StringDictionary[Anon_Enum]): BasePath = {
    val __obj = js.Dynamic.literal(hasVariables = js.Any.fromFunction0(hasVariables), path = path.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BasePath]
  }
}

