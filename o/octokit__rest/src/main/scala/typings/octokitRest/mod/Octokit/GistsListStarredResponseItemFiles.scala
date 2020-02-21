package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsListStarredResponseItemFiles extends js.Object {
  @JSName("hello_world.rb")
  var hello_worldDotrb: GistsListStarredResponseItemFilesHelloWorldRb
}

object GistsListStarredResponseItemFiles {
  @scala.inline
  def apply(hello_worldDotrb: GistsListStarredResponseItemFilesHelloWorldRb): GistsListStarredResponseItemFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.rb")(hello_worldDotrb.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsListStarredResponseItemFiles]
  }
}

