package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.cvhalDFT
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvHacksMod.sizeT
import typings.mirada.distSrcTypesOpencvHacksMod.uchar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvCoreHalInterfaceMod {
  
  @JSImport("mirada/dist/src/types/opencv/core_hal_interface", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def halNiDct2D(context: cvhalDFT, src_data: uchar, src_step: sizeT, dst_data: uchar, dst_step: sizeT): cvhalDFT = (^.asInstanceOf[js.Dynamic].applyDynamic("hal_ni_dct2D")(context.asInstanceOf[js.Any], src_data.asInstanceOf[js.Any], src_step.asInstanceOf[js.Any], dst_data.asInstanceOf[js.Any], dst_step.asInstanceOf[js.Any])).asInstanceOf[cvhalDFT]
  
  inline def halNiDctFree2D(context: cvhalDFT): cvhalDFT = ^.asInstanceOf[js.Dynamic].applyDynamic("hal_ni_dctFree2D")(context.asInstanceOf[js.Any]).asInstanceOf[cvhalDFT]
  
  inline def halNiDctInit2D(context: cvhalDFT, width: int, height: int, depth: int, flags: int): cvhalDFT = (^.asInstanceOf[js.Dynamic].applyDynamic("hal_ni_dctInit2D")(context.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[cvhalDFT]
  
  inline def halNiDft1D(context: cvhalDFT, src: uchar, dst: uchar): cvhalDFT = (^.asInstanceOf[js.Dynamic].applyDynamic("hal_ni_dft1D")(context.asInstanceOf[js.Any], src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[cvhalDFT]
  
  inline def halNiDft2D(context: cvhalDFT, src_data: uchar, src_step: sizeT, dst_data: uchar, dst_step: sizeT): cvhalDFT = (^.asInstanceOf[js.Dynamic].applyDynamic("hal_ni_dft2D")(context.asInstanceOf[js.Any], src_data.asInstanceOf[js.Any], src_step.asInstanceOf[js.Any], dst_data.asInstanceOf[js.Any], dst_step.asInstanceOf[js.Any])).asInstanceOf[cvhalDFT]
  
  inline def halNiDftFree1D(context: cvhalDFT): cvhalDFT = ^.asInstanceOf[js.Dynamic].applyDynamic("hal_ni_dftFree1D")(context.asInstanceOf[js.Any]).asInstanceOf[cvhalDFT]
  
  inline def halNiDftFree2D(context: cvhalDFT): cvhalDFT = ^.asInstanceOf[js.Dynamic].applyDynamic("hal_ni_dftFree2D")(context.asInstanceOf[js.Any]).asInstanceOf[cvhalDFT]
  
  inline def halNiDftInit1D(context: cvhalDFT, len: int, count: int, depth: int, flags: int, needBuffer: Any): cvhalDFT = (^.asInstanceOf[js.Dynamic].applyDynamic("hal_ni_dftInit1D")(context.asInstanceOf[js.Any], len.asInstanceOf[js.Any], count.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], needBuffer.asInstanceOf[js.Any])).asInstanceOf[cvhalDFT]
  
  inline def halNiDftInit2D(
    context: cvhalDFT,
    width: int,
    height: int,
    depth: int,
    src_channels: int,
    dst_channels: int,
    flags: int,
    nonzero_rows: int
  ): cvhalDFT = (^.asInstanceOf[js.Dynamic].applyDynamic("hal_ni_dftInit2D")(context.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], src_channels.asInstanceOf[js.Any], dst_channels.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], nonzero_rows.asInstanceOf[js.Any])).asInstanceOf[cvhalDFT]
  
  inline def halNiMinMaxIdx(
    src_data: uchar,
    src_step: sizeT,
    width: int,
    height: int,
    depth: int,
    minVal: Any,
    maxVal: Any,
    minIdx: Any,
    maxIdx: Any,
    mask: uchar
  ): uchar = (^.asInstanceOf[js.Dynamic].applyDynamic("hal_ni_minMaxIdx")(src_data.asInstanceOf[js.Any], src_step.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], minVal.asInstanceOf[js.Any], maxVal.asInstanceOf[js.Any], minIdx.asInstanceOf[js.Any], maxIdx.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[uchar]
}
