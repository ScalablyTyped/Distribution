package typings.mfiles

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
    val __obj = js.Dynamic.literal(ObjectFile = ObjectFile.asInstanceOf[js.Any], ObjectVersion = ObjectVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IObjectFileAndVersion]
  }
}

