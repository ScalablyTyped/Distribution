package typings
package paperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofPath extends js.Object {
  var Arc: org.scalablytyped.runtime.Instantiable3[
    /* from */ paperLib.paperNs.Point, 
    /* through */ paperLib.paperNs.Point, 
    /* to */ paperLib.paperNs.Point, 
    paperLib.paperNs.PathNs.Arc
  ]
  var Circle: org.scalablytyped.runtime.Instantiable2[
    /* center */ paperLib.paperNs.Point, 
    /* radius */ scala.Double, 
    paperLib.paperNs.PathNs.Circle
  ]
  var Ellipse: org.scalablytyped.runtime.Instantiable1[/* rectangle */ paperLib.paperNs.Rectangle, paperLib.paperNs.PathNs.Ellipse]
  var Line: org.scalablytyped.runtime.Instantiable2[
    /* from */ paperLib.paperNs.Point, 
    /* to */ paperLib.paperNs.Point, 
    paperLib.paperNs.PathNs.Line
  ]
  var Rectangle: org.scalablytyped.runtime.Instantiable2[
    /* rectangle */ paperLib.paperNs.Rectangle, 
    js.UndefOr[/* radius */ scala.Double], 
    paperLib.paperNs.PathNs.Rectangle
  ]
  var RegularPolygon: org.scalablytyped.runtime.Instantiable3[
    /* center */ paperLib.paperNs.Point, 
    /* sides */ scala.Double, 
    /* radius */ scala.Double, 
    paperLib.paperNs.PathNs.RegularPolygon
  ]
  var Star: org.scalablytyped.runtime.Instantiable4[
    /* center */ paperLib.paperNs.Point, 
    /* points */ scala.Double, 
    /* radius1 */ scala.Double, 
    /* radius2 */ scala.Double, 
    paperLib.paperNs.PathNs.Star
  ]
}

object TypeofPath {
  @scala.inline
  def apply(
    Arc: org.scalablytyped.runtime.Instantiable3[
      /* from */ paperLib.paperNs.Point, 
      /* through */ paperLib.paperNs.Point, 
      /* to */ paperLib.paperNs.Point, 
      paperLib.paperNs.PathNs.Arc
    ],
    Circle: org.scalablytyped.runtime.Instantiable2[
      /* center */ paperLib.paperNs.Point, 
      /* radius */ scala.Double, 
      paperLib.paperNs.PathNs.Circle
    ],
    Ellipse: org.scalablytyped.runtime.Instantiable1[/* rectangle */ paperLib.paperNs.Rectangle, paperLib.paperNs.PathNs.Ellipse],
    Line: org.scalablytyped.runtime.Instantiable2[
      /* from */ paperLib.paperNs.Point, 
      /* to */ paperLib.paperNs.Point, 
      paperLib.paperNs.PathNs.Line
    ],
    Rectangle: org.scalablytyped.runtime.Instantiable2[
      /* rectangle */ paperLib.paperNs.Rectangle, 
      js.UndefOr[/* radius */ scala.Double], 
      paperLib.paperNs.PathNs.Rectangle
    ],
    RegularPolygon: org.scalablytyped.runtime.Instantiable3[
      /* center */ paperLib.paperNs.Point, 
      /* sides */ scala.Double, 
      /* radius */ scala.Double, 
      paperLib.paperNs.PathNs.RegularPolygon
    ],
    Star: org.scalablytyped.runtime.Instantiable4[
      /* center */ paperLib.paperNs.Point, 
      /* points */ scala.Double, 
      /* radius1 */ scala.Double, 
      /* radius2 */ scala.Double, 
      paperLib.paperNs.PathNs.Star
    ]
  ): TypeofPath = {
    val __obj = js.Dynamic.literal(Arc = Arc, Circle = Circle, Ellipse = Ellipse, Line = Line, Rectangle = Rectangle, RegularPolygon = RegularPolygon, Star = Star)
  
    __obj.asInstanceOf[TypeofPath]
  }
}

