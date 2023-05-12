package typings.mirada.distSrcTypesOpencvTypesMod

import typings.mirada.distSrcTypesOpencvHacksMod.double
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada/dist/src/types/opencv/_types", "CLAHE")
@js.native
/**
  * @param clipLimit Threshold for contrast limiting. Default.  40.0,
  * @param totalGridSize Size of grid for histogram equalization. Input image will be divided into equally sized rectangular tiles. tileGridSize defines the number of tiles in row and column. Default: Size(8, 8)
  */
open class CLAHE ()
  extends typings.mirada.distSrcTypesOpencvHacksMod.CLAHE {
  def this(clipLimit: double) = this()
  def this(clipLimit: Unit, totalGridSize: typings.mirada.distSrcTypesOpencvHacksMod.Size) = this()
  def this(clipLimit: double, totalGridSize: typings.mirada.distSrcTypesOpencvHacksMod.Size) = this()
}
