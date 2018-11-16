package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IObjectFileAndObjVer extends js.Object {
  val ObjVer: IObjVer
  val ObjectFile: IObjectFile
  def Clone(): IObjectFileAndObjVer
  def ToJSON(): java.lang.String
}

