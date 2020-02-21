package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsListResponseItemFiles extends js.Object {
  @JSName("hello_world.rb")
  var hello_worldDotrb: GistsListResponseItemFilesHelloWorldRb
}

object GistsListResponseItemFiles {
  @scala.inline
  def apply(hello_worldDotrb: GistsListResponseItemFilesHelloWorldRb): GistsListResponseItemFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.rb")(hello_worldDotrb.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsListResponseItemFiles]
  }
}

