package typings.node.moduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapPayload extends js.Object {
  var file: String
  var mappings: String
  var names: js.Array[String]
  var sourceRoot: String
  var sources: js.Array[String]
  var sourcesContent: js.Array[String]
  var version: Double
}

object SourceMapPayload {
  @scala.inline
  def apply(
    file: String,
    mappings: String,
    names: js.Array[String],
    sourceRoot: String,
    sources: js.Array[String],
    sourcesContent: js.Array[String],
    version: Double
  ): SourceMapPayload = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceMapPayload]
  }
}

