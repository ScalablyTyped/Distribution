package typings.paper

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.paper.paper.Point
import typings.paper.paper.Rectangle
import typings.paper.paper.Shape.Circle
import typings.paper.paper.Shape.Ellipse
import typings.paper.paper.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofShape extends js.Object {
  var Circle: Instantiable2[/* center */ Point, /* radius */ Double, typings.paper.paper.Shape.Circle]
  var Ellipse: Instantiable1[/* rectangle */ Rectangle, typings.paper.paper.Shape.Ellipse]
  var Rectangle: Instantiable2[
    /* rectangle */ typings.paper.paper.Rectangle, 
    js.UndefOr[/* radius */ Size], 
    typings.paper.paper.Shape.Rectangle
  ]
}

object TypeofShape {
  @scala.inline
  def apply(
    Circle: Instantiable2[/* center */ Point, /* radius */ Double, Circle],
    Ellipse: Instantiable1[/* rectangle */ Rectangle, Ellipse],
    Rectangle: Instantiable2[
      /* rectangle */ Rectangle, 
      js.UndefOr[/* radius */ Size], 
      typings.paper.paper.Shape.Rectangle
    ]
  ): TypeofShape = {
    val __obj = js.Dynamic.literal(Circle = Circle.asInstanceOf[js.Any], Ellipse = Ellipse.asInstanceOf[js.Any], Rectangle = Rectangle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofShape]
  }
}

