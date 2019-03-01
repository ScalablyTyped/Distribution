package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectFileAndVersion extends js.Object {
  val ObjectFile: IObjectFile
  val ObjectVersion: IObjectVersionAndProperties
}

object IObjectFileAndVersion {
  @scala.inline
  def apply(ObjectFile: IObjectFile, ObjectVersion: IObjectVersionAndProperties): IObjectFileAndVersion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ObjectFile")(ObjectFile)
    __obj.updateDynamic("ObjectVersion")(ObjectVersion)
    __obj.asInstanceOf[IObjectFileAndVersion]
  }
}

