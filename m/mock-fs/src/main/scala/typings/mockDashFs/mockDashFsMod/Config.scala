package typings.mockDashFs.mockDashFsMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends /* path */ StringDictionary[String | Buffer | File | Directory | Symlink | Config]

object Config {
  @scala.inline
  def apply(
    StringDictionary: /* path */ StringDictionary[String | Buffer | File | Directory | Symlink | Config] = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Config]
  }
}

