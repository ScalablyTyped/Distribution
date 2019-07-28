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
    val __obj = js.Dynamic.literal(deps = deps, entry = entry, expose = expose, file = file, id = id, source = source)
  
    __obj.asInstanceOf[TransformObject]
  }
}

