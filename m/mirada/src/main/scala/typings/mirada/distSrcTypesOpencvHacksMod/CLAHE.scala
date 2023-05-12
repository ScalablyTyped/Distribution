package typings.mirada.distSrcTypesOpencvHacksMod

import typings.mirada.distSrcTypesOpencvMod.Algorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada/dist/src/types/opencv/_hacks", "CLAHE")
@js.native
/**
  * @param clipLimit Threshold for contrast limiting. Default.  40.0,
  * @param totalGridSize Size of grid for histogram equalization. Input image will be divided into equally sized rectangular tiles. tileGridSize defines the number of tiles in row and column. Default: Size(8, 8)
  */
open class CLAHE () extends Algorithm {
  def this(clipLimit: double) = this()
  def this(clipLimit: Unit, totalGridSize: Size) = this()
  def this(clipLimit: double, totalGridSize: Size) = this()
  
  /**
    * Equalizes the histogram of a grayscale image using Contrast Limited Adaptive Histogram Equalization.
    * @param src Source image of type CV_8UC1 or CV_16UC1.
    * @param dst Destination image.
    */
  @JSName("apply")
  def apply(src: typings.mirada.distSrcTypesOpencvMod.Mat, dst: typings.mirada.distSrcTypesOpencvMod.Mat): Unit = js.native
  
  def collectGarbage(): Unit = js.native
  
  /**
    * Returns threshold value for contrast limiting.
    */
  def getClipLimit(): double = js.native
  
  /**
    * Returns Size defines the number of tiles in row and column.
    */
  def getTilesGridSize(): Size = js.native
  
  /**
    * Sets threshold for contrast limiting.
    */
  def setClipLimit(clipLimit: double): Unit = js.native
  
  /**
    * Sets size of grid for histogram equalization. Input image will be divided into equally sized rectangular tiles.
    * @param tileGridSize defines the number of tiles in row and column.
    */
  def setTilesGridSize(tileGridSize: Size): Unit = js.native
}
