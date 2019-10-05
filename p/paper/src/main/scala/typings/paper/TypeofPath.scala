package typings.paper

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.paper.paper.Path.Arc
import typings.paper.paper.Path.Circle
import typings.paper.paper.Path.Ellipse
import typings.paper.paper.Path.Line
import typings.paper.paper.Path.RegularPolygon
import typings.paper.paper.Path.Star
import typings.paper.paper.Point
import typings.paper.paper.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofPath extends js.Object {
  var Arc: Instantiable3[/* from */ Point, /* through */ Point, /* to */ Point, typings.paper.paper.Path.Arc]
  var Circle: Instantiable2[/* center */ Point, /* radius */ Double, typings.paper.paper.Path.Circle]
  var Ellipse: Instantiable1[/* rectangle */ Rectangle, typings.paper.paper.Path.Ellipse]
  var Line: Instantiable2[/* from */ Point, /* to */ Point, typings.paper.paper.Path.Line]
  var Rectangle: Instantiable2[
    /* rectangle */ typings.paper.paper.Rectangle, 
    js.UndefOr[/* radius */ Double], 
    typings.paper.paper.Path.Rectangle
  ]
  var RegularPolygon: Instantiable3[
    /* center */ Point, 
    /* sides */ Double, 
    /* radius */ Double, 
    typings.paper.paper.Path.RegularPolygon
  ]
  var Star: Instantiable4[
    /* center */ Point, 
    /* points */ Double, 
    /* radius1 */ Double, 
    /* radius2 */ Double, 
    typings.paper.paper.Path.Star
  ]
}

object TypeofPath {
  @scala.inline
  def apply(
    Arc: Instantiable3[/* from */ Point, /* through */ Point, /* to */ Point, Arc],
    Circle: Instantiable2[/* center */ Point, /* radius */ Double, Circle],
    Ellipse: Instantiable1[/* rectangle */ Rectangle, Ellipse],
    Line: Instantiable2[/* from */ Point, /* to */ Point, Line],
    Rectangle: Instantiable2[
      /* rectangle */ Rectangle, 
      js.UndefOr[/* radius */ Double], 
      typings.paper.paper.Path.Rectangle
    ],
    RegularPolygon: Instantiable3[/* center */ Point, /* sides */ Double, /* radius */ Double, RegularPolygon],
    Star: Instantiable4[
      /* center */ Point, 
      /* points */ Double, 
      /* radius1 */ Double, 
      /* radius2 */ Double, 
      Star
    ]
  ): TypeofPath = {
    val __obj = js.Dynamic.literal(Arc = Arc, Circle = Circle, Ellipse = Ellipse, Line = Line, Rectangle = Rectangle, RegularPolygon = RegularPolygon, Star = Star)
  
    __obj.asInstanceOf[TypeofPath]
  }
}

