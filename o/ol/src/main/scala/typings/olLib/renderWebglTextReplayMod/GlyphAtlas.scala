package typings
package olLib.renderWebglTextReplayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlyphAtlas extends js.Object {
  var atlas: olLib.styleAtlasManagerMod.default
  var height: scala.Double
  var width: org.scalablytyped.runtime.StringDictionary[scala.Double]
}

object GlyphAtlas {
  @scala.inline
  def apply(
    atlas: olLib.styleAtlasManagerMod.default,
    height: scala.Double,
    width: org.scalablytyped.runtime.StringDictionary[scala.Double]
  ): GlyphAtlas = {
    val __obj = js.Dynamic.literal(atlas = atlas, height = height, width = width)
  
    __obj.asInstanceOf[GlyphAtlas]
  }
}

