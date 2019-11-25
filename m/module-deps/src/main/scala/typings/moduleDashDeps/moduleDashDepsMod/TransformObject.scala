package typings.moduleDashDeps.moduleDashDepsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformObject extends js.Object {
  var deps: StringDictionary[js.Any]
  var entry: Boolean
  var expose: String
  var file: String
  var id: String
  var source: String
}

object TransformObject {
  @scala.inline
  def apply(
    deps: StringDictionary[js.Any],
    entry: Boolean,
    expose: String,
    file: String,
    id: String,
    source: String
  ): TransformObject = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], expose = expose.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransformObject]
  }
}

