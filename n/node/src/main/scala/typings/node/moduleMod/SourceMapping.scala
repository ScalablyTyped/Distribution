package typings.node.moduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapping extends js.Object {
  var generatedColumn: Double
  var generatedLine: Double
  var originalColumn: Double
  var originalLine: Double
  var originalSource: String
}

object SourceMapping {
  @scala.inline
  def apply(
    generatedColumn: Double,
    generatedLine: Double,
    originalColumn: Double,
    originalLine: Double,
    originalSource: String
  ): SourceMapping = {
    val __obj = js.Dynamic.literal(generatedColumn = generatedColumn.asInstanceOf[js.Any], generatedLine = generatedLine.asInstanceOf[js.Any], originalColumn = originalColumn.asInstanceOf[js.Any], originalLine = originalLine.asInstanceOf[js.Any], originalSource = originalSource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceMapping]
  }
}

