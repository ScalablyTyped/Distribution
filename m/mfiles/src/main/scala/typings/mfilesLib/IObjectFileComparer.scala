package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectFileComparer extends js.Object {
  def Compare(FileLeft: IObjectFile, FileRight: IObjectFile): scala.Double
}

object IObjectFileComparer {
  @scala.inline
  def apply(Compare: js.Function2[IObjectFile, IObjectFile, scala.Double]): IObjectFileComparer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Compare")(Compare)
    __obj.asInstanceOf[IObjectFileComparer]
  }
}

