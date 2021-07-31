package typings.playcanvas.anon

import typings.playcanvas.playcanvasStrings.asset
import typings.playcanvas.playcanvasStrings.boolean
import typings.playcanvas.playcanvasStrings.curve
import typings.playcanvas.playcanvasStrings.entity
import typings.playcanvas.playcanvasStrings.json
import typings.playcanvas.playcanvasStrings.number
import typings.playcanvas.playcanvasStrings.rgb
import typings.playcanvas.playcanvasStrings.rgba
import typings.playcanvas.playcanvasStrings.string
import typings.playcanvas.playcanvasStrings.vec2
import typings.playcanvas.playcanvasStrings.vec3
import typings.playcanvas.playcanvasStrings.vec4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Array extends StObject {
  
  var default: js.UndefOr[js.Any] = js.undefined
  
  var array: js.UndefOr[Boolean] = js.undefined
  
  var assetType: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var curves: js.UndefOr[js.Array[String]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var `enum`: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var placeholder: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var precision: js.UndefOr[Double] = js.undefined
  
  var schema: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: boolean | number | string | json | asset | entity | rgb | rgba | vec2 | vec3 | vec4 | curve
}
object Array {
  
  @scala.inline
  def apply(
    `type`: boolean | number | string | json | asset | entity | rgb | rgba | vec2 | vec3 | vec4 | curve
  ): Array = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  
  @scala.inline
  implicit class ArrayMutableBuilder[Self <: Array] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: Boolean): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    @scala.inline
    def setAssetType(value: String): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCurves(value: js.Array[String]): Self = StObject.set(x, "curves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurvesUndefined: Self = StObject.set(x, "curves", js.undefined)
    
    @scala.inline
    def setCurvesVarargs(value: String*): Self = StObject.set(x, "curves", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnum(value: js.Array[js.Object]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: js.Object*): Self = StObject.set(x, "enum", js.Array(value :_*))
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String | js.Array[String]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPlaceholderVarargs(value: String*): Self = StObject.set(x, "placeholder", js.Array(value :_*))
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setSchema(value: js.Array[js.Object]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setSchemaVarargs(value: js.Object*): Self = StObject.set(x, "schema", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: boolean | number | string | json | asset | entity | rgb | rgba | vec2 | vec3 | vec4 | curve): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
