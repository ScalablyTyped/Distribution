package typings.nivoBullet.typesMod

import typings.std.MouseEvent
import typings.std.SVGRectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@nivo/bullet.@nivo/bullet/dist/types/types.BulletRectsProps, 'onMouseEnter' | 'onMouseLeave' | 'onClick'> & @nivo/bullet.@nivo/bullet/dist/types/types.Point & @nivo/core.@nivo/core.Dimensions & {  animatedProps :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<BulletRectAnimatedProps> * / any,   borderColor :string,   borderWidth :number,   color :string,   data :@nivo/bullet.@nivo/bullet/dist/types/types.ComputedRangeDatum,   index :number,   onMouseMove :@nivo/bullet.@nivo/bullet/dist/types/types.BulletRectsProps['onMouseEnter']} */
trait BulletRectsItemProps extends StObject {
  
  var animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<BulletRectAnimatedProps> */ Any
  
  var borderColor: String
  
  var borderWidth: Double
  
  var color: String
  
  var data: ComputedRangeDatum
  
  var height: Double
  
  var index: Double
  
  var onClick: MouseEventWithDatum[ComputedRangeDatum, SVGRectElement]
  
  var onMouseEnter: MouseEventWithDatum[ComputedRangeDatum, SVGRectElement]
  
  var onMouseLeave: MouseEventWithDatum[ComputedRangeDatum, SVGRectElement]
  
  var onMouseMove: MouseEventWithDatum[ComputedRangeDatum, SVGRectElement]
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object BulletRectsItemProps {
  
  inline def apply(
    animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<BulletRectAnimatedProps> */ Any,
    borderColor: String,
    borderWidth: Double,
    color: String,
    data: ComputedRangeDatum,
    height: Double,
    index: Double,
    onClick: (ComputedRangeDatum, /* event */ typings.react.mod.MouseEvent[SVGRectElement, MouseEvent]) => Unit,
    onMouseEnter: (ComputedRangeDatum, /* event */ typings.react.mod.MouseEvent[SVGRectElement, MouseEvent]) => Unit,
    onMouseLeave: (ComputedRangeDatum, /* event */ typings.react.mod.MouseEvent[SVGRectElement, MouseEvent]) => Unit,
    onMouseMove: (ComputedRangeDatum, /* event */ typings.react.mod.MouseEvent[SVGRectElement, MouseEvent]) => Unit,
    width: Double,
    x: Double,
    y: Double
  ): BulletRectsItemProps = {
    val __obj = js.Dynamic.literal(animatedProps = animatedProps.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], onClick = js.Any.fromFunction2(onClick), onMouseEnter = js.Any.fromFunction2(onMouseEnter), onMouseLeave = js.Any.fromFunction2(onMouseLeave), onMouseMove = js.Any.fromFunction2(onMouseMove), width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletRectsItemProps]
  }
  
  extension [Self <: BulletRectsItemProps](x: Self) {
    
    inline def setAnimatedProps(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<BulletRectAnimatedProps> */ Any
    ): Self = StObject.set(x, "animatedProps", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setData(value: ComputedRangeDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOnClick(
      value: (ComputedRangeDatum, /* event */ typings.react.mod.MouseEvent[SVGRectElement, MouseEvent]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnMouseEnter(
      value: (ComputedRangeDatum, /* event */ typings.react.mod.MouseEvent[SVGRectElement, MouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
    
    inline def setOnMouseLeave(
      value: (ComputedRangeDatum, /* event */ typings.react.mod.MouseEvent[SVGRectElement, MouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
    
    inline def setOnMouseMove(
      value: (ComputedRangeDatum, /* event */ typings.react.mod.MouseEvent[SVGRectElement, MouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
