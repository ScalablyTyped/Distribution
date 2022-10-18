package typings.nivoBullet.distTypesTypesMod

import typings.nivoBullet.anon.Color
import typings.std.MouseEvent
import typings.std.SVGLineElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@nivo/bullet.@nivo/bullet/dist/types/types.BulletMarkersProps, 'onMouseEnter' | 'onMouseLeave' | 'onClick'> & @nivo/bullet.@nivo/bullet/dist/types/types.Point & {  animatedProps :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<PositionWithColor> * / any,   size :number,   rotation :number,   color :string,   data :{  index :number,   value :number,   color :string},   onMouseMove :@nivo/bullet.@nivo/bullet/dist/types/types.BulletMarkersProps['onMouseEnter']} */
trait BulletMarkersItemProps extends StObject {
  
  var animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<PositionWithColor> */ Any
  
  var color: String
  
  var data: Color
  
  var onClick: MouseEventWithDatum[ComputedMarkersDatum, SVGLineElement]
  
  var onMouseEnter: MouseEventWithDatum[ComputedMarkersDatum, SVGLineElement]
  
  var onMouseLeave: MouseEventWithDatum[ComputedMarkersDatum, SVGLineElement]
  
  var onMouseMove: MouseEventWithDatum[ComputedMarkersDatum, SVGLineElement]
  
  var rotation: Double
  
  var size: Double
  
  var x: Double
  
  var y: Double
}
object BulletMarkersItemProps {
  
  inline def apply(
    animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<PositionWithColor> */ Any,
    color: String,
    data: Color,
    onClick: (ComputedMarkersDatum, /* event */ typings.react.mod.MouseEvent[SVGLineElement, MouseEvent]) => Unit,
    onMouseEnter: (ComputedMarkersDatum, /* event */ typings.react.mod.MouseEvent[SVGLineElement, MouseEvent]) => Unit,
    onMouseLeave: (ComputedMarkersDatum, /* event */ typings.react.mod.MouseEvent[SVGLineElement, MouseEvent]) => Unit,
    onMouseMove: (ComputedMarkersDatum, /* event */ typings.react.mod.MouseEvent[SVGLineElement, MouseEvent]) => Unit,
    rotation: Double,
    size: Double,
    x: Double,
    y: Double
  ): BulletMarkersItemProps = {
    val __obj = js.Dynamic.literal(animatedProps = animatedProps.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], onClick = js.Any.fromFunction2(onClick), onMouseEnter = js.Any.fromFunction2(onMouseEnter), onMouseLeave = js.Any.fromFunction2(onMouseLeave), onMouseMove = js.Any.fromFunction2(onMouseMove), rotation = rotation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletMarkersItemProps]
  }
  
  extension [Self <: BulletMarkersItemProps](x: Self) {
    
    inline def setAnimatedProps(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<PositionWithColor> */ Any
    ): Self = StObject.set(x, "animatedProps", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setData(value: Color): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOnClick(
      value: (ComputedMarkersDatum, /* event */ typings.react.mod.MouseEvent[SVGLineElement, MouseEvent]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnMouseEnter(
      value: (ComputedMarkersDatum, /* event */ typings.react.mod.MouseEvent[SVGLineElement, MouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
    
    inline def setOnMouseLeave(
      value: (ComputedMarkersDatum, /* event */ typings.react.mod.MouseEvent[SVGLineElement, MouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
    
    inline def setOnMouseMove(
      value: (ComputedMarkersDatum, /* event */ typings.react.mod.MouseEvent[SVGLineElement, MouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
