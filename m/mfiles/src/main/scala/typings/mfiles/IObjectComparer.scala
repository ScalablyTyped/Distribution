package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectComparer extends js.Object {
  def Compare(ObjectVersionDataLeft: IObjectVersion, ObjectVersionDataRight: IObjectVersion): Double
}

object IObjectComparer {
  @scala.inline
  def apply(Compare: (IObjectVersion, IObjectVersion) => Double): IObjectComparer = {
    val __obj = js.Dynamic.literal(Compare = js.Any.fromFunction2(Compare))
  
    __obj.asInstanceOf[IObjectComparer]
  }
}

