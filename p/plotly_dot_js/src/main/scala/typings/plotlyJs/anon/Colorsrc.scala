package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.horizontal
import typings.plotlyJs.plotlyJsStrings.none
import typings.plotlyJs.plotlyJsStrings.radial
import typings.plotlyJs.plotlyJsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Colorsrc extends StObject {
  
  var color: typings.plotlyJs.mod.Color = js.native
  
  var colorsrc: js.Any = js.native
  
  var `type`: radial | horizontal | vertical | none = js.native
  
  var typesrc: js.Any = js.native
}
object Colorsrc {
  
  @scala.inline
  def apply(
    color: typings.plotlyJs.mod.Color,
    colorsrc: js.Any,
    `type`: radial | horizontal | vertical | none,
    typesrc: js.Any
  ): Colorsrc = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorsrc = colorsrc.asInstanceOf[js.Any], typesrc = typesrc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colorsrc]
  }
  
  @scala.inline
  implicit class ColorsrcMutableBuilder[Self <: Colorsrc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setColorsrc(value: js.Any): Self = StObject.set(x, "colorsrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: radial | horizontal | vertical | none): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesrc(value: js.Any): Self = StObject.set(x, "typesrc", value.asInstanceOf[js.Any])
  }
}
