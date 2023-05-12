package typings.mirada.distSrcTypesCvMod.global.cv

import org.scalablytyped.runtime.Instantiable2
import typings.mirada.distSrcTypesCvMod.global.cv.^
import typings.mirada.distSrcTypesOpencvHacksMod.double
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("cv.CLAHE")
@js.native
/**
  * @param clipLimit Threshold for contrast limiting. Default.  40.0,
  * @param totalGridSize Size of grid for histogram equalization. Input image will be divided into equally sized rectangular tiles. tileGridSize defines the number of tiles in row and column. Default: Size(8, 8)
  */
open class CLAHE ()
  extends typings.mirada.distSrcTypesOpencvTypesMod.CLAHE {
  def this(clipLimit: double) = this()
  def this(clipLimit: Unit, totalGridSize: typings.mirada.distSrcTypesOpencvHacksMod.Size) = this()
  def this(clipLimit: double, totalGridSize: typings.mirada.distSrcTypesOpencvHacksMod.Size) = this()
}
object CLAHE {
  
  inline def apply: Instantiable2[
    /* clipLimit */ js.UndefOr[double], 
    /* totalGridSize */ js.UndefOr[typings.mirada.distSrcTypesOpencvHacksMod.Size], 
    typings.mirada.distSrcTypesOpencvTypesMod.CLAHE
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("CLAHE").asInstanceOf[Instantiable2[
    /* clipLimit */ js.UndefOr[double], 
    /* totalGridSize */ js.UndefOr[typings.mirada.distSrcTypesOpencvHacksMod.Size], 
    typings.mirada.distSrcTypesOpencvTypesMod.CLAHE
  ]]
}
