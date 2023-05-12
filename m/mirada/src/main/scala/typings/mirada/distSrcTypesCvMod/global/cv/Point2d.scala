package typings.mirada.distSrcTypesCvMod.global.cv

import org.scalablytyped.runtime.Instantiable2
import typings.mirada.distSrcTypesCvMod.global.cv.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("cv.Point2d")
@js.native
open class Point2d protected ()
  extends typings.mirada.distSrcTypesOpencvTypesMod.Point2d {
  def this(width: Double, height: Double) = this()
}
object Point2d {
  
  inline def apply: Instantiable2[
    /* width */ Double, 
    /* height */ Double, 
    typings.mirada.distSrcTypesOpencvTypesMod.Point2d
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("Point2d").asInstanceOf[Instantiable2[
    /* width */ Double, 
    /* height */ Double, 
    typings.mirada.distSrcTypesOpencvTypesMod.Point2d
  ]]
}
