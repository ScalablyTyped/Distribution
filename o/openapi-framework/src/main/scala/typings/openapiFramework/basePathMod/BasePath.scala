package typings.openapiFramework.basePathMod

import org.scalablytyped.runtime.StringDictionary
import typings.openapiFramework.anon.Enum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasePath extends js.Object {
  val path: String = js.native
  val variables: StringDictionary[Enum] = js.native
  def hasVariables(): Boolean = js.native
}

object BasePath {
  @scala.inline
  def apply(hasVariables: () => Boolean, path: String, variables: StringDictionary[Enum]): BasePath = {
    val __obj = js.Dynamic.literal(hasVariables = js.Any.fromFunction0(hasVariables), path = path.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePath]
  }
  @scala.inline
  implicit class BasePathOps[Self <: BasePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHasVariables(value: () => Boolean): Self = this.set("hasVariables", js.Any.fromFunction0(value))
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: StringDictionary[Enum]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

