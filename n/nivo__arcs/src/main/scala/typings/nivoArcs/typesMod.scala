package typings.nivoArcs

import typings.nivoArcs.nivoArcsStrings.after
import typings.nivoArcs.nivoArcsStrings.before
import typings.nivoArcs.nivoArcsStrings.end
import typings.nivoArcs.nivoArcsStrings.start
import typings.nivoArcs.typesTypesMod.DatumWithArc
import typings.nivoArcs.typesTypesMod.DatumWithArcAndColor
import typings.nivoArcs.typesTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait ArcLink extends StObject {
    
    var points: js.Tuple3[Point, Point, Point]
    
    var side: before | after
  }
  object ArcLink {
    
    inline def apply(points: js.Tuple3[Point, Point, Point], side: before | after): ArcLink = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcLink]
    }
    
    extension [Self <: ArcLink](x: Self) {
      
      inline def setPoints(value: js.Tuple3[Point, Point, Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setSide(value: before | after): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArcLinkLabel[Datum /* <: DatumWithArcAndColor */]
    extends StObject
       with ArcLinkWithDatum[Datum] {
    
    var label: String
    
    var linkColor: String
    
    var textAnchor: start | end
    
    var textColor: String
    
    var x: Double
    
    var y: Double
  }
  object ArcLinkLabel {
    
    inline def apply[Datum /* <: DatumWithArcAndColor */](
      data: Datum,
      label: String,
      linkColor: String,
      points: js.Tuple3[Point, Point, Point],
      side: before | after,
      textAnchor: start | end,
      textColor: String,
      x: Double,
      y: Double
    ): ArcLinkLabel[Datum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], linkColor = linkColor.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], textAnchor = textAnchor.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcLinkLabel[Datum]]
    }
    
    extension [Self <: ArcLinkLabel[?], Datum /* <: DatumWithArcAndColor */](x: Self & ArcLinkLabel[Datum]) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLinkColor(value: String): Self = StObject.set(x, "linkColor", value.asInstanceOf[js.Any])
      
      inline def setTextAnchor(value: start | end): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArcLinkWithDatum[Datum /* <: DatumWithArc */]
    extends StObject
       with ArcLink {
    
    var data: Datum
  }
  object ArcLinkWithDatum {
    
    inline def apply[Datum /* <: DatumWithArc */](data: Datum, points: js.Tuple3[Point, Point, Point], side: before | after): ArcLinkWithDatum[Datum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcLinkWithDatum[Datum]]
    }
    
    extension [Self <: ArcLinkWithDatum[?], Datum /* <: DatumWithArc */](x: Self & ArcLinkWithDatum[Datum]) {
      
      inline def setData(value: Datum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}
