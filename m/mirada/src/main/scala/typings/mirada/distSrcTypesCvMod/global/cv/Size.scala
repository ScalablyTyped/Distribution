package typings.mirada.distSrcTypesCvMod.global.cv

import org.scalablytyped.runtime.Instantiable2
import typings.mirada.distSrcTypesCvMod.global.cv.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("cv.Size")
@js.native
open class Size protected ()
  extends typings.mirada.distSrcTypesOpencvTypesMod.Size {
  def this(width: Double, height: Double) = this()
}
object Size {
  
  inline def apply: Instantiable2[
    /* width */ Double, 
    /* height */ Double, 
    typings.mirada.distSrcTypesOpencvTypesMod.Size
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("Size").asInstanceOf[Instantiable2[
    /* width */ Double, 
    /* height */ Double, 
    typings.mirada.distSrcTypesOpencvTypesMod.Size
  ]]
}
