package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFConditionType extends js.Object

@JSGlobal("MFiles.MFConditionType")
@js.native
object MFConditionType extends js.Object {
  @js.native
  sealed trait Contains
    extends mfilesLib.MFilesNs.MFConditionType
  
  @js.native
  sealed trait ContainsAnyBitwise
    extends mfilesLib.MFilesNs.MFConditionType
  
  @js.native
  sealed trait DoesNotContain
    extends mfilesLib.MFilesNs.MFConditionType
  
  @js.native
  sealed trait DoesNotContainAnyBitwise
    extends mfilesLib.MFilesNs.MFConditionType
  
  @js.native
  sealed trait DoesNotMatchWildcardPattern
    extends mfilesLib.MFilesNs.MFConditionType
  
  @js.native
  sealed trait DoesNotStartWith
    extends mfilesLib.MFilesNs.MFConditionType
  
  @js.native
  sealed trait Equal
    extends mfilesLib.MFilesNs.MFConditionType
  
  @js.native
  sealed trait GreaterThan
    extends mfilesLib.MFilesNs.MFConditionType
  
  @js.native
  sealed trait GreaterThanOrEqual
    extends mfilesLib.MFilesNs.MFConditionType
  
  @js.native
  sealed trait IsMissing
    extends mfilesLib.MFilesNs.MFConditionType
  
  @js.native
  sealed trait IsNotMissing
    extends mfilesLib.MFilesNs.MFConditionType
  
  @js.native
  sealed trait LessThan
    extends mfilesLib.MFilesNs.MFConditionType
  
  @js.native
  sealed trait LessThanOrEqual
    extends mfilesLib.MFilesNs.MFConditionType
  
  @js.native
  sealed trait MatchesWildcardPattern
    extends mfilesLib.MFilesNs.MFConditionType
  
  @js.native
  sealed trait NotEqual
    extends mfilesLib.MFilesNs.MFConditionType
  
  @js.native
  sealed trait StartsWith
    extends mfilesLib.MFilesNs.MFConditionType
  
  @js.native
  sealed trait StartsWithAtWordBoundary
    extends mfilesLib.MFilesNs.MFConditionType
  
  /* 7 */ val Contains: Contains with scala.Double = js.native
  /* 16 */ val ContainsAnyBitwise: ContainsAnyBitwise with scala.Double = js.native
  /* 8 */ val DoesNotContain: DoesNotContain with scala.Double = js.native
  /* 17 */ val DoesNotContainAnyBitwise: DoesNotContainAnyBitwise with scala.Double = js.native
  /* 12 */ val DoesNotMatchWildcardPattern: DoesNotMatchWildcardPattern with scala.Double = js.native
  /* 10 */ val DoesNotStartWith: DoesNotStartWith with scala.Double = js.native
  /* 1 */ val Equal: Equal with scala.Double = js.native
  /* 3 */ val GreaterThan: GreaterThan with scala.Double = js.native
  /* 5 */ val GreaterThanOrEqual: GreaterThanOrEqual with scala.Double = js.native
  /* 13 */ val IsMissing: IsMissing with scala.Double = js.native
  /* 14 */ val IsNotMissing: IsNotMissing with scala.Double = js.native
  /* 4 */ val LessThan: LessThan with scala.Double = js.native
  /* 6 */ val LessThanOrEqual: LessThanOrEqual with scala.Double = js.native
  /* 11 */ val MatchesWildcardPattern: MatchesWildcardPattern with scala.Double = js.native
  /* 2 */ val NotEqual: NotEqual with scala.Double = js.native
  /* 9 */ val StartsWith: StartsWith with scala.Double = js.native
  /* 15 */ val StartsWithAtWordBoundary: StartsWithAtWordBoundary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFConditionType with scala.Double] = js.native
}

