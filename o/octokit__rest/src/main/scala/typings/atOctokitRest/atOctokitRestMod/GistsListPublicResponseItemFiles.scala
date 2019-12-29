package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsListPublicResponseItemFiles extends js.Object {
  @JSName("hello_world.rb")
  var hello_worldDotrb: GistsListPublicResponseItemFilesHelloWorldRb
}

object GistsListPublicResponseItemFiles {
  @scala.inline
  def apply(hello_worldDotrb: GistsListPublicResponseItemFilesHelloWorldRb): GistsListPublicResponseItemFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.rb")(hello_worldDotrb.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsListPublicResponseItemFiles]
  }
}

