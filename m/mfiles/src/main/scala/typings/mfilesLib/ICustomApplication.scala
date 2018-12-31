package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomApplication extends js.Object {
  val ApplicationType: mfilesLib.MFilesNs.MFCustomApplicationType
  val ChecksumHash: java.lang.String
  val Description: java.lang.String
  val Enabled: scala.Boolean
  val ID: java.lang.String
  val MasterApplication: java.lang.String
  val Name: java.lang.String
  val Optional: scala.Boolean
  val Publisher: java.lang.String
  val RequireSystemAccess: scala.Boolean
  val Version: java.lang.String
  def Clone(): ICustomApplication
}

