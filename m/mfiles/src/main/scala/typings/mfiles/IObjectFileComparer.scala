package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectFileComparer extends js.Object {
  def Compare(FileLeft: IObjectFile, FileRight: IObjectFile): Double
}

object IObjectFileComparer {
  @scala.inline
  def apply(Compare: (IObjectFile, IObjectFile) => Double): IObjectFileComparer = {
    val __obj = js.Dynamic.literal(Compare = js.Any.fromFunction2(Compare))
  
    __obj.asInstanceOf[IObjectFileComparer]
  }
}

