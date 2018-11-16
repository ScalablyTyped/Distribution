package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFAutomaticValueType extends js.Object

@JSGlobal("MFiles.MFAutomaticValueType")
@js.native
object MFAutomaticValueType extends js.Object {
  @js.native
  sealed trait AutoNumberSimple
    extends mfilesLib.MFilesNs.MFAutomaticValueType
  
  @js.native
  sealed trait CalculatedWithPlaceholders
    extends mfilesLib.MFilesNs.MFAutomaticValueType
  
  @js.native
  sealed trait CalculatedWithVBScript
    extends mfilesLib.MFilesNs.MFAutomaticValueType
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFAutomaticValueType
  
  @js.native
  sealed trait WithVBScript
    extends mfilesLib.MFilesNs.MFAutomaticValueType
  
  /* 3 */ val AutoNumberSimple: AutoNumberSimple with scala.Double = js.native
  /* 1 */ val CalculatedWithPlaceholders: CalculatedWithPlaceholders with scala.Double = js.native
  /* 2 */ val CalculatedWithVBScript: CalculatedWithVBScript with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 4 */ val WithVBScript: WithVBScript with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFAutomaticValueType with scala.Double] = js.native
}

