package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRectReadOnly extends js.Object {
  val bottom: scala.Double
  val height: scala.Double
  val left: scala.Double
  val right: scala.Double
  val top: scala.Double
  val width: scala.Double
  val x: scala.Double
  val y: scala.Double
  def toJSON(): js.Any
}

@JSGlobal("DOMRectReadOnly")
@js.native
object DOMRectReadOnly
  extends org.scalablytyped.runtime.Instantiable0[DOMRectReadOnly]
     with org.scalablytyped.runtime.Instantiable1[/* x */ scala.Double, DOMRectReadOnly]
     with org.scalablytyped.runtime.Instantiable2[/* x */ scala.Double, /* y */ scala.Double, DOMRectReadOnly]
     with org.scalablytyped.runtime.Instantiable3[/* x */ scala.Double, /* y */ scala.Double, /* width */ scala.Double, DOMRectReadOnly]
     with org.scalablytyped.runtime.Instantiable4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      DOMRectReadOnly
    ] {
  def fromRect(): pdfjsDashDistLib.DOMRectReadOnly = js.native
  def fromRect(other: pdfjsDashDistLib.DOMRectInit): pdfjsDashDistLib.DOMRectReadOnly = js.native
}

