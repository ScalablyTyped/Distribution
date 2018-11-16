package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFOCRDimensionUnit extends js.Object

@JSGlobal("MFiles.MFOCRDimensionUnit")
@js.native
object MFOCRDimensionUnit extends js.Object {
  @js.native
  sealed trait InchX100
    extends mfilesLib.MFilesNs.MFOCRDimensionUnit
  
  @js.native
  sealed trait MillimeterX10
    extends mfilesLib.MFilesNs.MFOCRDimensionUnit
  
  @js.native
  sealed trait Pixel
    extends mfilesLib.MFilesNs.MFOCRDimensionUnit
  
  /* 2 */ val InchX100: InchX100 with scala.Double = js.native
  /* 1 */ val MillimeterX10: MillimeterX10 with scala.Double = js.native
  /* 0 */ val Pixel: Pixel with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFOCRDimensionUnit with scala.Double] = js.native
}

