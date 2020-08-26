package typings.paper.anon

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
import typings.paper.paper.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofPath extends js.Object {
  var Arc: Instantiable3[/* from */ Point, /* through */ Point, /* to */ Point, typings.paper.paper.Path.Arc] = js.native
  var Circle: Instantiable2[/* center */ Point, /* radius */ Double, typings.paper.paper.Path.Circle] = js.native
  var Ellipse: Instantiable1[/* rectangle */ Rectangle, typings.paper.paper.Path.Ellipse] = js.native
  var Line: Instantiable2[/* from */ Point, /* to */ Point, typings.paper.paper.Path.Line] = js.native
  var Rectangle: Instantiable2[
    /* rectangle */ typings.paper.paper.Rectangle, 
    /* radius */ js.UndefOr[Size], 
    typings.paper.paper.Path.Rectangle
  ] = js.native
  var RegularPolygon: Instantiable3[
    /* center */ Point, 
    /* sides */ Double, 
    /* radius */ Double, 
    typings.paper.paper.Path.RegularPolygon
  ] = js.native
  var Star: Instantiable4[
    /* center */ Point, 
    /* points */ Double, 
    /* radius1 */ Double, 
    /* radius2 */ Double, 
    typings.paper.paper.Path.Star
  ] = js.native
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
      /* radius */ js.UndefOr[Size], 
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
    val __obj = js.Dynamic.literal(Arc = Arc.asInstanceOf[js.Any], Circle = Circle.asInstanceOf[js.Any], Ellipse = Ellipse.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Rectangle = Rectangle.asInstanceOf[js.Any], RegularPolygon = RegularPolygon.asInstanceOf[js.Any], Star = Star.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPath]
  }
  @scala.inline
  implicit class TypeofPathOps[Self <: TypeofPath] (val x: Self) extends AnyVal {
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
    def setArc(value: Instantiable3[/* from */ Point, /* through */ Point, /* to */ Point, Arc]): Self = this.set("Arc", value.asInstanceOf[js.Any])
    @scala.inline
    def setCircle(value: Instantiable2[/* center */ Point, /* radius */ Double, Circle]): Self = this.set("Circle", value.asInstanceOf[js.Any])
    @scala.inline
    def setEllipse(value: Instantiable1[/* rectangle */ Rectangle, Ellipse]): Self = this.set("Ellipse", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Instantiable2[/* from */ Point, /* to */ Point, Line]): Self = this.set("Line", value.asInstanceOf[js.Any])
    @scala.inline
    def setRectangle(
      value: Instantiable2[
          /* rectangle */ Rectangle, 
          /* radius */ js.UndefOr[Size], 
          typings.paper.paper.Path.Rectangle
        ]
    ): Self = this.set("Rectangle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegularPolygon(value: Instantiable3[/* center */ Point, /* sides */ Double, /* radius */ Double, RegularPolygon]): Self = this.set("RegularPolygon", value.asInstanceOf[js.Any])
    @scala.inline
    def setStar(
      value: Instantiable4[
          /* center */ Point, 
          /* points */ Double, 
          /* radius1 */ Double, 
          /* radius2 */ Double, 
          Star
        ]
    ): Self = this.set("Star", value.asInstanceOf[js.Any])
  }
  
}

