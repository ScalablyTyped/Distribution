package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IObjectType extends js.Object {
  var AccessControlList: IAccessControlList
  var AllowAdding: scala.Boolean
  var AllowedAsGroupingLevel: scala.Boolean
  var CanHaveFiles: scala.Boolean
  var DefaultAccessControlList: IAccessControlList
  var DefaultPropertyDef: scala.Double
  var External: scala.Boolean
  val GUID: java.lang.String
  var HasOwnerType: scala.Boolean
  var Hierarchical: scala.Boolean
  var ID: scala.Double
  var Icon: js.Array[scala.Double]
  var NamePlural: java.lang.String
  var NameSingular: java.lang.String
  var ObjectTypeTargetsForBrowsing: IObjectTypeTargetsForBrowsing
  var OwnerPropertyDef: scala.Double
  var OwnerType: scala.Double
  val ReadOnlyPropertiesDuringInsert: IIDs
  val ReadOnlyPropertiesDuringUpdate: IIDs
  var RealObjectType: scala.Boolean
  var ShowCreationCommandInTaskPane: scala.Boolean
  var Translatable: scala.Boolean
  def CanHaveItemIcons(): scala.Boolean
  def Clone(): IObjectType
  def GetIconAsPNG(Width: scala.Double, Height: scala.Double): js.Array[scala.Double]
  def IsAddingAllowedForUser(SessionInfo: ISessionInfo): scala.Boolean
}

