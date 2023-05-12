package typings.mirada.distSrcTypesCvMod.global.cv

import org.scalablytyped.runtime.Instantiable2
import typings.mirada.distSrcTypesCvMod.global.cv.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("cv.Range")
@js.native
open class Range protected ()
  extends typings.mirada.distSrcTypesOpencvTypesMod.Range {
  def this(start: Double, end: Double) = this()
}
object Range {
  
  inline def apply: Instantiable2[
    /* start */ Double, 
    /* end */ Double, 
    typings.mirada.distSrcTypesOpencvTypesMod.Range
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("Range").asInstanceOf[Instantiable2[
    /* start */ Double, 
    /* end */ Double, 
    typings.mirada.distSrcTypesOpencvTypesMod.Range
  ]]
}
