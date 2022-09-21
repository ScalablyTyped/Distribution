package typings.mediapipeFaceMesh.mod

import typings.mediapipeFaceMesh.mod.^
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def FACEMESH_CONTOURS: LandmarkConnectionArray = ^.asInstanceOf[js.Dynamic].selectDynamic("FACEMESH_CONTOURS").asInstanceOf[LandmarkConnectionArray]

inline def FACEMESH_FACE_OVAL: LandmarkConnectionArray = ^.asInstanceOf[js.Dynamic].selectDynamic("FACEMESH_FACE_OVAL").asInstanceOf[LandmarkConnectionArray]

inline def FACEMESH_LEFT_EYE: LandmarkConnectionArray = ^.asInstanceOf[js.Dynamic].selectDynamic("FACEMESH_LEFT_EYE").asInstanceOf[LandmarkConnectionArray]

inline def FACEMESH_LEFT_EYEBROW: LandmarkConnectionArray = ^.asInstanceOf[js.Dynamic].selectDynamic("FACEMESH_LEFT_EYEBROW").asInstanceOf[LandmarkConnectionArray]

inline def FACEMESH_LEFT_IRIS: LandmarkConnectionArray = ^.asInstanceOf[js.Dynamic].selectDynamic("FACEMESH_LEFT_IRIS").asInstanceOf[LandmarkConnectionArray]

inline def FACEMESH_LIPS: LandmarkConnectionArray = ^.asInstanceOf[js.Dynamic].selectDynamic("FACEMESH_LIPS").asInstanceOf[LandmarkConnectionArray]

inline def FACEMESH_RIGHT_EYE: LandmarkConnectionArray = ^.asInstanceOf[js.Dynamic].selectDynamic("FACEMESH_RIGHT_EYE").asInstanceOf[LandmarkConnectionArray]

inline def FACEMESH_RIGHT_EYEBROW: LandmarkConnectionArray = ^.asInstanceOf[js.Dynamic].selectDynamic("FACEMESH_RIGHT_EYEBROW").asInstanceOf[LandmarkConnectionArray]

inline def FACEMESH_RIGHT_IRIS: LandmarkConnectionArray = ^.asInstanceOf[js.Dynamic].selectDynamic("FACEMESH_RIGHT_IRIS").asInstanceOf[LandmarkConnectionArray]

inline def FACEMESH_TESSELATION: LandmarkConnectionArray = ^.asInstanceOf[js.Dynamic].selectDynamic("FACEMESH_TESSELATION").asInstanceOf[LandmarkConnectionArray]

inline def VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[String]

inline def matrixDataToMatrix(mat: MatrixData): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("matrixDataToMatrix")(mat.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]

/**
  * GpuBuffers should all be compatible with Canvas' `drawImage`
  */
type GpuBuffer = HTMLCanvasElement | HTMLImageElement | ImageBitmap

type InputImage = HTMLVideoElement | HTMLImageElement | HTMLCanvasElement

type LandmarkConnectionArray = js.Array[js.Tuple2[Double, Double]]

type NormalizedLandmarkList = js.Array[NormalizedLandmark]

type NormalizedLandmarkListList = js.Array[NormalizedLandmarkList]

type ResultsListener = js.Function1[/* results */ Results, js.Promise[Unit] | Unit]
