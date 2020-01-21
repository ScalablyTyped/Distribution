package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsListPublicForUserResponseItemFiles extends js.Object {
  @JSName("hello_world.rb")
  var hello_worldDotrb: GistsListPublicForUserResponseItemFilesHelloWorldRb
}

object GistsListPublicForUserResponseItemFiles {
  @scala.inline
  def apply(hello_worldDotrb: GistsListPublicForUserResponseItemFilesHelloWorldRb): GistsListPublicForUserResponseItemFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.rb")(hello_worldDotrb.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsListPublicForUserResponseItemFiles]
  }
}

