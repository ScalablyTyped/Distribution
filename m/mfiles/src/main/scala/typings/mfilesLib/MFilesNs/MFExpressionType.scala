package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFExpressionType extends js.Object

@JSGlobal("MFiles.MFExpressionType")
@js.native
object MFExpressionType extends js.Object {
  @js.native
  sealed trait AnyField
    extends mfilesLib.MFilesNs.MFExpressionType
  
  @js.native
  sealed trait FileValue
    extends mfilesLib.MFilesNs.MFExpressionType
  
  @js.native
  sealed trait ObjectIDSegment
    extends mfilesLib.MFilesNs.MFExpressionType
  
  @js.native
  sealed trait Permissions
    extends mfilesLib.MFilesNs.MFExpressionType
  
  @js.native
  sealed trait PropertyValue
    extends mfilesLib.MFilesNs.MFExpressionType
  
  @js.native
  sealed trait StatusValue
    extends mfilesLib.MFilesNs.MFExpressionType
  
  @js.native
  sealed trait TypedValue
    extends mfilesLib.MFilesNs.MFExpressionType
  
  @js.native
  sealed trait Uninitialized
    extends mfilesLib.MFilesNs.MFExpressionType
  
  /* 6 */ val AnyField: AnyField with scala.Double = js.native
  /* 4 */ val FileValue: FileValue with scala.Double = js.native
  /* 2 */ val ObjectIDSegment: ObjectIDSegment with scala.Double = js.native
  /* 7 */ val Permissions: Permissions with scala.Double = js.native
  /* 1 */ val PropertyValue: PropertyValue with scala.Double = js.native
  /* 3 */ val StatusValue: StatusValue with scala.Double = js.native
  /* 5 */ val TypedValue: TypedValue with scala.Double = js.native
  /* 0 */ val Uninitialized: Uninitialized with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFExpressionType with scala.Double] = js.native
}

