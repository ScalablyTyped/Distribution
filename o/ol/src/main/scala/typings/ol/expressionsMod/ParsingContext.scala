package typings.ol.expressionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsingContext extends js.Object {
  var attributes: js.Array[String]
  var inFragmentShader: js.UndefOr[Boolean] = js.undefined
  var stringLiteralsMap: StringDictionary[Double]
  var variables: js.Array[String]
}

object ParsingContext {
  @scala.inline
  def apply(
    attributes: js.Array[String],
    stringLiteralsMap: StringDictionary[Double],
    variables: js.Array[String],
    inFragmentShader: js.UndefOr[Boolean] = js.undefined
  ): ParsingContext = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], stringLiteralsMap = stringLiteralsMap.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (!js.isUndefined(inFragmentShader)) __obj.updateDynamic("inFragmentShader")(inFragmentShader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsingContext]
  }
}

