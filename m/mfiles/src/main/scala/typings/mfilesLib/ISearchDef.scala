package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchDef extends js.Object {
  var Conditions: ISearchConditions
  var Levels: IExpressionExs
  var LookInAllVersions: scala.Boolean
  var ReturnLatestVisibleVersion: scala.Boolean
  var SearchFlags: mfilesLib.MFilesNs.MFSearchFlags
  def Clone(): ISearchDef
  def IsIndirectionUsed(): scala.Boolean
}

