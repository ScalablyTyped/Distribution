package typings.mirada.distSrcTypesOpencvMod

import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada/dist/src/types/opencv", "HOGDescriptor")
@js.native
/**
  *   aqual to [HOGDescriptor](Size(64,128), Size(16,16), Size(8,8), Size(8,8), 9 )
  */
open class HOGDescriptor ()
  extends typings.mirada.distSrcTypesOpencvTypesMod.HOGDescriptor {
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param d the HOGDescriptor which cloned to create a new one.
    */
  def this(d: typings.mirada.distSrcTypesOpencvHogdescriptorMod.HOGDescriptor) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param filename The file name containing HOGDescriptor properties and coefficients for the linear
    * SVM classifier.
    */
  def this(filename: String) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param _winSize sets winSize with given value.
    *
    * @param _blockSize sets blockSize with given value.
    *
    * @param _blockStride sets blockStride with given value.
    *
    * @param _cellSize sets cellSize with given value.
    *
    * @param _nbins sets nbins with given value.
    *
    * @param _derivAperture sets derivAperture with given value.
    *
    * @param _winSigma sets winSigma with given value.
    *
    * @param _histogramNormType sets histogramNormType with given value.
    *
    * @param _L2HysThreshold sets L2HysThreshold with given value.
    *
    * @param _gammaCorrection sets gammaCorrection with given value.
    *
    * @param _nlevels sets nlevels with given value.
    *
    * @param _signedGradient sets signedGradient with given value.
    */
  def this(
    _winSize: typings.mirada.distSrcTypesOpencvTypesMod.Size,
    _blockSize: typings.mirada.distSrcTypesOpencvTypesMod.Size,
    _blockStride: typings.mirada.distSrcTypesOpencvTypesMod.Size,
    _cellSize: typings.mirada.distSrcTypesOpencvTypesMod.Size,
    _nbins: int,
    _derivAperture: js.UndefOr[int],
    _winSigma: js.UndefOr[double],
    _histogramNormType: js.UndefOr[Any],
    _L2HysThreshold: js.UndefOr[double],
    _gammaCorrection: js.UndefOr[bool],
    _nlevels: js.UndefOr[int],
    _signedGradient: js.UndefOr[bool]
  ) = this()
}
/* static members */
object HOGDescriptor {
  
  @JSImport("mirada/dist/src/types/opencv", "HOGDescriptor")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDaimlerPeopleDetector(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDaimlerPeopleDetector")().asInstanceOf[Any]
  
  inline def getDefaultPeopleDetector(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultPeopleDetector")().asInstanceOf[Any]
}
