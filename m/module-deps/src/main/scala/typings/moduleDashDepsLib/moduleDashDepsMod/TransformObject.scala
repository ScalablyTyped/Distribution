package typings
package moduleDashDepsLib.moduleDashDepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformObject extends js.Object {
  var deps: org.scalablytyped.runtime.StringDictionary[js.Any]
  var entry: scala.Boolean
  var expose: java.lang.String
  var file: java.lang.String
  var id: java.lang.String
  var source: java.lang.String
}

object TransformObject {
  @scala.inline
  def apply(
    deps: org.scalablytyped.runtime.StringDictionary[js.Any],
    entry: scala.Boolean,
    expose: java.lang.String,
    file: java.lang.String,
    id: java.lang.String,
    source: java.lang.String
  ): TransformObject = {
    val __obj = js.Dynamic.literal(deps = deps, entry = entry, expose = expose, file = file, id = id, source = source)
  
    __obj.asInstanceOf[TransformObject]
  }
}

