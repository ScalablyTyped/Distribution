package typings.ol.expressionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsingContext extends js.Object {
  var attributes: js.Array[String] = js.native
  var inFragmentShader: js.UndefOr[Boolean] = js.native
  var stringLiteralsMap: StringDictionary[Double] = js.native
  var variables: js.Array[String] = js.native
}

object ParsingContext {
  @scala.inline
  def apply(
    attributes: js.Array[String],
    stringLiteralsMap: StringDictionary[Double],
    variables: js.Array[String]
  ): ParsingContext = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], stringLiteralsMap = stringLiteralsMap.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsingContext]
  }
  @scala.inline
  implicit class ParsingContextOps[Self <: ParsingContext] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringLiteralsMap(value: StringDictionary[Double]): Self = this.set("stringLiteralsMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariablesVarargs(value: String*): Self = this.set("variables", js.Array(value :_*))
    @scala.inline
    def setVariables(value: js.Array[String]): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setInFragmentShader(value: Boolean): Self = this.set("inFragmentShader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInFragmentShader: Self = this.set("inFragmentShader", js.undefined)
  }
  
}

