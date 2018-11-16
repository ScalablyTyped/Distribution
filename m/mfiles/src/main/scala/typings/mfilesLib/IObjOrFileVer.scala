package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IObjOrFileVer extends js.Object {
  var FileVer: IFileVer
  var ObjVer: IObjVer
  def Clone(): IObjOrFileVer
  def IsFile(): scala.Boolean
}

