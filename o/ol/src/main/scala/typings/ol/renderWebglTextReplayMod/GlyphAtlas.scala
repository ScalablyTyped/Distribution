package typings.ol.renderWebglTextReplayMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlyphAtlas extends js.Object {
  var atlas: typings.ol.styleAtlasManagerMod.default
  var height: Double
  var width: StringDictionary[Double]
}

object GlyphAtlas {
  @scala.inline
  def apply(atlas: typings.ol.styleAtlasManagerMod.default, height: Double, width: StringDictionary[Double]): GlyphAtlas = {
    val __obj = js.Dynamic.literal(atlas = atlas, height = height, width = width)
  
    __obj.asInstanceOf[GlyphAtlas]
  }
}

