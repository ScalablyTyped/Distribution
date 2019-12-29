package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsForkResponseFiles extends js.Object {
  @JSName("hello_world.rb")
  var hello_worldDotrb: GistsForkResponseFilesHelloWorldRb
}

object GistsForkResponseFiles {
  @scala.inline
  def apply(hello_worldDotrb: GistsForkResponseFilesHelloWorldRb): GistsForkResponseFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.rb")(hello_worldDotrb.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsForkResponseFiles]
  }
}

