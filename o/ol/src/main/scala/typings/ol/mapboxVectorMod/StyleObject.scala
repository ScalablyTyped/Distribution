package typings.ol.mapboxVectorMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleObject extends js.Object {
  
  var glyphs: String = js.native
  
  var layers: js.Array[LayerObject] = js.native
  
  var sources: StringDictionary[SourceObject] = js.native
  
  var sprite: String = js.native
}
object StyleObject {
  
  @scala.inline
  def apply(
    glyphs: String,
    layers: js.Array[LayerObject],
    sources: StringDictionary[SourceObject],
    sprite: String
  ): StyleObject = {
    val __obj = js.Dynamic.literal(glyphs = glyphs.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sprite = sprite.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleObject]
  }
  
  @scala.inline
  implicit class StyleObjectOps[Self <: StyleObject] (val x: Self) extends AnyVal {
    
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
    def setGlyphs(value: String): Self = this.set("glyphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersVarargs(value: LayerObject*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[LayerObject]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSources(value: StringDictionary[SourceObject]): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSprite(value: String): Self = this.set("sprite", value.asInstanceOf[js.Any])
  }
}
