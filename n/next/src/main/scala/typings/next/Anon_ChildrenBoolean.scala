package typings.next

import typings.propDashTypes.propDashTypesMod.ReactElementLike
import typings.propDashTypes.propDashTypesMod.ReactNodeArray
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenBoolean extends js.Object {
  var children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]
}

object Anon_ChildrenBoolean {
  @scala.inline
  def apply(children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]): Anon_ChildrenBoolean = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ChildrenBoolean]
  }
}

