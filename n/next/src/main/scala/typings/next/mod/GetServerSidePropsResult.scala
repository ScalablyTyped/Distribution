package typings.next.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServerSidePropsResult[P] extends js.Object {
  var props: P
}

object GetServerSidePropsResult {
  @scala.inline
  def apply[P](props: P): GetServerSidePropsResult[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServerSidePropsResult[P]]
  }
}

