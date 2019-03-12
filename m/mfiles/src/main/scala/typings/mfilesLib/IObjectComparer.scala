package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectComparer extends js.Object {
  def Compare(ObjectVersionDataLeft: IObjectVersion, ObjectVersionDataRight: IObjectVersion): scala.Double
}

object IObjectComparer {
  @scala.inline
  def apply(Compare: (IObjectVersion, IObjectVersion) => scala.Double): IObjectComparer = {
    val __obj = js.Dynamic.literal(Compare = js.Any.fromFunction2(Compare))
  
    __obj.asInstanceOf[IObjectComparer]
  }
}

