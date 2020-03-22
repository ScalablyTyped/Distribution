package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsListForUserResponseItemFiles extends js.Object {
  @JSName("hello_world.rb")
  var hello_worldDotrb: GistsListForUserResponseItemFilesHelloWorldRb
}

object GistsListForUserResponseItemFiles {
  @scala.inline
  def apply(hello_worldDotrb: GistsListForUserResponseItemFilesHelloWorldRb): GistsListForUserResponseItemFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.rb")(hello_worldDotrb.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsListForUserResponseItemFiles]
  }
}

