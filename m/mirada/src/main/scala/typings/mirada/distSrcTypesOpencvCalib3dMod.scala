package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.float
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvHacksMod.sizeT
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.InputArrayOfArrays
import typings.mirada.distSrcTypesOpencvTypesMod.InputOutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.Mat
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArrayOfArrays
import typings.mirada.distSrcTypesOpencvTypesMod.Point2d
import typings.mirada.distSrcTypesOpencvTypesMod.Rect
import typings.mirada.distSrcTypesOpencvTypesMod.Size
import typings.mirada.distSrcTypesOpencvTypesMod.TermCriteria
import typings.mirada.distSrcTypesOpencvTypesMod.Vec3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvCalib3dMod {
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_CB_ACCURACY")
  @js.native
  val CALIB_CB_ACCURACY: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_CB_ADAPTIVE_THRESH")
  @js.native
  val CALIB_CB_ADAPTIVE_THRESH: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_CB_ASYMMETRIC_GRID")
  @js.native
  val CALIB_CB_ASYMMETRIC_GRID: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_CB_CLUSTERING")
  @js.native
  val CALIB_CB_CLUSTERING: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_CB_EXHAUSTIVE")
  @js.native
  val CALIB_CB_EXHAUSTIVE: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_CB_FAST_CHECK")
  @js.native
  val CALIB_CB_FAST_CHECK: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_CB_FILTER_QUADS")
  @js.native
  val CALIB_CB_FILTER_QUADS: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_CB_NORMALIZE_IMAGE")
  @js.native
  val CALIB_CB_NORMALIZE_IMAGE: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_CB_SYMMETRIC_GRID")
  @js.native
  val CALIB_CB_SYMMETRIC_GRID: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_FIX_ASPECT_RATIO")
  @js.native
  val CALIB_FIX_ASPECT_RATIO: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_FIX_FOCAL_LENGTH")
  @js.native
  val CALIB_FIX_FOCAL_LENGTH: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_FIX_INTRINSIC")
  @js.native
  val CALIB_FIX_INTRINSIC: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_FIX_K1")
  @js.native
  val CALIB_FIX_K1: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_FIX_K2")
  @js.native
  val CALIB_FIX_K2: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_FIX_K3")
  @js.native
  val CALIB_FIX_K3: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_FIX_K4")
  @js.native
  val CALIB_FIX_K4: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_FIX_K5")
  @js.native
  val CALIB_FIX_K5: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_FIX_K6")
  @js.native
  val CALIB_FIX_K6: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_FIX_PRINCIPAL_POINT")
  @js.native
  val CALIB_FIX_PRINCIPAL_POINT: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_FIX_S1_S2_S3_S4")
  @js.native
  val CALIB_FIX_S1_S2_S3_S4: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_FIX_TANGENT_DIST")
  @js.native
  val CALIB_FIX_TANGENT_DIST: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_FIX_TAUX_TAUY")
  @js.native
  val CALIB_FIX_TAUX_TAUY: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_HAND_EYE_ANDREFF")
  @js.native
  val CALIB_HAND_EYE_ANDREFF: HandEyeCalibrationMethod = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_HAND_EYE_DANIILIDIS")
  @js.native
  val CALIB_HAND_EYE_DANIILIDIS: HandEyeCalibrationMethod = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_HAND_EYE_HORAUD")
  @js.native
  val CALIB_HAND_EYE_HORAUD: HandEyeCalibrationMethod = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_HAND_EYE_PARK")
  @js.native
  val CALIB_HAND_EYE_PARK: HandEyeCalibrationMethod = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_HAND_EYE_TSAI")
  @js.native
  val CALIB_HAND_EYE_TSAI: HandEyeCalibrationMethod = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_NINTRINSIC")
  @js.native
  val CALIB_NINTRINSIC: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_RATIONAL_MODEL")
  @js.native
  val CALIB_RATIONAL_MODEL: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_SAME_FOCAL_LENGTH")
  @js.native
  val CALIB_SAME_FOCAL_LENGTH: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_THIN_PRISM_MODEL")
  @js.native
  val CALIB_THIN_PRISM_MODEL: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_TILTED_MODEL")
  @js.native
  val CALIB_TILTED_MODEL: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_USE_EXTRINSIC_GUESS")
  @js.native
  val CALIB_USE_EXTRINSIC_GUESS: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_USE_INTRINSIC_GUESS")
  @js.native
  val CALIB_USE_INTRINSIC_GUESS: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_USE_LU")
  @js.native
  val CALIB_USE_LU: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_USE_QR")
  @js.native
  val CALIB_USE_QR: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_ZERO_DISPARITY")
  @js.native
  val CALIB_ZERO_DISPARITY: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "CALIB_ZERO_TANGENT_DIST")
  @js.native
  val CALIB_ZERO_TANGENT_DIST: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "FM_7POINT")
  @js.native
  val FM_7POINT: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "FM_8POINT")
  @js.native
  val FM_8POINT: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "FM_LMEDS")
  @js.native
  val FM_LMEDS: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "FM_RANSAC")
  @js.native
  val FM_RANSAC: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "LMEDS")
  @js.native
  val LMEDS: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "PROJ_SPHERICAL_EQRECT")
  @js.native
  val PROJ_SPHERICAL_EQRECT: UndistortTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "PROJ_SPHERICAL_ORTHO")
  @js.native
  val PROJ_SPHERICAL_ORTHO: UndistortTypes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "RANSAC")
  @js.native
  val RANSAC: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "RHO")
  @js.native
  val RHO: Any = js.native
  
  inline def RQDecomp3x3(src: InputArray, mtxR: OutputArray, mtxQ: OutputArray): Vec3d = (^.asInstanceOf[js.Dynamic].applyDynamic("RQDecomp3x3")(src.asInstanceOf[js.Any], mtxR.asInstanceOf[js.Any], mtxQ.asInstanceOf[js.Any])).asInstanceOf[Vec3d]
  inline def RQDecomp3x3(src: InputArray, mtxR: OutputArray, mtxQ: OutputArray, Qx: Unit, Qy: Unit, Qz: OutputArray): Vec3d = (^.asInstanceOf[js.Dynamic].applyDynamic("RQDecomp3x3")(src.asInstanceOf[js.Any], mtxR.asInstanceOf[js.Any], mtxQ.asInstanceOf[js.Any], Qx.asInstanceOf[js.Any], Qy.asInstanceOf[js.Any], Qz.asInstanceOf[js.Any])).asInstanceOf[Vec3d]
  inline def RQDecomp3x3(src: InputArray, mtxR: OutputArray, mtxQ: OutputArray, Qx: Unit, Qy: OutputArray): Vec3d = (^.asInstanceOf[js.Dynamic].applyDynamic("RQDecomp3x3")(src.asInstanceOf[js.Any], mtxR.asInstanceOf[js.Any], mtxQ.asInstanceOf[js.Any], Qx.asInstanceOf[js.Any], Qy.asInstanceOf[js.Any])).asInstanceOf[Vec3d]
  inline def RQDecomp3x3(src: InputArray, mtxR: OutputArray, mtxQ: OutputArray, Qx: Unit, Qy: OutputArray, Qz: OutputArray): Vec3d = (^.asInstanceOf[js.Dynamic].applyDynamic("RQDecomp3x3")(src.asInstanceOf[js.Any], mtxR.asInstanceOf[js.Any], mtxQ.asInstanceOf[js.Any], Qx.asInstanceOf[js.Any], Qy.asInstanceOf[js.Any], Qz.asInstanceOf[js.Any])).asInstanceOf[Vec3d]
  inline def RQDecomp3x3(src: InputArray, mtxR: OutputArray, mtxQ: OutputArray, Qx: OutputArray): Vec3d = (^.asInstanceOf[js.Dynamic].applyDynamic("RQDecomp3x3")(src.asInstanceOf[js.Any], mtxR.asInstanceOf[js.Any], mtxQ.asInstanceOf[js.Any], Qx.asInstanceOf[js.Any])).asInstanceOf[Vec3d]
  inline def RQDecomp3x3(src: InputArray, mtxR: OutputArray, mtxQ: OutputArray, Qx: OutputArray, Qy: Unit, Qz: OutputArray): Vec3d = (^.asInstanceOf[js.Dynamic].applyDynamic("RQDecomp3x3")(src.asInstanceOf[js.Any], mtxR.asInstanceOf[js.Any], mtxQ.asInstanceOf[js.Any], Qx.asInstanceOf[js.Any], Qy.asInstanceOf[js.Any], Qz.asInstanceOf[js.Any])).asInstanceOf[Vec3d]
  inline def RQDecomp3x3(src: InputArray, mtxR: OutputArray, mtxQ: OutputArray, Qx: OutputArray, Qy: OutputArray): Vec3d = (^.asInstanceOf[js.Dynamic].applyDynamic("RQDecomp3x3")(src.asInstanceOf[js.Any], mtxR.asInstanceOf[js.Any], mtxQ.asInstanceOf[js.Any], Qx.asInstanceOf[js.Any], Qy.asInstanceOf[js.Any])).asInstanceOf[Vec3d]
  inline def RQDecomp3x3(
    src: InputArray,
    mtxR: OutputArray,
    mtxQ: OutputArray,
    Qx: OutputArray,
    Qy: OutputArray,
    Qz: OutputArray
  ): Vec3d = (^.asInstanceOf[js.Dynamic].applyDynamic("RQDecomp3x3")(src.asInstanceOf[js.Any], mtxR.asInstanceOf[js.Any], mtxQ.asInstanceOf[js.Any], Qx.asInstanceOf[js.Any], Qy.asInstanceOf[js.Any], Qz.asInstanceOf[js.Any])).asInstanceOf[Vec3d]
  
  inline def Rodrigues(src: InputArray, dst: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Rodrigues")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Rodrigues(src: InputArray, dst: OutputArray, jacobian: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Rodrigues")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], jacobian.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "SOLVEPNP_AP3P")
  @js.native
  val SOLVEPNP_AP3P: SolvePnPMethod = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "SOLVEPNP_DLS")
  @js.native
  val SOLVEPNP_DLS: SolvePnPMethod = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "SOLVEPNP_EPNP")
  @js.native
  val SOLVEPNP_EPNP: SolvePnPMethod = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "SOLVEPNP_IPPE")
  @js.native
  val SOLVEPNP_IPPE: SolvePnPMethod = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "SOLVEPNP_IPPE_SQUARE")
  @js.native
  val SOLVEPNP_IPPE_SQUARE: SolvePnPMethod = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "SOLVEPNP_ITERATIVE")
  @js.native
  val SOLVEPNP_ITERATIVE: SolvePnPMethod = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "SOLVEPNP_P3P")
  @js.native
  val SOLVEPNP_P3P: SolvePnPMethod = js.native
  
  @JSImport("mirada/dist/src/types/opencv/calib3d", "SOLVEPNP_UPNP")
  @js.native
  val SOLVEPNP_UPNP: SolvePnPMethod = js.native
  
  inline def calibrateCamera(
    objectPoints: InputArrayOfArrays,
    imagePoints: InputArrayOfArrays,
    imageSize: Size,
    cameraMatrix: InputOutputArray,
    distCoeffs: InputOutputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrateCamera")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def calibrateCamera(
    objectPoints: InputArrayOfArrays,
    imagePoints: InputArrayOfArrays,
    imageSize: Size,
    cameraMatrix: InputOutputArray,
    distCoeffs: InputOutputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    flags: Unit,
    criteria: TermCriteria
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrateCamera")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def calibrateCamera(
    objectPoints: InputArrayOfArrays,
    imagePoints: InputArrayOfArrays,
    imageSize: Size,
    cameraMatrix: InputOutputArray,
    distCoeffs: InputOutputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    flags: int
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrateCamera")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def calibrateCamera(
    objectPoints: InputArrayOfArrays,
    imagePoints: InputArrayOfArrays,
    imageSize: Size,
    cameraMatrix: InputOutputArray,
    distCoeffs: InputOutputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    flags: int,
    criteria: TermCriteria
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrateCamera")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def calibrateCamera(
    objectPoints: InputArrayOfArrays,
    imagePoints: InputArrayOfArrays,
    imageSize: Size,
    cameraMatrix: InputOutputArray,
    distCoeffs: InputOutputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    stdDeviationsIntrinsics: OutputArray,
    stdDeviationsExtrinsics: OutputArray,
    perViewErrors: OutputArray
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrateCamera")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], stdDeviationsIntrinsics.asInstanceOf[js.Any], stdDeviationsExtrinsics.asInstanceOf[js.Any], perViewErrors.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def calibrateCamera(
    objectPoints: InputArrayOfArrays,
    imagePoints: InputArrayOfArrays,
    imageSize: Size,
    cameraMatrix: InputOutputArray,
    distCoeffs: InputOutputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    stdDeviationsIntrinsics: OutputArray,
    stdDeviationsExtrinsics: OutputArray,
    perViewErrors: OutputArray,
    flags: Unit,
    criteria: TermCriteria
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrateCamera")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], stdDeviationsIntrinsics.asInstanceOf[js.Any], stdDeviationsExtrinsics.asInstanceOf[js.Any], perViewErrors.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def calibrateCamera(
    objectPoints: InputArrayOfArrays,
    imagePoints: InputArrayOfArrays,
    imageSize: Size,
    cameraMatrix: InputOutputArray,
    distCoeffs: InputOutputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    stdDeviationsIntrinsics: OutputArray,
    stdDeviationsExtrinsics: OutputArray,
    perViewErrors: OutputArray,
    flags: int
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrateCamera")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], stdDeviationsIntrinsics.asInstanceOf[js.Any], stdDeviationsExtrinsics.asInstanceOf[js.Any], perViewErrors.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def calibrateCamera(
    objectPoints: InputArrayOfArrays,
    imagePoints: InputArrayOfArrays,
    imageSize: Size,
    cameraMatrix: InputOutputArray,
    distCoeffs: InputOutputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    stdDeviationsIntrinsics: OutputArray,
    stdDeviationsExtrinsics: OutputArray,
    perViewErrors: OutputArray,
    flags: int,
    criteria: TermCriteria
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrateCamera")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], stdDeviationsIntrinsics.asInstanceOf[js.Any], stdDeviationsExtrinsics.asInstanceOf[js.Any], perViewErrors.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[double]
  
  inline def calibrateCameraRO(
    objectPoints: InputArrayOfArrays,
    imagePoints: InputArrayOfArrays,
    imageSize: Size,
    iFixedPoint: int,
    cameraMatrix: InputOutputArray,
    distCoeffs: InputOutputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    newObjPoints: OutputArray
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrateCameraRO")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], iFixedPoint.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], newObjPoints.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def calibrateCameraRO(
    objectPoints: InputArrayOfArrays,
    imagePoints: InputArrayOfArrays,
    imageSize: Size,
    iFixedPoint: int,
    cameraMatrix: InputOutputArray,
    distCoeffs: InputOutputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    newObjPoints: OutputArray,
    flags: Unit,
    criteria: TermCriteria
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrateCameraRO")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], iFixedPoint.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], newObjPoints.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def calibrateCameraRO(
    objectPoints: InputArrayOfArrays,
    imagePoints: InputArrayOfArrays,
    imageSize: Size,
    iFixedPoint: int,
    cameraMatrix: InputOutputArray,
    distCoeffs: InputOutputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    newObjPoints: OutputArray,
    flags: int
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrateCameraRO")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], iFixedPoint.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], newObjPoints.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def calibrateCameraRO(
    objectPoints: InputArrayOfArrays,
    imagePoints: InputArrayOfArrays,
    imageSize: Size,
    iFixedPoint: int,
    cameraMatrix: InputOutputArray,
    distCoeffs: InputOutputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    newObjPoints: OutputArray,
    flags: int,
    criteria: TermCriteria
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrateCameraRO")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], iFixedPoint.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], newObjPoints.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def calibrateCameraRO(
    objectPoints: InputArrayOfArrays,
    imagePoints: InputArrayOfArrays,
    imageSize: Size,
    iFixedPoint: int,
    cameraMatrix: InputOutputArray,
    distCoeffs: InputOutputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    newObjPoints: OutputArray,
    stdDeviationsIntrinsics: OutputArray,
    stdDeviationsExtrinsics: OutputArray,
    stdDeviationsObjPoints: OutputArray,
    perViewErrors: OutputArray
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrateCameraRO")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], iFixedPoint.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], newObjPoints.asInstanceOf[js.Any], stdDeviationsIntrinsics.asInstanceOf[js.Any], stdDeviationsExtrinsics.asInstanceOf[js.Any], stdDeviationsObjPoints.asInstanceOf[js.Any], perViewErrors.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def calibrateCameraRO(
    objectPoints: InputArrayOfArrays,
    imagePoints: InputArrayOfArrays,
    imageSize: Size,
    iFixedPoint: int,
    cameraMatrix: InputOutputArray,
    distCoeffs: InputOutputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    newObjPoints: OutputArray,
    stdDeviationsIntrinsics: OutputArray,
    stdDeviationsExtrinsics: OutputArray,
    stdDeviationsObjPoints: OutputArray,
    perViewErrors: OutputArray,
    flags: Unit,
    criteria: TermCriteria
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrateCameraRO")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], iFixedPoint.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], newObjPoints.asInstanceOf[js.Any], stdDeviationsIntrinsics.asInstanceOf[js.Any], stdDeviationsExtrinsics.asInstanceOf[js.Any], stdDeviationsObjPoints.asInstanceOf[js.Any], perViewErrors.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def calibrateCameraRO(
    objectPoints: InputArrayOfArrays,
    imagePoints: InputArrayOfArrays,
    imageSize: Size,
    iFixedPoint: int,
    cameraMatrix: InputOutputArray,
    distCoeffs: InputOutputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    newObjPoints: OutputArray,
    stdDeviationsIntrinsics: OutputArray,
    stdDeviationsExtrinsics: OutputArray,
    stdDeviationsObjPoints: OutputArray,
    perViewErrors: OutputArray,
    flags: int
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrateCameraRO")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], iFixedPoint.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], newObjPoints.asInstanceOf[js.Any], stdDeviationsIntrinsics.asInstanceOf[js.Any], stdDeviationsExtrinsics.asInstanceOf[js.Any], stdDeviationsObjPoints.asInstanceOf[js.Any], perViewErrors.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def calibrateCameraRO(
    objectPoints: InputArrayOfArrays,
    imagePoints: InputArrayOfArrays,
    imageSize: Size,
    iFixedPoint: int,
    cameraMatrix: InputOutputArray,
    distCoeffs: InputOutputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    newObjPoints: OutputArray,
    stdDeviationsIntrinsics: OutputArray,
    stdDeviationsExtrinsics: OutputArray,
    stdDeviationsObjPoints: OutputArray,
    perViewErrors: OutputArray,
    flags: int,
    criteria: TermCriteria
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrateCameraRO")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], iFixedPoint.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], newObjPoints.asInstanceOf[js.Any], stdDeviationsIntrinsics.asInstanceOf[js.Any], stdDeviationsExtrinsics.asInstanceOf[js.Any], stdDeviationsObjPoints.asInstanceOf[js.Any], perViewErrors.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[double]
  
  inline def calibrateHandEye(
    R_gripper2base: InputArrayOfArrays,
    t_gripper2base: InputArrayOfArrays,
    R_target2cam: InputArrayOfArrays,
    t_target2cam: InputArrayOfArrays,
    R_cam2gripper: OutputArray,
    t_cam2gripper: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrateHandEye")(R_gripper2base.asInstanceOf[js.Any], t_gripper2base.asInstanceOf[js.Any], R_target2cam.asInstanceOf[js.Any], t_target2cam.asInstanceOf[js.Any], R_cam2gripper.asInstanceOf[js.Any], t_cam2gripper.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calibrateHandEye(
    R_gripper2base: InputArrayOfArrays,
    t_gripper2base: InputArrayOfArrays,
    R_target2cam: InputArrayOfArrays,
    t_target2cam: InputArrayOfArrays,
    R_cam2gripper: OutputArray,
    t_cam2gripper: OutputArray,
    method: HandEyeCalibrationMethod
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrateHandEye")(R_gripper2base.asInstanceOf[js.Any], t_gripper2base.asInstanceOf[js.Any], R_target2cam.asInstanceOf[js.Any], t_target2cam.asInstanceOf[js.Any], R_cam2gripper.asInstanceOf[js.Any], t_cam2gripper.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def calibrationMatrixValues(
    cameraMatrix: InputArray,
    imageSize: Size,
    apertureWidth: double,
    apertureHeight: double,
    fovx: Any,
    fovy: Any,
    focalLength: Any,
    principalPoint: Any,
    aspectRatio: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calibrationMatrixValues")(cameraMatrix.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], apertureWidth.asInstanceOf[js.Any], apertureHeight.asInstanceOf[js.Any], fovx.asInstanceOf[js.Any], fovy.asInstanceOf[js.Any], focalLength.asInstanceOf[js.Any], principalPoint.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkChessboard(img: InputArray, size: Size): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("checkChessboard")(img.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[bool]
  
  inline def composeRT(
    rvec1: InputArray,
    tvec1: InputArray,
    rvec2: InputArray,
    tvec2: InputArray,
    rvec3: OutputArray,
    tvec3: OutputArray,
    dr3dr1: js.UndefOr[OutputArray],
    dr3dt1: js.UndefOr[OutputArray],
    dr3dr2: js.UndefOr[OutputArray],
    dr3dt2: js.UndefOr[OutputArray],
    dt3dr1: js.UndefOr[OutputArray],
    dt3dt1: js.UndefOr[OutputArray],
    dt3dr2: js.UndefOr[OutputArray],
    dt3dt2: js.UndefOr[OutputArray]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("composeRT")(rvec1.asInstanceOf[js.Any], tvec1.asInstanceOf[js.Any], rvec2.asInstanceOf[js.Any], tvec2.asInstanceOf[js.Any], rvec3.asInstanceOf[js.Any], tvec3.asInstanceOf[js.Any], dr3dr1.asInstanceOf[js.Any], dr3dt1.asInstanceOf[js.Any], dr3dr2.asInstanceOf[js.Any], dr3dt2.asInstanceOf[js.Any], dt3dr1.asInstanceOf[js.Any], dt3dt1.asInstanceOf[js.Any], dt3dr2.asInstanceOf[js.Any], dt3dt2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def computeCorrespondEpilines(points: InputArray, whichImage: int, F: InputArray, lines: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCorrespondEpilines")(points.asInstanceOf[js.Any], whichImage.asInstanceOf[js.Any], F.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def convertPointsFromHomogeneous(src: InputArray, dst: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPointsFromHomogeneous")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def convertPointsHomogeneous(src: InputArray, dst: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPointsHomogeneous")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def convertPointsToHomogeneous(src: InputArray, dst: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPointsToHomogeneous")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def correctMatches(
    F: InputArray,
    points1: InputArray,
    points2: InputArray,
    newPoints1: OutputArray,
    newPoints2: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("correctMatches")(F.asInstanceOf[js.Any], points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], newPoints1.asInstanceOf[js.Any], newPoints2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def decomposeEssentialMat(E: InputArray, R1: OutputArray, R2: OutputArray, t: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeEssentialMat")(E.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def decomposeHomographyMat(
    H: InputArray,
    K: InputArray,
    rotations: OutputArrayOfArrays,
    translations: OutputArrayOfArrays,
    normals: OutputArrayOfArrays
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeHomographyMat")(H.asInstanceOf[js.Any], K.asInstanceOf[js.Any], rotations.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], normals.asInstanceOf[js.Any])).asInstanceOf[int]
  
  inline def decomposeProjectionMatrix(projMatrix: InputArray, cameraMatrix: OutputArray, rotMatrix: OutputArray, transVect: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeProjectionMatrix")(projMatrix.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], rotMatrix.asInstanceOf[js.Any], transVect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decomposeProjectionMatrix(
    projMatrix: InputArray,
    cameraMatrix: OutputArray,
    rotMatrix: OutputArray,
    transVect: OutputArray,
    rotMatrixX: Unit,
    rotMatrixY: Unit,
    rotMatrixZ: Unit,
    eulerAngles: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeProjectionMatrix")(projMatrix.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], rotMatrix.asInstanceOf[js.Any], transVect.asInstanceOf[js.Any], rotMatrixX.asInstanceOf[js.Any], rotMatrixY.asInstanceOf[js.Any], rotMatrixZ.asInstanceOf[js.Any], eulerAngles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decomposeProjectionMatrix(
    projMatrix: InputArray,
    cameraMatrix: OutputArray,
    rotMatrix: OutputArray,
    transVect: OutputArray,
    rotMatrixX: Unit,
    rotMatrixY: Unit,
    rotMatrixZ: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeProjectionMatrix")(projMatrix.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], rotMatrix.asInstanceOf[js.Any], transVect.asInstanceOf[js.Any], rotMatrixX.asInstanceOf[js.Any], rotMatrixY.asInstanceOf[js.Any], rotMatrixZ.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decomposeProjectionMatrix(
    projMatrix: InputArray,
    cameraMatrix: OutputArray,
    rotMatrix: OutputArray,
    transVect: OutputArray,
    rotMatrixX: Unit,
    rotMatrixY: Unit,
    rotMatrixZ: OutputArray,
    eulerAngles: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeProjectionMatrix")(projMatrix.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], rotMatrix.asInstanceOf[js.Any], transVect.asInstanceOf[js.Any], rotMatrixX.asInstanceOf[js.Any], rotMatrixY.asInstanceOf[js.Any], rotMatrixZ.asInstanceOf[js.Any], eulerAngles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decomposeProjectionMatrix(
    projMatrix: InputArray,
    cameraMatrix: OutputArray,
    rotMatrix: OutputArray,
    transVect: OutputArray,
    rotMatrixX: Unit,
    rotMatrixY: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeProjectionMatrix")(projMatrix.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], rotMatrix.asInstanceOf[js.Any], transVect.asInstanceOf[js.Any], rotMatrixX.asInstanceOf[js.Any], rotMatrixY.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decomposeProjectionMatrix(
    projMatrix: InputArray,
    cameraMatrix: OutputArray,
    rotMatrix: OutputArray,
    transVect: OutputArray,
    rotMatrixX: Unit,
    rotMatrixY: OutputArray,
    rotMatrixZ: Unit,
    eulerAngles: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeProjectionMatrix")(projMatrix.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], rotMatrix.asInstanceOf[js.Any], transVect.asInstanceOf[js.Any], rotMatrixX.asInstanceOf[js.Any], rotMatrixY.asInstanceOf[js.Any], rotMatrixZ.asInstanceOf[js.Any], eulerAngles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decomposeProjectionMatrix(
    projMatrix: InputArray,
    cameraMatrix: OutputArray,
    rotMatrix: OutputArray,
    transVect: OutputArray,
    rotMatrixX: Unit,
    rotMatrixY: OutputArray,
    rotMatrixZ: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeProjectionMatrix")(projMatrix.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], rotMatrix.asInstanceOf[js.Any], transVect.asInstanceOf[js.Any], rotMatrixX.asInstanceOf[js.Any], rotMatrixY.asInstanceOf[js.Any], rotMatrixZ.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decomposeProjectionMatrix(
    projMatrix: InputArray,
    cameraMatrix: OutputArray,
    rotMatrix: OutputArray,
    transVect: OutputArray,
    rotMatrixX: Unit,
    rotMatrixY: OutputArray,
    rotMatrixZ: OutputArray,
    eulerAngles: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeProjectionMatrix")(projMatrix.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], rotMatrix.asInstanceOf[js.Any], transVect.asInstanceOf[js.Any], rotMatrixX.asInstanceOf[js.Any], rotMatrixY.asInstanceOf[js.Any], rotMatrixZ.asInstanceOf[js.Any], eulerAngles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decomposeProjectionMatrix(
    projMatrix: InputArray,
    cameraMatrix: OutputArray,
    rotMatrix: OutputArray,
    transVect: OutputArray,
    rotMatrixX: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeProjectionMatrix")(projMatrix.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], rotMatrix.asInstanceOf[js.Any], transVect.asInstanceOf[js.Any], rotMatrixX.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decomposeProjectionMatrix(
    projMatrix: InputArray,
    cameraMatrix: OutputArray,
    rotMatrix: OutputArray,
    transVect: OutputArray,
    rotMatrixX: OutputArray,
    rotMatrixY: Unit,
    rotMatrixZ: Unit,
    eulerAngles: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeProjectionMatrix")(projMatrix.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], rotMatrix.asInstanceOf[js.Any], transVect.asInstanceOf[js.Any], rotMatrixX.asInstanceOf[js.Any], rotMatrixY.asInstanceOf[js.Any], rotMatrixZ.asInstanceOf[js.Any], eulerAngles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decomposeProjectionMatrix(
    projMatrix: InputArray,
    cameraMatrix: OutputArray,
    rotMatrix: OutputArray,
    transVect: OutputArray,
    rotMatrixX: OutputArray,
    rotMatrixY: Unit,
    rotMatrixZ: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeProjectionMatrix")(projMatrix.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], rotMatrix.asInstanceOf[js.Any], transVect.asInstanceOf[js.Any], rotMatrixX.asInstanceOf[js.Any], rotMatrixY.asInstanceOf[js.Any], rotMatrixZ.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decomposeProjectionMatrix(
    projMatrix: InputArray,
    cameraMatrix: OutputArray,
    rotMatrix: OutputArray,
    transVect: OutputArray,
    rotMatrixX: OutputArray,
    rotMatrixY: Unit,
    rotMatrixZ: OutputArray,
    eulerAngles: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeProjectionMatrix")(projMatrix.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], rotMatrix.asInstanceOf[js.Any], transVect.asInstanceOf[js.Any], rotMatrixX.asInstanceOf[js.Any], rotMatrixY.asInstanceOf[js.Any], rotMatrixZ.asInstanceOf[js.Any], eulerAngles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decomposeProjectionMatrix(
    projMatrix: InputArray,
    cameraMatrix: OutputArray,
    rotMatrix: OutputArray,
    transVect: OutputArray,
    rotMatrixX: OutputArray,
    rotMatrixY: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeProjectionMatrix")(projMatrix.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], rotMatrix.asInstanceOf[js.Any], transVect.asInstanceOf[js.Any], rotMatrixX.asInstanceOf[js.Any], rotMatrixY.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decomposeProjectionMatrix(
    projMatrix: InputArray,
    cameraMatrix: OutputArray,
    rotMatrix: OutputArray,
    transVect: OutputArray,
    rotMatrixX: OutputArray,
    rotMatrixY: OutputArray,
    rotMatrixZ: Unit,
    eulerAngles: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeProjectionMatrix")(projMatrix.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], rotMatrix.asInstanceOf[js.Any], transVect.asInstanceOf[js.Any], rotMatrixX.asInstanceOf[js.Any], rotMatrixY.asInstanceOf[js.Any], rotMatrixZ.asInstanceOf[js.Any], eulerAngles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decomposeProjectionMatrix(
    projMatrix: InputArray,
    cameraMatrix: OutputArray,
    rotMatrix: OutputArray,
    transVect: OutputArray,
    rotMatrixX: OutputArray,
    rotMatrixY: OutputArray,
    rotMatrixZ: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeProjectionMatrix")(projMatrix.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], rotMatrix.asInstanceOf[js.Any], transVect.asInstanceOf[js.Any], rotMatrixX.asInstanceOf[js.Any], rotMatrixY.asInstanceOf[js.Any], rotMatrixZ.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decomposeProjectionMatrix(
    projMatrix: InputArray,
    cameraMatrix: OutputArray,
    rotMatrix: OutputArray,
    transVect: OutputArray,
    rotMatrixX: OutputArray,
    rotMatrixY: OutputArray,
    rotMatrixZ: OutputArray,
    eulerAngles: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeProjectionMatrix")(projMatrix.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], rotMatrix.asInstanceOf[js.Any], transVect.asInstanceOf[js.Any], rotMatrixX.asInstanceOf[js.Any], rotMatrixY.asInstanceOf[js.Any], rotMatrixZ.asInstanceOf[js.Any], eulerAngles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def drawChessboardCorners(image: InputOutputArray, patternSize: Size, corners: InputArray, patternWasFound: bool): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawChessboardCorners")(image.asInstanceOf[js.Any], patternSize.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], patternWasFound.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def drawFrameAxes(
    image: InputOutputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvec: InputArray,
    tvec: InputArray,
    length: float
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawFrameAxes")(image.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawFrameAxes(
    image: InputOutputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvec: InputArray,
    tvec: InputArray,
    length: float,
    thickness: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawFrameAxes")(image.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], length.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def estimateAffine2D(
    from: InputArray,
    to: InputArray,
    inliers: js.UndefOr[OutputArray],
    method: js.UndefOr[int],
    ransacReprojThreshold: js.UndefOr[double],
    maxIters: js.UndefOr[sizeT],
    confidence: js.UndefOr[double],
    refineIters: js.UndefOr[sizeT]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("estimateAffine2D")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], inliers.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any], refineIters.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def estimateAffine3D(src: InputArray, dst: InputArray, out: OutputArray, inliers: OutputArray): int = (^.asInstanceOf[js.Dynamic].applyDynamic("estimateAffine3D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], out.asInstanceOf[js.Any], inliers.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def estimateAffine3D(
    src: InputArray,
    dst: InputArray,
    out: OutputArray,
    inliers: OutputArray,
    ransacThreshold: Unit,
    confidence: double
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("estimateAffine3D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], out.asInstanceOf[js.Any], inliers.asInstanceOf[js.Any], ransacThreshold.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def estimateAffine3D(src: InputArray, dst: InputArray, out: OutputArray, inliers: OutputArray, ransacThreshold: double): int = (^.asInstanceOf[js.Dynamic].applyDynamic("estimateAffine3D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], out.asInstanceOf[js.Any], inliers.asInstanceOf[js.Any], ransacThreshold.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def estimateAffine3D(
    src: InputArray,
    dst: InputArray,
    out: OutputArray,
    inliers: OutputArray,
    ransacThreshold: double,
    confidence: double
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("estimateAffine3D")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], out.asInstanceOf[js.Any], inliers.asInstanceOf[js.Any], ransacThreshold.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[int]
  
  inline def estimateAffinePartial2D(
    from: InputArray,
    to: InputArray,
    inliers: js.UndefOr[OutputArray],
    method: js.UndefOr[int],
    ransacReprojThreshold: js.UndefOr[double],
    maxIters: js.UndefOr[sizeT],
    confidence: js.UndefOr[double],
    refineIters: js.UndefOr[sizeT]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("estimateAffinePartial2D")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], inliers.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any], refineIters.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def filterHomographyDecompByVisibleRefpoints(
    rotations: InputArrayOfArrays,
    normals: InputArrayOfArrays,
    beforePoints: InputArray,
    afterPoints: InputArray,
    possibleSolutions: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filterHomographyDecompByVisibleRefpoints")(rotations.asInstanceOf[js.Any], normals.asInstanceOf[js.Any], beforePoints.asInstanceOf[js.Any], afterPoints.asInstanceOf[js.Any], possibleSolutions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def filterHomographyDecompByVisibleRefpoints(
    rotations: InputArrayOfArrays,
    normals: InputArrayOfArrays,
    beforePoints: InputArray,
    afterPoints: InputArray,
    possibleSolutions: OutputArray,
    pointsMask: InputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filterHomographyDecompByVisibleRefpoints")(rotations.asInstanceOf[js.Any], normals.asInstanceOf[js.Any], beforePoints.asInstanceOf[js.Any], afterPoints.asInstanceOf[js.Any], possibleSolutions.asInstanceOf[js.Any], pointsMask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def filterSpeckles(img: InputOutputArray, newVal: double, maxSpeckleSize: int, maxDiff: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filterSpeckles")(img.asInstanceOf[js.Any], newVal.asInstanceOf[js.Any], maxSpeckleSize.asInstanceOf[js.Any], maxDiff.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def filterSpeckles(img: InputOutputArray, newVal: double, maxSpeckleSize: int, maxDiff: double, buf: InputOutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filterSpeckles")(img.asInstanceOf[js.Any], newVal.asInstanceOf[js.Any], maxSpeckleSize.asInstanceOf[js.Any], maxDiff.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def find4QuadCornerSubpix(img: InputArray, corners: InputOutputArray, region_size: Size): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("find4QuadCornerSubpix")(img.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], region_size.asInstanceOf[js.Any])).asInstanceOf[bool]
  
  inline def findChessboardCorners(image: InputArray, patternSize: Size, corners: OutputArray): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("findChessboardCorners")(image.asInstanceOf[js.Any], patternSize.asInstanceOf[js.Any], corners.asInstanceOf[js.Any])).asInstanceOf[bool]
  inline def findChessboardCorners(image: InputArray, patternSize: Size, corners: OutputArray, flags: int): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("findChessboardCorners")(image.asInstanceOf[js.Any], patternSize.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[bool]
  
  inline def findChessboardCornersSB(image: InputArray, patternSize: Size, corners: OutputArray): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("findChessboardCornersSB")(image.asInstanceOf[js.Any], patternSize.asInstanceOf[js.Any], corners.asInstanceOf[js.Any])).asInstanceOf[bool]
  inline def findChessboardCornersSB(image: InputArray, patternSize: Size, corners: OutputArray, flags: int): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("findChessboardCornersSB")(image.asInstanceOf[js.Any], patternSize.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[bool]
  
  inline def findCirclesGrid(image: InputArray, patternSize: Size, centers: OutputArray): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("findCirclesGrid")(image.asInstanceOf[js.Any], patternSize.asInstanceOf[js.Any], centers.asInstanceOf[js.Any])).asInstanceOf[bool]
  inline def findCirclesGrid(image: InputArray, patternSize: Size, centers: OutputArray, flags: Unit, blobDetector: Any): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("findCirclesGrid")(image.asInstanceOf[js.Any], patternSize.asInstanceOf[js.Any], centers.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], blobDetector.asInstanceOf[js.Any])).asInstanceOf[bool]
  inline def findCirclesGrid(image: InputArray, patternSize: Size, centers: OutputArray, flags: int): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("findCirclesGrid")(image.asInstanceOf[js.Any], patternSize.asInstanceOf[js.Any], centers.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[bool]
  inline def findCirclesGrid(image: InputArray, patternSize: Size, centers: OutputArray, flags: int, blobDetector: Any): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("findCirclesGrid")(image.asInstanceOf[js.Any], patternSize.asInstanceOf[js.Any], centers.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], blobDetector.asInstanceOf[js.Any])).asInstanceOf[bool]
  inline def findCirclesGrid(
    image: InputArray,
    patternSize: Size,
    centers: OutputArray,
    flags: int,
    blobDetector: Any,
    parameters: Any
  ): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("findCirclesGrid")(image.asInstanceOf[js.Any], patternSize.asInstanceOf[js.Any], centers.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], blobDetector.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[bool]
  
  inline def findEssentialMat(points1: InputArray, points2: InputArray, cameraMatrix: InputArray): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findEssentialMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findEssentialMat(
    points1: InputArray,
    points2: InputArray,
    cameraMatrix: InputArray,
    method: Unit,
    prob: Unit,
    threshold: Unit,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findEssentialMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], method.asInstanceOf[js.Any], prob.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findEssentialMat(
    points1: InputArray,
    points2: InputArray,
    cameraMatrix: InputArray,
    method: Unit,
    prob: Unit,
    threshold: double
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findEssentialMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], method.asInstanceOf[js.Any], prob.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findEssentialMat(
    points1: InputArray,
    points2: InputArray,
    cameraMatrix: InputArray,
    method: Unit,
    prob: Unit,
    threshold: double,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findEssentialMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], method.asInstanceOf[js.Any], prob.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findEssentialMat(points1: InputArray, points2: InputArray, cameraMatrix: InputArray, method: Unit, prob: double): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findEssentialMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], method.asInstanceOf[js.Any], prob.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findEssentialMat(
    points1: InputArray,
    points2: InputArray,
    cameraMatrix: InputArray,
    method: Unit,
    prob: double,
    threshold: Unit,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findEssentialMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], method.asInstanceOf[js.Any], prob.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findEssentialMat(
    points1: InputArray,
    points2: InputArray,
    cameraMatrix: InputArray,
    method: Unit,
    prob: double,
    threshold: double
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findEssentialMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], method.asInstanceOf[js.Any], prob.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findEssentialMat(
    points1: InputArray,
    points2: InputArray,
    cameraMatrix: InputArray,
    method: Unit,
    prob: double,
    threshold: double,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findEssentialMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], method.asInstanceOf[js.Any], prob.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findEssentialMat(points1: InputArray, points2: InputArray, cameraMatrix: InputArray, method: int): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findEssentialMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findEssentialMat(
    points1: InputArray,
    points2: InputArray,
    cameraMatrix: InputArray,
    method: int,
    prob: Unit,
    threshold: Unit,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findEssentialMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], method.asInstanceOf[js.Any], prob.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findEssentialMat(
    points1: InputArray,
    points2: InputArray,
    cameraMatrix: InputArray,
    method: int,
    prob: Unit,
    threshold: double
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findEssentialMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], method.asInstanceOf[js.Any], prob.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findEssentialMat(
    points1: InputArray,
    points2: InputArray,
    cameraMatrix: InputArray,
    method: int,
    prob: Unit,
    threshold: double,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findEssentialMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], method.asInstanceOf[js.Any], prob.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findEssentialMat(points1: InputArray, points2: InputArray, cameraMatrix: InputArray, method: int, prob: double): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findEssentialMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], method.asInstanceOf[js.Any], prob.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findEssentialMat(
    points1: InputArray,
    points2: InputArray,
    cameraMatrix: InputArray,
    method: int,
    prob: double,
    threshold: Unit,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findEssentialMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], method.asInstanceOf[js.Any], prob.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findEssentialMat(
    points1: InputArray,
    points2: InputArray,
    cameraMatrix: InputArray,
    method: int,
    prob: double,
    threshold: double
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findEssentialMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], method.asInstanceOf[js.Any], prob.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findEssentialMat(
    points1: InputArray,
    points2: InputArray,
    cameraMatrix: InputArray,
    method: int,
    prob: double,
    threshold: double,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findEssentialMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], method.asInstanceOf[js.Any], prob.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findEssentialMat(
    points1: InputArray,
    points2: InputArray,
    focal: js.UndefOr[double],
    pp: js.UndefOr[Point2d],
    method: js.UndefOr[int],
    prob: js.UndefOr[double],
    threshold: js.UndefOr[double],
    mask: js.UndefOr[OutputArray]
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findEssentialMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], focal.asInstanceOf[js.Any], pp.asInstanceOf[js.Any], method.asInstanceOf[js.Any], prob.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  
  inline def findFundamentalMat(points1: InputArray, points2: InputArray): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(points1: InputArray, points2: InputArray, mask: OutputArray): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(
    points1: InputArray,
    points2: InputArray,
    mask: OutputArray,
    method: Unit,
    ransacReprojThreshold: Unit,
    confidence: double
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(
    points1: InputArray,
    points2: InputArray,
    mask: OutputArray,
    method: Unit,
    ransacReprojThreshold: double
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(
    points1: InputArray,
    points2: InputArray,
    mask: OutputArray,
    method: Unit,
    ransacReprojThreshold: double,
    confidence: double
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(points1: InputArray, points2: InputArray, mask: OutputArray, method: int): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(
    points1: InputArray,
    points2: InputArray,
    mask: OutputArray,
    method: int,
    ransacReprojThreshold: Unit,
    confidence: double
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(
    points1: InputArray,
    points2: InputArray,
    mask: OutputArray,
    method: int,
    ransacReprojThreshold: double
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(
    points1: InputArray,
    points2: InputArray,
    mask: OutputArray,
    method: int,
    ransacReprojThreshold: double,
    confidence: double
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(
    points1: InputArray,
    points2: InputArray,
    method: Unit,
    ransacReprojThreshold: Unit,
    confidence: Unit,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(
    points1: InputArray,
    points2: InputArray,
    method: Unit,
    ransacReprojThreshold: Unit,
    confidence: double
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(
    points1: InputArray,
    points2: InputArray,
    method: Unit,
    ransacReprojThreshold: Unit,
    confidence: double,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(points1: InputArray, points2: InputArray, method: Unit, ransacReprojThreshold: double): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(
    points1: InputArray,
    points2: InputArray,
    method: Unit,
    ransacReprojThreshold: double,
    confidence: Unit,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(
    points1: InputArray,
    points2: InputArray,
    method: Unit,
    ransacReprojThreshold: double,
    confidence: double
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(
    points1: InputArray,
    points2: InputArray,
    method: Unit,
    ransacReprojThreshold: double,
    confidence: double,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(points1: InputArray, points2: InputArray, method: int): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(
    points1: InputArray,
    points2: InputArray,
    method: int,
    ransacReprojThreshold: Unit,
    confidence: Unit,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(
    points1: InputArray,
    points2: InputArray,
    method: int,
    ransacReprojThreshold: Unit,
    confidence: double
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(
    points1: InputArray,
    points2: InputArray,
    method: int,
    ransacReprojThreshold: Unit,
    confidence: double,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(points1: InputArray, points2: InputArray, method: int, ransacReprojThreshold: double): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(
    points1: InputArray,
    points2: InputArray,
    method: int,
    ransacReprojThreshold: double,
    confidence: Unit,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(
    points1: InputArray,
    points2: InputArray,
    method: int,
    ransacReprojThreshold: double,
    confidence: double
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findFundamentalMat(
    points1: InputArray,
    points2: InputArray,
    method: int,
    ransacReprojThreshold: double,
    confidence: double,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findFundamentalMat")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  
  inline def findHomography(srcPoints: InputArray, dstPoints: InputArray): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(srcPoints: InputArray, dstPoints: InputArray, mask: OutputArray): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    mask: OutputArray,
    method: Unit,
    ransacReprojThreshold: double
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(srcPoints: InputArray, dstPoints: InputArray, mask: OutputArray, method: int): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    mask: OutputArray,
    method: int,
    ransacReprojThreshold: double
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: Unit,
    ransacReprojThreshold: Unit,
    mask: Unit,
    maxIters: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: Unit,
    ransacReprojThreshold: Unit,
    mask: Unit,
    maxIters: Any,
    confidence: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: Unit,
    ransacReprojThreshold: Unit,
    mask: Unit,
    maxIters: Unit,
    confidence: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: Unit,
    ransacReprojThreshold: Unit,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: Unit,
    ransacReprojThreshold: Unit,
    mask: OutputArray,
    maxIters: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: Unit,
    ransacReprojThreshold: Unit,
    mask: OutputArray,
    maxIters: Any,
    confidence: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: Unit,
    ransacReprojThreshold: Unit,
    mask: OutputArray,
    maxIters: Unit,
    confidence: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(srcPoints: InputArray, dstPoints: InputArray, method: Unit, ransacReprojThreshold: double): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: Unit,
    ransacReprojThreshold: double,
    mask: Unit,
    maxIters: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: Unit,
    ransacReprojThreshold: double,
    mask: Unit,
    maxIters: Any,
    confidence: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: Unit,
    ransacReprojThreshold: double,
    mask: Unit,
    maxIters: Unit,
    confidence: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: Unit,
    ransacReprojThreshold: double,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: Unit,
    ransacReprojThreshold: double,
    mask: OutputArray,
    maxIters: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: Unit,
    ransacReprojThreshold: double,
    mask: OutputArray,
    maxIters: Any,
    confidence: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: Unit,
    ransacReprojThreshold: double,
    mask: OutputArray,
    maxIters: Unit,
    confidence: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(srcPoints: InputArray, dstPoints: InputArray, method: int): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: int,
    ransacReprojThreshold: Unit,
    mask: Unit,
    maxIters: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: int,
    ransacReprojThreshold: Unit,
    mask: Unit,
    maxIters: Any,
    confidence: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: int,
    ransacReprojThreshold: Unit,
    mask: Unit,
    maxIters: Unit,
    confidence: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: int,
    ransacReprojThreshold: Unit,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: int,
    ransacReprojThreshold: Unit,
    mask: OutputArray,
    maxIters: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: int,
    ransacReprojThreshold: Unit,
    mask: OutputArray,
    maxIters: Any,
    confidence: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: int,
    ransacReprojThreshold: Unit,
    mask: OutputArray,
    maxIters: Unit,
    confidence: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(srcPoints: InputArray, dstPoints: InputArray, method: int, ransacReprojThreshold: double): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: int,
    ransacReprojThreshold: double,
    mask: Unit,
    maxIters: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: int,
    ransacReprojThreshold: double,
    mask: Unit,
    maxIters: Any,
    confidence: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: int,
    ransacReprojThreshold: double,
    mask: Unit,
    maxIters: Unit,
    confidence: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: int,
    ransacReprojThreshold: double,
    mask: OutputArray
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: int,
    ransacReprojThreshold: double,
    mask: OutputArray,
    maxIters: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: int,
    ransacReprojThreshold: double,
    mask: OutputArray,
    maxIters: Any,
    confidence: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def findHomography(
    srcPoints: InputArray,
    dstPoints: InputArray,
    method: int,
    ransacReprojThreshold: double,
    mask: OutputArray,
    maxIters: Unit,
    confidence: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("findHomography")(srcPoints.asInstanceOf[js.Any], dstPoints.asInstanceOf[js.Any], method.asInstanceOf[js.Any], ransacReprojThreshold.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maxIters.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any])).asInstanceOf[Mat]
  
  inline def getDefaultNewCameraMatrix(cameraMatrix: InputArray): Mat = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultNewCameraMatrix")(cameraMatrix.asInstanceOf[js.Any]).asInstanceOf[Mat]
  inline def getDefaultNewCameraMatrix(cameraMatrix: InputArray, imgsize: Unit, centerPrincipalPoint: bool): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultNewCameraMatrix")(cameraMatrix.asInstanceOf[js.Any], imgsize.asInstanceOf[js.Any], centerPrincipalPoint.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def getDefaultNewCameraMatrix(cameraMatrix: InputArray, imgsize: Size): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultNewCameraMatrix")(cameraMatrix.asInstanceOf[js.Any], imgsize.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def getDefaultNewCameraMatrix(cameraMatrix: InputArray, imgsize: Size, centerPrincipalPoint: bool): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultNewCameraMatrix")(cameraMatrix.asInstanceOf[js.Any], imgsize.asInstanceOf[js.Any], centerPrincipalPoint.asInstanceOf[js.Any])).asInstanceOf[Mat]
  
  inline def getOptimalNewCameraMatrix(cameraMatrix: InputArray, distCoeffs: InputArray, imageSize: Size, alpha: double): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptimalNewCameraMatrix")(cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def getOptimalNewCameraMatrix(
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    imageSize: Size,
    alpha: double,
    newImgSize: Unit,
    validPixROI: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptimalNewCameraMatrix")(cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImgSize.asInstanceOf[js.Any], validPixROI.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def getOptimalNewCameraMatrix(
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    imageSize: Size,
    alpha: double,
    newImgSize: Unit,
    validPixROI: Any,
    centerPrincipalPoint: bool
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptimalNewCameraMatrix")(cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImgSize.asInstanceOf[js.Any], validPixROI.asInstanceOf[js.Any], centerPrincipalPoint.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def getOptimalNewCameraMatrix(
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    imageSize: Size,
    alpha: double,
    newImgSize: Unit,
    validPixROI: Unit,
    centerPrincipalPoint: bool
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptimalNewCameraMatrix")(cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImgSize.asInstanceOf[js.Any], validPixROI.asInstanceOf[js.Any], centerPrincipalPoint.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def getOptimalNewCameraMatrix(cameraMatrix: InputArray, distCoeffs: InputArray, imageSize: Size, alpha: double, newImgSize: Size): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptimalNewCameraMatrix")(cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImgSize.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def getOptimalNewCameraMatrix(
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    imageSize: Size,
    alpha: double,
    newImgSize: Size,
    validPixROI: Any
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptimalNewCameraMatrix")(cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImgSize.asInstanceOf[js.Any], validPixROI.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def getOptimalNewCameraMatrix(
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    imageSize: Size,
    alpha: double,
    newImgSize: Size,
    validPixROI: Any,
    centerPrincipalPoint: bool
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptimalNewCameraMatrix")(cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImgSize.asInstanceOf[js.Any], validPixROI.asInstanceOf[js.Any], centerPrincipalPoint.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def getOptimalNewCameraMatrix(
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    imageSize: Size,
    alpha: double,
    newImgSize: Size,
    validPixROI: Unit,
    centerPrincipalPoint: bool
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptimalNewCameraMatrix")(cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImgSize.asInstanceOf[js.Any], validPixROI.asInstanceOf[js.Any], centerPrincipalPoint.asInstanceOf[js.Any])).asInstanceOf[Mat]
  
  inline def getValidDisparityROI(roi1: Rect, roi2: Rect, minDisparity: int, numberOfDisparities: int, SADWindowSize: int): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidDisparityROI")(roi1.asInstanceOf[js.Any], roi2.asInstanceOf[js.Any], minDisparity.asInstanceOf[js.Any], numberOfDisparities.asInstanceOf[js.Any], SADWindowSize.asInstanceOf[js.Any])).asInstanceOf[Rect]
  
  inline def initCameraMatrix2D(objectPoints: InputArrayOfArrays, imagePoints: InputArrayOfArrays, imageSize: Size): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("initCameraMatrix2D")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any])).asInstanceOf[Mat]
  inline def initCameraMatrix2D(
    objectPoints: InputArrayOfArrays,
    imagePoints: InputArrayOfArrays,
    imageSize: Size,
    aspectRatio: double
  ): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("initCameraMatrix2D")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Mat]
  
  inline def initUndistortRectifyMap(
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    R: InputArray,
    newCameraMatrix: InputArray,
    size: Size,
    m1type: int,
    map1: OutputArray,
    map2: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initUndistortRectifyMap")(cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], R.asInstanceOf[js.Any], newCameraMatrix.asInstanceOf[js.Any], size.asInstanceOf[js.Any], m1type.asInstanceOf[js.Any], map1.asInstanceOf[js.Any], map2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def initWideAngleProjMap(
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    imageSize: Size,
    destImageWidth: int,
    m1type: int,
    map1: OutputArray,
    map2: OutputArray
  ): float = (^.asInstanceOf[js.Dynamic].applyDynamic("initWideAngleProjMap")(cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], destImageWidth.asInstanceOf[js.Any], m1type.asInstanceOf[js.Any], map1.asInstanceOf[js.Any], map2.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def initWideAngleProjMap(
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    imageSize: Size,
    destImageWidth: int,
    m1type: int,
    map1: OutputArray,
    map2: OutputArray,
    projType: Any
  ): float = (^.asInstanceOf[js.Dynamic].applyDynamic("initWideAngleProjMap")(cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], destImageWidth.asInstanceOf[js.Any], m1type.asInstanceOf[js.Any], map1.asInstanceOf[js.Any], map2.asInstanceOf[js.Any], projType.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def initWideAngleProjMap(
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    imageSize: Size,
    destImageWidth: int,
    m1type: int,
    map1: OutputArray,
    map2: OutputArray,
    projType: Any,
    alpha: double
  ): float = (^.asInstanceOf[js.Dynamic].applyDynamic("initWideAngleProjMap")(cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], destImageWidth.asInstanceOf[js.Any], m1type.asInstanceOf[js.Any], map1.asInstanceOf[js.Any], map2.asInstanceOf[js.Any], projType.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def initWideAngleProjMap(
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    imageSize: Size,
    destImageWidth: int,
    m1type: int,
    map1: OutputArray,
    map2: OutputArray,
    projType: Unit,
    alpha: double
  ): float = (^.asInstanceOf[js.Dynamic].applyDynamic("initWideAngleProjMap")(cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], destImageWidth.asInstanceOf[js.Any], m1type.asInstanceOf[js.Any], map1.asInstanceOf[js.Any], map2.asInstanceOf[js.Any], projType.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def initWideAngleProjMap(
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    imageSize: Size,
    destImageWidth: int,
    m1type: int,
    map1: OutputArray,
    map2: OutputArray,
    projType: int
  ): float = (^.asInstanceOf[js.Dynamic].applyDynamic("initWideAngleProjMap")(cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], destImageWidth.asInstanceOf[js.Any], m1type.asInstanceOf[js.Any], map1.asInstanceOf[js.Any], map2.asInstanceOf[js.Any], projType.asInstanceOf[js.Any])).asInstanceOf[float]
  inline def initWideAngleProjMap(
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    imageSize: Size,
    destImageWidth: int,
    m1type: int,
    map1: OutputArray,
    map2: OutputArray,
    projType: int,
    alpha: double
  ): float = (^.asInstanceOf[js.Dynamic].applyDynamic("initWideAngleProjMap")(cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], destImageWidth.asInstanceOf[js.Any], m1type.asInstanceOf[js.Any], map1.asInstanceOf[js.Any], map2.asInstanceOf[js.Any], projType.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[float]
  
  inline def matMulDeriv(A: InputArray, B: InputArray, dABdA: OutputArray, dABdB: OutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matMulDeriv")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], dABdA.asInstanceOf[js.Any], dABdB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def projectPoints(
    objectPoints: InputArray,
    rvec: InputArray,
    tvec: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    imagePoints: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("projectPoints")(objectPoints.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def projectPoints(
    objectPoints: InputArray,
    rvec: InputArray,
    tvec: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    imagePoints: OutputArray,
    jacobian: Unit,
    aspectRatio: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("projectPoints")(objectPoints.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], jacobian.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def projectPoints(
    objectPoints: InputArray,
    rvec: InputArray,
    tvec: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    imagePoints: OutputArray,
    jacobian: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("projectPoints")(objectPoints.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], jacobian.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def projectPoints(
    objectPoints: InputArray,
    rvec: InputArray,
    tvec: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    imagePoints: OutputArray,
    jacobian: OutputArray,
    aspectRatio: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("projectPoints")(objectPoints.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], jacobian.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def recoverPose(E: InputArray, points1: InputArray, points2: InputArray, R: OutputArray, t: OutputArray): int = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPose")(E.asInstanceOf[js.Any], points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], R.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def recoverPose(
    E: InputArray,
    points1: InputArray,
    points2: InputArray,
    R: OutputArray,
    t: OutputArray,
    focal: Unit,
    pp: Unit,
    mask: InputOutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPose")(E.asInstanceOf[js.Any], points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], R.asInstanceOf[js.Any], t.asInstanceOf[js.Any], focal.asInstanceOf[js.Any], pp.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def recoverPose(
    E: InputArray,
    points1: InputArray,
    points2: InputArray,
    R: OutputArray,
    t: OutputArray,
    focal: Unit,
    pp: Point2d
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPose")(E.asInstanceOf[js.Any], points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], R.asInstanceOf[js.Any], t.asInstanceOf[js.Any], focal.asInstanceOf[js.Any], pp.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def recoverPose(
    E: InputArray,
    points1: InputArray,
    points2: InputArray,
    R: OutputArray,
    t: OutputArray,
    focal: Unit,
    pp: Point2d,
    mask: InputOutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPose")(E.asInstanceOf[js.Any], points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], R.asInstanceOf[js.Any], t.asInstanceOf[js.Any], focal.asInstanceOf[js.Any], pp.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def recoverPose(
    E: InputArray,
    points1: InputArray,
    points2: InputArray,
    R: OutputArray,
    t: OutputArray,
    focal: double
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPose")(E.asInstanceOf[js.Any], points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], R.asInstanceOf[js.Any], t.asInstanceOf[js.Any], focal.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def recoverPose(
    E: InputArray,
    points1: InputArray,
    points2: InputArray,
    R: OutputArray,
    t: OutputArray,
    focal: double,
    pp: Unit,
    mask: InputOutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPose")(E.asInstanceOf[js.Any], points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], R.asInstanceOf[js.Any], t.asInstanceOf[js.Any], focal.asInstanceOf[js.Any], pp.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def recoverPose(
    E: InputArray,
    points1: InputArray,
    points2: InputArray,
    R: OutputArray,
    t: OutputArray,
    focal: double,
    pp: Point2d
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPose")(E.asInstanceOf[js.Any], points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], R.asInstanceOf[js.Any], t.asInstanceOf[js.Any], focal.asInstanceOf[js.Any], pp.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def recoverPose(
    E: InputArray,
    points1: InputArray,
    points2: InputArray,
    R: OutputArray,
    t: OutputArray,
    focal: double,
    pp: Point2d,
    mask: InputOutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPose")(E.asInstanceOf[js.Any], points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], R.asInstanceOf[js.Any], t.asInstanceOf[js.Any], focal.asInstanceOf[js.Any], pp.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def recoverPose(
    E: InputArray,
    points1: InputArray,
    points2: InputArray,
    cameraMatrix: InputArray,
    R: OutputArray,
    t: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPose")(E.asInstanceOf[js.Any], points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], R.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def recoverPose(
    E: InputArray,
    points1: InputArray,
    points2: InputArray,
    cameraMatrix: InputArray,
    R: OutputArray,
    t: OutputArray,
    distanceThresh: double
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPose")(E.asInstanceOf[js.Any], points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], R.asInstanceOf[js.Any], t.asInstanceOf[js.Any], distanceThresh.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def recoverPose(
    E: InputArray,
    points1: InputArray,
    points2: InputArray,
    cameraMatrix: InputArray,
    R: OutputArray,
    t: OutputArray,
    distanceThresh: double,
    mask: Unit,
    triangulatedPoints: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPose")(E.asInstanceOf[js.Any], points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], R.asInstanceOf[js.Any], t.asInstanceOf[js.Any], distanceThresh.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], triangulatedPoints.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def recoverPose(
    E: InputArray,
    points1: InputArray,
    points2: InputArray,
    cameraMatrix: InputArray,
    R: OutputArray,
    t: OutputArray,
    distanceThresh: double,
    mask: InputOutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPose")(E.asInstanceOf[js.Any], points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], R.asInstanceOf[js.Any], t.asInstanceOf[js.Any], distanceThresh.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def recoverPose(
    E: InputArray,
    points1: InputArray,
    points2: InputArray,
    cameraMatrix: InputArray,
    R: OutputArray,
    t: OutputArray,
    distanceThresh: double,
    mask: InputOutputArray,
    triangulatedPoints: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPose")(E.asInstanceOf[js.Any], points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], R.asInstanceOf[js.Any], t.asInstanceOf[js.Any], distanceThresh.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], triangulatedPoints.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def recoverPose(
    E: InputArray,
    points1: InputArray,
    points2: InputArray,
    cameraMatrix: InputArray,
    R: OutputArray,
    t: OutputArray,
    mask: InputOutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPose")(E.asInstanceOf[js.Any], points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], R.asInstanceOf[js.Any], t.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[int]
  
  inline def rectify3Collinear(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    cameraMatrix3: InputArray,
    distCoeffs3: InputArray,
    imgpt1: InputArrayOfArrays,
    imgpt3: InputArrayOfArrays,
    imageSize: Size,
    R12: InputArray,
    T12: InputArray,
    R13: InputArray,
    T13: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    R3: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    P3: OutputArray,
    Q: OutputArray,
    alpha: double,
    newImgSize: Size,
    roi1: Any,
    roi2: Any,
    flags: int
  ): float = (^.asInstanceOf[js.Dynamic].applyDynamic("rectify3Collinear")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], cameraMatrix3.asInstanceOf[js.Any], distCoeffs3.asInstanceOf[js.Any], imgpt1.asInstanceOf[js.Any], imgpt3.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R12.asInstanceOf[js.Any], T12.asInstanceOf[js.Any], R13.asInstanceOf[js.Any], T13.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], R3.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], P3.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImgSize.asInstanceOf[js.Any], roi1.asInstanceOf[js.Any], roi2.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[float]
  
  inline def reprojectImageTo3D(disparity: InputArray, _3dImage: OutputArray, Q: InputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reprojectImageTo3D")(disparity.asInstanceOf[js.Any], _3dImage.asInstanceOf[js.Any], Q.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reprojectImageTo3D(
    disparity: InputArray,
    _3dImage: OutputArray,
    Q: InputArray,
    handleMissingValues: Unit,
    ddepth: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reprojectImageTo3D")(disparity.asInstanceOf[js.Any], _3dImage.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], handleMissingValues.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reprojectImageTo3D(disparity: InputArray, _3dImage: OutputArray, Q: InputArray, handleMissingValues: bool): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reprojectImageTo3D")(disparity.asInstanceOf[js.Any], _3dImage.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], handleMissingValues.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reprojectImageTo3D(
    disparity: InputArray,
    _3dImage: OutputArray,
    Q: InputArray,
    handleMissingValues: bool,
    ddepth: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reprojectImageTo3D")(disparity.asInstanceOf[js.Any], _3dImage.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], handleMissingValues.asInstanceOf[js.Any], ddepth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sampsonDistance(pt1: InputArray, pt2: InputArray, F: InputArray): double = (^.asInstanceOf[js.Dynamic].applyDynamic("sampsonDistance")(pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[double]
  
  inline def solveP3P(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    flags: int
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solveP3P")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[int]
  
  inline def solvePnP(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvec: OutputArray,
    tvec: OutputArray
  ): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnP")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any])).asInstanceOf[bool]
  inline def solvePnP(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvec: OutputArray,
    tvec: OutputArray,
    useExtrinsicGuess: Unit,
    flags: int
  ): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnP")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[bool]
  inline def solvePnP(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvec: OutputArray,
    tvec: OutputArray,
    useExtrinsicGuess: bool
  ): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnP")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any])).asInstanceOf[bool]
  inline def solvePnP(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvec: OutputArray,
    tvec: OutputArray,
    useExtrinsicGuess: bool,
    flags: int
  ): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnP")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[bool]
  
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: Unit,
    flags: Unit,
    rvec: Unit,
    tvec: Unit,
    reprojectionError: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], reprojectionError.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: Unit,
    flags: Unit,
    rvec: Unit,
    tvec: InputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: Unit,
    flags: Unit,
    rvec: Unit,
    tvec: InputArray,
    reprojectionError: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], reprojectionError.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: Unit,
    flags: Unit,
    rvec: InputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: Unit,
    flags: Unit,
    rvec: InputArray,
    tvec: Unit,
    reprojectionError: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], reprojectionError.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: Unit,
    flags: Unit,
    rvec: InputArray,
    tvec: InputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: Unit,
    flags: Unit,
    rvec: InputArray,
    tvec: InputArray,
    reprojectionError: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], reprojectionError.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: Unit,
    flags: SolvePnPMethod
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: Unit,
    flags: SolvePnPMethod,
    rvec: Unit,
    tvec: Unit,
    reprojectionError: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], reprojectionError.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: Unit,
    flags: SolvePnPMethod,
    rvec: Unit,
    tvec: InputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: Unit,
    flags: SolvePnPMethod,
    rvec: Unit,
    tvec: InputArray,
    reprojectionError: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], reprojectionError.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: Unit,
    flags: SolvePnPMethod,
    rvec: InputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: Unit,
    flags: SolvePnPMethod,
    rvec: InputArray,
    tvec: Unit,
    reprojectionError: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], reprojectionError.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: Unit,
    flags: SolvePnPMethod,
    rvec: InputArray,
    tvec: InputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: Unit,
    flags: SolvePnPMethod,
    rvec: InputArray,
    tvec: InputArray,
    reprojectionError: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], reprojectionError.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: bool
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: bool,
    flags: Unit,
    rvec: Unit,
    tvec: Unit,
    reprojectionError: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], reprojectionError.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: bool,
    flags: Unit,
    rvec: Unit,
    tvec: InputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: bool,
    flags: Unit,
    rvec: Unit,
    tvec: InputArray,
    reprojectionError: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], reprojectionError.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: bool,
    flags: Unit,
    rvec: InputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: bool,
    flags: Unit,
    rvec: InputArray,
    tvec: Unit,
    reprojectionError: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], reprojectionError.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: bool,
    flags: Unit,
    rvec: InputArray,
    tvec: InputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: bool,
    flags: Unit,
    rvec: InputArray,
    tvec: InputArray,
    reprojectionError: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], reprojectionError.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: bool,
    flags: SolvePnPMethod
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: bool,
    flags: SolvePnPMethod,
    rvec: Unit,
    tvec: Unit,
    reprojectionError: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], reprojectionError.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: bool,
    flags: SolvePnPMethod,
    rvec: Unit,
    tvec: InputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: bool,
    flags: SolvePnPMethod,
    rvec: Unit,
    tvec: InputArray,
    reprojectionError: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], reprojectionError.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: bool,
    flags: SolvePnPMethod,
    rvec: InputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: bool,
    flags: SolvePnPMethod,
    rvec: InputArray,
    tvec: Unit,
    reprojectionError: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], reprojectionError.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: bool,
    flags: SolvePnPMethod,
    rvec: InputArray,
    tvec: InputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def solvePnPGeneric(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvecs: OutputArrayOfArrays,
    tvecs: OutputArrayOfArrays,
    useExtrinsicGuess: bool,
    flags: SolvePnPMethod,
    rvec: InputArray,
    tvec: InputArray,
    reprojectionError: OutputArray
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPGeneric")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvecs.asInstanceOf[js.Any], tvecs.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], reprojectionError.asInstanceOf[js.Any])).asInstanceOf[int]
  
  inline def solvePnPRansac(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvec: OutputArray,
    tvec: OutputArray,
    useExtrinsicGuess: js.UndefOr[bool],
    iterationsCount: js.UndefOr[int],
    reprojectionError: js.UndefOr[float],
    confidence: js.UndefOr[double],
    inliers: js.UndefOr[OutputArray],
    flags: js.UndefOr[int]
  ): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPRansac")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], useExtrinsicGuess.asInstanceOf[js.Any], iterationsCount.asInstanceOf[js.Any], reprojectionError.asInstanceOf[js.Any], confidence.asInstanceOf[js.Any], inliers.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[bool]
  
  inline def solvePnPRefineLM(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvec: InputOutputArray,
    tvec: InputOutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPRefineLM")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def solvePnPRefineLM(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvec: InputOutputArray,
    tvec: InputOutputArray,
    criteria: TermCriteria
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPRefineLM")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def solvePnPRefineVVS(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvec: InputOutputArray,
    tvec: InputOutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPRefineVVS")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def solvePnPRefineVVS(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvec: InputOutputArray,
    tvec: InputOutputArray,
    criteria: Unit,
    VVSlambda: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPRefineVVS")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], VVSlambda.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def solvePnPRefineVVS(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvec: InputOutputArray,
    tvec: InputOutputArray,
    criteria: TermCriteria
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPRefineVVS")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def solvePnPRefineVVS(
    objectPoints: InputArray,
    imagePoints: InputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    rvec: InputOutputArray,
    tvec: InputOutputArray,
    criteria: TermCriteria,
    VVSlambda: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("solvePnPRefineVVS")(objectPoints.asInstanceOf[js.Any], imagePoints.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], rvec.asInstanceOf[js.Any], tvec.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], VVSlambda.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stereoCalibrate(
    objectPoints: InputArrayOfArrays,
    imagePoints1: InputArrayOfArrays,
    imagePoints2: InputArrayOfArrays,
    cameraMatrix1: InputOutputArray,
    distCoeffs1: InputOutputArray,
    cameraMatrix2: InputOutputArray,
    distCoeffs2: InputOutputArray,
    imageSize: Size,
    R: InputOutputArray,
    T: InputOutputArray,
    E: OutputArray,
    F: OutputArray,
    perViewErrors: OutputArray
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoCalibrate")(objectPoints.asInstanceOf[js.Any], imagePoints1.asInstanceOf[js.Any], imagePoints2.asInstanceOf[js.Any], cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], perViewErrors.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def stereoCalibrate(
    objectPoints: InputArrayOfArrays,
    imagePoints1: InputArrayOfArrays,
    imagePoints2: InputArrayOfArrays,
    cameraMatrix1: InputOutputArray,
    distCoeffs1: InputOutputArray,
    cameraMatrix2: InputOutputArray,
    distCoeffs2: InputOutputArray,
    imageSize: Size,
    R: InputOutputArray,
    T: InputOutputArray,
    E: OutputArray,
    F: OutputArray,
    perViewErrors: OutputArray,
    flags: Unit,
    criteria: TermCriteria
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoCalibrate")(objectPoints.asInstanceOf[js.Any], imagePoints1.asInstanceOf[js.Any], imagePoints2.asInstanceOf[js.Any], cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], perViewErrors.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def stereoCalibrate(
    objectPoints: InputArrayOfArrays,
    imagePoints1: InputArrayOfArrays,
    imagePoints2: InputArrayOfArrays,
    cameraMatrix1: InputOutputArray,
    distCoeffs1: InputOutputArray,
    cameraMatrix2: InputOutputArray,
    distCoeffs2: InputOutputArray,
    imageSize: Size,
    R: InputOutputArray,
    T: InputOutputArray,
    E: OutputArray,
    F: OutputArray,
    perViewErrors: OutputArray,
    flags: int
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoCalibrate")(objectPoints.asInstanceOf[js.Any], imagePoints1.asInstanceOf[js.Any], imagePoints2.asInstanceOf[js.Any], cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], perViewErrors.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def stereoCalibrate(
    objectPoints: InputArrayOfArrays,
    imagePoints1: InputArrayOfArrays,
    imagePoints2: InputArrayOfArrays,
    cameraMatrix1: InputOutputArray,
    distCoeffs1: InputOutputArray,
    cameraMatrix2: InputOutputArray,
    distCoeffs2: InputOutputArray,
    imageSize: Size,
    R: InputOutputArray,
    T: InputOutputArray,
    E: OutputArray,
    F: OutputArray,
    perViewErrors: OutputArray,
    flags: int,
    criteria: TermCriteria
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoCalibrate")(objectPoints.asInstanceOf[js.Any], imagePoints1.asInstanceOf[js.Any], imagePoints2.asInstanceOf[js.Any], cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], perViewErrors.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def stereoCalibrate(
    objectPoints: InputArrayOfArrays,
    imagePoints1: InputArrayOfArrays,
    imagePoints2: InputArrayOfArrays,
    cameraMatrix1: InputOutputArray,
    distCoeffs1: InputOutputArray,
    cameraMatrix2: InputOutputArray,
    distCoeffs2: InputOutputArray,
    imageSize: Size,
    R: OutputArray,
    T: OutputArray,
    E: OutputArray,
    F: OutputArray
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoCalibrate")(objectPoints.asInstanceOf[js.Any], imagePoints1.asInstanceOf[js.Any], imagePoints2.asInstanceOf[js.Any], cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def stereoCalibrate(
    objectPoints: InputArrayOfArrays,
    imagePoints1: InputArrayOfArrays,
    imagePoints2: InputArrayOfArrays,
    cameraMatrix1: InputOutputArray,
    distCoeffs1: InputOutputArray,
    cameraMatrix2: InputOutputArray,
    distCoeffs2: InputOutputArray,
    imageSize: Size,
    R: OutputArray,
    T: OutputArray,
    E: OutputArray,
    F: OutputArray,
    flags: Unit,
    criteria: TermCriteria
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoCalibrate")(objectPoints.asInstanceOf[js.Any], imagePoints1.asInstanceOf[js.Any], imagePoints2.asInstanceOf[js.Any], cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def stereoCalibrate(
    objectPoints: InputArrayOfArrays,
    imagePoints1: InputArrayOfArrays,
    imagePoints2: InputArrayOfArrays,
    cameraMatrix1: InputOutputArray,
    distCoeffs1: InputOutputArray,
    cameraMatrix2: InputOutputArray,
    distCoeffs2: InputOutputArray,
    imageSize: Size,
    R: OutputArray,
    T: OutputArray,
    E: OutputArray,
    F: OutputArray,
    flags: int
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoCalibrate")(objectPoints.asInstanceOf[js.Any], imagePoints1.asInstanceOf[js.Any], imagePoints2.asInstanceOf[js.Any], cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def stereoCalibrate(
    objectPoints: InputArrayOfArrays,
    imagePoints1: InputArrayOfArrays,
    imagePoints2: InputArrayOfArrays,
    cameraMatrix1: InputOutputArray,
    distCoeffs1: InputOutputArray,
    cameraMatrix2: InputOutputArray,
    distCoeffs2: InputOutputArray,
    imageSize: Size,
    R: OutputArray,
    T: OutputArray,
    E: OutputArray,
    F: OutputArray,
    flags: int,
    criteria: TermCriteria
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoCalibrate")(objectPoints.asInstanceOf[js.Any], imagePoints1.asInstanceOf[js.Any], imagePoints2.asInstanceOf[js.Any], cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[double]
  
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: Unit,
    alpha: Unit,
    newImageSize: Unit,
    validPixROI1: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: Unit,
    alpha: Unit,
    newImageSize: Unit,
    validPixROI1: Any,
    validPixROI2: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any], validPixROI2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: Unit,
    alpha: Unit,
    newImageSize: Unit,
    validPixROI1: Unit,
    validPixROI2: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any], validPixROI2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: Unit,
    alpha: Unit,
    newImageSize: Size
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: Unit,
    alpha: Unit,
    newImageSize: Size,
    validPixROI1: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: Unit,
    alpha: Unit,
    newImageSize: Size,
    validPixROI1: Any,
    validPixROI2: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any], validPixROI2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: Unit,
    alpha: Unit,
    newImageSize: Size,
    validPixROI1: Unit,
    validPixROI2: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any], validPixROI2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: Unit,
    alpha: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: Unit,
    alpha: double,
    newImageSize: Unit,
    validPixROI1: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: Unit,
    alpha: double,
    newImageSize: Unit,
    validPixROI1: Any,
    validPixROI2: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any], validPixROI2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: Unit,
    alpha: double,
    newImageSize: Unit,
    validPixROI1: Unit,
    validPixROI2: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any], validPixROI2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: Unit,
    alpha: double,
    newImageSize: Size
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: Unit,
    alpha: double,
    newImageSize: Size,
    validPixROI1: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: Unit,
    alpha: double,
    newImageSize: Size,
    validPixROI1: Any,
    validPixROI2: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any], validPixROI2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: Unit,
    alpha: double,
    newImageSize: Size,
    validPixROI1: Unit,
    validPixROI2: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any], validPixROI2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: int,
    alpha: Unit,
    newImageSize: Unit,
    validPixROI1: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: int,
    alpha: Unit,
    newImageSize: Unit,
    validPixROI1: Any,
    validPixROI2: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any], validPixROI2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: int,
    alpha: Unit,
    newImageSize: Unit,
    validPixROI1: Unit,
    validPixROI2: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any], validPixROI2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: int,
    alpha: Unit,
    newImageSize: Size
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: int,
    alpha: Unit,
    newImageSize: Size,
    validPixROI1: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: int,
    alpha: Unit,
    newImageSize: Size,
    validPixROI1: Any,
    validPixROI2: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any], validPixROI2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: int,
    alpha: Unit,
    newImageSize: Size,
    validPixROI1: Unit,
    validPixROI2: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any], validPixROI2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: int,
    alpha: double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: int,
    alpha: double,
    newImageSize: Unit,
    validPixROI1: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: int,
    alpha: double,
    newImageSize: Unit,
    validPixROI1: Any,
    validPixROI2: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any], validPixROI2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: int,
    alpha: double,
    newImageSize: Unit,
    validPixROI1: Unit,
    validPixROI2: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any], validPixROI2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: int,
    alpha: double,
    newImageSize: Size
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: int,
    alpha: double,
    newImageSize: Size,
    validPixROI1: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: int,
    alpha: double,
    newImageSize: Size,
    validPixROI1: Any,
    validPixROI2: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any], validPixROI2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stereoRectify(
    cameraMatrix1: InputArray,
    distCoeffs1: InputArray,
    cameraMatrix2: InputArray,
    distCoeffs2: InputArray,
    imageSize: Size,
    R: InputArray,
    T: InputArray,
    R1: OutputArray,
    R2: OutputArray,
    P1: OutputArray,
    P2: OutputArray,
    Q: OutputArray,
    flags: int,
    alpha: double,
    newImageSize: Size,
    validPixROI1: Unit,
    validPixROI2: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectify")(cameraMatrix1.asInstanceOf[js.Any], distCoeffs1.asInstanceOf[js.Any], cameraMatrix2.asInstanceOf[js.Any], distCoeffs2.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], R.asInstanceOf[js.Any], T.asInstanceOf[js.Any], R1.asInstanceOf[js.Any], R2.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], newImageSize.asInstanceOf[js.Any], validPixROI1.asInstanceOf[js.Any], validPixROI2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stereoRectifyUncalibrated(
    points1: InputArray,
    points2: InputArray,
    F: InputArray,
    imgSize: Size,
    H1: OutputArray,
    H2: OutputArray
  ): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectifyUncalibrated")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], F.asInstanceOf[js.Any], imgSize.asInstanceOf[js.Any], H1.asInstanceOf[js.Any], H2.asInstanceOf[js.Any])).asInstanceOf[bool]
  inline def stereoRectifyUncalibrated(
    points1: InputArray,
    points2: InputArray,
    F: InputArray,
    imgSize: Size,
    H1: OutputArray,
    H2: OutputArray,
    threshold: double
  ): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("stereoRectifyUncalibrated")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any], F.asInstanceOf[js.Any], imgSize.asInstanceOf[js.Any], H1.asInstanceOf[js.Any], H2.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[bool]
  
  inline def triangulatePoints(
    projMatr1: InputArray,
    projMatr2: InputArray,
    projPoints1: InputArray,
    projPoints2: InputArray,
    points4D: OutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triangulatePoints")(projMatr1.asInstanceOf[js.Any], projMatr2.asInstanceOf[js.Any], projPoints1.asInstanceOf[js.Any], projPoints2.asInstanceOf[js.Any], points4D.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def undistort(src: InputArray, dst: OutputArray, cameraMatrix: InputArray, distCoeffs: InputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("undistort")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def undistort(
    src: InputArray,
    dst: OutputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    newCameraMatrix: InputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("undistort")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], newCameraMatrix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def undistortPoints(src: InputArray, dst: OutputArray, cameraMatrix: InputArray, distCoeffs: InputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("undistortPoints")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def undistortPoints(
    src: InputArray,
    dst: OutputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    R: Unit,
    P: InputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("undistortPoints")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], R.asInstanceOf[js.Any], P.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def undistortPoints(src: InputArray, dst: OutputArray, cameraMatrix: InputArray, distCoeffs: InputArray, R: InputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("undistortPoints")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], R.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def undistortPoints(
    src: InputArray,
    dst: OutputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    R: InputArray,
    P: InputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("undistortPoints")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], R.asInstanceOf[js.Any], P.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def undistortPoints(
    src: InputArray,
    dst: OutputArray,
    cameraMatrix: InputArray,
    distCoeffs: InputArray,
    R: InputArray,
    P: InputArray,
    criteria: TermCriteria
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("undistortPoints")(src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], cameraMatrix.asInstanceOf[js.Any], distCoeffs.asInstanceOf[js.Any], R.asInstanceOf[js.Any], P.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateDisparity(disparity: InputOutputArray, cost: InputArray, minDisparity: int, numberOfDisparities: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateDisparity")(disparity.asInstanceOf[js.Any], cost.asInstanceOf[js.Any], minDisparity.asInstanceOf[js.Any], numberOfDisparities.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateDisparity(
    disparity: InputOutputArray,
    cost: InputArray,
    minDisparity: int,
    numberOfDisparities: int,
    disp12MaxDisp: int
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateDisparity")(disparity.asInstanceOf[js.Any], cost.asInstanceOf[js.Any], minDisparity.asInstanceOf[js.Any], numberOfDisparities.asInstanceOf[js.Any], disp12MaxDisp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type HandEyeCalibrationMethod = Any
  
  type SolvePnPMethod = Any
  
  type UndistortTypes = Any
}
