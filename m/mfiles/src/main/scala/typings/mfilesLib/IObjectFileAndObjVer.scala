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

object IObjectFileAndObjVer {
  @scala.inline
  def apply(
    Clone: js.Function0[IObjectFileAndObjVer],
    ObjVer: IObjVer,
    ObjectFile: IObjectFile,
    ToJSON: js.Function0[java.lang.String]
  ): IObjectFileAndObjVer = {
    val __obj = js.Dynamic.literal(Clone = Clone, ObjVer = ObjVer, ObjectFile = ObjectFile, ToJSON = ToJSON)
  
    __obj.asInstanceOf[IObjectFileAndObjVer]
  }
}

